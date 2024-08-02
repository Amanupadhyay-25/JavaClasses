public class ParamConstruct{
String name;
int salary;
public ParamConstruct(String name,int salary){
    this.name=name;
    this.salary=salary;
  }
public static void main(String[] args){
ParamConstruct data =new ParamConstruct("Aman Upadhyay",560000);
System.out.println(data.name +" "+data.salary);
 }
}