package com.bwei.lenovo.proworkone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.bwei.lenovo.proworkone.home.presenter.HomeListPresenter;
import com.bwei.lenovo.proworkone.home.view.IHomeListView;


public class MainActivity extends AppCompatActivity implements IHomeListView {

    private TextView viewById;
    private HomeListPresenter homeListPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewById = findViewById(R.id.tv);

        //初始化
        homeListPresenter = new HomeListPresenter(MainActivity.this);
        homeListPresenter.getModelDate();
       /* homeListPresenter = new HomeListPresenter(this);
        homeListPresenter.getModelDate();*/


    }

    @Override
    public void getViewData(String mViewData) {
        viewById.setText(mViewData);
    }
}
