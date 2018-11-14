package pers.li.seri.entity;


import java.io.Serializable;


/**
 * @author
 * {@link pers.li.seri.test.BDeserialTest}
 * {@link pers.li.seri.test.BSerialTest}
 * {@link BPerson}
 * 序列化测试类
 */
public class BPerson implements Serializable {

    public int id;
    public String name;

    public BPerson(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person: " + id + " " + name;
    }
}