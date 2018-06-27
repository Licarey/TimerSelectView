package cn.com.timerview.timerselectview;

import android.app.Application;

/**
 * Created by liming on 2018/6/27.
 * email liming@finupgroup.com
 */
public class App extends Application {
    public static App mInstance;
    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
    }

    public static App getmInstance(){
        return mInstance;
    }
}
