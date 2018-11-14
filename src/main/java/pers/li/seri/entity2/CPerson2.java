package pers.li.seri.entity2;


import pers.li.seri.entity.CPerson;

import java.io.Serializable;


/**
 * @author
 * {@link pers.li.seri.test.CDeserialTest}
 * {@link pers.li.seri.test.CSerialTest}
 * {@link CPerson2}
 * {@link CPerson}
 * 序列化测试类
 */
public class CPerson2 implements Serializable {

    private static final long serialVersionUID = 1L;

    public int id;
    public String name;

    public CPerson2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person: " + id + " " + name;
    }
}