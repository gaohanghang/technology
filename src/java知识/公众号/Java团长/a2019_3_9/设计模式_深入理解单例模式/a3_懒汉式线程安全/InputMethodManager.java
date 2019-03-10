package java知识.公众号.Java团长.a2019_3_9.设计模式_深入理解单例模式.a3_懒汉式线程安全;

import com.sun.deploy.services.ServiceManager;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2019/03/09 21:40
 */
public class InputMethodManager {

    // static InputMethodManager sInstance;
    //
    // /**
    //  * Retrieve the global InputMethodManager instance, creating it if it
    //  * doesn't already exist.
    //  * @hide
    //  */
    // public static InputMethodManager getInstance() {
    //     synchronized (InputMethodManager.class) {
    //         if (sInstance == null) {
    //             IBinder b = ServiceManager.getService(Context.INPUT_METHOD_SERVICE);
    //             IInputMethodManager service = IInputMethodManager.Stub.asInterface(b);
    //             sInstance = new InputMethodManager(service, Looper.getMainLooper());
    //         }
    //         return sInstance;
    //     }
    // }
}
