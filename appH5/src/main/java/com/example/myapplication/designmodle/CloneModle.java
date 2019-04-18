package com.example.myapplication.designmodle;

/**
 * 原型模式
 */
public class CloneModle implements Cloneable {

    private String name;
    private int age;
    private double height;
    private double weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "CloneModle{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    @Override
    public Object clone() {
        CloneModle cloneModle = null;

        try {
            cloneModle = (CloneModle) super.clone();
            cloneModle.name = this.name;
            cloneModle.weight = this.weight;
            cloneModle.age = this.age;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cloneModle;
    }
}
