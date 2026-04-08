package com.example.weatherapp.util;

import android.app.AlertDialog;
import android.content.Context;

public class NetworkAlertDialogCreator {

    public static AlertDialog.Builder createNetworkAlertDialog(Context context) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle("Weather App")
                .setMessage("No internet connection. Please check your internet connection and try again.")
                .setPositiveButton("OK", (dialog, which) -> {
                    dialog.dismiss();
                });
        return builder;

    }

}
