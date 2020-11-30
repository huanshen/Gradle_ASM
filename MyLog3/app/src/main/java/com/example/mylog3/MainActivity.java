package com.example.mylog3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.koala.KoalaLog;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        printPerson(new Person(18,"name"), 3, false, (byte)1,'w' );
    }

    @KoalaLog
    private Person printPerson(Person person, int x, boolean flag, byte time, char temp) {
        Log.i(TAG, "flag is " + flag);
        Log.i(TAG, "time is " + time);
        Log.i(TAG, "temp is " + temp);
        person.setName("new Name");
        person.setAge(x);
        return person;
    }
}