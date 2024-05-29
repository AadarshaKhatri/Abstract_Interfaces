package org.example;

import org.example.models.FountainPen;
import org.example.models.Human;
import org.example.models.SmartTelephone;
import org.example.models.Telephone;

public class Main {
    public static void main(String[] args) {
        FountainPen ink = new FountainPen();
        ink.Changenib();
        ink.refill();
        ink.write();

        Human male = new Human();
        male.jump();
        male.bite();
        male.sleep();

       Telephone bell = new SmartTelephone();
        //bell.ring(); //Cannot be used because telephone is not a smart telephone so we cant use the method of smart telephone

        SmartTelephone samsunmg = new SmartTelephone();
        samsunmg.ring();
        samsunmg.lift();


    }
    }
