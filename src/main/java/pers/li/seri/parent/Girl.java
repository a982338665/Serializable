package pers.li.seri.parent;

import java.beans.Transient;
import java.io.Serializable;

/**
 * @author:luofeng
 * @createTime : 2018/11/15 9:33
 */
public class Girl extends Person implements Serializable {


    public transient int id;

    public String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Girl(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person: " + id + " " + name + "| parent：";
    }
}
