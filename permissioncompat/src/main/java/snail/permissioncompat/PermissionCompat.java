package snail.permissioncompat;

import com.annotation.annotion.OnGrantedListener;

/**
 * Author: hzlishang
 * Data: 16/10/28 下午5:39
 * Des:
 * version:
 */
public class PermissionCompat {

    public static void request(BasePermissionCompatActivity activity) {

//        找到自己的listner列表
//        是否声明
//        Elementrequest elementrequest = findElementrequest();
//        activity.setFinishOnTouchOutside();
    }

//    private static Elementrequest findElementrequest() {
//
//    }


    static void checkPermmison(BasePermissionCompatActivity target) {
        if (PermissionUtils.hasSelfPermissions(target, null)) {
        } else {
            if (PermissionUtils.shouldShowRequestPermissionRationale(target, null)) {
//                target
            } else {
//                ActivityCompat.requestPermissions(target, {"",""},1);
            }
        }
    }

    private OnGrantedListener findGrantedListener() {
        OnGrantedListener listener = null;
        return listener;
    }
}