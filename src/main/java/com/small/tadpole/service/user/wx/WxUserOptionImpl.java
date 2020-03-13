package com.small.tadpole.service.user.wx;

import com.small.tadpole.domain.User;
import com.small.tadpole.domain.UserExample;
import com.small.tadpole.mapper.UserMapper;
import com.small.tadpole.service.user.UserOption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
 * @Author xu.chenyang
 * @Email chenyang.xu@linkkids.cn
 * @Description
 * @Date 9:23 2020/3/13
 **/
@Service("wxUserOptionImpl")
public class WxUserOptionImpl implements UserOption,WxUserOption {

    @Autowired
    private UserMapper userMapper;
    /**
     * 判断用户是否登陆过
     *
     * @param user
     * @return
     */
    @Override
    public boolean isLogin(User user) {
        UserExample userExample = new UserExample();
        userExample.newAndCreateCriteria().andOpenidEqualTo(user.getOpenid());
        long count = userMapper.countByExample(userExample);
        if (count > 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 创建一个用户
     *
     * @param user
     * @return
     */
    @Override
    public int createUser(User user) {
        return userMapper.insert(user);
    }

    /**
     * 刷新用户的 session
     * @param user
     * @return
     */
    @Override
    public int updateWxSession(User user) {
        UserExample userExample = new UserExample();
        userExample.newAndCreateCriteria().andOpenidEqualTo(user.getOpenid());
        return userMapper.updateByExample(user,userExample);
    }
}
