import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task1 {
    public static void main(String[] args) {
        boolean temp = true;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (temp) {
            System.out.print("Введите дробное число: ");
            try {
                float fNumber = Float.parseFloat(reader.readLine());
                System.out.printf("Введенное число равно %f\n", fNumber);
                temp = false;
            } catch (IOException | NumberFormatException e) {
                System.out.println("Введите дробное число!");
            }

        }
    }
}