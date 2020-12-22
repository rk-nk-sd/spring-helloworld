import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld beanHello2 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(beanHello2.getMessage());
        if(bean == beanHello2){
            System.out.println("----------------");
            System.out.println(true + "\n");
        }

        Cat beanCat1 =
                (Cat) applicationContext.getBean("cat");
        beanCat1.setName("Рыжик");
        System.out.println(beanCat1.getName());

        Cat beanCat2 = (Cat) applicationContext.getBean("cat");
        System.out.println(beanCat2.getName());
        if(beanCat1 != beanCat2) {
            System.out.println("----------------");
            System.out.println(false + "\n");
        }
    }
}