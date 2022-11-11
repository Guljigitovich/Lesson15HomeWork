import java.util.Scanner;

public class Circle {
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;

    }public void getInfo (){
        Scanner scanner = new Scanner(System.in);
        System.out.print("San jaz: ");
        System.out.println("Joop: "+area(scanner.nextInt()));
        System.out.print("San jaz: ");
        System.out.println("Joop: "+circumference(scanner.nextInt()));
    }

    public static String area(int number){
        double count = Math.PI*(number*number);
       return   Math.PI+"*"+"("+number+"*"+number+")"+"="+count;

    }public static String circumference(int number){
        double count = Math.PI*2*number;
        return Math.PI+"*"+2+"*"+number+"="+count;

    }


}
