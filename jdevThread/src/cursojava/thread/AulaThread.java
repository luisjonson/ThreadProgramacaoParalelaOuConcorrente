package cursojava.thread;

import javax.swing.JOptionPane;

public class AulaThread {
	public static void main(String[] args) throws InterruptedException {
		
		Thread threadEmail = new Thread(thread1);
		threadEmail.start();
		Thread threadNotaFiscal = new Thread(thread2);
		threadNotaFiscal.start();
		System.out.println("Chegou ao fim do codigo");
//		// fluxo de venda
		JOptionPane.showMessageDialog(null, "Sistema continua para o usuário");
	}

	private static Runnable thread1 = new Runnable() {
		
		@Override
		public void run() {
			for (int pos = 0; pos < 10; pos++) {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				/* Quero exercultar esse envio com um tempo de parada,ou com tempodeterminado */
				System.out.println("Exercultando alguma rotina envio de email" + pos);
			}
		}
	};
	
	private static Runnable thread2 = new Runnable() {

		@Override
		public void run() {
			
			for (int pos = 0; pos < 10; pos++) {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				/* Quero exercultar esse envio com um tempo de parada,ou com tempodeterminado */
				System.out.println("Exercultando alguma rotina envio de nota fiscall" + pos);
			}
		}
	};
}
