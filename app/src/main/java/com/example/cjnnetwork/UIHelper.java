package com.example.cjnnetwork;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;

import androidx.appcompat.app.AlertDialog;
import androidx.lifecycle.Lifecycle;

public class UIHelper {


    private static UIHelper uiHelper = null;


    private UIHelper() {
        // No instance
    }

    public static UIHelper getInstance() {
        if (uiHelper == null) {
            uiHelper = new UIHelper();
        }
        return uiHelper;
    }


    /**
     * Show message in SnackBar
     *
     * @param context   Activity context
     * @param message   message to be shown on toast
      *                  current fragment only
     */
    public AlertDialog showMessage(Context context, String message) {

        AlertDialog alertDialog = null;
        if (TextUtils.isEmpty(message))
            return null;

        try {

            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setTitle("CJN");
            builder.setMessage(message);
            builder.setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            alertDialog = builder.create();

            if (!alertDialog.isShowing() && alertDialog != null) {
                alertDialog.setCanceledOnTouchOutside(false);
                alertDialog.show();

            }


        } catch (Exception e) {
        }

        return alertDialog;
    }

}
