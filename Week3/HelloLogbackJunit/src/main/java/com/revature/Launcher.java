package com.revature;

public class Launcher {


    public static void main(String[] args) {

        //can't call a non-static member within a static method, UNLESS you make an object
        Calculator calc = new Calculator();

        calc.sum(54, 70);

    }

}
