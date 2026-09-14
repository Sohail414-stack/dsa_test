public class gcd {

    public static int gcde(int a,int b){
        if(a==0)return b;
        return gcde(b%a, a);
    }
    
    public static void main(String[] args) {
        int res=gcde(5, 15);
        System.out.println(res);
    }

}