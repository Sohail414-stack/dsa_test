import java.nio.charset.MalformedInputException;
import java.util.Scanner;

public class distinct {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first array size");
        int n=sc.nextInt();
        int arr[]=new int[n];
         System.out.println("enter second array size");
        int m=sc.nextInt();
        int arr1[]=new int[m];
        System.out.println("enter element of 1st arr ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        System.out.println("enter element of 2nd arr ");
        for(int i=0;i<m;i++){
            arr1[i]=sc.nextInt();

        }
       
        
         int []arr3=new int[m+n-1];
         int idx=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i]==arr1[j]){
                  arr3[idx++]=arr1[j];
                }
            }
        }
        for(int i=1;i<idx;i++){
           
            System.out.print( arr3[i]+ " ");
        }
    }
}