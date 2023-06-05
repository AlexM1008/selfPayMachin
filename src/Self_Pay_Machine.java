import java.util.Scanner;

public class Self_Pay_Machine {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Kaufland!");
        System.out.println("Introduceti valoarea bonului dvs.");
        double bon = sc.nextDouble();
        System.out.println("Introduceti banii in casa.");
        double bani = sc.nextDouble();
        double rest = bani - bon;
        System.out.println("Restul dvs. este de: " + rest + " lei.");

        while (rest >= 200){
            System.out.println(200);
            rest -= 200;
        }
        while (rest >= 100){
            System.out.println(100);
            rest -= 100;
        }
        while (rest >= 50){
            System.out.println(50);
            rest -= 50;
        }
        while (rest >= 10){
            System.out.println(10);
            rest -= 10;
        }
        while (rest >= 5){
            System.out.println(5);
            rest -= 5;
        }
        while (rest >= 1){
            System.out.println(1);
            rest -= 1;
        }
        while (rest >= 0.5){
            System.out.println(0.5);
            rest -= 0.5;
        }
        while (rest >= 0.1){
            System.out.println(0.1);
            rest -= 0.1;
        }
        while (rest >= 0.05){
            System.out.println(0.05);
            rest -= 0.05;
        }
        while (rest >= 0.01){
            System.out.println(0.01);
            rest -= 0.01;
        }
    }
}