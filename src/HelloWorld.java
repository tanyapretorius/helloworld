import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {

        System.out.println("Please Enter your Weight in Kilograms");

        // Get the entered values from user
        Scanner scanner = new Scanner(System.in);
        float w = scanner.nextFloat();

        System.out.println("Please Enter your Height in Meters");
        float h = scanner.nextFloat();

        float bmi = w/(h*h);

        System.out.println("BMI = " +bmi);
    }
}
