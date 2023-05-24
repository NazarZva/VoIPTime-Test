package test.operator.app.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import test.operator.app.service.ConversationGenerator;
import test.operator.app.thread.GeneratorThread;

@Controller
@RequestMapping("/generation")
@AllArgsConstructor
public class StartController {
    private final ConversationGenerator conversationGenerator;

    @GetMapping("/start")
    public String startGeneration() {
        Thread generator = new Thread(new GeneratorThread(conversationGenerator));
        generator.start();
        return "start";
    }
}
