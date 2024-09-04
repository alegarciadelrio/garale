package ventana;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

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
public class frmCompresion extends javax.swing.JFrame {
	private JPanel jPanel1;
	private JTextField txtVolumenCilindro;
	private JLabel jLabel3;
	private JLabel jLabel5;
	private JLabel jLabel7;
	private JLabel jLabel6;
	private JButton btnCalcular;
	private JTextField txtRelacionCompresion;
	private JLabel jLabel2;
	private JLabel jLabel1;
	private JTextField txtVolumenCamara;

	/**
	 * Auto-generated main method to display this JFrame
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				frmCompresion inst = new frmCompresion();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
				inst.setTitle("Relacion Compresion");
				inst.setResizable(false);
			}
		});
	}

	public frmCompresion() {
		super();
		initGUI();
	}

	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			{
				jPanel1 = new JPanel();
				getContentPane().add(jPanel1, BorderLayout.CENTER);
				jPanel1.setLayout(null);
				jPanel1.setPreferredSize(new java.awt.Dimension(300, 156));
				{
					txtVolumenCilindro = new JTextField();
					jPanel1.add(txtVolumenCilindro);
					txtVolumenCilindro.setBounds(183, 39, 65, 22);
				}
				{
					txtVolumenCamara = new JTextField();
					jPanel1.add(txtVolumenCamara);
					txtVolumenCamara.setBounds(183, 66, 65, 22);
				}
				{
					jLabel1 = new JLabel();
					jPanel1.add(jLabel1);
					jLabel1.setText("Volumen del Cilindro");
					jLabel1.setBounds(12, 42, 175, 15);
				}
				{
					jLabel2 = new JLabel();
					jPanel1.add(jLabel2);
					jLabel2.setText("Volumen de la Camara");
					jLabel2.setBounds(12, 70, 165, 15);
				}
				{
					txtRelacionCompresion = new JTextField();
					jPanel1.add(txtRelacionCompresion);
					txtRelacionCompresion.setBounds(183, 94, 65, 22);
					txtRelacionCompresion.setEditable(false);
				}
				{
					jLabel3 = new JLabel();
					jPanel1.add(jLabel3);
					jLabel3.setText("Relacion Compresion");
					jLabel3.setBounds(12, 98, 188, 15);
				}
				{
					jLabel5 = new JLabel();
					jPanel1.add(jLabel5);
					jLabel5.setText("Introducir los datos en cm3.");
					jLabel5.setBounds(12, 12, 293, 15);
				}
				{
					btnCalcular = new JButton();
					jPanel1.add(btnCalcular);
					btnCalcular.setText("Calcular");
					btnCalcular.setBounds(12, 131, 280, 22);
					btnCalcular.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							DecimalFormat formateador = new DecimalFormat(
									"####.##");

							double vCilindro = 0.0;
							double vCamara = 0.0;
							double rc = 0.0;

							try {
								vCilindro = Double.parseDouble(txtVolumenCilindro
										.getText());
								vCamara = Double.parseDouble(txtVolumenCamara
										.getText());
							} catch (NumberFormatException e2) {
								txtRelacionCompresion
										.setText("No es un numero valido.");
							}

							rc = (vCilindro + vCamara) / vCamara;

							txtRelacionCompresion.setText(formateador.format(rc)
									+ " a 1");

						}
					});
					{
						jLabel6 = new JLabel();
						jPanel1.add(jLabel6);
						jLabel6.setText("cm3");
						jLabel6.setBounds(254, 42, 52, 15);
					}
					{
						jLabel7 = new JLabel();
						jPanel1.add(jLabel7);
						jLabel7.setText("cm3");
						jLabel7.setBounds(254, 69, 57, 15);
					}
				}
				pack();
				this.setSize(313, 186);
			}
		} catch (Exception e) {
			// add your error handling code here
			e.printStackTrace();
		}
	}

}
