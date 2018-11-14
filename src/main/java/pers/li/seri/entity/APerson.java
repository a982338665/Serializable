package pers.li.seri.entity;


import pers.li.seri.test.ADeserialTest;
import pers.li.seri.test.ASerialTest;

import java.io.Serializable;


/**
 * @author
 * {@link ADeserialTest}
 * {@link ASerialTest}
 * {@link APerson}
 * 序列化测试类
 */
public class APerson implements Serializable {

    /**
     * 建议序列化id 显式指定，否则 JVM 将会在序列化时根据类名等自动生成序列化id
     */
    private static final long serialVersionUID = 1L;

    public int id;
    public String name;

    public APerson(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person: " + id + " " + name;
    }
}