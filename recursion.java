public class recursion {
    public void print(int n){
        if(n==0) return;
         System.out.print(n+ " ");
        print(n-1);
      
        System.out.print(n+" ");
       
       
    }

    public static void main(String[] args) {
        recursion r=new recursion();
        r.print(5);
        
    }
}