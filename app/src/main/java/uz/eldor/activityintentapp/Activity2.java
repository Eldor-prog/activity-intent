package uz.eldor.activityintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    private TextView textView1;
    private TextView textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        textView1 = findViewById(R.id.text_view1);
        textView2 = findViewById(R.id.text_view2);

        Intent intent = getIntent();
        String textview1 = intent.getStringExtra("textview1");
        String textview2 = intent.getStringExtra("textview2");

        textView1.setText(textview1);
        textView2.setText(textview2);

    }
}