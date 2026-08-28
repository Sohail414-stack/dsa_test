import java.util.*;

public class printpattern {
public  void  show (){
   
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=1;i<=n;i++){
         char ch='A';
        for(int j=1;j<=n;j++){
            System.out.print((ch) + " ");
            ch++;
            
        }
        System.out.println("\n");
        
    }
}   
public void show1(){
    int n=5;
 for(int i=1;i<=n;i++){
    for(int j=1;j<=i;j++){
     System.out.print("*");
    }
    System.out.println("\n");
 }   
}
public void show2(){
    int n=5;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
            System.out.print(i);
        }
        System.out.println("\n");
    }
}
public void show3(){
    int n=5;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
            System.out.print(j);
        }
        System.out.println("\n");
    }
}
public void show4(){
int n=5;
char ch='a';
for(int i=1;i<=n;i++ ){
    for(int j=1;j<=n;j++){
       System.out.print(ch);
    }
    ch++;
    System.out.println("\n");
    if(Character.isUpperCase(ch)){
        ch=Character.toLowerCase(ch);
    }
    else{
        ch=Character.toUpperCase(ch);
    }
}
}
public void show5(){
    int n=26;
    for(int i=1;i<=n;i++){
        
    char ch='A';
        for(int j=1;j<=i;j++){
            System.out.print(ch);
             ch++;
        }
       
        System.out.println('\n');
    }
}

public void show6(){
    int n=5;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
            if(i==1 || i==n ||  j==1 || j==n){
                
                System.out.print("*" );
            
        }
            else{
                System.out.print("#" );
            }
        }
     System.out.println();
    }

}
public void show7(){
    int n=5;
    for(int i=1;i<=n;i++){
         for(int j=1;j<=n;j++){
            if(i==(n+1)/2 || j==(n+1)/2){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }

         }
         System.out.println();
    }
}
public void show8(){
    int n=5;
    for(int i=1;i<=n;i++){
         for(int j=1;j<=i;j++){
            if((i+j) %2==0){
                System.out.print("1");
            }
             else{
                System.out.print("0");
            }

         }
         System.out.println();
    }
}
public void show9(){
    int n=5;
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if(i==j || i+j==n-1){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
public void show10(){
    int n=5;
    
    for(int i=1;i<=n;i++){
        int a=1;
        for(int j=1;j<=i;j++){
           
                System.out.print(a+" ");
                 a+=2;
            }
            System.out.println();
          
        }
       
        System.out.println();

    }
    public void show11(){
        int n=5;
        int nsp=n-1;
        int nn=1;
        for(int i=1;i<=n;i++){

            for(int j=1;j<=nsp;j++){
             System.out.print(" ");
            }
            for(int j=1;j<nn;j++){
                System.out.print(j);
            }
            System.out.println();
            nsp--;
            nn++;
        }
    }
    public void show12(){
        int n=5;
        int nsp=1;
        int nst=n;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=nst;j++){
                System.out.print("*");
            }
            for(int j=1;j<=nsp;j++){
                System.out.print(" ");
            }
            System.out.println();
            nsp++;
            nst--;
        }
    }
     public void show13(){
        int n=5;
        int nsp=n-1;
        int nn=1;
        char ch ='A';
        for(int i=1;i<=n;i++){

            for(int j=1;j<=nsp;j++){
             System.out.print(" ");
            }
            for(int j=1;j<=nn;j++){
                System.out.print(ch);
            }
            System.out.println();
            nsp--;
            nn++;
            ch++;
        }
    }
    public void show14(){
        int n=4;
        int nst=1;
        int nsp=n-1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=nsp;j++){
                System.out.print("  ");

            }
            for(int j=1;j<=nst;j++){
                System.out.print("* ");
               
            }
            System.out.println();
            nsp--;
            nst+=2;
        }
    }
     
     public void show15(){
        int n=4;
        int nst=1;
        int nsp=n-1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=nsp;j++){
                System.out.print("  ");

            }
            for(int j=1;j<=nst;j++){
                System.out.print("* ");
               
            }
            
            System.out.println();
            nsp--;
            nst+=2;
        }
      nst=n+1;
      nsp=0;
      for(int i=1;i<=n;i++){

          
      for(int j=1;j<=nsp;j++){
        System.out.print("  ");
      }
      for(int k=1;k<=nst;k++){
        System.out.print(" *");}
    
      System.out.println();
      nst-=2;
      nsp++;

    }
}
public void show16(){
    int n=4;
    int nst=1;
    int nsp=n-1;
    
    for(int i=1;i<=2*n-1;i++){
        for(int j=1;j<=nsp;j++){
            System.out.print("  ");
        }
        for(int j=1;j<=nst;j++){
            System.out.print("* ");
        }
        System.out.println();
        if(i<n){
            nsp--;
            nst+=2;
        }
        else{
            nst-=2;
            nsp++;
        }
    }
}
public void show17(){
    int n=5;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
            if(i==1 || i==n ||j==1||j==n){
            System.out.print(" *");
            }
            else{
                System.out.print("  ");
            }
        }
        System.out.println();
    }
}


public static void main(String[] args) {
    printpattern p=new printpattern();
    // p.show();
    // p.show1();
    // p.show2();
    // p.show3();
    // p.show4();
    // p.show5();
    // p.show6();
    // System.out.println();
    // p.show7();
    // p.show8();
    // System.out.println();
    // p.show9();
    // p.show10();
    // p.show11();
    // p.show12();
    //  p.show13();
    //  p.show14();
    //  p.show15();
    //  System.out.println();
       p.show16();
       p.show17();
} 
}
