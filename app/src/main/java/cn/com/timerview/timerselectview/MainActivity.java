package cn.com.timerview.timerselectview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimeSectionPicker timeSectionPicker = findViewById(R.id.time);
        int start = timeSectionPicker.getTimeNumber(13, 0);
        int end = timeSectionPicker.getTimeNumber(18, 0);
        timeSectionPicker.addUsed(new int[]{start, end});
    }
}
