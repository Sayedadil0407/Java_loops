import java.util.Scanner;
public class Userinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your fav. food");
        String food = sc.nextLine();
        System.out.println("hello " +name);
        System.out.println("You are " +age+ "years old");
        System.out.println("You like " +food);


    }
}
