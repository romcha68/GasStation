package Run;

import GasStation.Car;
import oracle.jrockit.jfr.events.DynamicValueDescriptor;

import java.util.Scanner;

/**
 * Created by aroma on 12.08.2017.
 */
public class Run
{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int a =reader.nextInt();
        int b = reader.nextInt();
        int c = reader.nextInt();
        int d=(int)Math.pow(b,2)-4*a*c;
        System.out.print((-b + Math.sqrt(d))/(2*a));
        System.out.println((-b-Math.pow(d,0.5))/(2*a));
        System.out.println(Math.pow(4,1.0/2));
        System.out.println(Math.pow(4,0.5));
        System.out.println(Math.sqrt(4));
    }
}
