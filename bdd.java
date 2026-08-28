import java.util.*;

public class bdd {
    public void numofzero(int arr[],int n){
        int arr2[]=new int[n];
        int count=0;
       for(int i=0;i<n;i++){
        if(arr[i]==0){
          count++;
        }
       }
       for(int i=count;i<n;i++){
          arr2[i]=1;
       }
       for(int i=0;i<n;i++){
        System.out.print(arr2[i]+" ");
       }
    }
    public void num(int arr[],int n){
      
       Arrays.sort(arr);
       System.out.println("after sorting ");
       for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
       }
       for(int i=0;i<n-1;i+=2){
        
       int temp=arr[i];
       arr[i]=arr[i+1];
       arr[i+1]=temp;
        }
        System.out.println("\n");
       
       for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
       }
    }
    public static void main(String[] args) {
        int n=5;
        int arr[]={4,3,6,8,2};
        bdd b=new bdd();
        // b.numofzero(arr,n);
        b.num(arr, n);
       
        
    }
}
