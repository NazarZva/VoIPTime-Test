package test.operator.app.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import test.operator.app.service.ConversationService;

@Controller
@RequestMapping("/users")
@AllArgsConstructor
public class UserController {
    private final ConversationService conversationService;

    @GetMapping("/close-conversation")
    public String closeConversation() {
        return "users/close";
    }

    @PostMapping("/close-conversation")
    public String getOperator(String conversationId, String submit) {
        if (submit != null) {
            conversationService.delete(Integer.parseInt(conversationId));
        }
        return "users/close";
    }
}
