package com.jingchen.pulltorefresh.activity;

import com.jingchen.pulltorefresh.MyPullListener;
import com.jingchen.pulltorefresh.R;
import com.jingchen.pulltorefresh.PullToRefreshLayout;

import android.app.Activity;
import android.os.Bundle;

public class PullableImageViewActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_imageview);
		PullToRefreshLayout ptr = (PullToRefreshLayout) findViewById(R.id.refresh_view);
		ptr.setOnPullListener(new MyPullListener());
	}
}
