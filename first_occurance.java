import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class first_occurance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList <Integer>list=new ArrayList<>();
    
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter element");
        for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
        }
        int x=5;
        Arrays.sort(arr);
        int l=0;
        int hi=n-1;
        while(l<=hi){
            int mid=(l+hi)/2;
            if(arr[mid]==x){
                if(arr[mid+1]>x){
                    list.add(mid);
                }
            }
            else if(arr[mid]>x){
                l=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        System.out.println(list);
}
}
