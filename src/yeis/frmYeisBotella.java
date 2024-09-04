package yeis;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;

/**
 * This code was edited or generated using CloudGarden's Jigloo SWT/Swing GUI
 * Builder, which is free for non-commercial use. If Jigloo is being used
 * commercially (ie, by a corporation, company or business for any purpose
 * whatever) then you should purchase a license for each developer using Jigloo.
 * Please visit www.cloudgarden.com for details. Use of Jigloo implies
 * acceptance of these licensing terms. A COMMERCIAL LICENSE HAS NOT BEEN
 * PURCHASED FOR THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED LEGALLY FOR
 * ANY CORPORATE OR COMMERCIAL PURPOSE.
 */
public class frmYeisBotella extends javax.swing.JFrame {
	private JTextField txtVelocidadSonido;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JLabel jLabel5;
	private JLabel jLabel14;
	private JTextField txtVolumen;
	private JLabel imagen;
	private JLabel jLabel24;
	private JTextField txtDiametro;
	private JLabel jLabel23;
	private JLabel jLabel13;
	private JLabel jLabel9;
	private JTextField txtLargo;
	private JLabel jLabel8;
	private JLabel jLabel7;
	private JLabel jLabel6;
	private JTextField txtRevoluciones;
	private JLabel txtEstado;
	private JButton btnCalcular;
	private JLabel jLabel1;

	/**
	 * Auto-generated main method to display this JFrame
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				frmYeisBotella inst = new frmYeisBotella();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
				inst.setTitle("Calcular Volumen de Botella Yeis");
				inst.setResizable(false);
			}
		});
	}

	public frmYeisBotella() {
		super();
		initGUI();
	}

	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			{
				txtVelocidadSonido = new JTextField();
				getContentPane().add(txtVelocidadSonido);
				txtVelocidadSonido.setBounds(502, 445, 50, 22);
				txtVelocidadSonido.setText("340");
			}
			{
				jLabel1 = new JLabel();
				getContentPane().add(jLabel1);
				jLabel1.setText("Velocidad del Sonido");
				jLabel1.setBounds(315, 452, 172, 15);
			}
			{
				btnCalcular = new JButton();
				getContentPane().add(btnCalcular);
				btnCalcular.setText("Calcular");
				btnCalcular.setBounds(295, 512, 294, 22);
				btnCalcular.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						calcular();
					}
				});
			}
			{
				jLabel3 = new JLabel();
				getContentPane().add(jLabel3);
				jLabel3.setText("Estado:");
				jLabel3.setBounds(14, 47, 84, 15);
			}
			{
				txtEstado = new JLabel();
				getContentPane().add(txtEstado);
				txtEstado.setBounds(90, 44, 182, 20);
			}
			{
				txtRevoluciones = new JTextField();
				getContentPane().add(txtRevoluciones);
				txtRevoluciones.setText("5000");
				txtRevoluciones.setBounds(502, 415, 50, 22);
				txtRevoluciones
						.setToolTipText("Rpm a las que optimizamos el motor.");
			}
			{
				jLabel4 = new JLabel();
				getContentPane().add(jLabel4);
				jLabel4.setText("RPM Optimizar");
				jLabel4.setBounds(315, 420, 141, 15);
			}
			{
				jLabel5 = new JLabel();
				getContentPane().add(jLabel5);
				jLabel5.setText("rpm");
				jLabel5.setBounds(553, 418, 60, 15);
			}
			{
				jLabel6 = new JLabel();
				getContentPane().add(jLabel6);
				jLabel6.setText("Calcular el volumen de la botella de YEIS");
				jLabel6.setBounds(12, 17, 301, 15);
			}
			{
				jLabel7 = new JLabel();
				getContentPane().add(jLabel7);
				jLabel7.setText("Largo de Mangera");
				jLabel7.setBounds(49, 419, 201, 15);
			}
			{
				jLabel8 = new JLabel();
				getContentPane().add(jLabel8);
				jLabel8.setText("m/s");
				jLabel8.setBounds(552, 448, 61, 15);
			}
			{
				txtLargo = new JTextField();
				getContentPane().add(txtLargo);
				txtLargo.setBounds(219, 416, 50, 22);
				txtLargo.setText("20.0");
			}
			{
				jLabel9 = new JLabel();
				getContentPane().add(jLabel9);
				jLabel9.setText("cm");
				jLabel9.setBounds(271, 419, 64, 15);
			}
			{
				jLabel13 = new JLabel();
				getContentPane().add(jLabel13);
				jLabel13.setText("Volumen de la Botella");
				jLabel13.setBounds(315, 484, 209, 15);
				jLabel13.setFont(new java.awt.Font("Arial Black",0,14));
			}
			{
				txtVolumen = new JTextField();
				getContentPane().add(txtVolumen);
				txtVolumen.setBounds(502, 479, 50, 22);
				txtVolumen.setEditable(false);
			}
			{
				jLabel14 = new JLabel();
				getContentPane().add(jLabel14);
				jLabel14.setText("cm3");
				jLabel14.setBounds(552, 482, 52, 15);
			}
			{
				jLabel23 = new JLabel();
				getContentPane().add(jLabel23);
				jLabel23.setText("Diametro de Manguera");
				jLabel23.setBounds(49, 452, 201, 15);
			}
			{
				txtDiametro = new JTextField();
				getContentPane().add(txtDiametro);
				txtDiametro.setText("8.0");
				txtDiametro.setBounds(219, 449, 50, 22);
			}
			{
				jLabel24 = new JLabel();
				getContentPane().add(jLabel24);
				jLabel24.setText("mm");
				jLabel24.setBounds(271, 452, 44, 15);
			}
			{
				ImageIcon icono = new ImageIcon(getClass().getResource(
						"/img/yeis.jpg"));
				imagen = new JLabel(icono);
				getContentPane().add(imagen);
				imagen.setBounds(12, 79, 623, 328);
			}
			pack();
			this.setSize(648, 572);
		} catch (Exception e) {
			// add your error handling code here
			e.printStackTrace();
		}
	}

	private void calcular() {
		txtEstado.setText("Calculando...");
		DecimalFormat formateador = new DecimalFormat("####.##");

		// Parametros
		double largo = 0.0;
		double diametro = 0.0;
		double velSonido = 0.0;
		double rpm = 0.0;
		double pi = Math.PI;
		
		double volumen = 0.0;


		txtEstado.setText("Listo!");

		try {
			largo = Double.parseDouble(txtLargo.getText());
			diametro = Double.parseDouble(txtDiametro.getText());
			rpm = Double.parseDouble(txtRevoluciones.getText());
			velSonido = Double.parseDouble(txtVelocidadSonido.getText());
		} catch (NumberFormatException e2) {
			txtEstado.setText("No es un numero valido.");
		}
		
		volumen = (Math.pow((diametro/20),2)*pi / (Math.pow(((rpm/60)*2*pi / (velSonido*100)),2) * (largo+1.57 * (diametro/20))));

		txtVolumen.setText(formateador.format(volumen) + "");

	}

	private double milimetro(double pulgada) {
		pulgada = pulgada * 25.4;
		return pulgada;
	}

	private double pulgada(double milimetro) {
		milimetro = milimetro / 25.4;
		return milimetro;
	}

}
