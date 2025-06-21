package com.fuck.Go.Author;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class PermissionHandler implements InvocationHandler {

    private final UserService target;
    private final Map<String, Boolean> permissionMap = new HashMap<>();

    public PermissionHandler(UserService target) {
        this.target = target;
        // 模拟权限：只允许查看，不允许编辑
        permissionMap.put("viewProfile", true);
        permissionMap.put("editProfile", false);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String methodName = method.getName();
        String userId = (String) args[0];

        System.out.println("[权限检查] 方法：" + methodName + " 用户ID：" + userId);

        if (permissionMap.getOrDefault(methodName, false)) {
            return method.invoke(target, args);
        } else {
            System.out.println("❌ 权限不足: 用户没有 " + methodName + " 权限。");
            return null;
        }
    }
}
