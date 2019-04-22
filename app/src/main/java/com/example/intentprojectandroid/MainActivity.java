package com.example.intentprojectandroid;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = findViewById(R.id.editText2);
                String s = editText.getText().toString();
                Log.d("editText2",s);
                Intent intent1 = new Intent();
                intent1.setAction(Intent.ACTION_VIEW);

                intent1.setData(Uri.parse(s));
                Intent choose = Intent.createChooser(intent1,"请选择一个浏览器");
                startActivity(choose);
            }
        });

    }
}
