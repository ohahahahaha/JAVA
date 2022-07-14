package test.Task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Task01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double a = Double.parseDouble(reader.readLine());
        double b = Double.parseDouble(reader.readLine());
        double c = Double.parseDouble(reader.readLine());
        System.out.println(getFunction(a,b,c));
    }

    public static double getFunction (double a, double b, double c){
        return ((a - 3) * b / 2) + c;
    }
}