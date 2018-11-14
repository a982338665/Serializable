package pers.li.seri.test;

import pers.li.seri.entity.APerson;
import pers.li.seri.entity.BPerson;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * 反序列化测试
 * {@link BDeserialTest}
 * {@link BSerialTest}
 * {@link pers.li.seri.entity.BPerson}
 */
public class BDeserialTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        BPerson person;
        FileInputStream fis = new FileInputStream("Person.obj");
        ObjectInputStream ois = new ObjectInputStream(fis);
        person = (BPerson) ois.readObject();
        ois.close();
        System.out.println("Person Deserial" + person);
    }

}