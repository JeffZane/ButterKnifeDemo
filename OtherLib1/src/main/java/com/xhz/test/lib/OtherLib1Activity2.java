package com.xhz.test.lib;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.widget.Button;

import com.xhz.test.otherlib1.R;
import com.xhz.test.otherlib1.R2;

import butterknife.BindView;
import butterknife.ButterKnife;

public class OtherLib1Activity2 extends Activity {
    @BindView(R2.id.button1) Button button1;

    public static void start(@NonNull Activity activity) {
        activity.startActivity(new Intent(activity, OtherLib1Activity2.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_other_lib1);
        ButterKnife.bind(this);

        button1.setText(String.format("当前时间：%s", CommonUtils.formatTime(System.currentTimeMillis())));
    }
}
