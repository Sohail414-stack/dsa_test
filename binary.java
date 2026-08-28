import java.util.Arrays;
import java.util.Scanner;

public class binary {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter element");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=9;
        int lo=0;
        int hi=n-1;
        Arrays.sort(arr);
        System.out.println(" ");
        while(lo<=hi){
            int idx=-1;
         int mid=((lo+hi)/2);
         if(arr[mid]==target){
            idx=mid;
            hi=mid-1;
            System.out.print(idx+ " ");

            return ;
         }
         if(arr[mid]>target){
         hi=mid-1;
         }
         else if(arr[mid]<target){
            lo=mid+1;
         }
         else{
            System.out.println("not found");
         }
        }   
    }
}
