package pers.li.seri.parent;

import java.io.Serializable;

/**
 * @author:luofeng
 * @createTime : 2018/11/15 9:27
 */
public class Person implements Serializable{

    private String leg;

    private String total;

    private int age;

    public String getLeg() {
        return leg;
    }

    public void setLeg(String leg) {
        this.leg = leg;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "leg='" + leg + '\'' +
                ", total='" + total + '\'' +
                ", age=" + age +
                '}';
    }
}
