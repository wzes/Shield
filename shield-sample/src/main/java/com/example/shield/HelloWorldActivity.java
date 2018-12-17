package com.example.shield;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.shield.learn.HelloWorldFragment;
import com.example.shield.learn.agent.HelloWorldAgent;

public class HelloWorldActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_world);

        FragmentManager fm = getSupportFragmentManager();

        HelloWorldFragment fragment = new HelloWorldFragment();

        fm.beginTransaction().add(R.id.fragment, fragment).commit();
    }
}
