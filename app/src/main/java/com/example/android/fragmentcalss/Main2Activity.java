package com.example.android.fragmentcalss;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity implements Fragmentinfo.Mylistener {
    private EditText mEditText;
    private Button mButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mEditText = (EditText) findViewById(R.id.view_main2);
        mButton = (Button) findViewById(R.id.butt_main2);
        mButton.setOnClickListener(new ook());

        initview();

    }

    private void initview() {
        FragmentManager manager = getFragmentManager();
        Fragment fragmentById = manager.findFragmentById(R.id.tag);
        Fragmentstill tag = (Fragmentstill) fragmentById;
        tag.setAa("fragment静态传递数据");

    }

    @Override
    public void thank(String code) {
        Toast.makeText(getApplicationContext(), "succeed " + code, Toast.LENGTH_SHORT).show();
    }

    private class ook implements View.OnClickListener {
        @Override
        public void onClick(View v) {
//activity向fragment传参
            String text = mEditText.getText().toString();
            Fragmentinfo fragmentinfo = new Fragmentinfo();
            Bundle bundle = new Bundle();
            bundle.putString("name", text);
            fragmentinfo.setArguments(bundle);//设置参数
            FragmentManager manager = getFragmentManager();//碎片管理者
            FragmentTransaction beginTransaction = manager.beginTransaction();//碎片开始处理
            beginTransaction.add(R.id.layout1, fragmentinfo, "fragmentinfo");
            beginTransaction.addToBackStack(null);
            beginTransaction.commit();

        }
    }

}
