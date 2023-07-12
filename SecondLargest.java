import java.util.Scanner;
public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int res = secondLargest(arr, n);
        if(res == -1) {
            System.out.println(res);
        } else if(res != 999999999) {
            System.out.println(res);
        }else {
            System.out.println("No such Element Exists");
        }
        
        sc.close();
    }

    static int secondLargest(int[] arr,int n) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        if(n <= 1) {
            return -1;
        }
        for(int i=0;i<n;i++) {
            if(arr[i] > first) {
                second = first;
                first = arr[i];
            } else if(arr[i]<first && arr[i] > second) {
                second = arr[i];
            }
        }
        if(second == Integer.MIN_VALUE) {
            return 999999999;
        }
        return second;
    }
}