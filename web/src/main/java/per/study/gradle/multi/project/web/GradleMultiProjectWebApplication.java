package per.study.gradle.multi.project.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author yangbin
 **/
@SpringBootApplication
@Controller
public class GradleMultiProjectWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(GradleMultiProjectWebApplication.class, args);
    }

    @GetMapping("/hello")
    public ModelAndView hello(Model model) {
        model.addAttribute("msg", "Gradle Multi Project: WEB");
        return new ModelAndView("hello", "model", model);
    }
}
