import java.util.Scanner;
public class baitap2 {
    public static void main(String[] args) {
        int n, c;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập vào số phần tử của mảng: ");
            n = scanner.nextInt();
        } while (n <= 0);
        int A[] = new int[n];
        int ch[] = new int[n];  // mảng chứa các phần tử là số chẵn
        System.out.println("Nhập các phần tử cho mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            A[i] = scanner.nextInt();
        }
        c = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] % 2 == 0) {
                ch[c] = A[i];
                c++;
            }
        }
        System.out.println("Các phần tử co gia tri la so chan la: ");
        for (int i = 0; i < c; i++) {
            System.out.print(ch[i] + "\t");
        }
    }//Viết chương trình nhập vào một mảng số nguyên có n phần tử, xuất mảng ra màn hình và cho hiển thị các phần tử có giá trị là số chẵn

}