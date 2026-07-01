package Inheritance.Device;
public class Laptop extends Device{
    private int ram; // in GB
    public Laptop(String brand, double price, int ram){
        super(brand,price);
        this.ram = ram;
    }
    @Override
    public boolean equals(Object obj){
        if(!super.equals(obj)){
            return false;
        }    
            Laptop other = (Laptop) obj;
            return this.ram == other.ram;   
    }
    public String toString(){
        return super.toString() + "Laptop [ RAM: " + ram + "GB]";
    } 
}
