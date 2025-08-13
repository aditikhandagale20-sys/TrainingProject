import java.lang.*;
import java.util.*;
public class UserInput
{
public static void main(String[] args)
{
Scanner input = new Scanner(System.in); //to take input from user
System.out.println("Please enter your name");
String name = input.nextLine();
System.out.println("Good Morning " + name);
System.out.println(name + ", Also tell me your age:");
int age = input.nextInt();
System.out.println("Your Age is: " + age);
}
}