package gui;

import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JList;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Component;
import java.awt.Toolkit;
import javax.swing.SwingConstants;
import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListCellRenderer;
import java.awt.Image;
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
import java.text.DecimalFormat;
import java.util.regex.Pattern;
import java.io.IOException;

public class VentanaMonedas extends JFrame {

	private JPanel contentPane;
	double numeroIngresado;
	private JTextField txtPoweredByLenny;
	private JComboBox<OpcionConIcono> comboBox;
	private JComboBox<OpcionConIcono> comboBox_1;
	private JTextField valorResultado;
	private JTextField flecha2;
	private JTextField flecha1;
	private JTextField valorIngresado;
	private JButton btnHome;

	public VentanaMonedas() {

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

		flecha1 = new JTextField();
		flecha1.setBounds(400, 22, 49, 38);
		contentPane.add(flecha1);
		flecha1.setFont(new Font("SansSerif", Font.BOLD, 40));
		flecha1.setText("→");
		flecha1.setColumns(10);
		flecha1.setBorder(null);
		flecha1.setEditable(false);

		flecha2 = new JTextField();
		flecha2.setFont(new Font("SansSerif", Font.BOLD, 40));
		flecha2.setText("←");
		flecha2.setBounds(384, 40, 49, 38);
		contentPane.add(flecha2);
		flecha2.setColumns(10);
		flecha2.setBorder(null);
		flecha2.setEditable(false);

		JTextField tipoDeMoneda = new JTextField();
		tipoDeMoneda.setForeground(new Color(255, 255, 255));
		tipoDeMoneda.setHorizontalAlignment(SwingConstants.CENTER);
		tipoDeMoneda.setBorder(null);
		tipoDeMoneda.setFont(new Font("SansSerif", Font.BOLD, 20));
		tipoDeMoneda.setText("USD");
		tipoDeMoneda.setBounds(23, 29, 77, 38);
		contentPane.add(tipoDeMoneda);
		tipoDeMoneda.setColumns(10);
		tipoDeMoneda.setBackground(colorPersonalizado);
		tipoDeMoneda.setEditable(false);

		comboBox = new JComboBox<>();
		comboBox.setBackground(new Color(255, 255, 255));
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 20));
		comboBox.setBounds(6, 90, 207, 64);
		contentPane.add(comboBox);

		String rutaImagenOriginal = "C:\\Users\\king_\\eclipse-workspace\\convertidor-de-divisas2\\Bandera-dominicana.png";
		ImageIcon iconoOriginal = new ImageIcon(rutaImagenOriginal);
		Image imagenOriginal = iconoOriginal.getImage();
		int nuevaAnchura = 45;
		int nuevaAltura = 30;
		Image nuevaImagen = imagenOriginal.getScaledInstance(nuevaAnchura, nuevaAltura, Image.SCALE_SMOOTH);
		ImageIcon icono1 = new ImageIcon(nuevaImagen);

		String rutaImagenOriginal2 = "C:\\Users\\king_\\eclipse-workspace\\convertidor-de-divisas2\\Bandera-estadosUnidos.jpg";
		ImageIcon iconoOriginal2 = new ImageIcon(rutaImagenOriginal2);
		Image imagenOriginal2 = iconoOriginal2.getImage();
		Image nuevaImagen2 = imagenOriginal2.getScaledInstance(nuevaAnchura, nuevaAltura, Image.SCALE_SMOOTH);
		ImageIcon icono2 = new ImageIcon(nuevaImagen2);

		String rutaImagenOriginal3 = "C:\\Users\\king_\\eclipse-workspace\\convertidor-de-divisas2\\Bandera-Europea.png";
		ImageIcon iconoOriginal3 = new ImageIcon(rutaImagenOriginal3);
		Image imagenOriginal3 = iconoOriginal3.getImage();
		Image nuevaImagen3 = imagenOriginal3.getScaledInstance(nuevaAnchura, nuevaAltura, Image.SCALE_SMOOTH);
		ImageIcon icono3 = new ImageIcon(nuevaImagen3);

		String rutaImagenOriginal4 = "C:\\Users\\king_\\eclipse-workspace\\convertidor-de-divisas2\\imagenes\\Bandera-Britanica.png";
		ImageIcon iconoOriginal4 = new ImageIcon(rutaImagenOriginal4);
		Image imagenOriginal4 = iconoOriginal4.getImage();
		Image nuevaImagen4 = imagenOriginal4.getScaledInstance(nuevaAnchura, nuevaAltura, Image.SCALE_SMOOTH);
		ImageIcon icono4 = new ImageIcon(nuevaImagen4);

		String rutaImagenOriginal5 = "C:\\Users\\king_\\eclipse-workspace\\convertidor-de-divisas2\\imagenes\\Bandera-Japon.png";
		ImageIcon iconoOriginal5 = new ImageIcon(rutaImagenOriginal5);
		Image imagenOriginal5 = iconoOriginal5.getImage();
		Image nuevaImagen5 = imagenOriginal5.getScaledInstance(nuevaAnchura, nuevaAltura, Image.SCALE_SMOOTH);
		ImageIcon icono5 = new ImageIcon(nuevaImagen5);

		String rutaImagenOriginal6 = "C:\\Users\\king_\\eclipse-workspace\\convertidor-de-divisas2\\imagenes\\Bandera-CoreadelSur.jpg";
		ImageIcon iconoOriginal6 = new ImageIcon(rutaImagenOriginal6);
		Image imagenOriginal6 = iconoOriginal6.getImage();
		Image nuevaImagen6 = imagenOriginal6.getScaledInstance(nuevaAnchura, nuevaAltura, Image.SCALE_SMOOTH);
		ImageIcon icono6 = new ImageIcon(nuevaImagen6);

		OpcionConIcono opcion1 = new OpcionConIcono("DOP", icono1);
		OpcionConIcono opcion2 = new OpcionConIcono("USD", icono2);
		OpcionConIcono opcion3 = new OpcionConIcono("EUR", icono3);
		OpcionConIcono opcion4 = new OpcionConIcono("GBP", icono4);
		OpcionConIcono opcion5 = new OpcionConIcono("JPY", icono5);
		OpcionConIcono opcion6 = new OpcionConIcono("KRW", icono6);

		OpcionConIcono[] opciones = { opcion2, opcion3, opcion4, opcion5, opcion6, opcion1 };
		OpcionConIcono[] opciones2 = { opcion1, opcion2, opcion3, opcion4, opcion5, opcion6 };
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
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OpcionConIcono opcionSeleccionada = (OpcionConIcono) comboBox.getSelectedItem();
				tipoDeMoneda.setText(opcionSeleccionada.getText());
			}
		});

		comboBox_1 = new JComboBox<>();
		comboBox_1.setForeground(new Color(255, 255, 255));
		comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		comboBox_1.setBounds(241, 90, 207, 64);
		contentPane.add(comboBox_1);
		comboBox_1.setBackground(new Color(255, 255, 255));

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
		contentPane.add(botonCopiar);

		botonCopiar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String resultado = valorResultado.getText();

				Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
				StringSelection selection = new StringSelection(resultado);
				clipboard.setContents(selection, null);

			}
		});

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

		valorResultado = new JTextField("57.00 DOP");
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
		valorIngresado.setText("1.00");
		valorIngresado.setBorder(null);

		btnHome = new JButton("Home");
		btnHome.setBackground(new Color(255, 255, 255));
		btnHome.setFont(new Font("SansSerif", Font.BOLD, 24));
		btnHome.setBounds(318, 419, 131, 38);
		contentPane.add(btnHome);

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

			String monedaOrigen = ((OpcionConIcono) comboBox.getSelectedItem()).getText();
			String monedaDestino = ((OpcionConIcono) comboBox_1.getSelectedItem()).getText();
			double resultado = 0;

			switch (monedaOrigen) {
			case "DOP":
				switch (monedaDestino) {
				case "USD":
					resultado = numeroIngresado / 57;
					break;
				case "EUR":
					resultado = numeroIngresado / 65;
					break;
				case "GBP":
					resultado = numeroIngresado / 73;
					break;
				case "JPY":
					resultado = numeroIngresado / 20;
					break;
				case "KRW":
					resultado = numeroIngresado / 0.044;
					break;
				default:
					resultado = 0;
					break;
				}
				break;
			case "USD":

				switch (monedaDestino) {
				case "DOP":
					resultado = numeroIngresado * 57;
					break;
				case "EUR":
					resultado = numeroIngresado * 0.91;
					break;
				case "GBP":
					resultado = numeroIngresado * 0.78;
					break;
				case "JPY":
					resultado = numeroIngresado * 139.50;
					break;
				case "KRW":
					resultado = numeroIngresado * 1279.88;
					break;
				default:
					resultado = 0;
					break;
				}
				break;
			case "EUR":

				switch (monedaDestino) {
				case "DOP":
					resultado = numeroIngresado * 61.75;
					break;
				case "USD":
					resultado = numeroIngresado * 1.10;
					break;
				case "GBP":
					resultado = numeroIngresado * 0.86;
					break;
				case "JPY":
					resultado = numeroIngresado * 153.32;
					break;
				case "KRW":
					resultado = numeroIngresado * 1407.84;
					break;
				default:
					resultado = 0;
					break;
				}
				break;
			case "GBP":

				switch (monedaDestino) {
				case "DOP":
					resultado = numeroIngresado * 72.08;
					break;
				case "USD":
					resultado = numeroIngresado * 1.28;
					break;
				case "EUR":
					resultado = numeroIngresado * 1.17;
					break;
				case "JPY":
					resultado = numeroIngresado * 179.00;
					break;
				case "KRW":
					resultado = numeroIngresado * 1643.06;
					break;
				default:
					resultado = 0;
					break;
				}
				break;
			case "JPY":

				switch (monedaDestino) {
				case "DOP":
					resultado = numeroIngresado * 0.40;
					break;
				case "USD":
					resultado = numeroIngresado * 0.0072;
					break;
				case "EUR":
					resultado = numeroIngresado * 0.0065;
					break;
				case "GBP":
					resultado = numeroIngresado * 0.0056;
					break;
				case "KRW":
					resultado = numeroIngresado * 9.18;
					break;
				default:
					resultado = 0;
					break;
				}
				break;
			case "KRW":

				switch (monedaDestino) {
				case "DOP":
					resultado = numeroIngresado * 0.044;
					break;
				case "USD":
					resultado = numeroIngresado * 0.00078;
					break;
				case "EUR":
					resultado = numeroIngresado * 0.00071;
					break;
				case "GBP":
					resultado = numeroIngresado * 0.0000061;
					break;
				case "JPY":
					resultado = numeroIngresado * 0.11;
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
			valorResultado.setText(String.valueOf(resultadoFormateado + " " + monedaDestino));
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
