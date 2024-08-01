class Animal2{
  String color;
  int age;
public void dog(String s,int c){
  color=s;
  age=c;
}
public static void main(String[] args){
  Animal2 zumbo=new Animal2();
  zumbo.dog("White",8);
  zumbo.display();
 }


public void display(){
 System.out.println("Color is "+color+ " and age is "+age);
}

}

 