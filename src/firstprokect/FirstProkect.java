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
public class FirstProkect {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cart cart = new Cart();
        
        Product l1 = new Laptop("Acer",20,"i5","15''");
        Product l2 = new Laptop("HP",30,"i7","17''");
        Product m1 = new Mobile("IPhone",18,"16GB","IOS");
        Product m2 = new Mobile("SamsungGS4",21,"32GB","Android");
	Product m3 = new Mobile("IPhone",18,"32GB","IOS");
        
        cart.add(l1,4);
        cart.add(l2,7);
        cart.add(m1,2);
        cart.add(m2,6);
	cart.add(m3,32);
        
        System.out.println(cart.toString());
        System.out.println(cart.getTotalPrice());
        
    }
    
}
