package model;
import view.*;


public class KorrelationsMain {
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MyFrame("Korrelationsrechner");
            }
        });
	}
}
