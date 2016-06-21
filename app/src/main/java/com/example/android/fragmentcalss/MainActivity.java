package com.example.android.fragmentcalss;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button jingtai, dongtai, fragment, activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        jingtai = (Button) findViewById(R.id.jingtai);
        dongtai = (Button) findViewById(R.id.dongtai);
        fragment = (Button) findViewById(R.id.fragment);
        activity = (Button) findViewById(R.id.activity);

        jingtai.setOnClickListener(new click());
        dongtai.setOnClickListener(new click());
        fragment.setOnClickListener(new click());
        activity.setOnClickListener(new click());
    }

    private class click implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                //静态加载
                case R.id.jingtai:
                    startActivity(new Intent(MainActivity.this, jingActivity.class));
                    break;
                //动态加载
                case R.id.dongtai:
                    Fragmentstill fragmentstill = new Fragmentstill();
                    FragmentManager fragmentManager = getFragmentManager();
                    FragmentTransaction saction = fragmentManager.beginTransaction();
                    saction.add(R.id.layout, fragmentstill);//添加布局
//                  saction.replace(R.id.layout,fragmentstill);//替换布局
                    saction.addToBackStack(null);//又返回的
                    saction.commit();//最后提交
                    break;


                case R.id.fragment:
                    //生命周期

                    break;


                case R.id.activity:
                    //activity and fragment pass on info
                    startActivity(new Intent(getApplicationContext(), Main2Activity.class));

                    break;


            }
        }
    }
}
