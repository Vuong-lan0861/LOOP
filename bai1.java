import java.util.Scanner;
public class bai1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập giá trị đầu a: ");
        int a = input.nextInt();
        System.out.print("Nhập giá trị cuối b: ");
        int b = input.nextInt();

        int total = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                total += i;
            }
        }
        System.out.println("Tổng các số chẵn trong khoảng từ " + a + " đến " + b + " là " + total);
    }
}