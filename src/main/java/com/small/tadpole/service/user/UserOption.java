package com.small.tadpole.service.user;

import com.small.tadpole.domain.User;
import com.small.tadpole.domain.UserExample;

/*
 * @Author xu.chenyang
 * @Email chenyang.xu@linkkids.cn
 * @Description
 * @Date 9:20 2020/3/13
 **/
public interface UserOption {
    /**
     * 判断用户是否登陆过
     * @param user
     * @return
     */
    boolean isLogin(User user);

    /**
     * 创建一个用户
     * @param user
     * @return
     */
    int createUser(User user);
}
