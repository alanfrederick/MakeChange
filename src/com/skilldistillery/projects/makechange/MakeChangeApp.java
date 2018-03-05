package com.skilldistillery.projects.makechange;

import java.util.Scanner;

public class MakeChangeApp {
  public static void main(String[] args) {
    
    //create variables for money given/received/items
    double itemPrice, customerCash, changeGiven;
    Scanner sc = new Scanner(System.in);
    System.out.println("What is the price of the item?");
    itemPrice = sc.nextDouble();
    System.out.println("The price of the item you entered is " + "$" + itemPrice);

    System.out.println("How much money did the customer give?");
    customerCash = sc.nextDouble();
    System.out.println("The customer gave you " + "$" + customerCash);
    
    //loop calculating if the item is the correct amount, too much or too little
    if (customerCash < itemPrice) {
      System.out.println("You still owe: $" + (itemPrice - customerCash));
    } else if (customerCash == itemPrice) {
      System.out.println("You customer gave the exact amount");
    } else {
      changeGiven = customerCash - itemPrice;
      cashRegister(changeGiven);

    }
    sc.close();
  }
 
//method that calculates the required change
  public static void cashRegister(double change) {
    int twenties, tens, fives, ones, quarters, dimes, nickles, pennies;

    int modChange = (int) (change * 100);

    twenties = modChange / 2000;
    modChange = modChange % 2000;
    //if statement to ignore the amount if it's not used
    if (twenties != 0) {
      System.out.println("Number of 20's = " + twenties);
    }

    tens = modChange / 1000;
    modChange = modChange % 1000;
    
    if (tens != 0) {
    System.out.println("Number of 10's = " + tens);
    }

    fives = modChange / 500;
    modChange = modChange % 500;
    if (fives != 0) {
    System.out.println("Number of 5's = " + fives);
    }

    ones = modChange / 100;
    modChange = modChange % 100;
    if (ones != 0) {
    System.out.println("Number of 1's = " + ones);
    }
    
    quarters = modChange / 25;
    modChange = modChange % 25;
    if (quarters != 0) {
    System.out.println("Number of Quarters = " + quarters);
    }
   
    dimes = modChange / 10;
    modChange = modChange % 10;
    if (dimes != 0) {
    System.out.println("Number of Dimes = " + dimes);
    }
   
    nickles = modChange / 5;
    modChange = modChange % 5;
    if (nickles != 0) {
    System.out.println("Number of Nickles = " + nickles);
    }
   
    pennies = modChange / 1;
    modChange = modChange % 1;
    if (pennies != 0) {
    System.out.println("Number of Pennies = " + pennies);
    }

  }

}
