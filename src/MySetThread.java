public class MySetThread implements Runnable{
    private Manager manager;
    private A a;
    private int sameValue;

    public MySetThread(Manager manager, A a, int sameValue) {
        this.manager = manager;
        this.a = a;
        this.sameValue = sameValue;
    }

    @Override
    public void run() {
        manager.updateAndPrintInfo(a.getArray(), sameValue);
    }
}
