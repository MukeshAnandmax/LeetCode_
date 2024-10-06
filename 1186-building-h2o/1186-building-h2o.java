
import java.util.concurrent.Semaphore;

class H2O {

    private Semaphore hSemaphore;
    private Semaphore oSemaphore;

    public H2O() {
        hSemaphore = new Semaphore(2);
        oSemaphore= new Semaphore(0);
        
    }

    public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {

        
            hSemaphore.acquire();
            releaseHydrogen.run();
            oSemaphore.release();

    }

    public void oxygen(Runnable releaseOxygen) throws InterruptedException {
        
        // releaseOxygen.run() outputs "O". Do not change or remove this line.
        oSemaphore.acquire();
		releaseOxygen.run();
        hSemaphore.release();
    }
}