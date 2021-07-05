import java.io.*;
import java.util.*;
public class StringHackerRank {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int x=A.length()+B.length();
        int m=A.length();
        int n=B.length();
        System.out.println(x);
        boolean isBig=false;
        //boolean visted=false;
        
        if(A.length() > B.length()){
            for(int i=0;i<n;i++){
                if(A.charAt(i)>B.charAt(i)){
                isBig=true;
                break;
                }
                else {
                	break;
                }
                
            }
        }
        else{
            for(int i=0;i<m;i++){
                if(A.charAt(i)>B.charAt(i)){
                isBig=true;
                break;
                }
                else {break;}
                
        }
        }
        if(isBig)System.out.println("Yes");
        else System.out.println("No");
        
        
        String z=A.substring(0,1);
        String y=A.substring(1);
        z=z.toUpperCase();
        
        String k=B.substring(0,1);
        String l=B.substring(1);
        k=k.toUpperCase();
        System.out.println(z+y+" "+k+l);
        // char a='a';
        // char b='b';
        // System.out.println(a>b);
    
}





}
