import java.util.Scanner;

public class bs {
    public int bs(int arr[],int key,int num){
        int l=0;
        int r=num.length-1;
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
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num of element");
        int num=sc.nextInt();
        int arr[]=new int[num];
        System.out.println("enter key");
        int key=sc.nextInt();
        System.out.println("enter element");
        for(int i=0;i<num.length;i++){
            arr[i]=sc.nextInt();
            
        }
        
        
    }
}
