package br.com.helloworld.helloworld.model;

import java.util.concurrent.atomic.AtomicLong;

public class Welcome {
    private Long id;
    private String name;
    private String message;

    public Welcome(Long id, String name, String message) {
        this.id = id;
        this.name = name;
        this.message = message;
    }

    public Welcome() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
