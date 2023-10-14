package Basics;
import java.util.Scanner;

public class Voting_Age {
    public static void main(String [] args){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your age:  ");
        int age=sc.nextInt();

        if(age>=18){
            System.out.println("You are an Eligible voter !");
        } else{
           System.out.println("Underage !"); 
        }
        
    }
}
