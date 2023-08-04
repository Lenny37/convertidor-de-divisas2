package gui;

import java.awt.EventQueue;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import javax.swing.JList;
import javax.swing.JTextArea;
import java.awt.Component;
import java.awt.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListCellRenderer;
import java.awt.Image;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.JLabel;
import javax.swing.Icon;

public class VentanaPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField txtConvertidor;
	private String rutaImagen = "C:\\Users\\king_\\eclipse-workspace\\convertidor-de-divisas2\\imagenes\\icono-principalConversor1.png";
    private ImageIcon imagenIcono;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
					frame.setVisible(true);
					frame.setTitle("Convertidor");
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

	public VentanaPrincipal() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\king_\\eclipse-workspace\\convertidor-de-divisas2\\imagenes\\icono-principalConversor1.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 468, 350);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(4,56,110,255));
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
		comboBox.setBounds(83, 119, 282, 42);
		contentPane.add(comboBox);
		
		JButton btnSiguiente = new JButton("Siguiente");
		btnSiguiente.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSiguiente.setBounds(158, 191, 150, 49);
		contentPane.add(btnSiguiente);
		
		imagenIcono = new ImageIcon(rutaImagen);
		
		txtConvertidor = new JTextField();
		txtConvertidor.setFont(new Font("SansSerif", Font.BOLD, 24));
		txtConvertidor.setBackground(new Color(4,56,110,255));
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
		
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String opcionSeleccionada = (String) comboBox.getSelectedItem();
				
				if (opcionSeleccionada.equals("Conversion de Divisas")) {
					VentanaMonedas ventanamoneda = new VentanaMonedas();
					ventanamoneda.setVisible(true);
				} else if (opcionSeleccionada.equals("Conversion de Temperatura")) {
					VentanaTemperatura ventanatemperatura = new VentanaTemperatura();
					ventanatemperatura.setVisible(true);
				}
				 dispose();
			}
		}
				);	
	}
	
}




public class VentanaMonedas extends JFrame {

	private JPanel contentPane;
	double numeroIngresado;
	private JTextField txtPoweredByLenny;
	private JTextArea textArea;
    private JComboBox<OpcionConIcono> comboBox;
    private JComboBox<OpcionConIcono> comboBox_1;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JButton btnHome;



	public VentanaMonedas() {

		setBackground(new Color(4,56,110,255));
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\king_\\eclipse-workspace\\convertidor-de-divisas2\\imagenes\\icono-principalConversor1.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 468, 499);
		contentPane = new JPanel();
        setResizable(false); 
        setMaximumSize(getPreferredSize());
        setLocationRelativeTo(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Color colorPersonalizado = new Color(4,56,110,255);
		getContentPane().setBackground(colorPersonalizado);
		
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

		JTextField txtMoneda = new JTextField();
		txtMoneda.setForeground(new Color(255, 255, 255));
		txtMoneda.setHorizontalAlignment(SwingConstants.CENTER);
		txtMoneda.setBorder(null);
		txtMoneda.setFont(new Font("SansSerif", Font.BOLD, 20));
		txtMoneda.setText("DOP");
		txtMoneda.setBounds(23, 29, 77, 38);
		contentPane.add(txtMoneda);
		txtMoneda.setColumns(10);
		txtMoneda.setBackground(colorPersonalizado);
        txtMoneda.setEditable(false); 

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

	        OpcionConIcono[] opciones = {opcion1, opcion2, opcion3, opcion4, opcion5, opcion6};
	        OpcionConIcono[] opciones2 = {opcion2,opcion3, opcion4, opcion5, opcion6, opcion1};
	        comboBox.setModel(new DefaultComboBoxModel<>(opciones));

	        comboBox.setRenderer(new DefaultListCellRenderer() {
	            @Override
	            public Component getListCellRendererComponent(JList<?> list, Object value, int index,
	                                                          boolean isSelected, boolean cellHasFocus) {
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
	                OpcionConIcono opcionSeleccionada = (OpcionConIcono) comboBox.getSelectedItem();
	                txtMoneda.setText(opcionSeleccionada.getText());
	            }
	        });
	        contentPane.add(comboBox);

	        comboBox_1 = new JComboBox<>();
	        comboBox_1.setForeground(new Color(255, 255, 255));
	        comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 20));
	        comboBox_1.setBounds(241, 90, 207, 64);
	        contentPane.add(comboBox_1);
	        comboBox_1.setBackground(new Color(255, 255, 255));

	        comboBox_1.setModel(new DefaultComboBoxModel<>(opciones2));
	        comboBox_1.setRenderer(new DefaultListCellRenderer() {
	        	@Override
	            public Component getListCellRendererComponent(JList<?> list, Object value, int index,
	                                                          boolean isSelected, boolean cellHasFocus) {
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
	        txtPoweredByLenny.setBackground(new Color(4,56,110,255));
	        txtPoweredByLenny.setFont(new Font("SansSerif", Font.PLAIN, 14));
	        txtPoweredByLenny.setText("Powered by: Lenny Sanchez");
	        txtPoweredByLenny.setBounds(6, 428, 184, 28);
	        contentPane.add(txtPoweredByLenny);
	        txtPoweredByLenny.setColumns(10);
	        txtPoweredByLenny.setBorder(null);
	        txtPoweredByLenny.setEditable(false);

	        JButton botonCopiar = new JButton(new ImageIcon("C:\\Users\\king_\\eclipse-workspace\\convertidor-de-divisas2\\imagenes\\icono-copiar2.png"));
	        botonCopiar.setBackground(new Color(4,56,110,255));
	        botonCopiar.setBounds(194, 292, 67, 44);
	        botonCopiar.setContentAreaFilled(false);
	        botonCopiar.setBorderPainted(false);
	        botonCopiar.setFocusPainted(false);
	        
	        botonCopiar.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                String resultado = textField.getText();

	                Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
	                StringSelection selection = new StringSelection(resultado);
	                clipboard.setContents(selection, null);

	            }
	        });
	        
	        contentPane.add(botonCopiar);

	        ImageIcon iconoEnlace = new ImageIcon("C:\\Users\\king_\\eclipse-workspace\\convertidor-de-divisas2\\Icono-Linkedin2.png");

	        int iconoEnlaceAnchura = 30;
	        int iconoEnlaceAltura = 30;
	        Image iconoEnlaceImagen = iconoEnlace.getImage().getScaledInstance(iconoEnlaceAnchura, iconoEnlaceAltura, Image.SCALE_SMOOTH);
	        ImageIcon iconoEnlaceAjustado = new ImageIcon(iconoEnlaceImagen);
	        JLabel iconoEnlaceLabel = new JLabel(iconoEnlaceAjustado);
	        iconoEnlaceLabel.setBounds(202, 426, iconoEnlaceAnchura, iconoEnlaceAltura);
	        contentPane.add(iconoEnlaceLabel);
	        
	        textField = new JTextField("0.01 USD");
	        textField.setForeground(new Color(255, 255, 255));
	        textField.setHorizontalAlignment(SwingConstants.CENTER);
	        textField.setFont(new Font("SansSerif", Font.PLAIN, 40));
	        textField.setBackground(new Color(4,56,110,255));
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

	        	        textField_3 = new JTextField();
	        	        textField_3.setBounds(107, 6, 230, 48);
	        	        panel.add(textField_3);
	        	        textField_3.setFont(new Font("SansSerif", Font.BOLD, 26));
	        	        textField_3.setHorizontalAlignment(SwingConstants.CENTER);
	        	        textField_3.setColumns(10);
	        	        textField_3.setText("1.00"); 
	        	        textField_3.setBorder(null);
	        	        
	        	        btnHome = new JButton("Home");
	        	        btnHome.setBackground(new Color(255, 255, 255));
	        	        btnHome.setFont(new Font("SansSerif", Font.BOLD, 24));
	        	        btnHome.setBounds(318, 419, 131, 38);
	        	        contentPane.add(btnHome);
	        
	       
	        textField_3.getDocument().addDocumentListener(new DocumentListener() {
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
	        
	        textField_3.getDocument().addDocumentListener(new DocumentListener() {
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
	}

	public void actualizarResultado() {
	    String textoIngresado = textField_3.getText();
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
	                        resultado = numeroIngresado * 1.10 ;
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

	        String resultadoFormateado = String.format("%.2f", resultado);
	        textField.setText(String.valueOf(resultadoFormateado + " " + monedaDestino));
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




public class VentanaTemperatura extends JFrame {

	private JPanel contentPane;
	double numeroIngresado;
	private JTextField txtPoweredByLenny;
	private JTextArea textArea;
    private JComboBox comboBox; 
    private JComboBox comboBox_1; 
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JLabel lblSimboloTemp;



	public VentanaTemperatura() {
		setBackground(new Color(4,56,110,255));
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\king_\\eclipse-workspace\\convertidor-de-divisas2\\imagenes\\icono-principalConversor1.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 468, 499);
		contentPane = new JPanel();
        setResizable(false); 
        setMaximumSize(getPreferredSize());
        setLocationRelativeTo(null);
        setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Color colorPersonalizado = new Color(4,56,110,255);
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
	   
        String[] opciones = {"Celsius(°C)", "Fahrenheit(°F)", "Kelvin(K)"};
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

	        String[] opciones2 = {"Fahrenheit(°F)", "Kelvin(K)", "Celsius(°C)"};
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
	        txtPoweredByLenny.setBackground(new Color(4,56,110,255));
	        txtPoweredByLenny.setFont(new Font("SansSerif", Font.PLAIN, 14));
	        txtPoweredByLenny.setText("Powered by: Lenny Sanchez");
	        txtPoweredByLenny.setBounds(6, 428, 184, 28);
	        contentPane.add(txtPoweredByLenny);
	        txtPoweredByLenny.setColumns(10);
	        txtPoweredByLenny.setBorder(null);
	        txtPoweredByLenny.setEditable(false);

	        JButton botonCopiar = new JButton(new ImageIcon("C:\\Users\\king_\\eclipse-workspace\\convertidor-de-divisas2\\imagenes\\icono-copiar2.png"));
	        botonCopiar.setBackground(new Color(4,56,110,255));
	        botonCopiar.setBounds(194, 292, 67, 44);
	        botonCopiar.setContentAreaFilled(false);
	        botonCopiar.setBorderPainted(false);
	        botonCopiar.setFocusPainted(false);
	        
	        botonCopiar.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                String resultado = textField.getText();

	                Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
	                StringSelection selection = new StringSelection(resultado);
	                clipboard.setContents(selection, null);

	            }
	        });
	        contentPane.add(botonCopiar);

	        ImageIcon iconoEnlace = new ImageIcon("C:\\Users\\king_\\eclipse-workspace\\convertidor-de-divisas2\\Icono-Linkedin2.png");

	        int iconoEnlaceAnchura = 30;
	        int iconoEnlaceAltura = 30;
	        Image iconoEnlaceImagen = iconoEnlace.getImage().getScaledInstance(iconoEnlaceAnchura, iconoEnlaceAltura, Image.SCALE_SMOOTH);
	        ImageIcon iconoEnlaceAjustado = new ImageIcon(iconoEnlaceImagen);
	        JLabel iconoEnlaceLabel = new JLabel(iconoEnlaceAjustado);
	        iconoEnlaceLabel.setBounds(202, 426, iconoEnlaceAnchura, iconoEnlaceAltura);
	        contentPane.add(iconoEnlaceLabel);
	        
	        textField = new JTextField("89.6 °F");
	        textField.setForeground(new Color(255, 255, 255));
	        textField.setHorizontalAlignment(SwingConstants.CENTER);
	        textField.setFont(new Font("SansSerif", Font.PLAIN, 40));
	        textField.setBackground(new Color(4,56,110,255));
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
	        
	        	        
	        	        textField_3 = new JTextField();
	        	        textField_3.setBounds(107, 6, 230, 48);
	        	        panel.add(textField_3);
	        	        textField_3.setFont(new Font("SansSerif", Font.BOLD, 26));
	        	        textField_3.setHorizontalAlignment(SwingConstants.CENTER);
	        	        textField_3.setColumns(10);
	        	        textField_3.setText("32.00"); 
	        	        textField_3.setBorder(null);
	        
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
	       
	        textField_3.getDocument().addDocumentListener(new DocumentListener() {
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
	        
	        textField_3.getDocument().addDocumentListener(new DocumentListener() {
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
	}

	public void actualizarResultado() {
	    String textoIngresado = textField_3.getText();
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
	                        resultado = (numeroIngresado * 9/5) + 32;
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
	                        resultado =(numeroIngresado - 32) * 5/9 + 273.15;
	                        simboloT = "K";
	                        break;
	                    case "Celsius(°C)":
	                        resultado = (numeroIngresado - 32) * 5/9;
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
	                        resultado = 1.8*(numeroIngresado - 273.15) + 32;
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
	        textField.setText(String.valueOf(resultadoFormateado + " " + simboloT));
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



public class OpcionConIcono {
	  private String text;
	    private Icon icon;

	    public OpcionConIcono(String text, Icon icon) {
	        this.text = text;
	        this.icon = icon;
	    }

	    public String getText() {
	        return text;
	    }

	    public Icon getIcon() {
	        return icon;
	    }

	    @Override
	    public String toString() {
	        return text; // Esto es importante para que el JComboBox muestre correctamente el texto en las opciones
	    }
	}

