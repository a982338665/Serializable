package pers.li.seri.parent;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DDeserialTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //不同包测试，不同包
        Person person;
        FileInputStream fis = new FileInputStream("girl.obj");
        ObjectInputStream ois = new ObjectInputStream(fis);
        person = (Person) ois.readObject();
        ois.close();
        System.out.println("Person Deserial" + person.toString());
        System.out.println("Person Deserial：" + person.getLeg() );
    }

}