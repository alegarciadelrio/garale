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
public class frmFlapper extends javax.swing.JFrame {
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JLabel jLabel5;
	private JLabel jLabel1;
	private JTextField txtDiametro;
	private JLabel txtEstado;
	private JButton btnCalcular;
	private JTextPane panelLabel;
	private JTextField txtAreaFlapper;

	/**
	 * Auto-generated main method to display this JFrame
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				frmFlapper inst = new frmFlapper();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
				inst.setTitle("Calcular Flapper");
				inst.setResizable(false);
			}
		});
	}

	public frmFlapper() {
		super();
		initGUI();
	}

	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			{
				txtAreaFlapper = new JTextField();
				getContentPane().add(getTxtAreaFlapper());
				txtAreaFlapper.setBounds(196, 114, 50, 22);
				txtAreaFlapper.setEditable(false);
			}
			{
				panelLabel = new JTextPane();
				getContentPane().add(panelLabel);
				panelLabel
						.setText("Calcular area del flaper en base al diametro del carburador.");
				panelLabel.setBounds(12, 11, 271, 33);
				panelLabel.setEditable(false);
				panelLabel.setBackground(Color.lightGray);
			}
			{
				jLabel2 = new JLabel();
				getContentPane().add(jLabel2);
				jLabel2.setText("Area del Flapper");
				jLabel2.setBounds(12, 117, 172, 15);
			}
			{
				btnCalcular = new JButton();
				getContentPane().add(btnCalcular);
				btnCalcular.setText("Calcular");
				btnCalcular.setBounds(12, 148, 272, 22);
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
				txtDiametro = new JTextField();
				getContentPane().add(txtDiametro);
				txtDiametro.setText("16");
				txtDiametro.setBounds(196, 84, 29, 22);
			}
			{
				jLabel4 = new JLabel();
				getContentPane().add(jLabel4);
				jLabel4.setText("Diametro del Carburador");
				jLabel4.setBounds(12, 87, 192, 15);
			}
			{
				jLabel5 = new JLabel();
				getContentPane().add(jLabel5);
				jLabel5.setText("mm");
				jLabel5.setBounds(225, 87, 60, 15);
			}
			{
				jLabel1 = new JLabel();
				getContentPane().add(jLabel1);
				jLabel1.setText("mm3");
				jLabel1.setBounds(248, 117, 46, 15);
			}
			pack();
			this.setSize(304, 211);
		} catch (Exception e) {
			// add your error handling code here
			e.printStackTrace();
		}
	}

	public JTextField getTxtAreaFlapper() {
		return txtAreaFlapper;
	}

	private void calcular() {
		txtEstado.setText("Calculando...");
		DecimalFormat formateador = new DecimalFormat("####.##");

		double diametro = 0.0;
		double radio = 0.0;
		double areaCarburador = 0.0;
		double areaFlaper = 0.0;
		double pi = Math.PI;

		txtEstado.setText("Listo!");

		try {
			diametro = Double.parseDouble(txtDiametro.getText());
		} catch (NumberFormatException e2) {
			txtEstado.setText("No es un numero valido.");
		}

		radio = diametro / 2;

		areaCarburador = pi * (Math.pow(radio, 2));
		areaFlaper = areaCarburador*0.90;

		txtAreaFlapper.setText(formateador.format(areaFlaper) + "");

	}

}
