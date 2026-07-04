package Interface.Speaker;

public class Test_Speaker {
    
    public static void main(String[]args){
        Speaker guest = new Dog("Tom");
        guest.speak();
        guest = new Philosopher("Socrates");
        guest.speak();
        System.out.println(guest);
    }
    
}
