package cursojava.thread;

import javax.swing.JOptionPane;

public class AulaThread {
	public static void main(String[] args) throws InterruptedException {

		new Thread() {
			public void run() {
				for (int pos = 0; pos < 10; pos++) {
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					/* Quero exercultar esse envio com um tempo de parada,ou com tempodeterminado */
					System.out.println("Exercultando alguma rotina" + pos);
				}

			};

		}.start();// liga a thread que fica processando paralelamente por tr´s
		/* Codigo da rotina que eu quero exerculta em paralelo. */
		System.out.println("Chegou ao fim do codigo");
		// fluxo de venda
		JOptionPane.showMessageDialog(null, "Sistema continua para o usuário");
	}

}
