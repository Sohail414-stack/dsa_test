import java.util.Scanner;

public class max{
   
    public static void main(String[] args) {
         System.out.println("enter number of arr");
     
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt(); 
     int arr[]=new int[n];
     System.out.println("enter element "+ n);
     for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
     }   
     int max=arr[0];  
     for(int i=1;i<n;i++) {
       if(arr[i]>max){
        max=arr[i];
        
       }
     }
     System.out.println(max);
       
    }
}