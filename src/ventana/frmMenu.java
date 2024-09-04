package ventana;
import java.awt.BorderLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.*;

import yeis.frmYeisBotella;


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
public class frmMenu extends javax.swing.JFrame {

	private JMenuItem helpMenuItem;
	private JMenu jMenu5;
	private JMenuItem rpmBotella;
	private JMenuItem largoMangeraBotella;
	private JMenuItem volumenBotella;
	private JMenu menuYeis;
	private JMenuItem tiempoSuperficie;
	private JMenuItem alturaTransfer;
	private JMenu menuCilindro;
	private JLabel jLabel1;
	private JMenuItem tapaCilindro;
	private JMenuItem relacionCompresion;
	private JMenu compresion;
	private JMenuItem deleteMenuItem;
	private JMenuItem btnFlapper;
	private JMenuItem btnCarburador;
	private JMenuItem btnCilindrada;
	private JMenu jMenu4;
	private JMenuItem exitMenuItem;
	private JSeparator jSeparator2;
	private JMenu jMenu3;
	private JMenuBar jMenuBar1;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				String nombre = "Garale";
				String version = "1.1";
				
				frmMenu inst = new frmMenu();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
				inst.setExtendedState(inst.MAXIMIZED_BOTH);
				inst.setTitle(nombre+" "+version +" "+ " - Menu Principal");
				inst.setDefaultCloseOperation(inst.EXIT_ON_CLOSE);
				
			}
		});
	}
	
	public frmMenu() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			{
			}
			getContentPane().setLayout(null);
			{
				jLabel1 = new JLabel();
				getContentPane().add(jLabel1);
				jLabel1.setText("Alejandro Garcia Competicion");
				jLabel1.setBounds(4, 12, 222, 15);
			}
			setSize(400, 300);
			{
				jMenuBar1 = new JMenuBar();
				setJMenuBar(jMenuBar1);
				{
					jMenu3 = new JMenu();
					jMenuBar1.add(jMenu3);
					jMenu3.setText("Archivo");
					{
						jSeparator2 = new JSeparator();
						jMenu3.add(jSeparator2);
					}
					{
						exitMenuItem = new JMenuItem();
						jMenu3.add(exitMenuItem);
						exitMenuItem.setText("Salir");
						exitMenuItem.addActionListener(new ActionListener() {
							
							@Override
							public void actionPerformed(ActionEvent e) {
								dispose();
							}
						});
					}
				}
				{
					jMenu4 = new JMenu();
					jMenuBar1.add(jMenu4);
					jMenu4.setText("Calcular");
					{
						deleteMenuItem = new JMenuItem();
						jMenu4.add(deleteMenuItem);
						deleteMenuItem.setText("Escape");
						deleteMenuItem.addActionListener(new ActionListener() {
							
							@Override
							public void actionPerformed(ActionEvent arg0) {
								// ubicacion = System.getProperty("user.dir")+"/src/ventana/javapipe.jar";
								/*String ubicacion = "/home/alejandro/Documentos/2t/javapipe.jar";
												
								try {
									Process p = Runtime.getRuntime().exec("java -jar "+ubicacion);
								} catch (IOException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}*/
								frmEscape.main(null);
							}
						});
					}
					{
						btnCilindrada = new JMenuItem();
						jMenu4.add(btnCilindrada);
						btnCilindrada.setText("Cilindrada");
						btnCilindrada.addActionListener(new ActionListener() {
							
							@Override
							public void actionPerformed(ActionEvent arg0) {
								frmCilindrada.main(null);
							}
						});
					}
					{
						btnCarburador = new JMenuItem();
						jMenu4.add(btnCarburador);
						btnCarburador.setText("Carburador");
						btnCarburador.addActionListener(new ActionListener() {
							
							@Override
							public void actionPerformed(ActionEvent arg0) {
								frmCarburador.main(null);
							}
						});
					}
					{
						btnFlapper = new JMenuItem();
						jMenu4.add(btnFlapper);
						btnFlapper.setText("Flapper");
						btnFlapper.addActionListener(new ActionListener() {
							
							@Override
							public void actionPerformed(ActionEvent arg0) {
								frmFlapper.main(null);
							}
						});
					}
					{
						compresion = new JMenu();
						jMenu4.add(compresion);
						compresion.setText("Compresion");
						{
							relacionCompresion = new JMenuItem();
							compresion.add(relacionCompresion);
							relacionCompresion.setText("Relacion Compresion");
							relacionCompresion.addActionListener(new ActionListener() {
								
								@Override
								public void actionPerformed(ActionEvent arg0) {
									frmCompresion.main(null);
								}
							});
						}
						{
							tapaCilindro = new JMenuItem();
							compresion.add(tapaCilindro);
							tapaCilindro.setText("Rebajar Tapa de Cilindro");
							tapaCilindro.addActionListener(new ActionListener() {
								
								@Override
								public void actionPerformed(ActionEvent arg0) {
									frmTapaCilindro.main(null);
								}
							});
						}
					}
					{
						menuCilindro = new JMenu();
						jMenu4.add(menuCilindro);
						menuCilindro.setText("Cilindro");
						{
							alturaTransfer = new JMenuItem();
							menuCilindro.add(alturaTransfer);
							alturaTransfer.setText("Altura de Transfer");
							alturaTransfer.addActionListener(new ActionListener() {
								
								@Override
								public void actionPerformed(ActionEvent arg0) {
									frmAlturaTransfer.main(null);
								}
							});
						}
						{
							tiempoSuperficie = new JMenuItem();
							menuCilindro.add(tiempoSuperficie);
							tiempoSuperficie.setText("Tiempo Superficie");
							tiempoSuperficie.addActionListener(new ActionListener() {
								
								@Override
								public void actionPerformed(ActionEvent arg0) {
									frmTiempoSuperficie.main(null);
								}
							});
						}
					}
					{
						menuYeis = new JMenu();
						jMenu4.add(menuYeis);
						menuYeis.setText("Yeis");
						{
							volumenBotella = new JMenuItem();
							menuYeis.add(volumenBotella);
							volumenBotella.setText("Volumen de la Botella");
							volumenBotella.addActionListener(new ActionListener() {
								
								@Override
								public void actionPerformed(ActionEvent arg0) {
									frmYeisBotella.main(null);
								}
							});
						}
						{
							rpmBotella = new JMenuItem();
							menuYeis.add(rpmBotella);
							rpmBotella.setText("RPM a la que funciona");
						}
						{
							largoMangeraBotella = new JMenuItem();
							menuYeis.add(largoMangeraBotella);
							largoMangeraBotella.setText("Largo de mangera");
						}
					}
				}
				{
					jMenu5 = new JMenu();
					jMenuBar1.add(jMenu5);
					jMenu5.setText("Ayuda");
					{
						helpMenuItem = new JMenuItem();
						jMenu5.add(helpMenuItem);
						helpMenuItem.setText("Acerca de..");
						helpMenuItem.addActionListener(new ActionListener() {
							
							@Override
							public void actionPerformed(ActionEvent arg0) {
								frmAcercaDe.main(null);
							}
						});
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
