
package pharmacy.pkgfinal.test;

import java.util.ArrayList;


public  class person implements sales{
    private String name ;
    private String gender; 
    private String phoneno;
    private String address;
    private ArrayList<product>specificproductlist=new ArrayList<product>();

    
    public person(){
        
    }
    public person(String name, String gender,String phoneno,String address) {
        this.name = name;
        this.gender = gender;
        this.address=address;
        this.phoneno=phoneno;
    }

    public ArrayList<product> getSpecificproductlist() {
        return specificproductlist;
    }

    public void setSpecificproductlist(ArrayList<product> specificproductlist) {
        this.specificproductlist = specificproductlist;
    }

    
    
    

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
   
    @Override
    public double salereceet(double cost){
        
       return cost; 
    }
    // ading the purchased product to the customers list
    public void addproducttopersonlist(product obj){
        specificproductlist.add(obj);
        
    }
    
    
}
