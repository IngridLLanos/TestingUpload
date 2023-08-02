import java.util.Scanner;

public class E4Scanner {
    public static void main(String[] args) {
        System.out.println("Please enter your name");
        //creating the object of the Scanner class so that we can reuse the logic from
        //this class wich is already written for us
        Scanner input=new Scanner(System.in);
        String name =input.next();
        if(name.equals("Asghar")){
            System.out.println("Java Instructor");
        }else {
            System.out.println("I don't know you");
        }
        //System.out.println("Hello "+name);
}}
