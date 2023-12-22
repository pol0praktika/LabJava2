package ru.olga.labjava2;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private TextView textViewResult;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        Button buttonShowText = findViewById(R.id.buttonShowText);
        textViewResult = findViewById(R.id.textViewResult);

        buttonShowText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showEnteredText();
            }
        });
    }

    private void showEnteredText() {
        String enteredText = editText.getText().toString();
        textViewResult.setText("Текст: " + enteredText);
    }
}