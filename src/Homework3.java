import java.util.Scanner;

public class Homework3 {
        public static void main(String [] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите длину в дюймах: ");
            double inch = scan.nextInt();
            double lenght = inch * 2.54;
            System.out.println("Ваша длина в сантиметрах: " + lenght + "cm");
        }
    }