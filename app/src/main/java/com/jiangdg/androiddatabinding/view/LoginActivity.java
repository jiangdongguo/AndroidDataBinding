package com.jiangdg.androiddatabinding.view;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jiangdg.androiddatabinding.R;
import com.jiangdg.androiddatabinding.databinding.ActivityLoginBinding;
import com.jiangdg.androiddatabinding.viewmodel.UserInfo;

/** LoginActivity的View层
 *
 * Created by jianddongguo on 2017/9/15.
 */
public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityLoginBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_login);
        // 绑定数据到view
        UserInfo info = new UserInfo("zhangsan",1111);
        binding.setUser(info);
    }
}
