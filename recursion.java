public class recursion {
    static int print(int n){
       if(n==0 || n==1){
        return 1;
       }
       int ans=n*print(n-1);
      System.out.println(ans);
      return ans;
       
       
    }
    public double pow(int base,int pow){
       if(pow==0)return 1;
       return (int)base*pow(base, pow-1);
    }

    public static void main(String[] args) {
        recursion r=new recursion();
        int res=r.print(5);
     int  rest= (int) r.pow(2, 5);
     System.out.println(rest);
        
    }
}