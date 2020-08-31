import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {


    @Bean(name = "cat")
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public POJOCat getPOJOCat() {
        POJOCat pojoCat = new POJOCat("Sphinks", "Nil", 10);
        pojoCat.specification();
        return pojoCat;
    }


    @Bean(name="helloworld")
    @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
    public HelloWorld getHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World!");
        return helloWorld;
    }
}