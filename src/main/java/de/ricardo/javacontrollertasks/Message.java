package de.ricardo.javacontrollertasks;

public class Message {
    private String name;
    private String id;
    private String message;

    // Constructor

    public Message(String name, String id, String message) {
        this.name = name;
        this.id = id;
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
