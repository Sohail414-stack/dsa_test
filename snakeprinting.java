import java.util.Scanner;

public class snakeprinting {
    public static void main(String[] args) {
        int arr[][]=new int[4][4];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter element");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=sc.nextInt();

            }
        }
        System.out.println("Original element is : ");
          
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("snake printing...");
          
        for(int i=0;j<arr.length;i++){
            if(i%2==0){
              for(int j=0;j<arr[0].length;j++){
                 System.out.print(arr[i][j]+" ");
              }

            }
            else{
                for(int j=arr[0].length-1;j>=0;j--){
                     System.out.print(arr[i][j]+ " ");

                }

            }
            System.out.println();
           
          
    }
}
}
