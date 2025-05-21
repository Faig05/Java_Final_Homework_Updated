package com.finalproject.FinalJavaProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@SpringBootApplication
@Controller
public class MainApplication {

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

    @GetMapping("/{name}/{groupNum}/{project}/{message}/")
    public String customGreeting(
            @PathVariable String name,
            @PathVariable String groupNum,
            @PathVariable String project,
            @PathVariable String message,
            Model model) {

        String formattedMessage = message.replace("-", " ");
        String fullMessage = name + " / " + groupNum + " / " + project + " / " + formattedMessage;

        model.addAttribute("greetings", fullMessage);
        return "htmlcode";
    }
}
