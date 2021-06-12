import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.IaccountService;


public class test {
    @Test
    public void test1(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("bean.xml");
        IaccountService ac=(IaccountService) applicationContext.getBean("accountService");
        ac.talk();

    }

    @Test
    public void factoryTest(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("bean.xml");
        IaccountService ac2=(IaccountService) applicationContext.getBean("factoryAccountService");
        ac2.talk();
    }

    @Test
    public void ObjectMappertest(){

    }



}
