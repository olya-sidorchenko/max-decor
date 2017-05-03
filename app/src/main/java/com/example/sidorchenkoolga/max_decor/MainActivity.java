package com.example.sidorchenkoolga.max_decor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button userSettingsButton = (Button)findViewById(R.id.userSettingsButton);
        userSettingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ActUser = new Intent(getApplicationContext(), UserSettingsActivity.class);
                startActivity(ActUser);
            }
        });

        Button clientEditorButton = (Button)findViewById(R.id.clientEditorButton);
        clientEditorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ClientEd = new Intent(getApplicationContext(), client_editor.class);
                startActivity(ClientEd);
            }
        });
    }
}
