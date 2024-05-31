import java.util.*;
public class SwappingofNibbles {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine(),2);
        int a=n%16;
        int b=n/16;
        int ans=(a*16+b);
        System.out.println(ans);
    }
}
