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
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class frmCilindrada extends javax.swing.JFrame {
	private JPanel jPanel1;
	private JTextField txtDiametro;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JLabel jLabel5;
	private JLabel jLabel7;
	private JLabel jLabel6;
	private JButton btnCalcular;
	private JTextField txtCilindrada;
	private JLabel jLabel2;
	private JLabel jLabel1;
	private JTextField txtCarrera;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				frmCilindrada inst = new frmCilindrada();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
				inst.setTitle("Cilindrada");
				inst.setResizable(false);
			}
		});
	}
	
	public frmCilindrada() {
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
				jPanel1.setPreferredSize(new java.awt.Dimension(269, 270));
				{
					txtDiametro = new JTextField();
					jPanel1.add(txtDiametro);
					txtDiametro.setBounds(107, 40, 65, 22);
				}
				{
					txtCarrera = new JTextField();
					jPanel1.add(txtCarrera);
					txtCarrera.setBounds(107, 67, 65, 22);
				}
				{
					jLabel1 = new JLabel();
					jPanel1.add(jLabel1);
					jLabel1.setText("Diametro");
					jLabel1.setBounds(12, 42, 83, 15);
				}
				{
					jLabel2 = new JLabel();
					jPanel1.add(jLabel2);
					jLabel2.setText("Carrera");
					jLabel2.setBounds(12, 70, 77, 15);
				}
				{
					txtCilindrada = new JTextField();
					jPanel1.add(txtCilindrada);
					txtCilindrada.setBounds(107, 95, 65, 22);
					txtCilindrada.setEditable(false);
				}
				{
					jLabel3 = new JLabel();
					jPanel1.add(jLabel3);
					jLabel3.setText("Cilindrada");
					jLabel3.setBounds(12, 98, 110, 15);
				}
				{
					jLabel4 = new JLabel();
					jPanel1.add(jLabel4);
					jLabel4.setText("cm3");
					jLabel4.setBounds(177, 99, 74, 15);
				}
				{
					jLabel5 = new JLabel();
					jPanel1.add(jLabel5);
					jLabel5.setText("Introducir los datos en mm.");
					jLabel5.setBounds(12, 12, 293, 15);
				}
				{
					btnCalcular = new JButton();
					jPanel1.add(btnCalcular);
					btnCalcular.setText("Calcular");
					btnCalcular.setBounds(12, 131, 194, 22);
					btnCalcular.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							DecimalFormat formateador = new DecimalFormat("####.##");
							
							
							double carrera = 0.0;
							double diametro = 0.0;
							double radio = 0.0;
							double cilindrada = 0.0;
							double pi = Math.PI;
							
							try {
								carrera = Double.parseDouble(txtCarrera.getText());
								diametro = Double.parseDouble(txtDiametro.getText());
							} catch (NumberFormatException e2) {
								txtCilindrada.setText("No es un numero valido.");
							}
							
							radio = diametro / 2;
							cilindrada = ((carrera * pi)*(radio*radio))/1000;
							
							txtCilindrada.setText(formateador.format(cilindrada)+"");
							
						}
					});
				}
				{
					jLabel6 = new JLabel();
					jPanel1.add(jLabel6);
					jLabel6.setText("mm");
					jLabel6.setBounds(178, 43, 52, 15);
				}
				{
					jLabel7 = new JLabel();
					jPanel1.add(jLabel7);
					jLabel7.setText("mm");
					jLabel7.setBounds(178, 70, 57, 15);
				}
			}
			pack();
			this.setSize(223, 187);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}

}
