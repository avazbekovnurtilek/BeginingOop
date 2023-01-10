public class Triangle {
    double sideA;
    double sideB;
    double sideC;

    public void areaTriangle(double sideA,double sideB,double sideC){
        double area = 0;
        System.out.println("Находим периметр, сумму всех старон и делим на 2!");
        double p = (sideA + sideB + sideC)/2;
        System.out.println("периметр треуголника: " +p);
        System.out.println("Выводим по формуле Гарнера");
        area = Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));
        System.out.println("площадь труголника: "+area);

    }
}
