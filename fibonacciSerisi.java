import java.util.Scanner;
public class fibonacciSerisi {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.print("Serinin elelman sayısını girin :");
        int number= input.nextInt();

        System.out.print("SONUÇ => ");
        int a=0,b=1;
        System.out.print(a+" "+b+" ");

        for(int i=2;i<number;i++){
            int c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
}
