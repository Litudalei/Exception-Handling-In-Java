package exceptionPropagation;

public class ExceptionPropagationDemo {
    public static void main(String[] args)throws ArithmeticException {
        try
        {m1();} catch (ArithmeticException e) {

        }
        System.out.println("Exception is finally reached at default exception Handler");
    }
    static void m1() {
        m2();
    }
    static void m2(){
        m3();
    }
    static void m3(){
        throw new ArithmeticException("exception occured due to arithmetic invalid input");
    }
}
