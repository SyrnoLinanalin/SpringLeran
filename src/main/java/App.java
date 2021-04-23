import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld beanagain =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(beanagain.getMessage());
        Cat mycat =
                (Cat) applicationContext.getBean("cat");

        Cat yourcat =
                (Cat) applicationContext.getBean("cat");

        System.out.println("Это ссылка на один бин? " + (bean==beanagain));
        System.out.println("Это ссылка на один бин? " + (mycat==yourcat));


    }
}