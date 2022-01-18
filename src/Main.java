public class Main {
    public static void main(String[] args) {
//        MyFirstTread myFirstTread = new MyFirstTread();
//        myFirstTread.start();
//
//        MySecondTread mySecondTread = new MySecondTread();
//        Thread thread = new Thread(mySecondTread);
//        thread.start();
//        System.out.println("End code");
        A a = new A();
        Manager manager = new Manager();
        MySetThread mySetThread = new MySetThread(manager, a, 1);
        MySetThread mySetThread1 = new MySetThread(manager, a, 2);
        Thread thread = new Thread(mySetThread);
        Thread thread1 = new Thread(mySetThread1);
        thread.start();
        thread1.start();
    }
}
