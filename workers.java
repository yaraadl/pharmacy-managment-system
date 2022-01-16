
package pharmacy.pkgfinal.test;

public class workers extends person {
    private int experience ;
    private double salary;
    
    public workers ( String name, int experience,String address , String phoneno, String gender){
     super(name, address , phoneno, gender);
     
             salary=1000*experience;
    }

    public workers(String name,String address,String phoneno,String gender) {
        super(name, gender, phoneno, address);
    }
    

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public double getSalary() {
        return salary;
    }
    //calculating his salary  
    public void setSalary(int salary) {
        salary=1000*experience;
    }
    
    @Override                    //getting his sale on cost
    public double salereceet(double cost){
        double sale=0.1;
        return cost-(cost*sale);
    }
    


}

