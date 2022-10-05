public class logicalOperator {
    public static void main(String[] args) {
        int a=10,b=20;
        System.out.println(a==b && a!=b);  //both condition true==false
        System.out.println(a==b || a!=b); //any one condition true = first false,true
        System.out.println(!(a>b)); //10>20 = false but "!" logial not operator use
    }
}
