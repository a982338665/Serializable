package pers.li.seri.test;

import pers.li.seri.entity.BPerson;
import pers.li.seri.entity2.CPerson2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * 反序列化测试
 * {@link CDeserialTest}
 * {@link CSerialTest}
 * {@link CPerson2}
 * {@link pers.li.seri.entity.CPerson}
 */
public class CDeserialTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //不同包测试
        CPerson2 person;
        FileInputStream fis = new FileInputStream("Person.obj");
        ObjectInputStream ois = new ObjectInputStream(fis);
        person = (CPerson2) ois.readObject();
        ois.close();
        System.out.println("Person Deserial" + person);
    }

}