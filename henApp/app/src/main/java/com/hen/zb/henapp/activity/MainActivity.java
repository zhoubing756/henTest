package com.hen.zb.henapp.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;

import database.HenDBCopyManager;
import database.HenDBCopyManagerWrap;


/**
 *
 */

public  class MainActivity extends BaseActivity {
    private HenDBCopyManager mHenDBCopyManager;

    @Override
    protected void initView(Bundle savedInstanceState) {
        //View view = new TextView(this);
        //setContentView(view);

        mHenDBCopyManager = HenDBCopyManagerWrap.getInstance(this) ;
        mHenDBCopyManager.init(getPackageName());

    }
}


