package gui;

import java.awt.EventQueue;
import javax.swing.UIManager;

public class Main {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal ventanaprincipal = new VentanaPrincipal();
					ventanaprincipal.setVisible(true);
					ventanaprincipal.setTitle("Convertidor");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
