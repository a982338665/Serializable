package pers.li.seri.test;

import pers.li.seri.entity.APerson;
import pers.li.seri.entity.BPerson;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * 序列化测试
 * {@link BDeserialTest}
 * {@link BSerialTest}
 * {@link pers.li.seri.entity.BPerson}
 *
 */
public class BSerialTest {

    public static void main(String[] args) throws IOException {
        BPerson person = new BPerson(1234, "wang");
        System.out.println("Person Serial" + person);
        FileOutputStream fos = new FileOutputStream("Person.obj");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(person);
        oos.flush();
        oos.close();
    }
}