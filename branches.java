
package pharmacy.pkgfinal.test;

import java.util.ArrayList;


public class branches {
    private String pharmacyName;
    private ArrayList<product>products=new ArrayList<product>();
    private int productsize;
    //polymorphism
    private ArrayList<person>personlist=new ArrayList<person>();
        
    
    
    branches(){
        
    }
    

    public branches(String pharmacyName, ArrayList<product> products, int productsize) {
        this.pharmacyName = pharmacyName;
        this.products = products;
        this.productsize = productsize;
    }

    public ArrayList<person> getPersonlist() {
        return personlist;
    }

    public void setPersonlist(ArrayList<person> personlist) {
        this.personlist = personlist;
    }
    

    public String getPharmacyName() {
        return pharmacyName;
    }

    public void setPharmacyName(String pharmacyName) {
        this.pharmacyName = pharmacyName;
    }

    public ArrayList<product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<product> products) {
        this.products = products;
    }

    public int getProductsize() {
        return productsize;
    }

    public void setProductsize(int productsize) {
        this.productsize = productsize;
    }

    //overloading // property no 4
    public void addproduct(product pro){//object from the product type
        products.add(pro);
        
    //overloading    
    }
    public void addproduct(String name,double price,int quantity){//pbject from the product type
        product pro2=new product(name,price,quantity);//an object from the type product 
        products.add(pro2);
    }
    public void updateproduct(int i,int amountinc){
        products.get(i).setQuantity(products.get(i).getQuantity()+amountinc);
        
        
        
    }
    
    
    public void addcustomer(String name,String phonenum,String address,String gender){
        person p=new customer(name, phonenum, address, gender);
        personlist.add(p);
    }
    public void addworker(String name,String address,String phonenum,String gender){
        person p=new workers(name, address, phonenum, gender);
        personlist.add(p);
    }
    public void printallpersoninfo(){
        int siz=personlist.size();
        System.out.printf("%3s  %-15s  %-15s  %-15s  %-15s\n","no","[name]","[phone no]","[address]","[gender]");
        for(int i=0;i<siz;i++){
            System.out.printf("%3d- %-15s  %-15s  %-15s  %-15s\n",(i+1),personlist.get(i).getName(),personlist.get(i).getPhoneno(),personlist.get(i).getAddress(),personlist.get(i).getGender());
        }
        
    }
    public void remove(int choice){
         System.out.printf("all  your person list including workers and customers will be deleted now");
        if(choice==1){
            
            personlist.clear();
            
            
            
        }
        
        
        else if(choice==2){
            products.clear();
            productsize=0;
            
            
        }
    }
    public void printspecificlist(int index){
        int size=products.get(index).getSpecificpersonlist().size();
        ArrayList<person>p=products.get(index).getSpecificpersonlist();
        System.out.printf("%3s  %-15s  %-15s  %-15s  %-15s\n","no","[name]","[phone no]","[address]","[gender]");
        for(int i=0;i<size;i++){
            System.out.printf("%3d- %-15s  %-15s  %-15s  %-15s\n",(i+1),p.get(i).getName(),p.get(i).getPhoneno(),p.get(i).getAddress(),p.get(i).getGender());
        }
    }
    
     public void printspecificproductlist(int index){
        int size=personlist.get(index).getSpecificproductlist().size();
        ArrayList<product>x=personlist.get(index).getSpecificproductlist();
          for(int i=0;i<size;i++){
              System.out.println((i+1)+"- "+x.get(i).getProductName());
          }
          
         //to get the person chosen
        
     }
     public person findperson(int index){
         return personlist.get(index) ;
     }
     //to get the chosen product
     public product findproduct(int index){
         return products.get(index);
     }
    
}
