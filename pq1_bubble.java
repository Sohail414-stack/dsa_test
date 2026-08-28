import java.util.Scanner;

public class pq1_bubble {
    public void noz(int arr[]){
     int n=arr.length;
     int j=0;
     for(int i=0;i<n;i++){
      
            if(arr[i]!=0 ){
                if(i!=j){
              int temp=arr[i];
              arr[i]=arr[j];
              arr[j]=temp;
              
              
                }
              j++;
                
              
            }
           
        
     }
     for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
     }
    }

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);

        pq1_bubble p=new pq1_bubble();
        System.out.println("enter number of element ");
        int n=sc.nextInt();

        int arr[]=new int[n];
        System.out.println("enter element ");
        for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
        }

     
        // for(int i=0;i<n;i++){
        //     int swap=0;
        //     for(int j=0;j<n-i-1;j++ ){
        //         if(arr[j]>arr[j+1]){
        //             int temp=arr[j];
        //             arr[j]=arr[j+1];
        //             arr[j+1]=temp;
        //             swap++;
        //         }
        //     }
        //     if(swap==0)break;

        // }
        // for(int i=0;i<n;i++){
        //  System.out.print(arr[i]+ " ");
        // }
        int a=n-1;
        for(int i=0;i<n;i++){
          int max=0;
          for(int j=1;j<=a;j++){
            if(arr[j]>arr[max]){
              max=j;
            }
          }
          
         int temp=arr[a];
         arr[a]=arr[max];
         arr[max] =temp;
        
            a--;
        }
       
       for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
       }
        p.noz(arr);
        // int temp=2;
        // arr[n]=temp;
        // System.out.println(arr[temp]);
    }
}