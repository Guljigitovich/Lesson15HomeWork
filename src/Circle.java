import java.util.Scanner;

public class Circle {
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;



    }

    public static String area(int number){
        double count = Math.PI*(number*number);
       return   Math.PI+"*"+"("+number+"*"+number+")"+"="+count;

    }public static String circumference(int number){
        double count = Math.PI*2*number;
        return Math.PI+"*"+2+"*"+number+"="+count;

    }


}
