package view;

import controller.ThreadSapo;

public class Main {

	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			Thread threadSapo = new ThreadSapo();
			threadSapo.start();
		}
	}

}
