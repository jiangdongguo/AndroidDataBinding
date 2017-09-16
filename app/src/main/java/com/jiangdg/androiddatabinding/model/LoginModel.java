package com.jiangdg.androiddatabinding.model;

/**模拟请求服务器用户登录
 *
 * Created by jianddongguo on 2017/9/15.
 * http://blog.csdn.net/andrexpert
 */

public class LoginModel{
    private static final String name = "jiangdongguo";
    private static final String passwd = "123";

    public interface VerifyOnResultListener{
        void onSuccess();
        void onFailure();
    }

    public void verifyUserPswd(final String usrName,final int usrPasswd,final VerifyOnResultListener listener) {
        // 耗时任务，在子线程中进行
        new Thread(new Runnable() {
            @Override
            public void run() {
                // 延时3s用于模拟请求服务器登录
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if(name.equals(usrName) && passwd.equals(String.valueOf(usrPasswd))) {
                    //验证成功
                    listener.onSuccess();
                }else{
                    // 验证失败
                    listener.onFailure();
                }
            }
        }).start();
    }

}
