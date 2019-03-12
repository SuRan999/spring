package teat;

import com.baizhi.application;
import com.baizhi.dao.PictureMapper;
import com.baizhi.entity.Picture;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = application.class)
public class testss {

    @Autowired
    private PictureMapper pm;

    @Test
    public void test1(){

        int i = pm.insert(new Picture("sadf", "fadf", "sdfa", null, null));

        System.out.println(i);

    }
}
