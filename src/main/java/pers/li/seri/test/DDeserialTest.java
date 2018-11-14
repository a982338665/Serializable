package pers.li.seri.test;

import pers.li.seri.entity2.CPerson2;
import pers.li.seri.entity2.DPerson;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * 反序列化测试
 * {@link DDeserialTest}
 * {@link DSerialTest}
 * {@link DPerson}
 * {@link pers.li.seri.entity.DPerson}
 */
public class DDeserialTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //不同包测试，不同包
        pers.li.seri.entity2.DPerson person;
        FileInputStream fis = new FileInputStream("Person.obj");
        ObjectInputStream ois = new ObjectInputStream(fis);
        person = (pers.li.seri.entity2.DPerson) ois.readObject();
        ois.close();
        System.out.println("Person Deserial" + person);
    }

}