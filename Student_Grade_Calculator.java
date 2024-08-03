import java.util.Scanner;

public class Student_Grade_Calculator {

    static void Calculation(int M1, int M2, int M3, int M4, int M5, Double sum2, Double Percentage) {
        sum2 = (double) (M1 + M2 + M3 + M4 + M5);
        System.out.println("The sum is : ");
        System.out.println(sum2);
        Percentage = (double) sum2 / 500 * 100;
        System.out.println("The average percentage is : ");
        System.out.println(Percentage + "%");
        if (Percentage >= 85) {
            System.out.println("The Grade is A");
        } else if (Percentage >= 75) {
            System.out.println("The Grade is B");
        } else if (Percentage >= 55) {
            System.out.println("The Grade is C");
        } else if (Percentage >= 34) {
            System.out.println("The Grade is D");
        } else {
            System.out.println("The Grade is F");
        }
    }

    public static void main(String[] args) {
        int M1, M2, M3, M4, M5;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the Marks of the subject......");
            System.out.println("Subject 1 marks : ");
            M1 = sc.nextInt();
            System.out.println("Subject 2 marks : ");
            M2 = sc.nextInt();
            System.out.println("Subject 3 marks : ");
            M3 = sc.nextInt();
            System.out.println("Subject 4 marks : ");
            M4 = sc.nextInt();
            System.out.println("Subject 5 marks : ");
            M5 = sc.nextInt();
        }
        Calculation(M1, M2, M3, M4, M5, null, null);
    }
}