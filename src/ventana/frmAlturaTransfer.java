package ventana;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
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
public class frmAlturaTransfer extends javax.swing.JFrame {
	private JTextField txtRecorrido;
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JLabel jLabel5;
	private JLabel jLabel7;
	private JLabel jLabel6;
	private JTextField txtRevoluciones;
	private JLabel txtEstado;
	private JButton btnCalcular;
	private JLabel jLabel1;
	private JTextPane panelLabel;
	private JTextField txtAdmicion;

	/**
	 * Auto-generated main method to display this JFrame
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				frmAlturaTransfer inst = new frmAlturaTransfer();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
				inst.setTitle("Altura Transfer");
			}
		});
	}
	
	public frmAlturaTransfer() {
		super();
		initGUI();
	}

	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			{
				txtRecorrido = new JTextField();
				getContentPane().add(txtRecorrido);
				txtRecorrido.setBounds(165, 137, 50, 22);
				txtRecorrido.setText("37.5");
			}
			{
				txtAdmicion = new JTextField();
				getContentPane().add(getTxtAdmicion());
				txtAdmicion.setBounds(166, 166, 49, 22);
				txtAdmicion.setEditable(false);
			}
			{
				panelLabel = new JTextPane();
				getContentPane().add(panelLabel);
				panelLabel.setText("Calcular la altura de admision en base a las rpm");
				panelLabel.setBounds(12, 11, 271, 33);
				panelLabel.setEditable(false);
				panelLabel.setBackground(Color.lightGray);
			}
			{
				jLabel1 = new JLabel();
				getContentPane().add(jLabel1);
				jLabel1.setText("Recorrido");
				jLabel1.setBounds(12, 140, 124, 15);
			}
			{
				jLabel2 = new JLabel();
				getContentPane().add(jLabel2);
				jLabel2.setText("Altura Admision");
				jLabel2.setBounds(12, 169, 136, 15);
			}
			{
				btnCalcular = new JButton();
				getContentPane().add(btnCalcular);
				btnCalcular.setText("Calcular");
				btnCalcular.setBounds(12, 206, 272, 22);
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
				jLabel3.setBounds(12, 58, 84, 15);
			}
			{
				txtEstado = new JLabel();
				getContentPane().add(txtEstado);
				txtEstado.setBounds(90, 55, 182, 20);
			}
			{
				txtRevoluciones = new JTextField();
				getContentPane().add(txtRevoluciones);
				txtRevoluciones.setText("7000");
				txtRevoluciones.setBounds(165, 107, 50, 22);
			}
			{
				jLabel4 = new JLabel();
				getContentPane().add(jLabel4);
				jLabel4.setText("RPM Optimizar");
				jLabel4.setBounds(12, 111, 141, 15);
			}
			{
				jLabel5 = new JLabel();
				getContentPane().add(jLabel5);
				jLabel5.setText("rpm");
				jLabel5.setBounds(216, 110, 60, 15);
			}
			{
				jLabel6 = new JLabel();
				getContentPane().add(jLabel6);
				jLabel6.setText("mm");
				jLabel6.setBounds(216, 140, 37, 15);
			}
			{
				jLabel7 = new JLabel();
				getContentPane().add(jLabel7);
				jLabel7.setText("mm");
				jLabel7.setBounds(216, 169, 30, 15);
			}
			pack();
			this.setSize(299, 269);
		} catch (Exception e) {
			// add your error handling code here
			e.printStackTrace();
		}
	}

	public JTextField getTxtAdmicion() {
		return txtAdmicion;
	}

	private void calcular() {
		txtEstado.setText("Calculando...");
		DecimalFormat formateador = new DecimalFormat("####.##");

		double recorrido = 0.0;
		double admision = 0.0;
		double rpm = 0.0;

		txtEstado.setText("Listo!");

		try {
			rpm = Double.parseDouble(txtRevoluciones.getText());
			recorrido = Double.parseDouble(txtRecorrido.getText());
		} catch (NumberFormatException e2) {
			txtEstado.setText("No es un numero valido.");
		}

		admision = (30000 - rpm) / 1000;
		admision = (admision * recorrido) / 100;

		txtAdmicion.setText(formateador.format(admision) + "");

	}

}
