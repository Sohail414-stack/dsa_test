public class insertion{
    public void bubble(int arr[]){
      for(int i=0;i<arr.length-1;i++){
        int swap=0;
        for(int j=0;j<arr.length-1;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                swap++;
            }
        }
        if(swap ==0) return ;

      }
    }
    public void selection(int arr[]){
        for(int i=0;i<arr.length;i++){
          int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
                    // min=i;
                    int temp=arr[i];
                    arr[i]=arr[min];
                    arr[min]=temp;

                }
            }

        
     
    
public static void main(String[] args) {
    insertion i=new insertion();
    int arr[]={20,1,4,3,8,9};
    // i.bubble(arr);
    // for(int el:arr){
    //     System.out.print(el+ " ");
    // }
    System.out.println();
    i.selection(arr);
    for(int el:arr){
        System.out.print(el+" ");
    }
}

    
}
