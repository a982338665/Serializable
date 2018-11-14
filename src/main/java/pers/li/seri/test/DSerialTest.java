package pers.li.seri.test;

import pers.li.seri.entity.CPerson;
import pers.li.seri.entity.DPerson;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * 序列化测试
 * {@link DDeserialTest}
 * {@link DSerialTest}
 * {@link DPerson}
 * {@link pers.li.seri.entity2.DPerson}
 *
 */
public class DSerialTest {

    public static void main(String[] args) throws IOException {
        DPerson person = new DPerson(1234, "wang");
        System.out.println("Person Serial" + person);
        FileOutputStream fos = new FileOutputStream("Person.obj");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(person);
        oos.flush();
        oos.close();
    }
}