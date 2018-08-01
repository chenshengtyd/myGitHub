import com.yeahsir.entity.Pet;
import com.yeahsir.service.IPetService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by Yegz on 2017/9/14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring-mybatis.xml"})
public class TestMybatis {

    private static Logger logger = Logger.getLogger(TestMybatis.class);

    @Resource
    IPetService petService;

    @Test
    public void testQueryById(){
        Pet pet = petService.selectByPrimaryKey(new Integer(1));
        logger.info(pet.toString());
    }
}
