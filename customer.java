
package pharmacy.pkgfinal.test;


public class customer extends person {
    
    private int age;
    private double totalpurchases=0;
    private double sale;
    
    
    
   public customer(){
       
   }
                             //total purchases=0  for the new customers 
    public customer(String name,int age, String phoneno, String address,String gender) {
        super(name, gender, phoneno, address);
        this.age = age;
        
    }
    public customer(String name, String phoneno, String address,String gender) {
        super(name, gender, phoneno, address);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getTotalpuchases() {
        return totalpurchases;
    }

    public void setTotalpuchases(double totalpuchases) {
        this.totalpurchases = totalpuchases;
    }

    public double getSale() {
        return sale;
    }

    public void setSale(double sale) {
        this.sale = sale;
    }
    
    
    @Override           // getting his sale on cost
    public double salereceet(double cost){
        if (totalpurchases>=120){
           sale=0.40;
            
        }
        else if (totalpurchases>=90){
            sale=0.35;
        }
        else if (totalpurchases>=50){
           sale=0.50;
        }
        else if (totalpurchases>=70){
            sale=0.70;
        }
        else{
            sale=0;
        }
        totalpurchases+=cost;
        return cost-(cost*sale);
    }
    
    
}
