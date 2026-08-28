import java.util.Scanner;

public class string{
    public static int compareTo(String a,String b){
        if(a.equals(b))return 0;
        int n=Math.min(a.length(), b.length());
        for(int i=0;i<n;i++){
            if(a.charAt(i)!=b.charAt(i)){
                return  a.charAt(i)-b.charAt(i);
            }
           
            
        }
        return a.length()-b.length();
    }
    public String suString(String str){
        for(int i=0;i<=str.length();i++){
            for(int j=i+1;j<=str.length();j++){
              return (str.substring(i,j));
            }
        }
       return;
    }
    public boolean checkpalindrome(String s){
        int i=0;
        int j=s.length()-1;
        int flag=0;
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
              flag=1;
                
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return true;
    }
  public static void main(String[] args) {
    
  
        Scanner sc=new Scanner(System.in);
        // System.out.println("enter name");
        // String s=sc.nextLine();
        // for(int  i=0;i<s.length();i++){
        //    if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
        //     // s.charAt(i );
        //     String name=s.toUpperCase();
        //     if(s.contains("sohail")){
        //         System.out.println(name);
        //     }
        //     System.out.println(s.charAt(i));

           
        //    }
        // }
            String a="harshita";
            String b="gopi";
            string sp=new string();
            // sp.checkpalindrome(s);
            // System.out.println(sp.checkpalindrome(s));
            // System.out.println(s.lastIndexOf('a'));
            // System.out.println(s.toUpperCase());
            // System.out.println(sp.compareTo(a, b));
            // System.out.println(a.length());
            sp.suString(b);
           }
        }

    
