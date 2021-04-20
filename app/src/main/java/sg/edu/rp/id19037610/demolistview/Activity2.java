package sg.edu.rp.id19037610.demolistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Intent intent = getIntent();
        String text = intent.getStringExtra(Intent.EXTRA_TEXT);

        tv = (TextView) findViewById(R.id.textView);
        tv.setText(text);
    }
}