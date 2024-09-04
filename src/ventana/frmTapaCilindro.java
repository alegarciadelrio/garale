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
public class frmTapaCilindro extends javax.swing.JFrame {
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JLabel jLabel5;
	private JLabel jLabel8;
	private JTextField txtCompresionDeseada;
	private JLabel jLabel1;
	private JLabel jLabel10;
	private JLabel jLabel9;
	private JTextField txtCarrera;
	private JLabel jLabel7;
	private JLabel jLabel6;
	private JTextField txtCompresion;
	private JLabel txtEstado;
	private JButton btnCalcular;
	private JTextField txtTapaCilindro;

	/**
	 * Auto-generated main method to display this JFrame
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				frmTapaCilindro inst = new frmTapaCilindro();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
				inst.setTitle("Rebajar Tapa de Cilindro");
				inst.setResizable(false);
			}
		});
	}

	public frmTapaCilindro() {
		super();
		initGUI();
	}

	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			{
				txtTapaCilindro = new JTextField();
				getContentPane().add(getTxtTapaCilindro());
				txtTapaCilindro.setBounds(241, 168, 48, 22);
				txtTapaCilindro.setEditable(false);
			}
			{
				jLabel2 = new JLabel();
				getContentPane().add(jLabel2);
				jLabel2.setText("Rebajar la Tapa de Cilindro en");
				jLabel2.setBounds(13, 171, 228, 15);
			}
			{
				btnCalcular = new JButton();
				getContentPane().add(btnCalcular);
				btnCalcular.setText("Calcular");
				btnCalcular.setBounds(9, 198, 319, 22);
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
				txtCompresion = new JTextField();
				getContentPane().add(txtCompresion);
				txtCompresion.setBounds(240, 106, 50, 22);
				txtCompresion.setText("9");
			}
			{
				jLabel4 = new JLabel();
				getContentPane().add(jLabel4);
				jLabel4.setText("Relación Compresion Actual");
				jLabel4.setBounds(12, 112, 216, 15);
			}
			{
				jLabel5 = new JLabel();
				getContentPane().add(jLabel5);
				jLabel5.setText("a 1");
				jLabel5.setBounds(291, 109, 60, 15);
			}
			{
				jLabel6 = new JLabel();
				getContentPane().add(jLabel6);
				jLabel6.setText("Rebajar la tapa de cilindro.");
				jLabel6.setBounds(12, 17, 301, 15);
			}
			{
				jLabel7 = new JLabel();
				getContentPane().add(jLabel7);
				jLabel7.setText("Carrera");
				jLabel7.setBounds(12, 80, 201, 15);
			}
			{
				txtCarrera = new JTextField();
				getContentPane().add(txtCarrera);
				txtCarrera.setBounds(240, 76, 50, 22);
			}
			{
				jLabel9 = new JLabel();
				getContentPane().add(jLabel9);
				jLabel9.setText("mm");
				jLabel9.setBounds(292, 79, 64, 15);
			}
			{
				jLabel10 = new JLabel();
				getContentPane().add(jLabel10);
				jLabel10.setText("mm");
				jLabel10.setBounds(291, 171, 48, 15);
			}
			{
				jLabel1 = new JLabel();
				getContentPane().add(jLabel1);
				jLabel1.setText("Relacion Compresion Deseada");
				jLabel1.setBounds(12, 140, 231, 15);
			}
			{
				txtCompresionDeseada = new JTextField();
				getContentPane().add(txtCompresionDeseada);
				txtCompresionDeseada.setText("11");
				txtCompresionDeseada.setBounds(240, 137, 49, 22);
			}
			{
				jLabel8 = new JLabel();
				getContentPane().add(jLabel8);
				jLabel8.setText("a 1");
				jLabel8.setBounds(295, 139, 53, 15);
			}
			pack();
			this.setSize(333, 258);
		} catch (Exception e) {
			// add your error handling code here
			e.printStackTrace();
		}
	}

	public JTextField getTxtTapaCilindro() {
		return txtTapaCilindro;
	}

	private void calcular() {
		txtEstado.setText("Calculando...");
		DecimalFormat formateador = new DecimalFormat("####.##");

		double carrera = 0.0;
		double compresion = 0.0;
		double compresionDeseada = 0.0;
		double rebajeTapa = 0.0;

		txtEstado.setText("Listo!");

		try {
			compresion = Double.parseDouble(txtCompresion.getText());
			compresionDeseada = Double.parseDouble(txtCompresionDeseada.getText());
			carrera = Double.parseDouble(txtCarrera.getText());
		} catch (NumberFormatException e2) {
			txtEstado.setText("No es un numero valido.");
		}

		rebajeTapa = ((carrera)/(compresion-1)-((carrera)/(compresionDeseada-1)));

		txtTapaCilindro.setText(formateador.format(rebajeTapa) + "");

	}

}
