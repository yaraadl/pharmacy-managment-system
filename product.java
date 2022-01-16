//yara adel hassan mohamed 19100683
//pharmacy sheet product class
package pharmacy.pkgfinal.test;

import java.util.ArrayList;

public class product {
    private String productName;
    private double price;
    private int quantity;
    private int quantitySoled;
    
    private ArrayList<person>specificpersonlist=new ArrayList<person>();
    
    public product(){
        
    }

     public product(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
       
    }

    public ArrayList<person> getSpecificpersonlist() {
        return specificpersonlist;
    }

    public void setSpecificpersonlist(ArrayList<person> specificpersonlist) {
        this.specificpersonlist = specificpersonlist;
    }

    
     

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantitySoled() {
        return quantitySoled;
    }

    public void setQuantitySoled(int quantitySoled) {
        this.quantitySoled = quantitySoled;
    }
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
     
    
    


    
    public void incrementQuantity(int q) // Increment not set
    {
        quantity += q;
        
    }
    ///////////////////////////////////////////////
    public void sell (int amount)
    {
        quantity -= amount;
        quantitySoled += amount;
    }
    ///////////////////////////////////////////
    // adding the person who purchesd the product to the product list
    public void addpersontoproductlist(person obj){
        specificpersonlist.add(obj);
        
    }
    
    
}
