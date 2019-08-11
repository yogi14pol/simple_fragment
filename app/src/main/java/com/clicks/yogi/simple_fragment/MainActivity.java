package com.clicks.yogi.simple_fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button fragment1, fragment2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragment1 = findViewById(R.id.Fragments1);
        fragment2 = findViewById(R.id.Fragments2);
    }

    public void hello(View view1) {

        switch (view1.getId()) {

            case R.id.Fragments1:
                loadFragment(new Fragment1());
                break;
            case R.id.Fragments2:
                loadFragment(new Fragment2());
                break;
        }
    }

    private void loadFragment(Fragment f) {

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.MyFrame, f);
        fragmentTransaction.commit();
    }
}