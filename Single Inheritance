import java.util.*;
class Admin{
public String name;
public int age;
void display() {
System.out.println("Name is : "+name+"  Age is: "+age);
}
}
class User1 extends Admin{
void display() {
System.out.println("Name is : "+name);
System.out.println("Age is :"+age);
}
}
public class Main {

public static void main(String[] args) {
Admin u2=new Admin();
Admin u1=new User1();
Scanner s1=new Scanner(System.in);
String name=s1.nextLine();
int age=s1.nextInt();
u1.name=name;
u1.age=age;
u1.display();
s1.nextLine();
String name1=s1.nextLine();
int age1=s1.nextInt();
u2.name=name1;
u2.age=age1;
u2.display();
s1.close();
}
}
