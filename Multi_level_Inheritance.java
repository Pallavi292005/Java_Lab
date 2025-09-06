import java.util.*;
class Gp{
    Gp(){
        System.out.println("Grandparent class");
    }
    Gp(int n){
        System.out.println("Grandparents : "+n);
    }
}
class parents extends Gp{
    parents(){
        System.out.println("Parents class");
    }
    parents(int m){
        System.out.println("Parents : "+m);
    }
}
class child extends parents{
    child(){
        System.out.println("child class");
    }
}
public class Main
{
public static void main(String[] args) {
   Scanner s1=new Scanner(System.in);
   int n=s1.nextInt();
Gp a1=new Gp();
Gp a4=new Gp(n);
Gp a2=new parents();
Gp a5=new parents(50);
parents a3=new child();
}
}
