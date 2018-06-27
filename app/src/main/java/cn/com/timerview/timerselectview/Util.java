package cn.com.timerview.timerselectview;

import android.content.Context;

/**
 * Created by liming on 2018/6/27.
 * email liming@finupgroup.com
 */
public class Util {
    /**
     * dp转换成px
     */
    public static int dp2px(Context context, float dpValue){
        float scale=context.getResources().getDisplayMetrics().density;
        return (int)(dpValue*scale+0.5f);
    }
}
