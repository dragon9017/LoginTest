package com.logintest.logintest.modal.service.serviceimp;
import com.logintest.logintest.modal.mapper.userMapper.UserMapper;
import com.logintest.logintest.modal.service.userService.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Auther lby
 * @Date 2020/8/7
 */
@Service
public class UserServiceimp implements UserService {
    @Resource
    private UserMapper userMappe;
    @Override
    public String SelectPowerById(Integer id) {
        String s = userMappe.SelectPowerById(id);
        return s;
    }
}
