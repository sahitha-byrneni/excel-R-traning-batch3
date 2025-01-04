
import java.util.Scanner;

 public class Demo008 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String loginId;
        String pwd;
        String reply;
        do {
            System.out.println("Welcome to mallareddyuniversity");
            System.out.println("have you visited our site earlier");
            reply = sc.nextLine();
               if(reply == "no") {
                  System.out.println("login here");
                  System.out.println("enter ur id and pwd");
                  loginId = sc.nextLine();
                  pwd = sc.nextLine();
               }else
               System.out.println("you are our valued customer");
        } while ((loginId == "sahitha") && (pwd == "12345"));
        }
    }

