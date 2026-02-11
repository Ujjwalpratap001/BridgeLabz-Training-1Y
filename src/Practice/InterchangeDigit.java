package Practice;

public class InterchangeDigit {
    public static void main (String[] args){
        double a=5;
        double b=10;

        double temp=a;
                  a=b;
                  b=temp;

        System.out.println(a);
        System.out.println(b);
    }

}
