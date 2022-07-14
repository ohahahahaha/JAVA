package test.Task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double a = Double.parseDouble(reader.readLine());
        double b = Double.parseDouble(reader.readLine());
        double c = Double.parseDouble(reader.readLine());
        double b2 = Math.pow(b,2);
        double b_2 = Math.pow(b, -2);
        double a3 = Math.pow(a, 3);
        double z = b2 - 4*a*c;
        if(z < 0) {
            System.out.println("The expression is less than 0");
        }
        else {
            double y = Math.sqrt((z));
            double f = ((b + y)/(2 * a)) - a3 * c + b_2;
            System.out.printf("%.2f", f);
        }
    }

}