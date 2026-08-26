package ThreadDay3;

public class DemoOnThreadSynchronization {
    public static void main(String[] args)throws Exception {
        System.out.println("main thread started");
        for(int i=0;i<=10;i++)
        {
            System.out.println("mainThread---count--- "+i);
            try{
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Thread th=new Thread(()->
        {
            for(int i=2;i<=20;i++)
            {
                if(i%2==0)
                    System.out.println("the even numbers are "+i);
                try{
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        );
        th.start();
        th.join();
        System.out.println("main thread task completed");
    }
}
