package com.ringsterz.tensorflow_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.tensorflow.Tensor;

public class MainActivity extends AppCompatActivity {

    static {
        System.loadLibrary("tensorflow_inference");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Tensor c = Tensor.create(3.0f);

        TextView tv = (TextView) findViewById(R.id.textView);
        tv.setText(String.valueOf(c.floatValue()));
    }
}
