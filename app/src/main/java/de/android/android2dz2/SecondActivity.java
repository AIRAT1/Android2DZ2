package de.android.android2dz2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SecondActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);
        TextView textView = (TextView)findViewById(R.id.textView);
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        textView.setText(sdf.format(new Date()));
    }
}
