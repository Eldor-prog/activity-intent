package uz.eldor.activityintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private EditText editText1;
    private EditText editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        editText1 = findViewById(R.id.edit_text1);
        editText2 = findViewById(R.id.edit_text2);

        button.setOnClickListener(v -> {
            openActivity2();
        });

    }

    private void openActivity2() {
        String text1 = editText1.getText().toString();
        String text2 = editText2.getText().toString();
        Intent intent = new Intent(this, Activity2.class);
        intent.putExtra("textview1", text1);
        intent.putExtra("textview2", text2);
        startActivity(intent);
    }
}