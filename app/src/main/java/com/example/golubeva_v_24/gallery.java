package com.example.golubeva_v_24;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class gallery extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
    }

    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.WebCl:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://developer.android.com"));
                startActivity(intent);
                break;
            case R.id.Back:
                intent = new Intent(this, Start.class);
                startActivity(intent);
                break;
        }
    }
}

