package Interface.Speaker;

public class Philosopher implements Speaker {
    private String name;

    public Philosopher(String name) {
        this.name = name;
    }
    public void speak() {
        System.out.println("I think, therefore I am.");
    }  
    public String toString(){
      return "Philosopher: " + name;
    }   
}
