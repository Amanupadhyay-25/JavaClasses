class InheritAnimal{
    void eat(){
   System.out.println("Dog can not eat chocolates");
  }
}

class Dog extends InheritAnimal{
 void run(){
System.out.println("Dog can run very fast");
}
 public static void main(String[] args){
  
     Dog dog=new Dog();
     dog.run();
     dog.eat();
 } 
}