package com.company.name;

import com.company.name.basics.FunctionOverLoading;
import com.company.name.basics.inheritance.Calculation;

public class BasicMain {
    public static void main(String[] args) {

        FunctionOverLoading functionOverLoading = new FunctionOverLoading();
        functionOverLoading.showValue("ABC", "XYZ");
        functionOverLoading.showValue();

        Calculation calculation = new Calculation();
        calculation.addition(5,6);

    }
}
