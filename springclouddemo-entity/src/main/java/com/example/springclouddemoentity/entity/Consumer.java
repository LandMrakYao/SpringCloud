package com.example.springclouddemoentity.entity;

/**
 * created by Limengyao on 2020-06-04
 */
public class Consumer {
    private String name;
    private String address;
    private String email;
    private String phone;
    private int age;

    public Consumer(){
        this.name = "李梦耀";
        this.address = "上海市钦州北路1198号云角信息技术有限公司";
        this.email = "limyad@yungoal.com";
        this.phone = "15503908886";
        this.age = 24;
    }

    @Override
    public String toString() {
        return "Consumer{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}