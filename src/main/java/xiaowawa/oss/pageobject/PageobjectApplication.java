package xiaowawa.oss.pageobject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("controller")
public class PageobjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(PageobjectApplication.class, args);
	}
}
