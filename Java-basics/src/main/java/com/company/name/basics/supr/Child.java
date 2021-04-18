package com.company.name.basics.supr;

public class Child extends Parent {
    public  Child(){
        super();
        System.out.println("CHILD");

    }

    public void Show(){
        super.Show();
        System.out.println("Child method");
    }
}
