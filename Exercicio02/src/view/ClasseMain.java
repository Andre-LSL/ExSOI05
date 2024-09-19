
package view;
import controller.CorredorThread;
import java.util.concurrent.Semaphore;


public class ClasseMain {

	public static void main(String[] args) {
		Semaphore semaforo = new Semaphore(1);
		for(int i = 1; i <= 4; i++) {
			CorredorThread th = new CorredorThread(i, semaforo);
			th.start();
		}
	}

}
