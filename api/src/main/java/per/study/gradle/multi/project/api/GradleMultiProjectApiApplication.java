package per.study.gradle.multi.project.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangbin
 **/
@SpringBootApplication
@RestController
@RequestMapping("/api")
public class GradleMultiProjectApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(GradleMultiProjectApiApplication.class, args);
    }

    @GetMapping("/hello")
    public Object hello() {
        return "Gradle Multi Project: API";
    }
}
