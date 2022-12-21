package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int total_bill = 0;
        String main_dish, Drink;


        System.out.println("welcome to our restraurant");
        System.out.println("main dish : 1 for fried rice, 2 for salad ");
        Scanner MD = new Scanner(System.in);
        int main_dish_choice = MD.nextInt();

        if (main_dish_choice == 1) {
            main_dish = "fried rice";
            total_bill += 500;
        } else if (main_dish_choice == 2) {
            main_dish = "salad";
            total_bill += 150;
        } else {
            System.out.println("wrong choice");
        }
        System.out.println("press 3 for fantasy 200 , 4 for malt 150");
        int drink = MD.nextInt();

        if (drink == 3) {
            Drink = "fantasy";
            total_bill += 200;

        } else if (drink == 4) {
            Drink = "malt";
            total_bill += 150;
        } else {
            System.out.println("Wrong Choice");
        }
        System.out.println("How much Tip? 5 for 20%, 6 for 15%");

        int Tip_choice = MD.nextInt();

        if (Tip_choice == 5) {
            total_bill += total_bill * 0.20;
        } else if (Tip_choice == 6) {
            total_bill += total_bill * 0.15;
        } else {
            System.out.println("Wrong Tip Choice");
        }

        System.out.println("Total bill is " + total_bill);



    }
    }