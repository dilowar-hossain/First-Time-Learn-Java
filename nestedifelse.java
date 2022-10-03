//Three number as a grater number
import java.util.Scanner;
public class nestedifelse {
    public static void main(String[] args) {
        System.out.println("Enteer Three integer number ");
        int num1,num2,num3;
        Scanner dil=new Scanner(System.in);
        num1=dil.nextInt();
        num2=dil.nextInt();
        num3=dil.nextInt();//soups input value 40, 50 60
        if (num1>num2) { // 40>50 confition false this body exit
            if (num1>num3) {
               System.out.println("The big number "+num1);
            }else{ //soups input 20 10 20 then this condition working
                System.out.println("The big number "+num3);//
            }
        }else{  
            if (num2>num3) { //50>60 condition false this body exit
                System.out.println("The big number "+num2);
            }else{ // finaly this body print
                System.out.println("The big number "+num3);
            }
        }
    }
}
