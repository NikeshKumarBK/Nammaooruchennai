package com.example.cachii.nammaooruchennai;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


public class developers extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.developers);


    }

    @Override
    public void onBackPressed() {
        Intent intent=new Intent(developers.this,FirstScreen.class);
        startActivity(intent);
        finish();
    }
}
