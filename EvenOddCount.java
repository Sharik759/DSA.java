import java.util.Scanner;
public class EvenOddCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        
            arr[i] = sc.nextInt();
            }
            int even = 0, odd = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] % 2 == 0)
                     System.out.println("Even Numbers: " + even);
                else
                     System.out.println("Odd Numbers: " + odd);
                }
               
                }
                