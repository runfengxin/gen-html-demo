package com.example.genhtmldemo;

import lombok.Data;

@Data
public class Poem {
    private String first;
    private String second;

    public Poem(String first, String second) {
        this.first = first;
        this.second = second;
    }
}