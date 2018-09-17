package com.sby.blog;

import com.sby.blog.entity.User;
import com.sby.blog.mapper.UserMapper;
import com.sby.blog.utils.RedisUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BlogApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RedisUtil redisUtil;

    /**
     * 测试mybatis plus的集成
     */
    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
        Assert.assertEquals(1, userList.size());
        userList.forEach(System.out::println);
    }

    /**
     * 测试redis集成
     */
    @Test
    public void testRedis() {
        redisUtil.set("666","测试数据666");

        System.out.println(redisUtil.get("666"));
    }
}
