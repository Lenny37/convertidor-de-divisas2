package gui;

import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import java.text.DecimalFormat;
import java.util.regex.Pattern;

import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.DocumentFilter;
import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListCellRenderer;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class VentanaCriptomonedas extends JFrame {

	private JPanel contentPane;
	double numeroIngresado;
	private JTextField txtPoweredByLenny;
	private JComboBox<OpcionConIcono> comboBox;
	private JComboBox<OpcionConIcono> comboBox_1;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField valorIngresado;
	private JButton btnHome;
	private JTextField txtMoneda;

	public VentanaCriptomonedas() {
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

		textField_2 = new JTextField();
		textField_2.setBackground(new Color(255, 255, 255));
		textField_2.setBounds(400, 22, 49, 38);
		contentPane.add(textField_2);
		textField_2.setFont(new Font("SansSerif", Font.BOLD, 40));
		textField_2.setText("→");
		textField_2.setColumns(10);
		textField_2.setBorder(null);
		textField_2.setEditable(false);

		textField_1 = new JTextField();
		textField_1.setBackground(new Color(255, 255, 255));
		textField_1.setFont(new Font("SansSerif", Font.BOLD, 40));
		textField_1.setText("←");
		textField_1.setBounds(384, 40, 49, 38);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		textField_1.setBorder(null);
		textField_1.setEditable(false);

		txtMoneda = new JTextField();
		txtMoneda.setForeground(new Color(255, 255, 255));
		txtMoneda.setHorizontalAlignment(SwingConstants.CENTER);
		txtMoneda.setBorder(null);
		txtMoneda.setFont(new Font("SansSerif", Font.BOLD, 20));
		txtMoneda.setText("BTC");
		txtMoneda.setBounds(23, 29, 77, 38);
		contentPane.add(txtMoneda);
		txtMoneda.setColumns(10);
		txtMoneda.setBackground(colorPersonalizado);
		txtMoneda.setEditable(false);

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

		textField = new JTextField("1,641,695.61 DOP");
		textField.setForeground(new Color(255, 255, 255));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("SansSerif", Font.PLAIN, 40));
		textField.setBackground(new Color(4, 56, 110, 255));
		textField.setBounds(22, 223, 412, 84);
		contentPane.add(textField);
		textField.setColumns(10);
		textField.setBorder(null);
		textField.setEditable(false);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(10, 19, 439, 60);
		contentPane.add(panel);
		panel.setLayout(null);

		botonCopiar = new JButton(new ImageIcon(
				"C:\\Users\\king_\\eclipse-workspace\\convertidor-de-divisas2\\imagenes\\icono-copiar2.png"));
		botonCopiar.setBackground(new Color(4, 56, 110, 255));
		botonCopiar.setBounds(193, 302, 67, 44);
		botonCopiar.setContentAreaFilled(false);
		botonCopiar.setBorderPainted(false);
		botonCopiar.setFocusPainted(false);
		contentPane.add(botonCopiar);

		valorIngresado = new JTextField();
		valorIngresado.setBounds(107, 6, 230, 48);
		panel.add(valorIngresado);
		valorIngresado.setFont(new Font("SansSerif", Font.BOLD, 26));
		valorIngresado.setHorizontalAlignment(SwingConstants.CENTER);
		valorIngresado.setColumns(10);
		valorIngresado.setText("1.00");
		valorIngresado.setBorder(null);

		btnHome = new JButton("Home");
		btnHome.setBackground(new Color(255, 255, 255));
		btnHome.setFont(new Font("SansSerif", Font.BOLD, 24));
		btnHome.setBounds(318, 419, 131, 38);
		contentPane.add(btnHome);

		comboBox = new JComboBox<>();
		comboBox.setBackground(new Color(255, 255, 255));
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 20));
		comboBox.setBounds(10, 90, 207, 64);
		contentPane.add(comboBox);

		comboBox_1 = new JComboBox<>();
		comboBox_1.setForeground(new Color(0, 0, 0));
		comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		comboBox_1.setBounds(241, 90, 207, 64);
		contentPane.add(comboBox_1);
		comboBox_1.setBackground(new Color(255, 255, 255));

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

		String rutaImagenOriginal = "C:\\Users\\king_\\eclipse-workspace\\convertidor-de-divisas2\\imagenes\\icono-bitcoin.png";
		ImageIcon iconoOriginal = new ImageIcon(rutaImagenOriginal);
		Image imagenOriginal = iconoOriginal.getImage();
		int nuevaAnchura = 45;
		int nuevaAltura = 45;
		Image nuevaImagen = imagenOriginal.getScaledInstance(nuevaAnchura, nuevaAltura, Image.SCALE_SMOOTH);
		ImageIcon icono1 = new ImageIcon(nuevaImagen);

		String rutaImagenOriginal2 = "C:\\Users\\king_\\eclipse-workspace\\convertidor-de-divisas2\\imagenes\\icono-ethereum.png";
		ImageIcon iconoOriginal2 = new ImageIcon(rutaImagenOriginal2);
		Image imagenOriginal2 = iconoOriginal2.getImage();
		Image nuevaImagen2 = imagenOriginal2.getScaledInstance(nuevaAltura, nuevaAnchura, Image.SCALE_SMOOTH);
		ImageIcon icono2 = new ImageIcon(nuevaImagen2);

		String rutaImagenOriginal3 = "C:\\Users\\king_\\eclipse-workspace\\convertidor-de-divisas2\\imagenes\\icono-tether.png";
		ImageIcon iconoOriginal3 = new ImageIcon(rutaImagenOriginal3);
		Image imagenOriginal3 = iconoOriginal3.getImage();
		Image nuevaImagen3 = imagenOriginal3.getScaledInstance(nuevaAltura, nuevaAnchura, Image.SCALE_SMOOTH);
		ImageIcon icono3 = new ImageIcon(nuevaImagen3);

		String rutaImagenOriginal4 = "C:\\Users\\king_\\eclipse-workspace\\convertidor-de-divisas2\\imagenes\\icono-xrp.png";
		ImageIcon iconoOriginal4 = new ImageIcon(rutaImagenOriginal4);
		Image imagenOriginal4 = iconoOriginal4.getImage();
		Image nuevaImagen4 = imagenOriginal4.getScaledInstance(nuevaAltura, nuevaAnchura, Image.SCALE_SMOOTH);
		ImageIcon icono4 = new ImageIcon(nuevaImagen4);

		String rutaImagenOriginal5 = "C:\\Users\\king_\\eclipse-workspace\\convertidor-de-divisas2\\imagenes\\icono-bnb.png";
		ImageIcon iconoOriginal5 = new ImageIcon(rutaImagenOriginal5);
		Image imagenOriginal5 = iconoOriginal5.getImage();
		Image nuevaImagen5 = imagenOriginal5.getScaledInstance(nuevaAltura, nuevaAnchura, Image.SCALE_SMOOTH);
		ImageIcon icono5 = new ImageIcon(nuevaImagen5);

		OpcionConIcono opcion1 = new OpcionConIcono("Bitcoin (BTC)", icono1);
		OpcionConIcono opcion2 = new OpcionConIcono("Ethereum (ETH)", icono2);
		OpcionConIcono opcion3 = new OpcionConIcono("Tether (USDT)", icono3);
		OpcionConIcono opcion4 = new OpcionConIcono("XRP", icono4);
		OpcionConIcono opcion5 = new OpcionConIcono("BNB", icono5);

		String rutaImagenOriginal6 = "C:\\Users\\king_\\eclipse-workspace\\convertidor-de-divisas2\\Bandera-dominicana.png";
		ImageIcon iconoOriginal6 = new ImageIcon(rutaImagenOriginal6);
		Image imagenOriginal6 = iconoOriginal6.getImage();
		int nuevaAnchura2 = 45;
		int nuevaAltura2 = 30;
		Image nuevaImagen6 = imagenOriginal6.getScaledInstance(nuevaAnchura2, nuevaAltura2, Image.SCALE_SMOOTH);
		ImageIcon icono6 = new ImageIcon(nuevaImagen6);

		String rutaImagenOriginal7 = "C:\\Users\\king_\\eclipse-workspace\\convertidor-de-divisas2\\Bandera-estadosUnidos.jpg";
		ImageIcon iconoOriginal7 = new ImageIcon(rutaImagenOriginal7);
		Image imagenOriginal7 = iconoOriginal7.getImage();
		Image nuevaImagen7 = imagenOriginal7.getScaledInstance(nuevaAnchura2, nuevaAltura2, Image.SCALE_SMOOTH);
		ImageIcon icono7 = new ImageIcon(nuevaImagen7);

		String rutaImagenOriginal8 = "C:\\Users\\king_\\eclipse-workspace\\convertidor-de-divisas2\\Bandera-Europea.png";
		ImageIcon iconoOriginal8 = new ImageIcon(rutaImagenOriginal8);
		Image imagenOriginal8 = iconoOriginal8.getImage();
		Image nuevaImagen8 = imagenOriginal8.getScaledInstance(nuevaAnchura2, nuevaAltura2, Image.SCALE_SMOOTH);
		ImageIcon icono8 = new ImageIcon(nuevaImagen8);

		String rutaImagenOriginal9 = "C:\\Users\\king_\\eclipse-workspace\\convertidor-de-divisas2\\imagenes\\Bandera-Britanica.png";
		ImageIcon iconoOriginal9 = new ImageIcon(rutaImagenOriginal9);
		Image imagenOriginal9 = iconoOriginal9.getImage();
		Image nuevaImagen9 = imagenOriginal9.getScaledInstance(nuevaAnchura2, nuevaAltura2, Image.SCALE_SMOOTH);
		ImageIcon icono9 = new ImageIcon(nuevaImagen9);

		String rutaImagenOriginal10 = "C:\\Users\\king_\\eclipse-workspace\\convertidor-de-divisas2\\imagenes\\Bandera-Japon.png";
		ImageIcon iconoOriginal10 = new ImageIcon(rutaImagenOriginal10);
		Image imagenOriginal10 = iconoOriginal10.getImage();
		Image nuevaImagen10 = imagenOriginal10.getScaledInstance(nuevaAnchura2, nuevaAltura2, Image.SCALE_SMOOTH);
		ImageIcon icono10 = new ImageIcon(nuevaImagen10);

		String rutaImagenOriginal11 = "C:\\Users\\king_\\eclipse-workspace\\convertidor-de-divisas2\\imagenes\\Bandera-CoreadelSur.jpg";
		ImageIcon iconoOriginal11 = new ImageIcon(rutaImagenOriginal11);
		Image imagenOriginal11 = iconoOriginal11.getImage();
		Image nuevaImagen11 = imagenOriginal11.getScaledInstance(nuevaAnchura2, nuevaAltura2, Image.SCALE_SMOOTH);
		ImageIcon icono11 = new ImageIcon(nuevaImagen11);

		OpcionConIcono opcion6 = new OpcionConIcono("DOP", icono6);
		OpcionConIcono opcion7 = new OpcionConIcono("USD", icono7);
		OpcionConIcono opcion8 = new OpcionConIcono("EUR", icono8);
		OpcionConIcono opcion9 = new OpcionConIcono("GBP", icono9);
		OpcionConIcono opcion10 = new OpcionConIcono("JPY", icono10);
		OpcionConIcono opcion11 = new OpcionConIcono("KRW", icono11);

		OpcionConIcono[] opciones = { opcion1, opcion2, opcion3, opcion4, opcion5 };
		OpcionConIcono[] opciones2 = { opcion6, opcion7, opcion8, opcion9, opcion10, opcion11 };

		comboBox.setModel(new DefaultComboBoxModel<>(opciones));

		comboBox.setRenderer(new DefaultListCellRenderer() {
			@Override
			public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected,
					boolean cellHasFocus) {
				OpcionConIcono opcion = (OpcionConIcono) value;
				JLabel label = new JLabel(opcion.getText(), opcion.getIcon(), JLabel.LEFT);
				label.setOpaque(true);
				label.setFont(new Font("Tahoma", Font.BOLD, 20));

				if (isSelected) {
					label.setBackground(list.getSelectionBackground());
					label.setForeground(list.getSelectionForeground());
				} else {
					label.setBackground(list.getBackground());
					label.setForeground(list.getForeground());
				}
				return label;
			}
		});

		comboBox_1.setModel(new DefaultComboBoxModel<>(opciones2));
		comboBox_1.setRenderer(new DefaultListCellRenderer() {
			@Override
			public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected,
					boolean cellHasFocus) {
				OpcionConIcono opcion = (OpcionConIcono) value;
				JLabel label = new JLabel(opcion.getText(), opcion.getIcon(), JLabel.LEFT);
				label.setOpaque(true);
				label.setFont(new Font("Tahoma", Font.BOLD, 20)); // Cambia 16 por el tamaño deseado

				if (isSelected) {
					label.setBackground(list.getSelectionBackground());
					label.setForeground(list.getSelectionForeground());
				} else {
					label.setBackground(list.getBackground());
					label.setForeground(list.getForeground());
				}
				return label;
			}
		});

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

		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();

				VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
				ventanaPrincipal.setVisible(true);
			}
		});

		botonCopiar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String resultado = textField.getText();

				Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
				StringSelection selection = new StringSelection(resultado);
				clipboard.setContents(selection, null);

			}
		});
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actualizarTipoCripto();
			}
		});

		botonCopiar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String resultado = textField.getText();

				Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
				StringSelection selection = new StringSelection(resultado);
				clipboard.setContents(selection, null);

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

	public void actualizarTipoCripto() {
		String opcionSeleccionada = ((OpcionConIcono) comboBox.getSelectedItem()).getText();
		String valorSeleccionado = "";

		switch (opcionSeleccionada) {
		case "Bitcoin (BTC)":
			valorSeleccionado = "BTC";
			break;
		case "Ethereum (ETH)":
			valorSeleccionado = "ETH";
			break;
		case "Tether (USDT)":
			valorSeleccionado = "USDT";
			break;
		case "XRP":
			valorSeleccionado = "XRP";
			break;
		case "BNB":
			valorSeleccionado = "BNB";
			break;
		default:
			valorSeleccionado = "";
			break;
		}
		txtMoneda.setText(valorSeleccionado);
	}

	public void actualizarResultado() {
		String textoIngresado = valorIngresado.getText();
		if (isNumeric(textoIngresado)) {
			numeroIngresado = Double.parseDouble(textoIngresado);

			String criptomoneda = ((OpcionConIcono) comboBox.getSelectedItem()).getText();
			String moneda = ((OpcionConIcono) comboBox_1.getSelectedItem()).getText();
			double resultado = 0;

			switch (criptomoneda) {
			case "Bitcoin (BTC)":
				switch (moneda) {
				case "DOP":
					resultado = numeroIngresado * 1641695.61;
					break;
				case "USD":
					resultado = numeroIngresado * 29361.30;
					break;
				case "EUR":
					resultado = numeroIngresado * 26616.02;
					break;
				case "GBP":
					resultado = numeroIngresado * 22856.37;
					break;
				case "JPY":
					resultado = numeroIngresado * 4144200.69;
					break;
				case "KRW":
					resultado = numeroIngresado * 37388092.19;
					break;
				default:
					resultado = 0;
					break;
				}
				break;
			case "Ethereum (ETH)":

				switch (moneda) {
				case "DOP":
					resultado = numeroIngresado * 105114.45;
					break;
				case "USD":
					resultado = numeroIngresado * 1880.17;
					break;
				case "EUR":
					resultado = numeroIngresado * 1703.95;
					break;
				case "GBP":
					resultado = numeroIngresado * 1463.26;
					break;
				case "JPY":
					resultado = numeroIngresado * 265310.26;
					break;
				case "KRW":
					resultado = numeroIngresado * 2393572.39;
					break;
				default:
					resultado = 0;
					break;
				}
				break;
			case "Tether (USDT)":

				switch (moneda) {
				case "DOP":
					resultado = numeroIngresado * 55.91;
					break;
				case "USD":
					resultado = numeroIngresado * 1;
					break;
				case "EUR":
					resultado = numeroIngresado * 0.91;
					break;
				case "GBP":
					resultado = numeroIngresado * 0.78;
					break;
				case "JPY":
					resultado = numeroIngresado * 141.16;
					break;
				case "KRW":
					resultado = numeroIngresado * 1273.49;
					break;
				default:
					resultado = 0;
					break;
				}
				break;
			case "XRP":

				switch (moneda) {
				case "DOP":
					resultado = numeroIngresado * 39.88;
					break;
				case "USD":
					resultado = numeroIngresado * 0.71;
					break;
				case "EUR":
					resultado = numeroIngresado * 0.65;
					break;
				case "GBP":
					resultado = numeroIngresado * 0.56;
					break;
				case "JPY":
					resultado = numeroIngresado * 100.69;
					break;
				case "KRW":
					resultado = numeroIngresado * 908.37;
					break;
				default:
					resultado = 0;
					break;
				}
				break;
			case "BNB":

				switch (moneda) {
				case "DOP":
					resultado = numeroIngresado * 13561.34;
					break;
				case "USD":
					resultado = numeroIngresado * 242.56;
					break;
				case "EUR":
					resultado = numeroIngresado * 219.88;
					break;
				case "GBP":
					resultado = numeroIngresado * 188.83;
					break;
				case "JPY":
					resultado = numeroIngresado * 34239.90;
					break;
				case "KRW":
					resultado = numeroIngresado * 308887.15;
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
			DecimalFormat decimalFormat = new DecimalFormat("#,###.00");
			String resultadoFormateado = decimalFormat.format(resultado);
			textField.setText(String.valueOf(resultadoFormateado + " " + moneda));
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
