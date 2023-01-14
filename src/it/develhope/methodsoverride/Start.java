package it.develhope.methodsoverride;

import it.develhope.methodsoverride.entities.Smartphone;
import it.develhope.methodsoverride.entities.SmartphonePrice;

public class Start {
    public static void main(String[] args){
        SmartphonePrice producerPrice1 = new SmartphonePrice("producer: ", 400.6);
        SmartphonePrice producerPrice2 = new SmartphonePrice("producer: ", 600.7);
        SmartphonePrice retailPrice1 = new SmartphonePrice("retail: ", 300.2);
        SmartphonePrice retailPrice2 = new SmartphonePrice("retail: ", 500.5);

        Smartphone smartphone1 = new Smartphone("Samsung", "S5", 100, producerPrice1, retailPrice1);
        Smartphone smartphone2 = new Smartphone("Xiaomi", "A8", 90, producerPrice2, retailPrice2);

       String phone1Details = smartphone1.toString();
       String phone2Details =smartphone2.toString();
       System.out.println(phone1Details);
       System.out.println(phone2Details);

       boolean isSmartphoneEqual = smartphone1.equals(smartphone2);
        System.out.println("Are smartphones equal? " + isSmartphoneEqual);


        try {
            Smartphone clonedSmartphone2 = smartphone2.clone();
            clonedSmartphone2.modelName = "Iphone 6s";
            System.out.println(clonedSmartphone2.toString());
            boolean isCloneEqual = smartphone2.equals(clonedSmartphone2);
            System.out.println("Is the cloned smartphone equal? " + isCloneEqual);
        } catch (CloneNotSupportedException e) {
             e.printStackTrace();
            System.out.println("Error");
        }

    }
}
