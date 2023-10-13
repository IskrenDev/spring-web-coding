package de.ir.springwebcoding;

public class Message {
    private String name;

    private String message;

    private String id;

    public Message(String name, String message, String id) {
        this.name = name;
        this.message = message;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Message{" +
                "name='" + name + '\'' +
                ", message='" + message + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
