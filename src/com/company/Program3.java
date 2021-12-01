package com.company;

//Create an instance for the child class in child class and call abstract methods

public class Program3 extends Program1{
    public static void main(String[] args) {
        Program3 object = new Program3();
        object.totalAmount();
    }

    @Override
    void totalAmount() {
        System.out.println("Total Amount: 10000");
    }
}
