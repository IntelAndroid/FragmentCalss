package com.example.android.fragmentcalss;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Android on 2016/6/15.
 */
public class Fragmentperiod extends Fragment {


    //加载布局每次都绘制view
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);


    }

    //附件在activity
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    //只调用一次在创建
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    //在activity中创建
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    //开始启动
    @Override
    public void onStart() {


    }

    //重新开始恢复
    @Override
    public void onResume() {
        super.onResume();
    }

    //暂停
    @Override
    public void onPause() {
        super.onPause();
    }

    //停止
    @Override
    public void onStop() {
        super.onStop();
    }

    //消除view
    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    //销毁fragment
    @Override
    public void onDestroy() {
        super.onDestroy();
    }


    //从Activity分离销毁
    @Override
    public void onDetach() {
        super.onDetach();
    }
}
