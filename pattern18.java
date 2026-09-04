/*
In this pattern we will print the following pattern:
E 
D E 
C D E 
B C D E 
A B C D E
*/
import java.util.Scanner;

public class pattern18 {
    public static void pattern(int n){
        //for rows
        for(int i=1; i<=n; i++){
            //for pattern
            for(int j=n-i; j<n; j++){
                char start = 'A';
                start +=j;
                System.out.print(start+" ");

                // ch++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the number of rows:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        pattern(n);
    }
}
