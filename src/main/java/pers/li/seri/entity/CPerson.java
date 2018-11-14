package pers.li.seri.entity;


import java.io.Serializable;


/**
 * @author
 * {@link pers.li.seri.test.CDeserialTest}
 * {@link pers.li.seri.test.CSerialTest}
 * {@link CPerson}
 * {@link pers.li.seri.entity2.CPerson2}
 * 序列化测试类
 */
public class CPerson implements Serializable {

    private static final long serialVersionUID = 1L;

    public int id;
    public String name;

    public CPerson(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person: " + id + " " + name;
    }
}