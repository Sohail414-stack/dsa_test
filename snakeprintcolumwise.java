  import java.util.Scanner;
public class snakeprintcolumwise {
  

    public static void main(String[] args) {
        int arr[][]=new int[3][3];
        int arr2[][]=new int[3][3];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter element");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=sc.nextInt();

            }
        }
        System.out.println("Original element is : ");
          
        for(int i=0;i<arr.length;i++){
            for(int j=arr[0].length-1;j>=0;j--){
                arr2[i][j]=arr[i][j];
                System.out.print(arr2[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("snake printing...");
          
        for(int i=arr.length-1;i>=0;i--){
            
              for(int j=arr[0].length-1;j>=0;j--){
                 System.out.print(arr2[i][j]+" ");
              }
               System.out.println();

            }
          

            
           
           
          
    }
}



