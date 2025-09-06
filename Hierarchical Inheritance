import java.util.*;

class Admin {
    public String name;
    public int age;

    void display() {
        System.out.println("Admin Name: " + name + " Age: " + age);
    }
}

class User1 extends Admin {
    @Override
    void display() {
        System.out.println("User1 Name: " + name + " Age: " + age);
    }
}

class User2 extends Admin {
    @Override
    void display() {
        System.out.println("User2 Name: " + name + " Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = s1.nextLine();
        System.out.print("Enter age: ");
        int age = s1.nextInt();
        Admin a1 = new Admin();
        Admin a2 = new User1();
        Admin a3 = new User2();
        a1.name = name;
        a1.age = age;
        a2.name = name;
        a2.age = age;
        a3.name = name;
        a3.age = age;
        a1.display();
        a2.display();
        a3.display();

        s1.close();
    }
}
