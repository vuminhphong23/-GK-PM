import java.util.Scanner;

public class Tuan1_buoi2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao so nguyen duong n: ");
        int n = scanner.nextInt();
        scanner.close();
        
        int sum = 0;
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            System.out.println("Tong cac so tu 1 den " + n + " la: " + sum);
        } else {
            System.out.println("Vui long nhap lai 1 so nguyen duong.");
        }
    }
}