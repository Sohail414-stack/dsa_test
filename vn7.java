import java.util.Scanner;

public class vn7{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of element");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter element ")
        ;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            
        }
        boolean flag[]=new boolean[n+1];
        for(int i=0;i<n;i++){
            int el=arr[i];
            if(flag[el]==true){
                System.out.println("found duplicate"+el);
            }
            else if(flag[el]!=true){
                flag[el]=true;
            }
           else{
            System.out.println("duplicate not available");
           }
        }
        
    }
}