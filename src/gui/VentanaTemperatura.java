package gui;

import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import javax.swing.text.DocumentFilter.FilterBypass;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.regex.Pattern;

public class VentanaTemperatura extends JFrame {

	private JPanel contentPane;
	double numeroIngresado;
	private JTextField txtPoweredByLenny;
	private JComboBox comboBox;
	private JComboBox comboBox_1;
	private JTextField valorResultado;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField valorIngresado;
	private JLabel lblSimboloTemp;

	public VentanaTemperatura() {
		setBackground(new Color(4, 56, 110, 255));
		setIconImage(Toolkit.getDefaultToolkit().getImage(
				"C:\\Users\\king_\\eclipse-workspace\\convertidor-de-divisas2\\imagenes\\icono-principalConversor1.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 468, 499);
		contentPane = new JPanel();
		setResizable(false);
		setMaximumSize(getPreferredSize());
		setLocationRelativeTo(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setTitle("Convertidor");

		Color colorPersonalizado = new Color(4, 56, 110, 255);
		getContentPane().setBackground(colorPersonalizado);

		lblSimboloTemp = new JLabel("°C");
		lblSimboloTemp.setForeground(new Color(0, 0, 0));
		lblSimboloTemp.setHorizontalAlignment(SwingConstants.CENTER);
		lblSimboloTemp.setBorder(null);
		lblSimboloTemp.setFont(new Font("SansSerif", Font.BOLD, 20));
		lblSimboloTemp.setBounds(23, 29, 77, 38);
		contentPane.add(lblSimboloTemp);
		lblSimboloTemp.setBackground(new Color(0, 0, 0));

		textField_2 = new JTextField();
		textField_2.setBounds(400, 22, 49, 38);
		contentPane.add(textField_2);
		textField_2.setFont(new Font("SansSerif", Font.BOLD, 40));
		textField_2.setText("→");
		textField_2.setColumns(10);
		textField_2.setBorder(null);
		textField_2.setEditable(false);

		textField_1 = new JTextField();
		textField_1.setFont(new Font("SansSerif", Font.BOLD, 40));
		textField_1.setText("←");
		textField_1.setBounds(384, 40, 49, 38);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		textField_1.setBorder(null);
		textField_1.setEditable(false);

		String[] opciones = { "Celsius(°C)", "Fahrenheit(°F)", "Kelvin(K)" };
		comboBox = new JComboBox<>(opciones);
		comboBox.setBackground(new Color(255, 255, 255));
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 20));
		comboBox.setBounds(6, 90, 207, 64);
		contentPane.add(comboBox);

		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String textoSeleccionado = comboBox.getSelectedItem().toString();

				switch (textoSeleccionado) {
				case "Celsius(°C)":
					lblSimboloTemp.setText("°C");
					break;
				case "Fahrenheit(°F)":
					lblSimboloTemp.setText("°F");
					break;
				case "Kelvin(K)":
					lblSimboloTemp.setText("K");
					break;
				default:
					lblSimboloTemp.setText("");
					break;
				}
			}
		});

		String[] opciones2 = { "Fahrenheit(°F)", "Kelvin(K)", "Celsius(°C)" };
		comboBox_1 = new JComboBox<>(opciones2);
		comboBox_1.setForeground(new Color(255, 255, 255));
		comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		comboBox_1.setBounds(241, 90, 207, 64);
		contentPane.add(comboBox_1);
		comboBox_1.setBackground(new Color(255, 255, 255));

		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actualizarResultado();
			}
		});

		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actualizarResultado();

			}
		});

		txtPoweredByLenny = new JTextField();
		txtPoweredByLenny.setForeground(new Color(255, 255, 255));
		txtPoweredByLenny.setBackground(new Color(4, 56, 110, 255));
		txtPoweredByLenny.setFont(new Font("SansSerif", Font.PLAIN, 14));
		txtPoweredByLenny.setText("Powered by: Lenny Sanchez");
		txtPoweredByLenny.setBounds(6, 428, 184, 28);
		contentPane.add(txtPoweredByLenny);
		txtPoweredByLenny.setColumns(10);
		txtPoweredByLenny.setBorder(null);
		txtPoweredByLenny.setEditable(false);

		JButton botonCopiar = new JButton(new ImageIcon(
				"C:\\Users\\king_\\eclipse-workspace\\convertidor-de-divisas2\\imagenes\\icono-copiar2.png"));
		botonCopiar.setBackground(new Color(4, 56, 110, 255));
		botonCopiar.setBounds(194, 292, 67, 44);
		botonCopiar.setContentAreaFilled(false);
		botonCopiar.setBorderPainted(false);
		botonCopiar.setFocusPainted(false);

		botonCopiar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String resultado = valorResultado.getText();

				Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
				StringSelection selection = new StringSelection(resultado);
				clipboard.setContents(selection, null);

			}
		});
		contentPane.add(botonCopiar);

		ImageIcon iconoEnlace = new ImageIcon(
				"C:\\Users\\king_\\eclipse-workspace\\convertidor-de-divisas2\\Icono-Linkedin2.png");

		int iconoEnlaceAnchura = 30;
		int iconoEnlaceAltura = 30;
		Image iconoEnlaceImagen = iconoEnlace.getImage().getScaledInstance(iconoEnlaceAnchura, iconoEnlaceAltura,
				Image.SCALE_SMOOTH);
		ImageIcon iconoEnlaceAjustado = new ImageIcon(iconoEnlaceImagen);
		JLabel iconoEnlaceLabel = new JLabel(iconoEnlaceAjustado);
		iconoEnlaceLabel.setBounds(202, 426, iconoEnlaceAnchura, iconoEnlaceAltura);
		contentPane.add(iconoEnlaceLabel);

		valorResultado = new JTextField("89.6 °F");
		valorResultado.setForeground(new Color(255, 255, 255));
		valorResultado.setHorizontalAlignment(SwingConstants.CENTER);
		valorResultado.setFont(new Font("SansSerif", Font.PLAIN, 40));
		valorResultado.setBackground(new Color(4, 56, 110, 255));
		valorResultado.setBounds(22, 223, 412, 84);
		contentPane.add(valorResultado);
		valorResultado.setColumns(10);
		valorResultado.setBorder(null);
		valorResultado.setEditable(false);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(10, 19, 439, 60);
		contentPane.add(panel);
		panel.setLayout(null);

		valorIngresado = new JTextField();
		valorIngresado.setBounds(107, 6, 230, 48);
		panel.add(valorIngresado);
		valorIngresado.setFont(new Font("SansSerif", Font.BOLD, 26));
		valorIngresado.setHorizontalAlignment(SwingConstants.CENTER);
		valorIngresado.setColumns(10);
		valorIngresado.setText("32.00");
		valorIngresado.setBorder(null);

		JButton btnHome = new JButton("Home");
		btnHome.setBackground(new Color(255, 255, 255));
		btnHome.setFont(new Font("SansSerif", Font.BOLD, 24));
		btnHome.setBounds(318, 419, 131, 38);
		contentPane.add(btnHome);

		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();

				VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
				ventanaPrincipal.setVisible(true);
			}
		});

		valorIngresado.getDocument().addDocumentListener(new DocumentListener() {
			@Override
			public void insertUpdate(DocumentEvent e) {
				actualizarResultado();

			}

			@Override
			public void removeUpdate(DocumentEvent e) {
				actualizarResultado();

			}

			@Override
			public void changedUpdate(DocumentEvent e) {
				actualizarResultado();

			}
		});

		valorIngresado.getDocument().addDocumentListener(new DocumentListener() {
			@Override
			public void insertUpdate(DocumentEvent e) {
				actualizarResultado();
			}

			@Override
			public void removeUpdate(DocumentEvent e) {
				actualizarResultado();
			}

			@Override
			public void changedUpdate(DocumentEvent e) {
				actualizarResultado();
			}
		});

		iconoEnlaceLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				abrirPaginaWeb("https://www.linkedin.com/in/lennysanchezmar/");
			}
		});
		
		((AbstractDocument) valorIngresado.getDocument()).setDocumentFilter(new DocumentFilter() {
			private final Pattern regex = Pattern.compile("\\d*\\.?\\d{0,2}");

			@Override
			public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr)
					throws BadLocationException {
				StringBuilder sb = new StringBuilder(fb.getDocument().getText(0, fb.getDocument().getLength()));
				sb.insert(offset, string);

				if (isValidDecimal(sb.toString())) {
					super.insertString(fb, offset, string, attr);
				}
			}

			@Override
			public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs)
					throws BadLocationException {
				StringBuilder sb = new StringBuilder(fb.getDocument().getText(0, fb.getDocument().getLength()));
				sb.replace(offset, offset + length, text);

				if (isValidDecimal(sb.toString())) {
					super.replace(fb, offset, length, text, attrs);
				}
			}

			private boolean isValidDecimal(String text) {
				return regex.matcher(text).matches();
			}
		});
	}

	public void actualizarResultado() {
		String textoIngresado = valorIngresado.getText();
		if (isNumeric(textoIngresado)) {
			numeroIngresado = Double.parseDouble(textoIngresado);

			String monedaOrigen = comboBox.getSelectedItem().toString();
			String monedaDestino = comboBox_1.getSelectedItem().toString();
			double resultado = 0;
			String simboloT = "";

			switch (monedaOrigen) {
			case "Celsius(°C)":
				switch (monedaDestino) {
				case "Fahrenheit(°F)":
					resultado = (numeroIngresado * 9 / 5) + 32;
					simboloT = "°F";
					break;
				case "Kelvin(K)":
					resultado = numeroIngresado + 273.15;
					simboloT = "K";
					break;
				case "GBP":
					resultado = numeroIngresado / 73;
					break;
				default:
					resultado = 0;
					break;
				}
				break;
			case "Fahrenheit(°F)":

				switch (monedaDestino) {
				case "Kelvin(K)":
					resultado = (numeroIngresado - 32) * 5 / 9 + 273.15;
					simboloT = "K";
					break;
				case "Celsius(°C)":
					resultado = (numeroIngresado - 32) * 5 / 9;
					simboloT = "°C";
					break;
				case "GBP":
					resultado = numeroIngresado * 0.78;
					break;
				default:
					resultado = 0;
					break;
				}
				break;
			case "Kelvin(K)":

				switch (monedaDestino) {
				case "Fahrenheit(°F)":
					resultado = 1.8 * (numeroIngresado - 273.15) + 32;
					simboloT = "°F";
					break;
				case "Celsius(°C)":
					resultado = numeroIngresado - 273.15;
					simboloT = "°C";
					break;
				case "GBP":
					resultado = numeroIngresado * 0.86;
					break;
				default:
					resultado = 0;
					break;
				}
				break;
			default:
				resultado = 0;
				break;
			}

			String resultadoFormateado = String.format("%.2f", resultado);
			valorResultado.setText(String.valueOf(resultadoFormateado + " " + simboloT));
		}
	}

	private void abrirPaginaWeb(String url) {
		try {
			URI uri = new URI(url);
			Desktop.getDesktop().browse(uri);
		} catch (IOException | URISyntaxException ex) {
			ex.printStackTrace();
		}
	}

	private boolean isNumeric(String str) {
		return str.matches("-?\\d+(\\.\\d+)?");
	}
}
