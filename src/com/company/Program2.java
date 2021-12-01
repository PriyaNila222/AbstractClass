package com.company;
/*
Create a subclass for an abstract class. Create an object in the child class for the
abstract class and access the non-abstract methods
 */

class Program2 extends Program1 {
    public static void main(String[] args) {
        Program1 object = new Program2();
        object.creditedAmount();
    }

    @Override
    void totalAmount() {
        System.out.println("Total Amount: 10000");

    }
}
