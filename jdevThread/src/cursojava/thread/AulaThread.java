package cursojava.thread;

public class AulaThread {
	public static void main(String[] args) throws InterruptedException {

		for (int pos = 0; pos < 10; pos++) {
			Thread.sleep(2000);
			/* Quero exercultar esse envio com um tempo de parada,ou com tempodeterminado */
			System.out.println("Exercultando alguma rotina" + pos);
		}
	}

}
