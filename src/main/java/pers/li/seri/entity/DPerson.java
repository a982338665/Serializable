package pers.li.seri.entity;


import pers.li.seri.test.DDeserialTest;
import pers.li.seri.test.DSerialTest;

import java.io.Serializable;


/**
 * 反序列化测试
 * {@link DDeserialTest}
 * {@link DSerialTest}
 * {@link pers.li.seri.entity2.DPerson}
 * {@link pers.li.seri.entity.DPerson}
 */
public class DPerson implements Serializable {

    private static final long serialVersionUID = 1L;

    public int id;
    public String name;

    public DPerson(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person: " + id + " " + name;
    }
}