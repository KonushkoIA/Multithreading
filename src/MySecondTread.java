public class MySecondTread implements Runnable{
//    private Thread thread;
//    public MySecondTread() {
//        thread = new Thread() ;
//    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(i);
        }
    }
}
