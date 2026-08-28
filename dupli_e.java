import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class dupli_e{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer>list=new ArrayList<>();
        System.out.println("enter no of element ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter eleement ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int i=0;
        while (i<n-1) {
            
            if(arr[i]==arr[i+1]){
                list.add(arr[i]);
              
              
            }
            i++;
           
           
         
        }
        System.out.println(list);


    }
}