import java.util.*;


public class ps3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList <Integer>ar=new ArrayList<>();
        System.out.println("enter number of element");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int arrb[]=new int[n];
        System.out.println("Enter first array element");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
         System.out.println("Enter second array element");
          for(int i=0;i<n;i++){
            arrb[i]=sc.nextInt();
        }
        System.out.println("duplicate array ");
        for(int i=0;i<n;i++){
          for(int j=0;j<n;j++){
            if(arr[i]==arrb[j]){
                ar.add(arr[i]);
             
            }
          }  
        }
        System.out.println(ar);
    }
    
}
