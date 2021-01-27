package com.nefamutiara.my_layout_profile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.nefamutiara.my_layout_profile.R;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {
    Button btn1 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.btn_profilku);
        btn1.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case (R.id.btn_profilku):
                Intent intent = new Intent(MainActivity.this,MainProfile.class);
                startActivity(intent);
                break;
        }
    }
}