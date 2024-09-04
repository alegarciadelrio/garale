package ventana;

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
public class frmEscape extends javax.swing.JFrame {
	private JTextField txtEscape;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JLabel jLabel5;
	private JLabel jLabel18;
	private JLabel jLabel17;
	private JLabel jLabel16;
	private JLabel jLabel15;
	private JLabel jLabel10;
	private JLabel jLabel2;
	private JLabel jLabel14;
	private JTextField txtArea;
	private JTextField txtLT;
	private JTextPane txtInfo;
	private JPanel info;
	private JLabel jLabel20;
	private JLabel jLabel21;
	private JLabel imagen;
	private JLabel jLabel25;
	private JTextField txtFactorBajada;
	private JLabel jLabel24;
	private JTextField txtAngulo2;
	private JLabel jLabel23;
	private JLabel jLabel22;
	private JTextField txtDe;
	private JTextField txtL7;
	private JTextField txtL6;
	private JTextField txtL5;
	private JTextField txtL4;
	private JLabel jLabel12;
	private JLabel jLabel11;
	private JPanel Medidas;
	private JTabbedPane tablaPanel;
	private JTextField txtL3;
	private JTextField txtL2;
	private JTextField txtL1;
	private JTextField txtD3;
	private JTextField txtD2;
	private JTextField txtD1;
	private JLabel jLabel19;
	private JLabel jLabel13;
	private JLabel jLabel9;
	private JTextField txtAngulo;
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
				frmEscape inst = new frmEscape();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
				inst.setTitle("Calcular Escape");
				inst.setResizable(false);
			}
		});
	}

	public frmEscape() {
		super();
		initGUI();
	}

	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			{
				txtEscape = new JTextField();
				getContentPane().add(txtEscape);
				txtEscape.setBounds(219, 374, 50, 22);
				txtEscape.setText("172");
			}
			{
				jLabel1 = new JLabel();
				getContentPane().add(jLabel1);
				jLabel1.setText("Grados de Escape");
				jLabel1.setBounds(12, 381, 172, 15);
			}
			{
				btnCalcular = new JButton();
				getContentPane().add(btnCalcular);
				btnCalcular.setText("Calcular");
				btnCalcular.setBounds(12, 474, 294, 22);
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
				txtRevoluciones.setText("8500");
				txtRevoluciones.setBounds(219, 344, 50, 22);
				txtRevoluciones.setToolTipText("Rpm a las que optimizamos el motor.");
			}
			{
				jLabel4 = new JLabel();
				getContentPane().add(jLabel4);
				jLabel4.setText("RPM Optimizar");
				jLabel4.setBounds(12, 349, 141, 15);
			}
			{
				jLabel5 = new JLabel();
				getContentPane().add(jLabel5);
				jLabel5.setText("rpm");
				jLabel5.setBounds(270, 347, 60, 15);
			}
			{
				jLabel6 = new JLabel();
				getContentPane().add(jLabel6);
				jLabel6.setText("Calcular Escape");
				jLabel6.setBounds(12, 17, 301, 15);
			}
			{
				jLabel7 = new JLabel();
				getContentPane().add(jLabel7);
				jLabel7.setText("1er Angulo de Divergencia");
				jLabel7.setBounds(12, 285, 201, 15);
			}
			{
				jLabel8 = new JLabel();
				getContentPane().add(jLabel8);
				jLabel8.setText("º");
				jLabel8.setBounds(269, 377, 61, 15);
			}
			{
				txtAngulo = new JTextField();
				getContentPane().add(txtAngulo);
				txtAngulo.setBounds(219, 282, 50, 22);
				txtAngulo.setText("7.5");
			}
			{
				jLabel9 = new JLabel();
				getContentPane().add(jLabel9);
				jLabel9.setText("º");
				jLabel9.setBounds(271, 285, 64, 15);
			}
			{
				jLabel13 = new JLabel();
				getContentPane().add(jLabel13);
				jLabel13.setText("Area de Lumbrera de Escape");
				jLabel13.setBounds(12, 411, 209, 15);
			}
			{
				txtArea = new JTextField();
				getContentPane().add(txtArea);
				txtArea.setText("345");
				txtArea.setBounds(219, 407, 50, 22);
			}
			{
				jLabel14 = new JLabel();
				getContentPane().add(jLabel14);
				jLabel14.setText("mm2");
				jLabel14.setBounds(269, 413, 52, 15);
			}
			{
				tablaPanel = new JTabbedPane();
				getContentPane().add(tablaPanel);
				tablaPanel.setBounds(353, 285, 286, 179);
				{
					Medidas = new JPanel();
					tablaPanel.addTab("Medidas", null, Medidas, null);
					Medidas.setLayout(null);
					Medidas.setPreferredSize(new java.awt.Dimension(287, 152));
					{
						txtLT = new JTextField();
						Medidas.add(txtLT);
						txtLT.setBounds(215, 82, 55, 22);
					}
					{
						txtD3 = new JTextField();
						Medidas.add(txtD3);
						txtD3.setBounds(39, 58, 43, 24);
					}
					{
						txtD2 = new JTextField();
						Medidas.add(txtD2);
						txtD2.setBounds(39, 34, 43, 24);
					}
					{
						txtD1 = new JTextField();
						Medidas.add(txtD1);
						txtD1.setBounds(39, 10, 43, 24);
					}
					{
						jLabel19 = new JLabel();
						Medidas.add(jLabel19);
						jLabel19.setText("LT:");
						jLabel19.setBounds(193, 86, 35, 15);
					}
					{
						jLabel15 = new JLabel();
						Medidas.add(jLabel15);
						jLabel15.setText("D3:");
						jLabel15.setBounds(12, 61, 43, 15);
					}
					{
						jLabel10 = new JLabel();
						Medidas.add(jLabel10);
						jLabel10.setText("D2:");
						jLabel10.setBounds(12, 37, 35, 15);
					}
					{
						jLabel2 = new JLabel();
						Medidas.add(jLabel2);
						jLabel2.setText("D1:");
						jLabel2.setBounds(12, 13, 34, 15);
					}
					{
						txtL3 = new JTextField();
						Medidas.add(txtL3);
						txtL3.setBounds(127, 58, 55, 22);
					}
					{
						txtL2 = new JTextField();
						Medidas.add(txtL2);
						txtL2.setBounds(127, 34, 55, 22);
					}
					{
						txtL1 = new JTextField();
						Medidas.add(txtL1);
						txtL1.setBounds(127, 10, 55, 22);
					}
					{
						jLabel18 = new JLabel();
						Medidas.add(jLabel18);
						jLabel18.setText("L3:");
						jLabel18.setBounds(107, 60, 30, 15);
					}
					{
						jLabel17 = new JLabel();
						Medidas.add(jLabel17);
						jLabel17.setText("L2:");
						jLabel17.setBounds(107, 36, 28, 15);
					}
					{
						jLabel16 = new JLabel();
						Medidas.add(jLabel16);
						jLabel16.setText("L1:");
						jLabel16.setBounds(107, 12, 25, 15);
					}
					{
						jLabel11 = new JLabel();
						Medidas.add(jLabel11);
						jLabel11.setText("L4:");
						jLabel11.setBounds(107, 84, 36, 15);
					}
					{
						jLabel12 = new JLabel();
						Medidas.add(jLabel12);
						jLabel12.setText("L5:");
						jLabel12.setBounds(192, 15, 36, 15);
					}
					{
						jLabel20 = new JLabel();
						Medidas.add(jLabel20);
						jLabel20.setText("L6:");
						jLabel20.setBounds(192, 39, 30, 15);
					}
					{
						jLabel21 = new JLabel();
						Medidas.add(jLabel21);
						jLabel21.setText("L7:");
						jLabel21.setBounds(192, 63, 41, 15);
					}
					{
						txtL4 = new JTextField();
						Medidas.add(txtL4);
						txtL4.setBounds(127, 82, 55, 22);
					}
					{
						txtL5 = new JTextField();
						Medidas.add(txtL5);
						txtL5.setBounds(215, 10, 55, 22);
					}
					{
						txtL6 = new JTextField();
						Medidas.add(txtL6);
						txtL6.setBounds(215, 34, 55, 22);
					}
					{
						txtL7 = new JTextField();
						Medidas.add(txtL7);
						txtL7.setBounds(215, 58, 55, 22);
					}
					{
						txtDe = new JTextField();
						Medidas.add(txtDe);
						txtDe.setBounds(39, 83, 43, 24);
					}
					{
						jLabel22 = new JLabel();
						Medidas.add(jLabel22);
						jLabel22.setText("De:");
						jLabel22.setBounds(12, 86, 34, 15);
					}
				}
				{
					info = new JPanel();
					tablaPanel.addTab("Informacion", null, info, null);
					info.setLayout(null);
					{
						txtInfo = new JTextPane();
						info.add(txtInfo);
						txtInfo.setText("Las medidas brindadas por el sistema son para un caño de escape de 2 conos con un descanso. Estan en mm.");
						txtInfo.setBounds(8, 6, 223, 100);
					}
				}
			}
			{
				jLabel23 = new JLabel();
				getContentPane().add(jLabel23);
				jLabel23.setText("2do Angulo de Divergencia");
				jLabel23.setBounds(12, 318, 201, 15);
			}
			{
				txtAngulo2 = new JTextField();
				getContentPane().add(txtAngulo2);
				txtAngulo2.setText("7.5");
				txtAngulo2.setBounds(219, 315, 50, 22);
			}
			{
				jLabel24 = new JLabel();
				getContentPane().add(jLabel24);
				jLabel24.setText("º");
				jLabel24.setBounds(271, 318, 44, 15);
			}
			{
				txtFactorBajada = new JTextField();
				getContentPane().add(txtFactorBajada);
				txtFactorBajada.setText("9");
				txtFactorBajada.setBounds(219, 440, 50, 22);
				txtFactorBajada.setToolTipText("Este define el largo de la bajada, es entre 6 y 12.");
			}
			{
				jLabel25 = new JLabel();
				getContentPane().add(jLabel25);
				jLabel25.setText("Factor de la bajada del caño");
				jLabel25.setBounds(14, 443, 211, 15);
			}
			{
				//ImageIcon icono = new ImageIcon(System.getProperty("user.dir")+"//src//img//canio.jpg");
				ImageIcon icono = new ImageIcon(getClass().getResource("/img/canio.jpg"));
				imagen = new JLabel(icono);
				getContentPane().add(imagen);
				imagen.setBounds(12, 74, 623, 188);
			}
			pack();
			this.setSize(657, 535);
		} catch (Exception e) {
			// add your error handling code here
			e.printStackTrace();
		}
	}

	private void calcular() {
		txtEstado.setText("Calculando...");
		DecimalFormat formateador = new DecimalFormat("####.##");

		// Parametros
		double angulo = 0.0;
		double angulo2 = 0.0;
		double areaEscape = 0.0;
		double rpm = 0.0;
		double escape = 0.0;
		double pi = Math.PI;
		double factorBajada = 0.0;

		// Calculos
		double cotA1 = 0.0;
		double cotA2 = 0.0;
		double De = 0.0;
		double D1 = 0.0;
		double D2 = 0.0;
		double D3 = 0.0;

		double L1 = 0.0;
		double L2 = 0.0;
		double L3 = 0.0;
		double L4 = 0.0;
		double L5 = 0.0;
		double L6 = 0.0;
		double L7 = 0.0;
		double Lt = 0.0;

		txtEstado.setText("Listo!");

		try {
			angulo = Double.parseDouble(txtAngulo.getText());
			angulo2 = Double.parseDouble(txtAngulo2.getText());
			areaEscape = Double.parseDouble(txtArea.getText());
			rpm = Double.parseDouble(txtRevoluciones.getText());
			escape = Double.parseDouble(txtEscape.getText());
			factorBajada = Double.parseDouble(txtFactorBajada.getText());
		} catch (NumberFormatException e2) {
			txtEstado.setText("No es un numero valido.");
		}

		Lt = (escape * 1700) / rpm;
		Lt = this.milimetro(Lt);
		cotA1 = (1 / Math.tan(Math.toRadians(angulo)));
		cotA2 = (1 / Math.tan(Math.toRadians(angulo2)));

		De = Math.sqrt(areaEscape / pi) * 2;
		D1 = De * 1.3;
		D2 = Math.sqrt(Math.pow(D1, 2) * 6.25);
		D3 = D1 * 0.62;

		L2 = (D2 / 2) * (cotA2);
		L1 = Lt - (L2 / 2);
		L3 = D1 * factorBajada;
		L4 = ((D2 - D1) / 2) * (cotA1 * 2);
		L5 = L1 - (L3 + L4);
		L6 = ((D2 - D3) / 2) * (cotA2);
		L7 = D3 * 12;

		txtDe.setText(formateador.format(De) + "");
		txtD1.setText(formateador.format(D1) + "");
		txtD2.setText(formateador.format(D2) + "");
		txtD3.setText(formateador.format(D3) + "");

		txtL1.setText(formateador.format(L1) + "");
		txtL2.setText(formateador.format(L2) + "");
		txtL3.setText(formateador.format(L3) + "");
		txtL4.setText(formateador.format(L4) + "");
		txtL5.setText(formateador.format(L5) + "");
		txtL6.setText(formateador.format(L6) + "");
		txtL7.setText(formateador.format(L7) + "");

		txtLT.setText(formateador.format(Lt) + "");

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
