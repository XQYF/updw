package com.baizhi;

import com.baizhi.dao.AlbumMapper;
import com.baizhi.entity.Album;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = UpdwApplication.class)
public class UpdwApplicationTests {

    @Autowired
    private AlbumMapper albumMapper;
    @Test
    public void contextLoads() {
        Album album = albumMapper.selectByPrimaryKey("1");
        System.out.println(album);
    }
    @Test
    public void test4(){
        // Long value = Long.MAX_VALUE;
        //y=2;
        //System.out.println(value);
        float x = 10/4f;
        System.out.println(x);
    }


}
