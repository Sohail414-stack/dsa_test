import java.util.Scanner;

public class find{
    public int maxmin(int[][]arr){
        int n=arr.length;
        int m=arr[0].length;
        int max[]=new int[n];
        
        for(int i=0;i<n;i++){
              int maxixmum=Integer.MIN_VALUE;
            for(int j=0;j<m;j++){
              if(arr[i][j]>maxixmum){
                 maxixmum=arr[i][j];
                   
              }
            }
            max[i]=maxixmum;
        }
              
               int min=Integer.MAX_VALUE;
              for(int i=0;i<max.length;i++){
                if(max[i]<min){
                    min=max[i];
                }
              }
             
            
          return min;
        
    }
    public static void main(String[] args) {
        int max=Integer.MIN_VALUE;
        find f=new find();
        
        Scanner sc=new Scanner(System.in);
        int [][]arr=new int[3][4];
        for(int i=0;i<arr.length;i++){
           for(int j=0;j<arr[0].length;j++){
            arr[i][j]=sc.nextInt();
           
           }
        }
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<arr[0].length;j++){
            sum+=arr[i][j];
            }
              if(sum>max){
                max=sum;
              }
        }
        System.out.println("max is "+max);
        int result =f.maxmin(arr);
        System.out.println();
        System.out.println("min is : "+result);        
     
    }
}