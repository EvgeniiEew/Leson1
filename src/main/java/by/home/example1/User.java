package by.home.example1;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class User {
    private String name;
    private int age;

    public String userSay(String string) {
        return string.concat("a");
    }

    public String toJson(Object toJson) throws JsonProcessingException {
        return new ObjectMapper().writeValueAsString(toJson);

    }

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
