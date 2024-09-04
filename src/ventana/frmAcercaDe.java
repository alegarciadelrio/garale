package ventana;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

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
public class frmAcercaDe extends javax.swing.JFrame {
	private JLabel garale;
	private JTextPane jTextPane1;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				frmAcercaDe inst = new frmAcercaDe();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public frmAcercaDe() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			{
				garale = new JLabel();
				getContentPane().add(garale);
				garale.setText("Garale");
				garale.setBounds(17, 12, 263, 15);
			}
			{
				jTextPane1 = new JTextPane();
				getContentPane().add(jTextPane1);
				jTextPane1.setText("Desarrollado por Alejandro Garcia con la ayuda de ciclosargentinos.mforos.com . Este programa es gratis y el que quiera copiarselo a un amigo no pasa nada. Si ven algun error o tienen algo nuevo que se podria agregar, pasen la formula al correo ale.garciadelrio@gmail.com Un abrazo a todos! Y que vuelen esas maquinas.");
				jTextPane1.setBounds(17, 39, 361, 219);
			}
			pack();
			setSize(400, 300);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}

}
