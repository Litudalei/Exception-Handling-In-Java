package day2;

public class ThreadDay2 {
    public static void main(String[] args) {
        Thread t1=new Thread();
        Thread t2=new Thread();
        Thread t3=new Thread();
        t3.setName("Kalinga");
        System.out.println("T1 thead details"+t1.getId());
        System.out.println("t1 name"+t1.getName());
        System.out.println("T2 thread details"+t2.getId());
        System.out.println("name of the thread2"+t2.getName());
        System.out.println("t3 Thread details"+t3.getName()+"------"+t3.getId());
    }
}
