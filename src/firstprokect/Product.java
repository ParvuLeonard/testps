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
public abstract class Product {
    protected String name;
    protected int price;
    
    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }
    
    public abstract int getPrice(int quantity);
    
    public String toString() {
        return null;
    }
    
    public String getName() {
        return name;
    }
    
}
