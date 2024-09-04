package ventana;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
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
public class frmCarburador extends javax.swing.JFrame {
	private JTextField txtCilindrada;
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JLabel jLabel5;
	private JComboBox cmbCarburador;
	private JLabel jLabel11;
	private JLabel jLabel10;
	private JLabel jLabel9;
	private JTextField txtVelocidadAire;
	private JLabel jLabel8;
	private JLabel jLabel7;
	private JLabel jLabel6;
	private JTextField txtRevoluciones;
	private JLabel txtEstado;
	private JButton btnCalcular;
	private JLabel jLabel1;
	private JTextField txtCarburador;

	/**
	 * Auto-generated main method to display this JFrame
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				frmCarburador inst = new frmCarburador();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
				inst.setTitle("Calcular Carburador");
				inst.setResizable(false);
			}
		});
	}

	public frmCarburador() {
		super();
		initGUI();
	}

	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			{
				txtCilindrada = new JTextField();
				getContentPane().add(txtCilindrada);
				txtCilindrada.setBounds(219, 137, 50, 22);
			}
			{
				txtCarburador = new JTextField();
				getContentPane().add(getTxtCarburador());
				txtCarburador.setBounds(220, 205, 48, 22);
				txtCarburador.setEditable(false);
			}
			{
				jLabel1 = new JLabel();
				getContentPane().add(jLabel1);
				jLabel1.setText("Volumen del Cilindro");
				jLabel1.setBounds(12, 144, 172, 15);
			}
			{
				jLabel2 = new JLabel();
				getContentPane().add(jLabel2);
				jLabel2.setText("Diametro de Carburador");
				jLabel2.setBounds(12, 208, 172, 15);
			}
			{
				btnCalcular = new JButton();
				getContentPane().add(btnCalcular);
				btnCalcular.setText("Calcular");
				btnCalcular.setBounds(12, 239, 319, 22);
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
				txtRevoluciones.setText("7000");
				txtRevoluciones.setBounds(219, 107, 50, 22);
			}
			{
				jLabel4 = new JLabel();
				getContentPane().add(jLabel4);
				jLabel4.setText("RPM Optimizar");
				jLabel4.setBounds(12, 112, 141, 15);
			}
			{
				jLabel5 = new JLabel();
				getContentPane().add(jLabel5);
				jLabel5.setText("rpm");
				jLabel5.setBounds(270, 110, 60, 15);
			}
			{
				jLabel6 = new JLabel();
				getContentPane().add(jLabel6);
				jLabel6.setText("Calcular diametro ideal del carburador.");
				jLabel6.setBounds(12, 17, 301, 15);
			}
			{
				jLabel7 = new JLabel();
				getContentPane().add(jLabel7);
				jLabel7.setText("Veloc. de Circulacion de Aire");
				jLabel7.setBounds(12, 80, 201, 15);
			}
			{
				jLabel8 = new JLabel();
				getContentPane().add(jLabel8);
				jLabel8.setText("cm3");
				jLabel8.setBounds(269, 140, 61, 15);
			}
			{
				txtVelocidadAire = new JTextField();
				getContentPane().add(txtVelocidadAire);
				txtVelocidadAire.setText("90");
				txtVelocidadAire.setBounds(219, 77, 50, 22);
			}
			{
				jLabel9 = new JLabel();
				getContentPane().add(jLabel9);
				jLabel9.setText("m/s");
				jLabel9.setBounds(271, 80, 64, 15);
			}
			{
				jLabel10 = new JLabel();
				getContentPane().add(jLabel10);
				jLabel10.setText("mm");
				jLabel10.setBounds(270, 208, 48, 15);
			}
			{
				jLabel11 = new JLabel();
				getContentPane().add(jLabel11);
				jLabel11.setText("Compuerta del Carburador");
				jLabel11.setBounds(12, 176, 207, 15);
			}
			{
				ComboBoxModel cmbCarburadorModel = new DefaultComboBoxModel(
						new String[] { "Redonda", "Plana" });
				cmbCarburador = new JComboBox();
				getContentPane().add(cmbCarburador);
				cmbCarburador.setModel(cmbCarburadorModel);
				cmbCarburador.setBounds(219, 172, 111, 22);
			}
			pack();
			this.setSize(353, 300);
		} catch (Exception e) {
			// add your error handling code here
			e.printStackTrace();
		}
	}

	public JTextField getTxtCarburador() {
		return txtCarburador;
	}

	private void calcular() {
		txtEstado.setText("Calculando...");
		DecimalFormat formateador = new DecimalFormat("####.##");

		double cilindro = 0.0;
		double velocidad = 0.0;
		double rpm = 0.0;
		double diametro = 0.0;

		txtEstado.setText("Listo!");

		try {
			rpm = Double.parseDouble(txtRevoluciones.getText());
			cilindro = Double.parseDouble(txtCilindrada.getText());
			velocidad = Double.parseDouble(txtVelocidadAire.getText());
		} catch (NumberFormatException e2) {
			txtEstado.setText("No es un numero valido.");
		}

		diametro = (Math.pow(cilindro, 1 / 3.55))
				* (Math.sqrt((4 * rpm * cilindro) / (94.25 * velocidad))) * 1
				/ 2.65;

		if (cmbCarburador.getSelectedIndex() == 0) {
			diametro = diametro * 1.039;
		}

		txtCarburador.setText(formateador.format(diametro) + "");

	}

}
