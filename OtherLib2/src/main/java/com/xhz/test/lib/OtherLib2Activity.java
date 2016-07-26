package com.xhz.test.lib;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.xhz.test.otherlib2.R;
import com.xhz.test.otherlib2.R2;

import butterknife.BindView;
import butterknife.ButterKnife;

public class OtherLib2Activity extends Activity {
    @BindView(R2.id.button1) Button button1;

    public static void start(@NonNull Activity activity) {
        activity.startActivity(new Intent(activity, OtherLib2Activity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_other_lib2);
        ButterKnife.bind(this);

        button1.setText(String.format("当前时间：%s", CommonUtils.toExactString(System.currentTimeMillis())));
    }
}
