import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        
            arr[i] = sc.nextInt();
        }

        boolean found = true;

        for (int i = 0; i < n; i++) {
            if (arr[i] == n) {
                System.out.println("found");
                found = true;
                else{
                 System.out.println("Not found");
                
                break;
            }
        }

       
    }
