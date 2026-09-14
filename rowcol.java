import java.util.Scanner;

public class rowcol {
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
        System.out.println("original element ");
         for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+ " ");

            }
            System.out.println();
        }
        System.out.println();
        for(int i=0;i<arr[0].length;i++){
            for(int j=arr.length-1;j>=0;j--){
             arr2[i][j]=arr[j][i];
             System.out.print(arr2[i][j]+ " ");

            }
            System.out.println();
        }
        
        

}
}
