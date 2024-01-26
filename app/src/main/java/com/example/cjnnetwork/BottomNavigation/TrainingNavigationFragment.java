package com.example.cjnnetwork.BottomNavigation;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.loader.content.CursorLoader;

import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.cjnnetwork.DashboardActivity;
import com.example.cjnnetwork.R;
import com.example.cjnnetwork.TainingWebView;
import com.example.cjnnetwork.UIHelper;
import com.example.cjnnetwork.databinding.FragmentTrainingNavigationBinding;

import java.io.File;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;


public class TrainingNavigationFragment extends Fragment {
    private FragmentTrainingNavigationBinding binding;
    private static final int REQUEST_VIDEO_PICK = 1;
    private static final int REQUEST_EXTERNAL_STORAGE = 101;
    private static final int READ_EXTERNAL_STORAGE_REQUEST = 1;

    Uri uri;
    private static final int REQUEST_VIDEO_PERMISSION = 100;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentTrainingNavigationBinding.inflate(inflater, container, false);

        binding.training.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(requireActivity(), TainingWebView.class));
            }
        });

        binding.vidume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                UIHelper.getInstance().showMessage(requireContext(),"Coming Soon ");
                pickVideo();

            }
        });
        binding.sendEmailResume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkPermission()) {
                    openPdfFile();
                }
            }
        });

        binding.sendEmailButton.setOnClickListener(view -> sendEmail());


        return binding.getRoot();
    }
    private void pickVideo() {

            Intent intent = new Intent(Intent.ACTION_OPEN_DOCUMENT);
            intent.addCategory(Intent.CATEGORY_OPENABLE);
            intent.setType("video/*");
            startActivityForResult(intent, REQUEST_VIDEO_PICK);

    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_VIDEO_PICK && resultCode == Activity.RESULT_OK && data != null) {
            uri = data.getData();
            Toast.makeText(requireContext(), "Video picked successfully", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(requireContext(), "Error picking video", Toast.LENGTH_SHORT).show();
        }
    }

    private static String getRealPathFromUri(Uri uri,Context context) {
        if (uri == null) {
            return null;
        }

        String[] projection = {MediaStore.Video.Media.DATA};
        CursorLoader loader = new CursorLoader(context, uri, projection, null, null, null);
        Cursor cursor = loader.loadInBackground();

        if (cursor != null && cursor.moveToFirst()) {
            int column_index = cursor.getColumnIndexOrThrow(MediaStore.Video.Media.DATA);
            String path = cursor.getString(column_index);
            cursor.close();
            return path;
        } else {
            return null;
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        if (requestCode == REQUEST_EXTERNAL_STORAGE) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                pickVideo();
            } else {
                Toast.makeText(requireContext(), "Permission denied", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private void sendEmail() {
        // Replace these values with your email configuration
        String senderEmail = "waghmodeajinkya80@gmail.com";
        String senderPassword = "Ajink@7242";
        String recipientEmail = "waghmodeajinkya72@gmail.co";
        String emailTitle = "Video Email Title";
        String emailBody = "Video Email Body";

        new SendEmailTask(requireContext(),senderEmail, senderPassword, recipientEmail, emailTitle, emailBody, uri).execute();
    }

    public static class SendEmailTask extends AsyncTask<Void, Void, Boolean> {
        private final String senderEmail;
        private final String senderPassword;
        private final String recipientEmail;
        private final String emailTitle;
        private final String emailBody;
        private final Uri uri;
        private final Context context;

        public SendEmailTask(Context context, String senderEmail, String senderPassword, String recipientEmail, String emailTitle, String emailBody, Uri uri) {
            this.senderEmail = senderEmail;
            this.senderPassword = senderPassword;
            this.recipientEmail = recipientEmail;
            this.emailTitle = emailTitle;
            this.emailBody = emailBody;
            this.uri = uri;
            this.context = context;
        }

        @Override
        protected Boolean doInBackground(Void... params) {
            try {
                // Set the email properties
                java.util.Properties properties = System.getProperties();
                properties.put("mail.smtp.host", "smtp.gmail.com");
                properties.put("mail.smtp.port", "587");
                properties.put("mail.smtp.auth", "true");
                properties.put("mail.smtp.starttls.enable", "true");
                Session session = Session.getInstance(properties, new Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(senderEmail, senderPassword);
                    }
                });
                // Create a session with the email configuration

                // Create a MimeMessage
                MimeMessage mimeMessage = new MimeMessage(session);
                mimeMessage.setFrom(new InternetAddress(senderEmail));
                mimeMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(recipientEmail));
                mimeMessage.setSubject(emailTitle);

                // Create the email body
                Multipart multipart = new MimeMultipart();

                // Text part
                MimeBodyPart textPart = new MimeBodyPart();
                textPart.setText(emailBody);
                multipart.addBodyPart(textPart);

                // Attachment part
                if (uri != null) {
                    MimeBodyPart attachmentPart = new MimeBodyPart();
                    File file = new File(getRealPathFromUri(uri,context));
                    FileDataSource fileDataSource = new FileDataSource(file);
                    attachmentPart.setDataHandler(new DataHandler(fileDataSource));
                    attachmentPart.setFileName(fileDataSource.getName());
                    multipart.addBodyPart(attachmentPart);
                } else {
                    return false; // No video selected
                }

                // Set the email content
                mimeMessage.setContent(multipart);

                // Send the email
                Transport.send(mimeMessage);

                return true; // Email sent successfully
            } catch (Exception e) {
                e.printStackTrace();
                return false; // Error sending email
            }
        }

        @Override
        protected void onPostExecute(Boolean success) {
            Activity activity = (Activity) context;

            if (success) {
                activity.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(context, "Email sent successfully", Toast.LENGTH_SHORT).show();
                    }
                });
            } else {
                activity.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(context, "Error sending email or no video selected", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        }

    }



    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }


    private boolean checkPermission() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (ContextCompat.checkSelfPermission(requireContext(), Manifest.permission.READ_EXTERNAL_STORAGE)
                    != PackageManager.PERMISSION_GRANTED) {
                // Permission is not granted
                ActivityCompat.requestPermissions(requireActivity(),
                        new String[]{Manifest.permission.READ_EXTERNAL_STORAGE},
                        READ_EXTERNAL_STORAGE_REQUEST);
                return false;
            }
        }
        // Permission is granted
        return true;
    }

//    @Override
//    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions,
//                                           @NonNull int[] grantResults) {
//        if (requestCode == READ_EXTERNAL_STORAGE_REQUEST) {
//            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
//                // Permission granted, proceed with opening the PDF file
//                openPdfFile();
//            } else {
//                // Permission denied, show a message or handle accordingly
//                Toast.makeText(requireContext(), "Permission denied. Unable to open PDF.", Toast.LENGTH_SHORT).show();
//            }
//        }
//    }

    private void openPdfFile() {
        // Your existing code for opening the PDF file
        // ...
    }
}