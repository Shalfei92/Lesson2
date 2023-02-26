import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


//ЗАДАНИЕ 1-5
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите ваше имя: ");
        String name = scanner1.next();
        System.out.println("Привет, "+ name);
        System.out.println("Какой ваш год рождения?");
        int year = scanner1.nextInt();
        System.out.println("Ваш возраст: " + (2023-year));
        System.out.println("Для вычесления периметра квадрата, укажите длину стороны:");
        int SquareLength = scanner1.nextInt();
        System.out.println("Периметр квадрата равен: " + (SquareLength*4));
        System.out.println("Укажите расстояние из точки А в точку Б в киллометрах:");
        int distance = scanner1.nextInt();
        System.out.println("Укажите время за которое нужно добраться из точки А в точку Б в часах:");
        int time = scanner1.nextInt();
        System.out.println("Вам необходимо двигаться со скоростью не менее: "+(distance/time)+ "км/ч.");
//Задание 6
        final double  courseEVR = 0.94805;
        System.out.println("Для конвертации  долларов в евро, пожалуйста укажите сумму в долларах:");
        int dollars = scanner1.nextInt();
        System.out.println("Сумма составляет: " + (dollars*courseEVR));
//Задание 7
        final int fileSize = 820;
        final int gigabyteSize = 1024;
        System.out.println("Укажите объем памяти физического накопителя в гигабайтах:");
        int memoryCapacity = scanner1.nextInt();
        System.out.print("При объеме физического носителя "+ memoryCapacity + " GB, можно поместить: ");
        System.out.print((memoryCapacity*gigabyteSize/fileSize)+ " файлов, размером 820 Mb.");
//Задание 8
        System.out.println("Пожалуйста укажите сумму в кошельке:");
        double theAmount = scanner1.nextDouble();
        System.out.println("Пожалуйста укажите цену за одну шокаладку:");
        double priceChocolate = scanner1.nextDouble();
        double result = theAmount%priceChocolate;
        double transformationIntDouble = theAmount/priceChocolate;
        int Quantity = (int) transformationIntDouble;
        System.out.println("Вы можете приобрести:" + Quantity + " шоколадок, ваша сдача составит: " + result);
    }
}