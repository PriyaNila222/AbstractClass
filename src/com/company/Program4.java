package com.company;

//Create an instance for the child class in child class and call non-abstract methods

public class Program4  extends Program1{
    public static void main(String[] args) {
        Program4 object = new Program4();
        object.creditedAmount();
    }

    @Override
    void totalAmount() {
        System.out.println("Total Amount: 10000");
    }
}
