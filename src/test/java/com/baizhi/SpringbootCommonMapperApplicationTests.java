package com.baizhi;

import com.baizhi.entity.User;
import com.baizhi.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootCommonMapperApplicationTests {

    @Autowired
    UserMapper userMapper;
    @Test
    public void testSelectOne() {
        User user = new User(1,null,"123456",null);
        User user1 = userMapper.selectOne(user);
        System.out.println(user1);
    }

}

