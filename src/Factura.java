import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;

public class Factura extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtCalle;
	private JTextField txtJhonDoe;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Factura frame = new Factura();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Factura() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 726, 722);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 716, 102);
		panel.setBackground(new Color(0, 102, 153));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Factura en Java - NetBeans - ArrayList y POO");
		lblNewLabel_1.setBounds(30, 23, 462, 25);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		panel.add(lblNewLabel_1);
		
		JLabel lblsinBaseDe = new JLabel("[Sin Base de datos]");
		lblsinBaseDe.setForeground(new Color(255, 255, 255));
		lblsinBaseDe.setHorizontalAlignment(SwingConstants.LEFT);
		lblsinBaseDe.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblsinBaseDe.setBounds(29, 58, 150, 35);
		panel.add(lblsinBaseDe);
		
		JLabel lblNewLabel = new JLabel("Datos del cliente");
		lblNewLabel.setBounds(48, 129, 113, 35);
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel);
		
		JLabel lblDocumento = new JLabel("Documento: ");
		lblDocumento.setBounds(60, 177, 113, 35);
		lblDocumento.setHorizontalAlignment(SwingConstants.CENTER);
		lblDocumento.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblDocumento);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField.setText("123456");
		textField.setBounds(183, 187, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblDireccin = new JLabel("Dirección: ");
		lblDireccin.setBounds(76, 232, 113, 35);
		lblDireccin.setHorizontalAlignment(SwingConstants.LEFT);
		lblDireccin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblDireccin);
		
		txtCalle = new JTextField();
		txtCalle.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtCalle.setText("Calle 1 # 123");
		txtCalle.setBounds(183, 242, 96, 19);
		contentPane.add(txtCalle);
		txtCalle.setColumns(10);
		
		JLabel lblNombres = new JLabel("Nombres:");
		lblNombres.setBounds(343, 177, 113, 35);
		lblNombres.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombres.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblNombres);
		
		txtJhonDoe = new JTextField();
		txtJhonDoe.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtJhonDoe.setText("Jhon Doe");
		txtJhonDoe.setBounds(466, 187, 96, 19);
		txtJhonDoe.setColumns(10);
		contentPane.add(txtJhonDoe);
		
		JLabel lblTelfono = new JLabel("Teléfono:");
		lblTelfono.setBounds(343, 232, 113, 35);
		lblTelfono.setHorizontalAlignment(SwingConstants.CENTER);
		lblTelfono.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblTelfono);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_3.setText("5554433");
		textField_3.setBounds(466, 242, 96, 19);
		textField_3.setColumns(10);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(31, 146, 638, 130);
		lblNewLabel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(lblNewLabel_2);
		
		JLabel lblDatosDeFactura_1 = new JLabel("Datos de factura");
		lblDatosDeFactura_1.setBounds(48, 283, 113, 35);
		lblDatosDeFactura_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblDatosDeFactura_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblDatosDeFactura_1);
		
		JLabel lblNFactura = new JLabel("N° Factura:");
		lblNFactura.setBounds(60, 331, 113, 35);
		lblNFactura.setHorizontalAlignment(SwingConstants.LEFT);
		lblNFactura.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblNFactura);
		
		JLabel lblFecha = new JLabel("Fecha: ");
		lblFecha.setBounds(343, 331, 113, 35);
		lblFecha.setHorizontalAlignment(SwingConstants.CENTER);
		lblFecha.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblFecha);
		
		JLabel lblVerListadoDe = new JLabel("Ver listado de facturas");
		lblVerListadoDe.setBounds(76, 395, 155, 35);
		lblVerListadoDe.setHorizontalAlignment(SwingConstants.CENTER);
		lblVerListadoDe.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblVerListadoDe);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("D:\\Descargas\\icono mas.png"));
		lblNewLabel_4.setBounds(460, 395, 33, 35);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\felix\\Downloads\\Opciones.png"));
		lblNewLabel_3.setBounds(48, 395, 33, 35);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("D:\\Descargas\\icono X.png"));
		lblNewLabel_5.setBounds(551, 395, 25, 37);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblAadir = new JLabel("Añadir");
		lblAadir.setHorizontalAlignment(SwingConstants.CENTER);
		lblAadir.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAadir.setBounds(466, 395, 96, 35);
		contentPane.add(lblAadir);
		
		JLabel lblEliminar = new JLabel("Eliminar");
		lblEliminar.setHorizontalAlignment(SwingConstants.CENTER);
		lblEliminar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEliminar.setBounds(541, 395, 125, 35);
		contentPane.add(lblEliminar);
		
		String tableTittles[] = {"Producto","Cantidad","Valor","Sub Total"};
		
		String tableData [][] = {
				{"Agua", "2","500","1000.0"},
				{"Cereal","5","1000","5000.0"},
				{"Leche","2","300","600.0"}
		};
		
		JTable tableUsers = new JTable(tableData,tableTittles);
		tableUsers.setFont(new Font("Tahoma", Font.PLAIN, 14));
		//tableUsers.setBounds(40, 400, 920, 40);
		
		JScrollPane tableScroll = new JScrollPane(tableUsers);
		tableScroll.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tableScroll.setBounds(31, 440, 644, 102);
		
		contentPane.add(tableScroll);
		
		JLabel lblDatosDeFactura = new JLabel("SubTotal:");
		lblDatosDeFactura.setBounds(60, 552, 113, 35);
		lblDatosDeFactura.setHorizontalAlignment(SwingConstants.LEFT);
		lblDatosDeFactura.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblDatosDeFactura);
		
		JLabel lblDescuento = new JLabel("% Descuento:");
		lblDescuento.setBounds(60, 582, 113, 35);
		lblDescuento.setHorizontalAlignment(SwingConstants.LEFT);
		lblDescuento.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblDescuento);
		
		textField_4 = new JTextField();
		textField_4.setBounds(169, 590, 47, 21);
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_4.setText("5");
		textField_4.setColumns(10);
		contentPane.add(textField_4);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.setBounds(233, 582, 40, 40);
		chckbxNewCheckBox.setSelected(true);
		contentPane.add(chckbxNewCheckBox);
		
		JLabel lblIva = new JLabel("IVA 19%:");
		lblIva.setBounds(60, 620, 110, 35);
		lblIva.setHorizontalAlignment(SwingConstants.LEFT);
		lblIva.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblIva);
		
		JLabel lblTotalFactura = new JLabel("Total Factura: ");
		lblTotalFactura.setBounds(60, 653, 113, 35);
		lblTotalFactura.setHorizontalAlignment(SwingConstants.LEFT);
		lblTotalFactura.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblTotalFactura);
		
		JButton btnNewButton_1 = new JButton("Finalizar factura");
		btnNewButton_1.setBounds(439, 658, 149, 25);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Limpiar");
		btnNewButton_1_1.setBounds(617, 658, 85, 25);
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(btnNewButton_1_1);
		
		JLabel lblValorDescontado = new JLabel("Valor descontado:");
		lblValorDescontado.setBounds(318, 582, 132, 35);
		lblValorDescontado.setHorizontalAlignment(SwingConstants.LEFT);
		lblValorDescontado.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblValorDescontado);
		
		JLabel lblIva_1 = new JLabel("330.0");
		lblIva_1.setBounds(478, 582, 110, 35);
		lblIva_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblIva_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblIva_1);
		
		JLabel lblIva_1_1 = new JLabel("6600.0");
		lblIva_1_1.setBounds(169, 552, 110, 35);
		lblIva_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblIva_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblIva_1_1);
		
		JLabel lblIva_1_2 = new JLabel("1254.0");
		lblIva_1_2.setBounds(169, 621, 110, 35);
		lblIva_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblIva_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblIva_1_2);
		
		JLabel lblIva_1_3 = new JLabel("7524.0");
		lblIva_1_3.setBounds(169, 653, 110, 35);
		lblIva_1_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblIva_1_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblIva_1_3);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setBounds(31, 300, 638, 78);
		lblNewLabel_2_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("");
		lblNewLabel_2_1_1.setBounds(31, 388, 638, 45);
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(lblNewLabel_2_1_1);
		
		JLabel lblIva_1_1_1 = new JLabel("1");
		lblIva_1_1_1.setBounds(169, 331, 110, 35);
		lblIva_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblIva_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblIva_1_1_1);
		
		JLabel lblIva_1_1_2 = new JLabel("2021/50/21");
		lblIva_1_1_2.setBounds(466, 331, 110, 35);
		lblIva_1_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblIva_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblIva_1_1_2);
		
	}
}
