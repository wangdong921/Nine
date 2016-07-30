package com.example.com.nine.reflex;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by 汪栋 on 2016/7/30.
 */

class Studens{
    private String name;
    private int age;

    public Studens(String name,int age){
        this.setName(name);
        this.setAge(age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "姓名：" +this.name + ", 年龄：" +this.age;
    }
}

public class InstanceDemo2 {
    public static void main(String args[]){
        Class<?> c = null;
        try {
            c = Class.forName("com.example.com.nine.reflex.Studens");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Studens studens = null;

        Constructor<?> constructor[] = null;
        constructor = c.getConstructors();

        try {
            studens = (Studens) constructor[0].newInstance("wang", 32);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }


        System.out.println(studens);


    }


}
