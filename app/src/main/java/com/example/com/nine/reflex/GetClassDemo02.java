package com.example.com.nine.reflex;

/**
 * Created by 汪栋 on 2016/7/30.
 */

class Y{

}
public class GetClassDemo02 {

   public static void main(String args[]){
       Class<?> c1 = null;
       Class<?> c2 = null;
       Class<?> c3 = null;

       try {
           c1 = Class.forName("com.example.com.nine.reflex.Y");
       } catch (ClassNotFoundException e) {
           e.printStackTrace();
       }

       c2 = new Y().getClass();

       c3= Y.class;

       System.out.println("类名称：" + c1.getName());
       System.out.println("类名称：" + c2.getName());
       System.out.println("类名称：" + c3.getName());

   }


}
