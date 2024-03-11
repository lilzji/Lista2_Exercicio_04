package controller;

public class ThreadSapo extends Thread {

	public ThreadSapo() {
		super();
	}
	
	public void run() {
		int distMax = 50;
		int percorrido = 0;
		int sapo = (int) getId();
		double tempoInicial = System.nanoTime();
		while(distMax > 0) {
			int pulo = (int) (Math.random() * (2 + 0) + 0);
			percorrido = percorrido + pulo;
			distMax = distMax - pulo;
			System.out.println("O sapo " + sapo + " pulou " + pulo + " e percorreu " + percorrido + " metros");
		}
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		tempoTotal = tempoTotal / Math.pow(10, 9);
		System.out.println("O sapo " + sapo + " percorreu a distancia maxima em " + tempoTotal + "segundos");
	}
}
