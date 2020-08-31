import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean1.getMessage());

        POJOCat bean2 =
                (POJOCat) applicationContext.getBean("cat");
        System.out.println(bean2.specification());

        POJOCat bean3 =
                (POJOCat) applicationContext.getBean("cat");
        System.out.println(bean3.specification());

        boolean one = bean == bean1;
        boolean two = bean2 == bean3;

        System.out.println(one);
        System.out.println(two);

    }
}