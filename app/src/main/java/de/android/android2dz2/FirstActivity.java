package de.android.android2dz2;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.view.View;

public class FirstActivity extends Activity {
    private final String LOG = "log";
//    private final String SHOW_TIME = "showtime";
    private final String SHOW_TIME = "showtime1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);
    }

    public void onClick(View view) {
//        Intent intent = new Intent(SHOW_TIME);
//        List<ResolveInfo> resolveInfo = getPackageManager()
//                .queryIntentActivities(intent, PackageManager.GET_RESOLVED_FILTER);
//        if (resolveInfo.isEmpty()) {
//            Log.d(LOG, "No activities");
//            showMessage();
//        }else {
//            startActivity(intent);
//        }
        try {
            startActivity(new Intent(SHOW_TIME));
        } catch (Exception e) {
            e.printStackTrace();
            Log.d(LOG, "Error!");
            showMessage();
        }
    }

    private void showMessage() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Warning!")
                .setMessage("No activities with name " + SHOW_TIME)
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                }).create().show();
    }
}