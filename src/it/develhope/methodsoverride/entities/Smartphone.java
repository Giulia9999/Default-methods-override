package it.develhope.methodsoverride.entities;

import java.util.Objects;

public class Smartphone implements Cloneable{
    public String brandName;
    public String modelName;
    public int batterymAh;
    public SmartphonePrice producerPrice;
    public SmartphonePrice  retailPrice;

    @Override
    public String toString() {
        return "Smartphone details: " + brandName + " - " + modelName + " - " + batterymAh + "% - " + producerPrice + "$ - " + retailPrice + "$";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Smartphone that = (Smartphone) o;
        return batterymAh == that.batterymAh && Objects.equals(brandName, that.brandName) && Objects.equals(modelName, that.modelName) && Objects.equals(producerPrice, that.producerPrice) && Objects.equals(retailPrice, that.retailPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brandName, modelName, batterymAh, producerPrice, retailPrice);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Smartphone clonedSmartphone = (Smartphone)super.clone();
        clonedSmartphone.producerPrice = (SmartphonePrice) this.producerPrice.clone();
        clonedSmartphone.retailPrice = (SmartphonePrice) this.retailPrice.clone();
        return clonedSmartphone;
    }

    public Smartphone (String brand, String model, int battery,SmartphonePrice prodP, SmartphonePrice retailP){
        this.brandName = brand;
        this.modelName = model;
        this.batterymAh = battery;
        this.producerPrice = prodP;
        this.retailPrice = retailP;
    }
}
