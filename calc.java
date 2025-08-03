import java.util.Scanner;
public class calc{
    public static void main(String[]args){
        while(true){
        System.out.println("Enter the operatons you want to make:");
        System.out.println("1.+\n2.-\n3.*\n4./");
        Scanner mm=new Scanner(System.in);
        int operation=mm.nextInt();
        if(operation==1){
            System.out.print("a= ");
            int a=mm.nextInt();
            System.out.print("b= ");
            int b=mm.nextInt();
            int sum=a+b;
            System.out.println(sum);
        }
        System.out.println("Do you want to continue?\nYes or No");
        String or=mm.next();
        if(or.equalsIgnoreCase("No")){
            break;
        }
        }
    }
}