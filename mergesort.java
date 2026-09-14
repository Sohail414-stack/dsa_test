import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public  class mergesort {

    public void mergesort(int arr[],int left,int right){
        if(left>=right) return;
        int mid=(left+right)/2;
        mergesort(arr, left, mid);
        mergesort(arr, mid+1, right);
        merge(arr, left,mid, right);
    }
    public void merge(int arr[],int left,int mid,int right){
            int temp[] = new int[right - left + 1];
        int i=left;
        int j=mid+1;
        int idx=0;
        while(i<=mid && j<=right){
            if(arr[i]<arr[j]){
                temp[idx++]=arr[i++];
            }
            else{
                temp[idx++]=arr[j++];
            }
        }
        while(i<=mid){
            temp[idx++]=arr[i++];
        }
        while (j<=right) {
            temp[idx++]=arr[j++];
        }
          for(int k = 0; k < temp.length; k++) {
            arr[ left+k] = temp[k];
            // System.out.print(arr[left+k]+ " ");
        }
        

    }
    public static void main(String[] args) {
        mergesort ms=new mergesort();
        System.out.println("enter no of element ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter element ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        ms.mergesort(arr,0,arr.length-1);
        for(int el:arr){
            System.out.print(el+ " ");
        }
    }
}


    


    

