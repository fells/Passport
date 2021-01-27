package com.michel.javacourse.lesson2;


import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Enter in the passport's number:");
        String passportNumber = input.nextLine();

        System.out.println("Enter in the passanger's name:");
        String individualName = input.nextLine();

        System.out.println("Enter in the passanger's BOD:");
        String individualBirthDate = input.nextLine();

        System.out.println("Enter in the passanger's nationality:");
        String nationality = input.nextLine();

        System.out.println("Enter in the passport's expiration date:");
        String expiryDate = input.nextLine();

        System.out.println("Enter in the day it arrived:");
        String arrived = input.nextLine();

        System.out.println("Enter in the day it leave's:");
        String goingOut = input.nextLine();

        input.close();

        Passport brPassoport = new Passport (passportNumber,individualName,individualBirthDate,nationality,expiryDate,arrived,goingOut);

        System.out.println("------------------------");

        System.out.println("Passport's number: " + brPassoport.passportNumber);
        System.out.println("Individual's name: " + brPassoport.individualName);
        System.out.println("Individual's BOD: " + brPassoport.individualBirthDate);
        System.out.println("Individual's nationality: " + brPassoport.nationality);
        System.out.println("Passport's expiration date: " + brPassoport.expiryDate);
        System.out.println("Day it arrived: " + brPassoport.arrival);
        System.out.println("Day it leave's: " + brPassoport.goingOut);


    }

    static class Passport {
        String passportNumber;
        String individualName;
        String individualBirthDate;
        String nationality;
        String expiryDate;
        String arrival;
        String goingOut;


        Passport(String passportNumber, String individualName, String individualBirthDate, String nationality, String expiryDate, String arrival, String goingOut) {

            this.passportNumber = passportNumber;
            this.individualName = individualName;
            this.individualBirthDate = individualBirthDate;
            this.nationality = nationality;
            this.expiryDate = expiryDate;
            this.arrival = arrival;
            this.goingOut = goingOut;


        }



    }

}





