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
public class frmTiempoSuperficie extends javax.swing.JFrame {
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JLabel jLabel5;
	private JLabel txtSuperficie;
	private JLabel jLabel14;
	private JLabel txtK;
	private JLabel jLabel13;
	private JLabel jLabel12;
	private JTextField txtGrados;
	private JLabel jLabel11;
	private JLabel jLabel8;
	private JTextField txtRpm;
	private JLabel jLabel1;
	private JLabel jLabel10;
	private JLabel jLabel9;
	private JTextField txtAltura;
	private JLabel jLabel7;
	private JLabel jLabel6;
	private JTextField txtAncho;
	private JLabel txtEstado;
	private JButton btnCalcular;
	private JTextField txtTiempoSuperficie;

	/**
	 * Auto-generated main method to display this JFrame
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				frmTiempoSuperficie inst = new frmTiempoSuperficie();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
				inst.setTitle("Tiempo Superficie");
				inst.setResizable(false);
			}
		});
	}

	public frmTiempoSuperficie() {
		super();
		initGUI();
	}

	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			{
				txtTiempoSuperficie = new JTextField();
				getContentPane().add(getTxtTiempoSuperficie());
				txtTiempoSuperficie.setBounds(240, 201, 48, 22);
				txtTiempoSuperficie.setEditable(false);
			}
			{
				jLabel2 = new JLabel();
				getContentPane().add(jLabel2);
				jLabel2.setText("Tiempo Superficie");
				jLabel2.setBounds(12, 204, 228, 15);
			}
			{
				btnCalcular = new JButton();
				getContentPane().add(btnCalcular);
				btnCalcular.setText("Calcular");
				btnCalcular.setBounds(6, 273, 319, 22);
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
				txtAncho = new JTextField();
				getContentPane().add(txtAncho);
				txtAncho.setBounds(240, 106, 50, 22);
				txtAncho.setText("24");
			}
			{
				jLabel4 = new JLabel();
				getContentPane().add(jLabel4);
				jLabel4.setText("Ancho Lumbrera");
				jLabel4.setBounds(12, 112, 216, 15);
			}
			{
				jLabel5 = new JLabel();
				getContentPane().add(jLabel5);
				jLabel5.setText("mm");
				jLabel5.setBounds(291, 109, 60, 15);
			}
			{
				jLabel6 = new JLabel();
				getContentPane().add(jLabel6);
				jLabel6.setText("Calcular tiempo superficie");
				jLabel6.setBounds(12, 17, 301, 15);
			}
			{
				jLabel7 = new JLabel();
				getContentPane().add(jLabel7);
				jLabel7.setText("Altura Lumbrera");
				jLabel7.setBounds(12, 80, 201, 15);
			}
			{
				txtAltura = new JTextField();
				getContentPane().add(txtAltura);
				txtAltura.setBounds(240, 76, 50, 22);
				txtAltura.setText("18");
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
				jLabel10.setText("t/s");
				jLabel10.setBounds(290, 204, 48, 15);
			}
			{
				jLabel1 = new JLabel();
				getContentPane().add(jLabel1);
				jLabel1.setText("RPM");
				jLabel1.setBounds(12, 140, 231, 15);
			}
			{
				txtRpm = new JTextField();
				getContentPane().add(txtRpm);
				txtRpm.setText("9000");
				txtRpm.setBounds(240, 137, 49, 22);
			}
			{
				jLabel8 = new JLabel();
				getContentPane().add(jLabel8);
				jLabel8.setText("rpm");
				jLabel8.setBounds(292, 139, 53, 15);
			}
			{
				jLabel11 = new JLabel();
				getContentPane().add(jLabel11);
				jLabel11.setText("Grados de la Lumbrera");
				jLabel11.setBounds(12, 170, 201, 15);
			}
			{
				txtGrados = new JTextField();
				getContentPane().add(txtGrados);
				txtGrados.setText("150");
				txtGrados.setBounds(241, 167, 48, 22);
			}
			{
				jLabel12 = new JLabel();
				getContentPane().add(jLabel12);
				jLabel12.setText("º");
				jLabel12.setBounds(290, 170, 18, 15);
			}
			{
				jLabel13 = new JLabel();
				getContentPane().add(jLabel13);
				jLabel13.setText("K");
				jLabel13.setBounds(207, 240, 28, 15);
			}
			{
				txtK = new JLabel();
				getContentPane().add(txtK);
				txtK.setBounds(241, 240, 59, 15);
			}
			{
				jLabel14 = new JLabel();
				getContentPane().add(jLabel14);
				jLabel14.setText("Superficie");
				jLabel14.setBounds(12, 240, 86, 15);
			}
			{
				txtSuperficie = new JLabel();
				getContentPane().add(txtSuperficie);
				txtSuperficie.setBounds(92, 240, 69, 15);
			}
			pack();
			this.setSize(340, 336);
		} catch (Exception e) {
			// add your error handling code here
			e.printStackTrace();
		}
	}

	public JTextField getTxtTiempoSuperficie() {
		return txtTiempoSuperficie;
	}

	private void calcular() {
		txtEstado.setText("Calculando...");
		DecimalFormat formateador = new DecimalFormat("####.##");

		double altura = 0.0;
		double ancho = 0.0;
		double rpm = 0.0;
		double grados = 0.0;
		double K = 0.0;
		double superficie = 0.0;
		double tiempoSuperficie = 0.0;

		txtEstado.setText("Listo!");

		try {
			ancho = Double.parseDouble(txtAncho.getText());
			altura = Double.parseDouble(txtAltura.getText());
			rpm = Double.parseDouble(txtRpm.getText());
			grados = Double.parseDouble(txtGrados.getText());
		} catch (NumberFormatException e2) {
			txtEstado.setText("No es un numero valido.");
		}

		superficie = altura * ancho;
		K = 22.8 - (((210 - grados) / 10) * 1.05);
		tiempoSuperficie = (altura * ancho * K) / rpm;

		txtSuperficie.setText(formateador.format(superficie) + "");
		txtK.setText(formateador.format(K) + "");
		txtTiempoSuperficie.setText(formateador.format(tiempoSuperficie) + "");

	}

}
