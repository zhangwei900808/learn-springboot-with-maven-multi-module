package com.awbeci.test;

/**
 * Created by zhangwei on 2017/7/9.
 */
public class Test {
    public Test(String name) {
        this.name = name;
    }

    public String name;
    public String age;
    public String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
