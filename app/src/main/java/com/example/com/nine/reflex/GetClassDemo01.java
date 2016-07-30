package com.example.com.nine.reflex;

/**
 * Created by 汪栋 on 2016/7/30.
 */

class  X{
}

public class GetClassDemo01 {
    public static void main(String args[]){
        X x = new X();
        System.out.println(x.getClass().getName());
    }
}

//com.example.com.nine.reflex.X

//正常方式： 引入需要的“包.类”名称 - 通过new实例化 - 取得实例化对象
//反射方式： 实例化对象 - getClass()方法 - 得到完整的“包.类”名称



