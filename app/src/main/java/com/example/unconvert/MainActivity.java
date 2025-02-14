package com.example.unconvert;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;
    private EditText editTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        textView = findViewById(R.id.textView2);
        editTextView = findViewById(R.id.editTextView);

//      THIS WAS BY EVENT LISTENER
//        button.setOnClickListener(new View.OnClickListener() {
//            @SuppressLint("SetTextI18n")
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, "Button Clicked", Toast.LENGTH_SHORT).show();
//                String s = editTextView.getText().toString();
//                double kg = Double.parseDouble(s);
//                double pound  = kg * 2.20462;
//                textView.setText("The corresponding value in Pounds is: " + pound + " Pounds.");
//            }
//        });


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }


// NOW, MAKING BUTTON RESPONSIVE VIA CALLING A FUNCTION
    @SuppressLint("SetTextI18n")
    public void calculate(View view) {
        Toast.makeText(MainActivity.this, "Button Clicked", Toast.LENGTH_SHORT).show();
        String s = editTextView.getText().toString();
        double kg = Double.parseDouble(s);
        double pound  = kg * 2.20462;
        textView.setText("The corresponding value in Pounds is: " + pound + " Pounds.");
    }
}