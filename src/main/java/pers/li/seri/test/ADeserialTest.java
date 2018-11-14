package pers.li.seri.test;

import pers.li.seri.entity.APerson;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * 反序列化测试
 * {@link ADeserialTest}
 * {@link ASerialTest}
 * {@link APerson}
 */
public class ADeserialTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        APerson person;
        FileInputStream fis = new FileInputStream("Person.obj");
        ObjectInputStream ois = new ObjectInputStream(fis);
        person = (APerson) ois.readObject();
        ois.close();
        System.out.println("Person Deserial" + person);
    }

}