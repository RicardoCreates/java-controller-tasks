package de.ricardo.javacontrollertasks;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class MessageController {

    //BOnus Task List
    private List<Message> messages = new ArrayList<>();

    @PostMapping("/messages")
    public Message createMessage(@RequestBody Message newMessage) {
        messages.add(newMessage);
        return newMessage;
    }

    @GetMapping("/messages")
    public List<Message> getAllMessages() {
        return messages;
    }

    @DeleteMapping("/messages/{id}")
    public String deleteMessage(@PathVariable String id) {
        messages.removeIf(message -> message.getId().equals(id));
        return "Message with id " + id + " was deleted";
    }

}
