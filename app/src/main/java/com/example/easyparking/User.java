package com.example.easyparking;

public class User {
   public  String fullname, Email, carName, carColor, carLicense, phoneNumber;

    public User(){

    }

    public User(String fullname, String Email, String carName, String carColor, String carLicense, String phoneNumber){

        this.fullname=fullname;
        this.Email=Email;
        this.carColor= carColor;
        this.carLicense=carLicense;
        this.carName=carName;
        this.phoneNumber=phoneNumber;
    }


}
