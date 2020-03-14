package com.example.coursera;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;


import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getString(R.string.hello_android);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            getColor(R.color.red);
        }

        ContextCompat.getColor(this,R.color.red);
        btn = findViewById(R.id.button);
        text =findViewById(R.id.textView);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(getString(R.string.new_text));
            }
        });

        Bundle bundle = new Bundle();
        bundle.putString("Key","Value");                                                        

    }
}
