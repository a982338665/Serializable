package pers.li.seri.test;

import pers.li.seri.entity.BPerson;
import pers.li.seri.entity.CPerson;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * 序列化测试
 * {@link CDeserialTest}
 * {@link CSerialTest}
 * {@link CPerson}
 * {@link pers.li.seri.entity2.CPerson2}
 *
 */
public class CSerialTest {

    public static void main(String[] args) throws IOException {
        CPerson person = new CPerson(1234, "wang");
        System.out.println("Person Serial" + person);
        FileOutputStream fos = new FileOutputStream("Person.obj");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(person);
        oos.flush();
        oos.close();
    }
}