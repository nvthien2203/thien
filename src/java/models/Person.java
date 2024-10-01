/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author NGUYEN VAN TUAN
 */
public class Person {
    //access modifiers: từ khóa chỉ mức độ truy cập của 1 class 1 PT hoặc 1 biến
    // public: không bị giới hạn truy cập;
    //private: chỉ dc dử dụng trong class chứa biến, PT đó
    //protected: chỉ được sử dụng trong package hoặc class con của nó.
    //default: chỉ được sử dụng trong package
    //OOP có 4 thuộc tính:
    //kế thừa
    //đóng gói
    //đa hình
    //trừu tượng
    private String name;
    private int age;
    private String phone;

    public Person() {
        
    }

    public Person(String name, int age, String phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    
    
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
        if(age < 18){
            System.out.println("pai nhap trn 18 tuoi");
        }
        else{
        this.age = age;
        }
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
}
