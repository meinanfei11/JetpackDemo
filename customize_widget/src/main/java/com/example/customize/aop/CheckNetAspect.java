package com.example.customize.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * author : Android 轮子哥
 * github : https://github.com/getActivity/AndroidProject
 * time   : 2020/01/11
 * desc   : 网络检测
 */
@Aspect
public class CheckNetAspect {

    /**
     * 方法切入点
     */
    @Pointcut("execution(@com.hjq.demo.aop.CheckNet * *(..))")
    public void method() {
    }

    /**
     * 在连接点进行方法替换
     */
    @Around("method() && @annotation(checkNet)")
    public void aroundJoinPoint(ProceedingJoinPoint joinPoint, CheckNet checkNet) throws Throwable {
//        Application application = Application.getInstance().getApplication();
//        if (application != null) {
//            ConnectivityManager manager = ContextCompat.getSystemService(application, ConnectivityManager.class);
//            if (manager != null) {
//                NetworkInfo info = manager.getActiveNetworkInfo();
//                // 判断网络是否连接
//                if (info == null || !info.isConnected()) {
//                    ToastUtils.show(R.string.common_network);
//                    return;
//                }
//            }
//        }
//        //执行原方法
//        joinPoint.proceed();
    }
}