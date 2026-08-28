import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class pos_neg_int {
       public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList <Integer>list=new ArrayList<>();
    
        int n=sc.nextInt();
        System.out.println("enter no of element ");
        int arr[]=new int[n];
        System.out.println("enter element");
        for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int pos=0,neg=0,lo=0,hi=n-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(arr[mid]>0){
                pos=mid-1;
                hi=mid-1;
            }
            else{
                neg=mid+1;
                lo=mid+1;
            }
        }
        int max=Math.max(pos, neg);
        System.out.println("max is : "+max);

}
}