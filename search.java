import java.util.Scanner;

public class search {
    
    public static void main(String []args) {

        try (Scanner sc = new Scanner(System.in)) {
            int arr[] = new int[100];
            System.out.println("Enter how many elements");
            int n;
            n=sc.nextInt();
            System.out.println("Enter "+n+" values ...");
            int i;
            for (i=0; i<n;i++) {
                arr[i]=sc.nextInt();

            }

            System.out.println("Enter the search value : ");
            int src=sc.nextInt();

            for(i=0; i<n; i++) {
                if(arr[i]==src) {
                    System.out.println(src+ "is found & the position is : "+(i+1));
                    break;
                }
            }

            if(i==n) {
                System.out.println(src+" not found");
            }
        }
    }
}