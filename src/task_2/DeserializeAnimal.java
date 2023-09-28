package task_4;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class DeserializeAnimal implements Serializable {
    public static void main(String[] args) {

        String filePath = "D:\\КУРС ПО JAVA\\Java Advanced\\№5. Reflection and ClassLoader\\Homework_5\\src\\animal.ser";

        try (FileInputStream fileInputStream = new FileInputStream(filePath);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {

            Animal animal = (Animal) objectInputStream.readObject();

            System.out.println("Имя: " + animal.getName());
            System.out.println("Возраст: " + animal.getAge());
            System.out.println("Высота: " + animal.getHeight());

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}