import java.util.Scanner;
public class JavaTask2 {

    // Instance variable (belongs to object)
    int instanceVar = 10;

    // Static variable (shared by all objects)
    static int staticVar = 20;

    public static void main(String[] args) {

        // 1️⃣ Primitive data types with explanation
        byte b = 10;          // byte chosen to save memory
        short s = 200;        // short for slightly larger range
        int i = 1000;         // int is default for integers
        long l = 100000L;     // long for large values

        float f = 10.5f;      // float uses less memory than double
        double d = 99.99;     // double gives more precision

        char c = 'A';         // char stores single character
        boolean isJavaFun = true; // boolean for true/false values

        // 2️⃣ Scanner for user input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // 3️⃣ Arithmetic operations
        int sum = num1 + num2;
        int diff = num1 - num2;
        int product = num1 * num2;

        // 5️⃣ Handling invalid input (division by zero)
        if (num2 != 0) {
            int quotient = num1 / num2;
            System.out.println("Division: " + quotient);
        } else {
            System.out.println("Cannot divide by zero!");
        }

        // 4️⃣ Type casting
        double castedValue = num1;       // implicit casting (int → double)
        int narrowedValue = (int) d;     // explicit casting (double → int)

        // Local variable (exists only inside this method)
        int localVar = 30;

        // Creating object to access instance variable
        JavaTask2 obj = new JavaTask2 ();

        // 6️⃣ Formatted output
        System.out.printf("\nSum: %d\nDifference: %d\nProduct: %d\n", sum, diff, product);
        System.out.printf("Implicit Casting (int → double): %.2f\n", castedValue);
        System.out.printf("Explicit Casting (double → int): %d\n", narrowedValue);

        // 7️⃣ Variable scope demonstration
        System.out.println("\nLocal Variable: " + localVar);
        System.out.println("Instance Variable: " + obj.instanceVar);
        System.out.println("Static Variable: " + staticVar);

        sc.close();
    }
}
