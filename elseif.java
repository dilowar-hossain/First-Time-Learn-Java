import java.util.Scanner;
public class elseif {
    public static void main(String[] args) {
        System.out.println("Enter your marks");
        int marks;
        Scanner dil=new Scanner(System.in);
        marks=dil.nextInt();
       if (marks>=70 && marks<=100){
        System.out.println("Outstanding");
       }else if (marks>=50 && marks<=70)
         {
            System.out.println("Good ");
        }  else if (marks>=35 && marks<=50) {
          System.out.println("poor");  
        } else{
            System.out.println("Fail.");
        }     
    }
}