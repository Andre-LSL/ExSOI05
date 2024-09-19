package view;
import controller.ThreadCarros;
import java.util.concurrent.Semaphore;
public class ClasseMain {

	public static void main(String[] args) {
		Semaphore semaforo = new Semaphore(1);
		for(int i=0; i < 4; i++) {
			ThreadCarros th = new ThreadCarros(i, semaforo);
			th.start();
		}
	}
}