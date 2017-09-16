package com.jiangdg.androiddatabinding.viewmodel;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;

import com.jiangdg.androiddatabinding.model.LoginModel;
import com.jiangdg.androiddatabinding.view.KnowledgeActivity;

/** LoginActivity的ViewModel层
 *
 * Created by jianddongguo on 2017/9/15.
 */

public class UserInfo extends ViewModel{

    private String userName;
    private int userPswd;

    public UserInfo(String userName, int userPswd) {
        this.userName = userName;
        this.userPswd = userPswd;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserPswd() {
        return userPswd;
    }

    public void setUserPswd(int userPswd) {
        this.userPswd = userPswd;
    }

    // 处理登录事件业务逻辑
    public void onLoginBtnClick(final View view){
        new LoginModel().verifyUserPswd(getUserName(), getUserPswd(), new LoginModel.VerifyOnResultListener() {
            @Override
            public void onSuccess() {
                Intent intent = new Intent(view.getContext(), KnowledgeActivity.class);
                view.getContext().startActivity(intent);
            }

            @Override
            public void onFailure() {

            }
        });
    }
}
