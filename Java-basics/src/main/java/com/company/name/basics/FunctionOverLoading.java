package com.company.name.basics;

public class FunctionOverLoading {

    public void showValue(String str1, String str2) {
        System.out.println(str1.concat(str2));


    }

    public void showValue() {
        System.out.println("dummy");
    }
}
