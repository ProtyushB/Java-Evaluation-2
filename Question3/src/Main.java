import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number Of Passengers: ");
        int passengers=sc.nextInt();

        System.out.print("Enter Number of KMs: ");
        int kms=sc.nextInt();

        OLA myOla = new OLA();
        Car myCar = myOla.bookCar(passengers,kms);
        int res = myOla.calculateBill(myCar);
        System.out.println("The total fare amount is "+ res);
    }
}
