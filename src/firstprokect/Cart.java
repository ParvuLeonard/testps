/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstprokect;

import java.util.*;
import java.util.HashMap;

/**
 *
 * @author Student
 */
public class Cart {
    private HashMap<Product, Integer> products;
    
    public Cart() {
        products = new HashMap<Product, Integer>();
    }
    
    public void add(Product p, int i) {
        products.put(p, i);
    }
    
    public HashMap getProducts() {
        return products;
    }
    
    public int getTotalPrice() {
        Set set = products.entrySet();
        Iterator i = set.iterator();
        int total = 0;
        
       
        while(i.hasNext()) {
            Map.Entry<Product,Integer> me = (Map.Entry)i.next();
            total += me.getKey().getPrice(me.getValue());
        }
        return total;
    }
    
    public String toString() {
        Set set = products.entrySet();
        Iterator i = set.iterator();
        String str = "";
        
        while(i.hasNext()) {
            Map.Entry<Product, Integer> me = (Map.Entry)i.next();
            str =str + me.getKey().toString() + ";";
        }
        return str;
    }
}
