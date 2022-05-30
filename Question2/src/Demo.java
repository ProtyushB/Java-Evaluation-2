import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Number Student Objects Need To Be Created: ");
        int n=sc.nextInt();

        System.out.println("========================================");
        Student[] students  = new Student[n];

        for (int i=0;i<n;i++){
            students[i]=new Student();
            System.out.println("\n\nEnter The Details of Student "+(i+1));

            System.out.print("Enter Name: ");
            students[i].setName(sc.next());

            System.out.print("Enter Roll: ");
            students[i].setRoll(sc.nextInt());

            System.out.print("Enter Address: ");
            students[i].setAddress(sc.next());

            System.out.print("Enter Marks: ");
            students[i].setMarks(sc.nextInt());
        }

        System.out.println("--------------------------------------");

        float avg=0;

        for (int i=0;i<n;i++){
            System.out.println("\n\nPrinting Details Of Student "+(i+1));
            System.out.println("Name: "+students[i].getName());
            System.out.println("Roll: "+students[i].getRoll());
            System.out.println("Address: "+students[i].getAddress());
            System.out.println("Marks: "+students[i].getMarks());
            avg+=students[i].getMarks();
        }
        System.out.println("\nAverage Marks Of The Students Is: "+(avg/n));
    }
}
