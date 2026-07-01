package Inheritance.Device;
public class Device {
    protected String brand;
    protected double price;
    
    public Device(String brand, double price){
        this.brand = brand;
        this.price = price;
    }
    @Override
    public boolean equals(Object obj){
    if(this == obj){
        return true;
    }    
    if(obj == null || this.getClass() != obj.getClass()){
        return false;
    }
    Device other = (Device) obj;
    return Double.compare(this.price , other.price) == 0 &&
            (this.brand != null ? this.brand.equals(other.brand) : other.brand == null);   
    }
    @Override
    public String toString(){
        return "Brand: " + brand + "\nPrice: " + price ;      
    }
}
