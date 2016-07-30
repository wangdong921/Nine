package com.example.com.nine.reflex;

/**
 * Created by 汪栋 on 2016/7/30.
 */

class Person{
    private String name;
    private int age;

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

    @Override
    public String toString() {
        return "姓名：" + this.name + ", 年龄：" + this.age;
    }

}
public class InstanceDemo01 {
    public static void main(String args[]){
        //指定泛型
        Class<?> c = null;

        try {
            c = Class.forName("com.example.com.nine.reflex.Person");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //声明Person对象
        Person person = null;

        try {
            //实例化person对象
            person = (Person) c.newInstance();

        } catch (Exception e) {
            e.printStackTrace();
        }

        person.setName("汪栋");
        person.setAge(12);

        System.out.println(person);

    }
}
