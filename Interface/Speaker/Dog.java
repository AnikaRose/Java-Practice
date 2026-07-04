package Interface.Speaker;
public class Dog implements Speaker {
    private String name;
    public Dog(String name){
        this.name = name;
    }
    public void speak(){
        System.out.println("Ghew ");
    }
    public String toString(){
      return "Dog: " + name;
    }
   
}
