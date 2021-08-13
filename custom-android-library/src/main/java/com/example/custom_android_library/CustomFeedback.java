package com.example.custom_android_library;

import android.app.Activity;
import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class CustomFeedback {
    private static Snackbar snackbar;
    private static final int ICON_PADDING_SNACKBAR = 55;
    private static int SNACKBAR_DURATION = 450;
    private static final String GREEN = "#478F3D";
    private static final String RED = "#D6392E";
    private static Toast toast;

    // Show green snackbar with icon and text
    public static void showGreenSnackbar(String message, Activity activity) {
        snackbar = Snackbar.make(activity.findViewById(android.R.id.content), message, SNACKBAR_DURATION);
        View snackbarView = snackbar.getView();
        snackbarView.setBackgroundColor(Color.parseColor(GREEN));

        TextView snackbarText = snackbarView.findViewById(com.google.android.material.R.id.snackbar_text);
        snackbarText.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_vector_checkmark, 0, 0, 0);
        snackbarText.setCompoundDrawablePadding(ICON_PADDING_SNACKBAR);
        snackbarText.setGravity(Gravity.CENTER);

        FrameLayout.LayoutParams params = (FrameLayout.LayoutParams)snackbarView.getLayoutParams();
        params.width = FrameLayout.LayoutParams.MATCH_PARENT;
        snackbarView.setLayoutParams(params);

        snackbar.show();
    }

    // Show red snackbar with icon and text
    public static void showRedSnackbar(String message, Activity activity) {
        snackbar = Snackbar.make(activity.findViewById(android.R.id.content), message, SNACKBAR_DURATION);
        View snackbarView = snackbar.getView();
        snackbarView.setBackgroundColor(Color.parseColor(RED));

        TextView snackbarText = snackbarView.findViewById(com.google.android.material.R.id.snackbar_text);
        snackbarText.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_vector_cross, 0, 0, 0);
        snackbarText.setCompoundDrawablePadding(ICON_PADDING_SNACKBAR);
        snackbarText.setGravity(Gravity.CENTER);

        FrameLayout.LayoutParams params = (FrameLayout.LayoutParams)snackbarView.getLayoutParams();
        params.width = FrameLayout.LayoutParams.MATCH_PARENT;
        snackbarView.setLayoutParams(params);

        snackbar.show();
    }

    // Display toast anchored to top of screen
    public static void displayToastTop(String message, Activity activity) {
        toast = Toast.makeText(activity, message, Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.TOP, 0, 250);
        toast.show();
    }

    // Display toast anchored to bottom of screen
    public static void displayToastBottom(String message, Activity activity) {
        Toast.makeText(activity, message, Toast.LENGTH_SHORT).show();
    }

}
