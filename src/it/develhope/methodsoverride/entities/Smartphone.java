package it.develhope.methodsoverride.entities;

import java.util.Objects;

/**
 * This class defines the basic Smartphone properties and has 4 default methods override, implementing Cloneable
 */
public class Smartphone implements Cloneable{
    public String brandName;
    public String modelName;
    public int batterymAh;
    public SmartphonePrice producerPrice;
    public SmartphonePrice  retailPrice;

    /**
     * Override for toString() method
     * @return The method return Smartphone class attributes
     */
    @Override
    public String toString() {
        return "Smartphone details: " + brandName + " - " + modelName + " - " + batterymAh + "mAh - " + producerPrice + "€ - " + retailPrice + "€";
    }

    /**
     * Override equals() method
     * @return The method returns "false" if the 2 objects are different, "true" if the objects are equal
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Smartphone that = (Smartphone) o;
        return batterymAh == that.batterymAh && Objects.equals(brandName, that.brandName) && Objects.equals(modelName, that.modelName) && Objects.equals(producerPrice, that.producerPrice) && Objects.equals(retailPrice, that.retailPrice);
    }

    /**
     * Override for hashCode method, it comes together with equals() method
     * @return It returns the object hashcode(it could give back a negative int)
     */
    @Override
    public int hashCode() {
        return Objects.hash(brandName, modelName, batterymAh, producerPrice, retailPrice);
    }

    /**
     * Override for clone() method (protected --> public)
     * @return The cloned object
     * @throws CloneNotSupportedException
     */
    @Override
    public Smartphone clone() throws CloneNotSupportedException {
        Smartphone clonedSmartphone = (Smartphone)super.clone();
        clonedSmartphone.producerPrice =  this.producerPrice.clone();
        clonedSmartphone.retailPrice = this.retailPrice.clone();
        return clonedSmartphone;
    }

    /**
     * Creating Smartphone constructor method
     * @param brand a String of the smartphone brand name
     * @param model a String of the smartphone model
     * @param battery The int battery energy in milliampere hour (mAh)
     * @param prodP a SmartphonePrice type of smartphone producer price
     * @param retailP a SmartphonePrice type of smartphone producer price
     */
    public Smartphone (String brand, String model, int battery,SmartphonePrice prodP, SmartphonePrice retailP){
        this.brandName = brand;
        this.modelName = model;
        this.batterymAh = battery;
        this.producerPrice = prodP;
        this.retailPrice = retailP;
    }
}
