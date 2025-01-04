import java.util.Scanner;
public class Demo007 {
    public static void main(String[] args){
        String name;
        int age;
        String phno;
        System.out.println("plz enter ur name,age,and phone no");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        age = sc.nextInt();
        phno = sc.nextLine();
        System.out.println("Hello "+name +"ur age is"+age+"ur phone no is"+phno);
    }
 }


