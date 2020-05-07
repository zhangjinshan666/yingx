package com.baizhi.zjs;

import com.baizhi.zjs.dao.AdminDao;

import com.baizhi.zjs.entity.Admin;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class YingxApplicationTests {
@Resource
    AdminDao adminDao;
    @Test
    public void contextLoads() {
        System.out.println("12324");
       /* Admin admin1 = adminDao.queryAll();
        System.out.println(admin1);*/

    }

}
