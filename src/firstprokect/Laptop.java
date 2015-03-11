/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstprokect;

/**
 *
 * @author Student
 */
public class Laptop extends Product {
    private String processor;
    private String screenSize;
    
    public Laptop(String name, int price, String processor, String screenSize) {
        super(name, price);
        this.processor = processor;
        this.screenSize = screenSize;
    }
    
    public int getPrice(int quantity) {
        if(quantity < 3)
            return price * quantity;
        else
            if(quantity <5)
                return (price * quantity) - 2;
        else
                return (price * quantity) - 3;
    }
    
    public String toString() {
        return name + " " + processor + " " + Integer.toString(price);
    }
}
