public class Homework3 {
    public static void main(String[] args) {
//            Scanner scan = new Scanner(System.in);
//            System.out.println("Введите длину в дюймах: ");
//            double inch = scan.nextInt();
//            double lenght = inch * 2.54;
//            System.out.println("Ваша длина в сантиметрах: " + lenght + "cm");
//        }
//    }
//
//        double max;
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Input first double: ");
//        double dou1 = scan.nextInt();
//        System.out.println("Input second double: ");
//        double dou2 = scan.nextInt();
//        System.out.println("Input third double: ");
//        double dou3 = scan.nextInt();
//        if (dou1 > dou2)
//            max = dou1;
//        else max = dou2;
//        if (max > dou3)
//        System.out.println("Максимальное число: " + max);
//            else
//        System.out.println("Максимальное число: " + dou3);


        Scanner scan = new Scanner(System.in);
        System.out.println("Input first double: ");
        double dou1 = scan.nextInt();
        System.out.println("Input second double: ");
        double dou2 = scan.nextInt();
        System.out.println("Input third double: ");
        double dou3 = scan.nextInt();
        if (dou2 > dou1) && (dou3 > dou2) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}


