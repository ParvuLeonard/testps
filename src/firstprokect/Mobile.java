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
public class Mobile extends Product {
    private String memory;
    private String os;
    
    public Mobile(String name, int price, String memory, String os) {
        super(name, price);
        
        this.memory = memory;
        this.os = os;
    }
    
    public int getPrice(int quantity) {
        if(quantity < 3)
            return price * quantity;
        else
            if(quantity < 5)
                return (price * quantity) - 1;
        else
                return (price * quantity) - 2;
            
    }
    
    public String toString() {
        return name + " " + os + " " + price;
    }
}
