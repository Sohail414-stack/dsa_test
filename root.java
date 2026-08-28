public class root{
    public int rooti(int n){
     int i;
     for(i=1;i<=n;i++){
        if(i*i==n){
            return i;
        }
        else if(i*i>n){
            return i-1;
            
        }
       
     }
     return i-1;
    }
    public static void main(String[] args) {
        
    
        root r=new root();
        int n=17;
        int res=r.rooti(n);
        System.out.println(res);
    
     }
    }