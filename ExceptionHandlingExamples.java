/*
The Summary:
This work demonstrates practical examples of various Java exceptions.
Each program deliberately triggers and handles a specific exception using try-catch blocks.
i added some Comments  to explain the purpose and functionality of each block of code.
*/

import java.io.*;
import java.sql.*;

public class ExceptionHandlingExamples {

    // 1. IOException: Simulating an input/output error when reading a file.
    public static void simulateIOException() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("nonexistentfile.txt"));
            reader.readLine();
        } catch (IOException e) {
            System.out.println("IOException caught: " + e.getMessage());
        }
    }

    // 2. FileNotFoundException: Trying to open a file that does not exist.
    public static void simulateFileNotFoundException() {
        try {
            FileReader file = new FileReader("missingfile.txt");
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException caught: " + e.getMessage());
        }
    }

    // 3. EOFException: Reading beyond the content of a file.
    public static void simulateEOFException() {
        try {
            DataInputStream dataInput = new DataInputStream(new FileInputStream("samplefile.txt"));
            while (true) {
                dataInput.readByte();
            }
        } catch (EOFException e) {
            System.out.println("EOFException caught: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException caught: " + e.getMessage());
        }
    }

    // 4. SQLException: Attempting to connect to a non-existent database.
    public static void simulateSQLException() {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nonexistentdb", "user", "password");
        } catch (SQLException e) {
            System.out.println("SQLException caught: " + e.getMessage());
        }
    }

    // 5. ClassNotFoundException: Loading a class that does not exist.
    public static void simulateClassNotFoundException() {
        try {
            Class.forName("com.nonexistent.Class");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException caught: " + e.getMessage());
        }
    }

    // 6. ArithmeticException: Performing an invalid arithmetic operation.
    public static void simulateArithmeticException() {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        }
    }

    // 7. NullPointerException: Accessing a null reference.
    public static void simulateNullPointerException() {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        }
    }

    // 8. ArrayIndexOutOfBoundsException: Accessing an invalid array index.
    public static void simulateArrayIndexOutOfBoundsException() {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        }
    }

    // 9. ClassCastException: Performing an invalid type cast.
    public static void simulateClassCastException() {
        try {
            Object obj = new Integer(10);
            String str = (String) obj;
        } catch (ClassCastException e) {
            System.out.println("ClassCastException caught: " + e.getMessage());
        }
    }

    // 10. IllegalArgumentException: Passing an invalid argument to a method.
    public static void simulateIllegalArgumentException() {
        try {
            Thread.sleep(-1000);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught: " + e.getMessage());
        } catch (InterruptedException e) {
            System.out.println("InterruptedException caught: " + e.getMessage());
        }
    }

    // 11. NumberFormatException: Converting an invalid string to a number.
    public static void simulateNumberFormatException() {
        try {
            int number = Integer.parseInt("NotANumber");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e.getMessage());
        }
    }

    
    public static void main(String[] args) {
        simulateIOException();
        simulateFileNotFoundException();
        simulateEOFException();
        simulateSQLException();
        simulateClassNotFoundException();
        simulateArithmeticException();
        simulateNullPointerException();
        simulateArrayIndexOutOfBoundsException();
        simulateClassCastException();
        simulateIllegalArgumentException();
        simulateNumberFormatException();
    }
}
