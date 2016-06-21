package com.example.android.fragmentcalss;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class jingActivity extends AppCompatActivity {
    private EditText mEditText;
    private Button mButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jing);
        mEditText= (EditText) findViewById(R.id.view_one);
        mButton= (Button) findViewById(R.id.butt);
        mButton.setOnClickListener(new ok());
    }

    private class ok implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            mEditText.setText("222222222222");
        }
    }
}
