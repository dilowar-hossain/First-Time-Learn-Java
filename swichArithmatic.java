import java.util.Scanner;
public class swichArithmatic {
    public static void main(String[] args) {
        int a,b,c,ch;
        Scanner dil=new Scanner( System.in);
        System.out.println("Enter two number ");
        a=dil.nextInt();
        b=dil.nextInt();
        System.out.println("Enter your choice ");
        ch=dil.nextInt();
        switch (ch) {
            case 1:c=a+b;
                System.out.println("Addition "+c);
                break;
                case 2:c=a-b;
                System.out.println("Substracton "+c);
                break;
                case 3:c=a*b;
                System.out.println("Multiplication "+c);
                break;
                case 4:c=a/b;
                System.out.println("Divition "+c);
                break;
                case 5:c=a%b;
                System.out.println("Remainder "+c);
                break;
                default:System.out.println("Invalid Chioce...");
                break;
        }
    }
}
