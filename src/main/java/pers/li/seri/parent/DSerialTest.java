package pers.li.seri.parent;

import pers.li.seri.entity.DPerson;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class DSerialTest {

    public static void main(String[] args) throws IOException {
        //序列化前：-------------------------------------------------
        Girl person = new Girl(1234, "wang");
        person.setAge(12);
        person.setLeg("leg");
        System.out.println("girl序列化前:" + person);
        FileOutputStream fos = new FileOutputStream("girl.obj");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(person);
        oos.flush();
        oos.close();
        //序列化后：--------------------------------------------------




    }
}