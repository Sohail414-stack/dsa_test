import java.util.Scanner;

public class linera {
    public int ls(int key){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number of element");
    
    int n=sc.nextInt();
    System.out.println("enter element ");
    int el[]=new int[n];
    for(int i=0;i<n;i++){
        el[i]=sc.nextInt();
    }
    for(int i=0;i<el.length;i++){
        if(el[i]==key){
       return i;
        }
      
    }
     
            System.out.println("element not found ");
        
         return -1;


    
    }
    public int bs(int key){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number of element");
    
    int n=sc.nextInt();
    System.out.println("enter element ");
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int l=0;
    int r=arr.length-1;
    
    while(l<=r){
        int mid=(l+r)/2;
        if(arr[mid]==key){
            return mid;
            
        }
        if(key<arr[mid]){
            r=mid-1;
        }
        else{
            l=mid+1;
        }
        
    }
    return -1;
}

    public static void main(String[] args) {
        linera lr=new linera();
      int res=  lr.ls(5);
      if(res ==-1){
        System.out.println("element not fount");
      }
      else{
        System.out.println("element found at "+ res);
      }
      int res1=lr.bs(7);
      if(res1 ==-1){
        System.out.println("element not found ");
      }
      else{
        System.out.println("elemetn found at index " + res1);
      }
    }
    
}
