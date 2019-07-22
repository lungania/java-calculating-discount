import java.util.Scanner;

public class MethodOverloading {
    public static void main(String[] args) {
       over("liz","lung'ania");
    }
    public static String over(String x,String y){
        Scanner chukua;
        chukua=new Scanner(System.in);
        System.out.println("Enter value of x");
        x=chukua.next();
        System.out.println("Enter value of y");
        y=chukua.next();
       String ans=x+" "+y;
        System.out.println(ans);
        return ans;
    }
    public void over(){
        System.out.println("Method overloading");
    }
    public static Integer over(Integer x,Integer y){
        Scanner chukua;
        chukua=new Scanner(System.in);
        System.out.println("Enter value of x");
        x=chukua.nextInt();
        System.out.println("Enter value of y");
        y=chukua.nextInt();
        Integer ans=x+y;
        System.out.println(ans);
        return ans;
    }
    public void over(int x){
        Scanner chukua;
        chukua=new Scanner(System.in);
        x=chukua.nextInt();
        System.out.println("You entered "+x);
    }
}
