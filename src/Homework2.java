import java.util.Scanner;

public class Homework2 {
    // Написати програму, яка буде отримувати від користувача два цілих числа та виводити на екран їхню суму.
            public static void main(String[] args) {


            Scanner k = new Scanner(System.in);
            System.out.println ("Введіть 2 будь-яких цілих числа: ");
            int number1 = k.nextInt();//зчитує перше число і присвоює значення в number1
            int number2 = k.nextInt();//зчитує друге число і присвоює значення в number2
            System.out.print(number1 + number2);//виводить суму number1 + number2



        }

}
