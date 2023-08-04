package gui;

import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JTextField;

public class VentanaPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField txtConvertidor;
	private String rutaImagen = "C:\\Users\\king_\\eclipse-workspace\\convertidor-de-divisas2\\imagenes\\icono-principalConversor1.png";
	private ImageIcon imagenIcono;

	public VentanaPrincipal() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(
				"C:\\Users\\king_\\eclipse-workspace\\convertidor-de-divisas2\\imagenes\\icono-principalConversor1.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 468, 350);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(4, 56, 110, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);

		JLabel lblNewLabel = new JLabel("Selecciona el tipo de conversion: ");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(30, 73, 391, 49);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Yu Gothic Medium", Font.BOLD, 20));
		contentPane.add(lblNewLabel);

		JComboBox<String> comboBox = new JComboBox<>();
		comboBox.setBackground(new Color(255, 255, 255));
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 18));
		comboBox.setBounds(76, 119, 296, 42);
		contentPane.add(comboBox);

		JButton btnSiguiente = new JButton("Siguiente");
		btnSiguiente.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSiguiente.setBounds(158, 191, 150, 49);
		contentPane.add(btnSiguiente);

		imagenIcono = new ImageIcon(rutaImagen);

		txtConvertidor = new JTextField();
		txtConvertidor.setFont(new Font("SansSerif", Font.BOLD, 24));
		txtConvertidor.setBackground(new Color(4, 56, 110, 255));
		txtConvertidor.setText("Convertidor");
		txtConvertidor.setBounds(179, 19, 160, 42);
		contentPane.add(txtConvertidor);
		txtConvertidor.setColumns(10);
		txtConvertidor.setBorder(null);
		txtConvertidor.setEditable(false);

		JLabel lblNewLabel_1 = new JLabel(imagenIcono);
		lblNewLabel_1.setBounds(96, 6, 82, 65);
		contentPane.add(lblNewLabel_1);

		comboBox.addItem("Conversion de Divisas");
		comboBox.addItem("Conversion de Temperatura");
		comboBox.addItem("Conversion de Criptomonedas");

		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String opcionSeleccionada = (String) comboBox.getSelectedItem();

				if (opcionSeleccionada.equals("Conversion de Divisas")) {
					VentanaMonedas ventanamoneda = new VentanaMonedas();
					ventanamoneda.setVisible(true);
				} else if (opcionSeleccionada.equals("Conversion de Temperatura")) {
					VentanaTemperatura ventanatemperatura = new VentanaTemperatura();
					ventanatemperatura.setVisible(true);
				} else if (opcionSeleccionada.equals("Conversion de Criptomonedas")) {
					VentanaCriptomonedas ventanacriptomonedas = new VentanaCriptomonedas();
					ventanacriptomonedas.setVisible(true);
				}
				dispose();
			}
		});
	}

}
