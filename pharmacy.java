//yara adel hassan mohamed 19100683
//pharmacy sheet pharmacy class
package pharmacy.pkgfinal.test;

import java.util.ArrayList;
import java.util.Scanner;
public class pharmacy {
    String namepro;
    ArrayList<branches>b1;

    public pharmacy(String namepro, ArrayList<branches> b1) {
        this.namepro = namepro;
        this.b1 = b1;
    }

    public pharmacy() {
        
    }

    public pharmacy(ArrayList<branches> b1) {
        this.b1 = b1;
    }
    
    

    
    
    
    //overloading
    public void addbranch(branches b2){
        b1.add(b2);
        
    }//overloading
    public void addbranch(String name,int n,ArrayList<product>proarray){//overloading
        branches obj=new branches(name,proarray,n);
        b1.add(obj);
        
    }

    public String getNamepro() {
        return namepro;
    }

    public void setNamepro(String namepro) {
        this.namepro = namepro;
    }

    public ArrayList<branches> getB1() {
        return b1;
    }

    public void setB1(ArrayList<branches> b1) {
        this.b1 = b1;
    }
    

    
    
    }
