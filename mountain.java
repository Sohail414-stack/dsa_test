import java.util.Scanner;

public class mountain {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter element");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int l=0;
        int r=n-1;
        while(r<=l){
            int mid=(r+l)/2;
            if(mid>0 && mid <n-1 && arr[mid]>arr[mid+1]&& arr[mid]>arr[mid-1]){
                System.out.println("peak element at index =" + mid);
                return;
            }
            else if(arr[mid]<arr[mid+1]){
                l=mid+1;

            }
            else{
                r=mid-1;
            }
          
        }
}
}
