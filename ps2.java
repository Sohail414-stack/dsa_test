import java.util.Arrays;
import java.util.Scanner;

public class ps2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of element ");
        
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter element");
        for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
        }
        System.out.println("enter target");
        int target=sc.nextInt();
        Arrays.sort(arr);
        int i=0;
        int j=n-1;
        while(i<j){
            if(arr[i]+arr[j]==target){
                System.out.println(i + " " + j);
                break;
            }
            else if(arr[i]+arr[j]<target){
                i++;
            }
            else if(arr[i]+arr[j]>target){
                j--;
            }
            System.out.println("there is not achivable target");
            return;
        }
    
    }
    
}
