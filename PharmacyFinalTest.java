
package pharmacy.pkgfinal.test;

import java.util.ArrayList;
import java.util.Scanner;
public class PharmacyFinalTest {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
      
        //objects 
        ArrayList<branches>arrtemp=new ArrayList<branches>();
        pharmacy p1=new pharmacy(arrtemp);
        
        
        
        
        //asking for the number of branches and scaning it
        System.out.println("how many branches do you want to form");
        int branchnum=scan.nextInt();
        
        //scanning branch name and products number
         for(int i=0;i<branchnum;i++){
            ArrayList<product>pro1=new ArrayList<product>();
            
            System.out.println("enter the name of the branch "+(i+1));
            String branchname=scan.next();
            System.out.println("enter the number  of the products for branch "+(i+1));
            int productnum=scan.nextInt();
            String x=scan.nextLine();
            
            //scanning each product with its name ,price, quantity
            for(int j=0;j<productnum;j++){
                System.out.println("enter the (name )for product no # "+(j+1));
                String proname=scan.nextLine();
                System.out.println("enter the (price) for product no # "+(j+1));
                double priceprod=scan.nextDouble();
                System.out.println("enter the  (quantity )for product no # "+(j+1));
                int proquan=scan.nextInt();
                //to prevent the enter being intialized for the product name
                x=scan.nextLine();
                
               //object
                product product1=new product(proname,priceprod,proquan);
                //adding object to the array list
                pro1.add(product1);
            }
            //adding all  pharmacy  objects to the branch  
            p1.addbranch(branchname,productnum, pro1);
         }
         // a stopping condition for the program
        int exit=1;
        while(exit!=0){
            System.out.println("enter number of the branch you will deal with ");//choose which branch  you wil purchase from
            for(int i=0;i<branchnum;i++){
                System.out.println("branch  ["+(i+1)+"] "+p1.getB1().get(i).getPharmacyName());//getting the array list b1 from pharmacy class 
            }
            int chosenbranch  =scan.nextInt();
            System.out.println("_________________________________");
            System.out.println(" [welcome in "+p1.getB1().get(chosenbranch-1).getPharmacyName()+" pharmacy]");//getting the name of the chosen branch to be diplayed
            System.out.println("_________________________________");
        
         
            //object for 
            branches branch=p1.getB1().get(chosenbranch-1);// object = object 
                                                       //intializing an object to another object
                                                       //index  of product in the array list 
                                                       //to get the branch name
            while(true){//infinite loop always true


                // displaying  a menu
                System.out.println("__________");
                System.out.println("Main Menu: ");
                System.out.println("1: add product");
                System.out.println("2: update product info");
                System.out.println("3: add customer");
                System.out.println("4: add worker");
                System.out.println("5: sell ");
                System.out.println("6: display all person ");
                System.out.println("7: display all branch products");
                System.out.println("8: clear");
                System.out.println("9: display all products taken by a certain person");
                System.out.println("10: display  all person that took this product/medicine");
                System.out.println("11: quit to your main branches");
                System.out.println("___");
                System.out.println("Enter a choice: ");
                System.out.println("___");
                int choice = scan.nextInt();
                String d=scan.nextLine();


                //switching between  these coditions to perform the function the user needs
                if (choice == 1) {
                    System.out.println("Product will be added now");
                    branch.setProductsize(branch.getProductsize()+1);  //incrementing the index of product size by 1
                    System.out.println("enter the (name )for product no # "+branch.getProductsize());
                    String proname=scan.nextLine();
                    System.out.println("enter the (price) for product no # "+branch.getProductsize());
                    double priceprod=scan.nextDouble();
                    System.out.println("enter the  (quantity )for product no # "+branch.getProductsize());
                    int proquan=scan.nextInt();
                    branch.addproduct(proname, priceprod, proquan);
                //getting the array list

                } 
                if (choice == 2) {
                    System.out.println("Product will be updated now");
                    int size=branch.getProductsize();
                    for(int i=0;i<size;i++){
                        System.out.println("drug ["+(i+1)+"] "+branch.getProducts().get(i).getProductName()+" # "+branch.getProducts().get(i).getQuantity()+" $ "+branch.getProducts().get(i).getPrice());//getting the array list b1 from pharmacy class 
                    }
                    System.out.println((size+1)+"- not found");
                    System.out.println("\nEnter product number.. ");
                    int productnum=scan.nextInt();                        //printing the name of the product that will be updated
                    System.out.println("\n enter the quantity of product "+branch.getProducts().get(productnum-1).getProductName()+" you want to add");
                    int amountinc=scan.nextInt(); 
                    if(productnum>=1&&productnum<=size){
                        branch.updateproduct(productnum-1,amountinc);
                        System.out.println("___________________________________");//pronting a message that the certain product is updated
                        System.out.println("\n [Updated]  "+branch.getProducts().get(productnum-1).getProductName()+" # "+branch.getProducts().get(productnum-1).getQuantity()+" $ "+branch.getProducts().get(productnum-1).getPrice());
                        System.out.println("___________________________________");
                    }
                    else{
                        System.out.println("\n product is not found please add it.. ");

                    }

                } //adding a new  customer
                else if (choice == 3) {
                    System.out.println("a new customer will be added in branch "+branch.getPharmacyName());
                    System.out.println("enter customer name");
                    String name =scan.nextLine();
                    System.out.println("enter customer age");
                    int age =scan.nextInt();
                    String z=scan.nextLine();
                    System.out.println("enter customer phone number ");
                    String phonenum =scan.nextLine();
                    System.out.println("enter customer address");
                    String address =scan.nextLine();
                    System.out.println("enter customer gender");
                    String gender =scan.nextLine();

                    //customer c1=new customer(name,age,phonenum,address,gender);
                    branch.addcustomer(name,phonenum,address,gender);
                } // adding a new  customer 
                else if (choice == 4) {

                    System.out.println("a new worker will be added in branch "+branch.getPharmacyName());
                    System.out.println("enter worker name");
                    String name =scan.nextLine();
                    System.out.println("enter worker experience");
                    int experience =scan.nextInt();
                    String z=scan.nextLine();
                    System.out.println("enter worker phone number ");
                    String phonenum =scan.nextLine();
                    System.out.println("enter worker address");
                    String address =scan.nextLine();
                    System.out.println("enter worker gender");
                    String gender =scan.nextLine();

                    //workers w1=new workers(name,experience,address,phonenum,gender);
                    branch.addworker(name,address,phonenum,gender);

                }   //selling
                else if (choice == 5) {
                    //printing your person list to  choose  who  will sell
                    ArrayList<person>cw=p1.getB1().get(chosenbranch-1).getPersonlist();
                    int siz=cw.size();
                    System.out.println("_________________________________");
                    System.out.println("your person list");
                    System.out.println("_________________________________");
                    for(int i=0;i<siz;i++){
                        System.out.println((i+1)+"- "+cw.get(i).getName());

                    }
                    System.out.println((siz+1)+"- not found ");// size -1  as  we start from zero
                    System.out.println("enter the number of your customer");
                    int custnum=scan.nextInt();
                    if(custnum>siz){
                                        //if you chose the not found option 
                        System.out.println("\n person is not found please add him!!.. ");
                        continue;
                    }
                    System.out.println("\nEnter product number.. ");
                    int size=branch.getProductsize();
                    for(int i=0;i<size;i++){
                        System.out.println("drug ["+(i+1)+"] "+branch.getProducts().get(i).getProductName()+" # "+branch.getProducts().get(i).getQuantity()+" $ "+branch.getProducts().get(i).getPrice());//getting the array list b1 from pharmacy class 
                    }                         // size +1 to corectly print the number a s  we  start from zero
                    System.out.println("drug ["+(siz+1)+"] not found ");
                    
                    int productnum=scan.nextInt();
                    if(productnum>=1&&productnum<=size){// checking  we  are within range
                        System.out.println("Enter the amount to be sold");
                        int amount=scan.nextInt();
                        if (amount != 0)//if you want to preview the product info only . set soldqunt to be zero
                        {
                            product product1=branch.getProducts().get(productnum-1);//object equals quantity of product
                            if (product1.getQuantity() < amount)//checking that the quantity needed  isn,t more than the actual quantity in pharmacy    
                                System.out.println("[Insufficient quantity].");
                            else{//selling the product
                                product1.sell(amount);//calling sell method from product class to dec the quantity for the sold product
                                branch.getProducts().get(productnum-1).addpersontoproductlist(branch.findperson(custnum-1));
                                branch.getPersonlist().get(productnum-1).addproducttopersonlist(branch.findproduct(productnum-1));

                                System.out.println("your cost is "+cw.get(custnum-1).salereceet(amount)+"$");
                            }
                        }
                        else{ // if the quantity cant be afforded
                            System.out.println("inuffisiont amount");
                        }
                    }
                    else{    // if you chose the not found condition
                        System.out.println("\n product is not found please add it.. ");
                    }
                }
                                // bonus point  // removing the person object  by freeing the array list and object from data and garbage value
                else if (choice == 6) {
                    if(branch.getPersonlist().size()==0){
                        System.out.println("your list is already  cleared ");
                        continue;
                    }
                    //printing your person list
                    
                    System.out.println("_________________________________");
                    System.out.println("your person list");
                    System.out.println("_________________________________");
                    branch.printallpersoninfo();

                }
                else if (choice == 7) {// bonus point  // removing the product object  by freeing the array list and object from data and garbage value
                    if(branch.getProducts().size()==0){
                        System.out.println("your list is already  cleared ");
                        continue;
                        
                    }
                    int size=branch.getProductsize();
                    for(int i=0;i<size;i++){
                        System.out.println("drug ["+(i+1)+"] "+branch.getProducts().get(i).getProductName()+" # "+branch.getProducts().get(i).getQuantity()+" $ "+branch.getProducts().get(i).getPrice());//getting the array list b1 from pharmacy class 
                    }
                    
                } 
                else if (choice == 8) {// bonus point  // removing the person  and product object  by freeing the array list and object from data and garbage value
                    System.out.println("1- clear all person  ");
                    System.out.println("2- clear all your products");
                    int x=scan.nextInt();
                    branch.remove(x);
                    
                   //display all the products he purchased from this branch    
                }
                else if (choice == 9) {
                    int size=branch.getPersonlist().size();
                    ArrayList<person>cw=branch.getPersonlist();
                    System.out.println("_________________________________");
                    System.out.println("your person list");
                    System.out.println("_________________________________");
                    for(int i=0;i<size;i++){
                        System.out.println((i+1)+"- "+cw.get(i).getName());

                    }
                    System.out.println(" enter the number of the person you want to display all the products he purchased from this branch ");  
                    int personnum=scan.nextInt();
                    System.out.println("  alist of the products which is taken by "+branch.getPersonlist().get(personnum-1).getName());
                    branch.printspecificproductlist(personnum-1);
                    
                    
                    
                    
                   // display  all person that took this product/medicine   
                } 
                else if (choice == 10) {
                    int size=branch.getProducts().size();
                    for(int i=0;i<size;i++){
                        System.out.println("drug ["+(i+1)+"] "+branch.getProducts().get(i).getProductName());//getting the array list b1 from pharmacy class 
                    }
                    System.out.println(" enter the number of the product you want to display  all person that took this product/medicine");  
                    int productnum=scan.nextInt();
                    System.out.println("  alist of the people who took "+branch.getProducts().get(productnum-1).getProductName());
                    branch.printspecificlist(productnum-1);
                    
                    
                    
                   
                       
                }
                else if (choice == 11) {
                    break;   
                }
            }
            System.out.println("if you want to exit and restart the program enter 0 ");
            System.out.println("if you want to continue the program enter 1 ");
            exit=scan.nextInt();
            
        }
    }
}
    
    

