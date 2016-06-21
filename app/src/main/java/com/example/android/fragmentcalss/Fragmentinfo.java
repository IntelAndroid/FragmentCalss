package com.example.android.fragmentcalss;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

/**
 * Created by Android on 2016/6/15.
 */
public class Fragmentinfo extends Fragment {
    EditText mEditText;


    //fragment向activity传参
    private String txt = "Hello World!";
    private Mylistener mMylistener;

    public interface Mylistener {
        public void thank(String code);
    }

    @Override
    public void onAttach(Activity activity) {
        mMylistener= (Mylistener) activity;
        super.onAttach(activity);
    }

    @Nullable
    @Override//activity向fragment传参
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.view, container, false);
        mEditText = (EditText) view.findViewById(R.id.view_one1);
        String text = getArguments().get("name") + "";
        mEditText.setText(text);//activity向fragment传参
        mMylistener.thank(txt);//fragment向activity传参
        return view;
    }
}
