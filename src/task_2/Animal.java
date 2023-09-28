package task_4;

import java.io.Serializable;

public class Animal implements Serializable {

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = (int) height;
    }

    public Animal(int age, String name, int height) {
        this.age = age;
        this.name = name;
        this.height = height;
    }
    public int age;
    protected String name;
    private int height;
}



