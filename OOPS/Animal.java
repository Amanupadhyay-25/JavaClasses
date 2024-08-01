class Animal{
  public void run(){
    System.out.println("I am running");
  }
     
 
  public void eat(){
     System.out.println("I am eating");
    }
 
public static void main(String[] args){
    Animal dog=new Animal();
    dog.run();
    dog.eat();
    Birds parrot=new Birds();
    parrot.fly();
    
  }
}

class Birds{
public void fly(){
 System.out.println("Yes i can Also Fly");
 }
}