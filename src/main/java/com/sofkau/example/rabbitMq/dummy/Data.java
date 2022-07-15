package com.sofkau.example.rabbitMq.dummy;

import java.io.Serializable;

public class Data implements Serializable {

    private static final long serialVersionUID = 1L;

    private long id;

    private String message;

    public Data(long id, String message) {
        this.id = id;
        this.message = message;
    }

    public long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "Data{" +
                "id=" + id +
                ", message='" + message + '\'' +
                '}';
    }
}
