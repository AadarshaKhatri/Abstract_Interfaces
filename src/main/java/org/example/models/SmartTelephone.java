package org.example.models;

public class SmartTelephone extends Telephone{
    public void ring(){
        System.out.println("Ringing");

    }
    public void lift(){
        System.out.println("Picking");
    }
    public void disconnect(){
        System.out.println("Disconnecting");
    }
}
