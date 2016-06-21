package com.example.android.fragmentcalss;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Android on 2016/6/15.
 */
public class Fragmentstill extends Fragment {
private EditText mEditText;
    private Button mButton;


    public  String aa;

    public String getAa() {
        return aa;
    }

    public void setAa(String aa) {
        this.aa = aa;
    }

    @Nullable
    @Override                      //添加布局 ，ViewGroup的内容container ，不添加父类布局填false
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.still_view,container,false);
        mEditText= (EditText) view.findViewById(R.id.view_one);
        mButton= (Button) view.findViewById(R.id.butt);

        mButton.setOnClickListener(new onclick());

        return view;

    }

    private class onclick implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            String aa = getAa();
            Toast.makeText(getActivity(),aa,Toast.LENGTH_SHORT).show();
            mEditText.setText("111111111111");
        }
    }
}
