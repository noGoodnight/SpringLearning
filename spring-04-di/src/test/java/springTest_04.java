import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class springTest_04 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.toString());
    }

    @Test
    public void userTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("UserConfig.xml");
        User user = context.getBean("user",User.class);
        System.out.println(user.toString());
    }
}
