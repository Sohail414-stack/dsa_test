import java.util.Scanner;

public class ls {
    int ans;

    public boolean linears(int[]arr,int el){
       ans=rec(0, arr, el);
       if(ans ==1)return true;
         return false;
    }
   
    public int rec(int idx,int[]arr,int el){
        if(idx==arr.length)return 0;
        if(arr[idx]==el) return 1;
         
         return rec(idx+1, arr,el);
    }
    public static void main(String[] args) {
        ls l=new ls();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of element ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter element ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter element ");
        int el=sc.nextInt();
       boolean res=l.linears(arr, el);
       System.out.println(res);
        

    }
}