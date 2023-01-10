import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Car car =new Car();
//        car.name = "Toyota";
//        car.yearOfProduction = 2022;
//        car.color = "black";
//        System.out.println("Name: "+ car.name);
//        System.out.println("Year of production: "+ car.yearOfProduction);
//        System.out.println("color: "+ car.color);
//        car.zhurot();
//
//        Car car1 = new Car();
//        car1.name = "Mersedes Benz";
//        car1.yearOfProduction = 2020;
//        car1.color = "blue";
//        System.out.println("Name: "+ car1.name);
//        System.out.println("Year of production: "+ car1.yearOfProduction);
//        System.out.println("color: "+ car1.color);
//        car1.zhurot();
//        Scanner scan = new Scanner(System.in);
//        Computer comp = new Computer();
//
//        System.out.println("Model:");
//        comp.model = scan.nextLine();
//        System.out.println("год производства:");
//        comp.yearsProduction = scan.nextInt();
//        System.out.println("Страна производства:");
//        comp.countryOfProduction = scan.nextLine();
//        System.out.println("сколько памяти:");
//        comp.pamyat = scan.nextInt();
//        System.out.println("country of production: "+comp.countryOfProduction);
//        System.out.println("model: "+comp.model);
//        System.out.println("years production: "+comp.yearsProduction);
//        System.out.println("pamyat: "+comp.pamyat);
//        comp.works();

        // площадь треугголника A B C...

        Scanner scan = new Scanner(System.in);
        Triangle angle = new Triangle();
        System.out.println("Введите сторону А: ");
        angle.sideA = scan.nextDouble();
        System.out.println("Введите сторону В: ");
        angle.sideB = scan.nextDouble();
        System.out.println("Введите сторону С: ");
        angle.sideC = scan.nextDouble();
        System.out.println("сторона А: "+angle.sideA);
        System.out.println("сторона B: "+angle.sideB);
        System.out.println("сторона C: "+angle.sideC);
        angle.areaTriangle(angle.sideA, angle.sideB, angle.sideC);

    }
}