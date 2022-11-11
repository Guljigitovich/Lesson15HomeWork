import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("San jaz: ");
        System.out.println("Joop: "+Circle.area(scanner.nextInt()));
        System.out.print("San jaz: ");
        System.out.println("Joop: "+Circle.circumference(scanner.nextInt()));


    }
}