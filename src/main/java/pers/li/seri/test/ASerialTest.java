package pers.li.seri.test;

import pers.li.seri.entity.APerson;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * 序列化测试
 * {@link ADeserialTest}
 * {@link ASerialTest}
 * {@link APerson}
 *
 */
public class ASerialTest {

    public static void main(String[] args) throws IOException {
        APerson person = new APerson(1234, "wang");
        System.out.println("Person Serial" + person);
        FileOutputStream fos = new FileOutputStream("Person.obj");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(person);
        oos.flush();
        oos.close();
    }
}