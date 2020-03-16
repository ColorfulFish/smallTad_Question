package com.small.tadpole.service.user.wx;
/*
 * @Author xu.chenyang
 * @Email chenyang.xu@linkkids.cn
 * @Description
 * @Date 9:38 2020/3/13
 **/

import com.small.tadpole.domain.User;

public interface WxUserOption {
    /**
     * 更新sessoin
     * @param user
     * @return
     */
    public int updateWxSession(User user);

    /**
     * 获取一个用户
     * @param code
     * @return
     */
    public User getOneUser(String code);
}
