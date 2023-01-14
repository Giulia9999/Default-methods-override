package it.develhope.methodsoverride.entities;

import java.util.Objects;
/**
 * This class defines the SmartphonePrice properties and has 4 default methods override, implementing Cloneable
 */
public class SmartphonePrice implements Cloneable{
    private String priceType;
    private double priceInEuros;

    /**
     * Override clone() method
     * @return The cloned object
     * @throws CloneNotSupportedException
     */
    @Override
    public SmartphonePrice clone() throws CloneNotSupportedException {
        SmartphonePrice clonedSmartphonePrice = (SmartphonePrice)super.clone();
        return clonedSmartphonePrice;
    }

    /**
     * override of the default toString() method
     * @return A String with the 2 attributes regarding a SmartphonePrice
     */
    @Override
    public String toString() {
        return priceType + priceInEuros;
    }

    /**
     * Override of the equals() method
     * @param o an Object type method parameter
     * @return  True if the objects are equal, false if they aren't
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SmartphonePrice that = (SmartphonePrice) o;
        return Double.compare(that.priceInEuros, priceInEuros) == 0 && Objects.equals(priceType, that.priceType);
    }

    /**
     * Overrride of hashCode() method
     * @return The object hashcode
     */
    @Override
    public int hashCode() {
        return Objects.hash(priceType, priceInEuros);
    }

    /**
     * Constructor method for SmartphonePrice
     * @param type a String about the type of price (e.g. Retail or Producer)
     * @param price a double about the amount in euros
     */
    public SmartphonePrice (String type, double price){
        this.priceType = type;
        this.priceInEuros = price;
    }
}
