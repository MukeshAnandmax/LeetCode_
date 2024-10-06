import java.util.concurrent.Semaphore;

class Foo {
    
    private Semaphore firstSemaphore;
    private Semaphore secondSemaphore;
    private Semaphore thirdSemaphore;

    public Foo() {
        firstSemaphore = new Semaphore(1);
        secondSemaphore = new Semaphore(0);
        thirdSemaphore = new Semaphore(0);
    }

    public void first(Runnable printFirst) throws InterruptedException {
        
        // printFirst.run() outputs "first". Do not change or remove this line.
        firstSemaphore.acquire();
        printFirst.run();
        secondSemaphore.release();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        
        // printSecond.run() outputs "second". Do not change or remove this line.
        secondSemaphore.acquire();
        printSecond.run();
        thirdSemaphore.release();
    }

    public void third(Runnable printThird) throws InterruptedException {
        
        // printThird.run() outputs "third". Do not change or remove this line.
        thirdSemaphore.acquire();
        printThird.run();
        firstSemaphore.release();
    }
}