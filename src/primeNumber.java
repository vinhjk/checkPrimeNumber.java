import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number :");
        int num = scanner.nextInt();

        if (num < 2)
            System.out.println(num + " is not prime");
        else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(num)){
                if (num % i == 0){
                    check = false;
                    break;
                }
                i++;
            }
            if (check) System.out.println(num + " is prime");
            else System.out.println(num + " is not prime");
        }
    }
}
