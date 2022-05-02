package TP4;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JSeparator;
import java.awt.Panel;
import javax.swing.JEditorPane;
import javax.swing.JTable;
import java.awt.GridLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio_2 extends JFrame {

	
	private static final long serialVersionUID = 1L;
	protected static final Container Panel_1 = null;
	private JPanel contentPane;
	private JTextField txtNota2;
	private JTextField txtNota1;
	private JTextField txtNota3;
	private JTextField txtPromedio;
	private JTextField txtCondicion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio_2 frame = new Ejercicio_2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ejercicio_2() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle("Promedio");
		setBounds(100, 100, 514, 473);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setAlignmentY(Component.TOP_ALIGNMENT);
		panel.setAlignmentX(Component.LEFT_ALIGNMENT);
		panel.setBorder(new TitledBorder(null, "Notas del alumno", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Notas del estudiante", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JComboBox cbNotaTp = new JComboBox();
		cbNotaTp.setModel(new DefaultComboBoxModel(new String[] {"--Sin Calificar--", "Aprobado", "Desaprobado"}));
		cbNotaTp.setBounds(120, 140, 106, 22);
		panel.add(cbNotaTp);
		
		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 float n1,n2,n3,prom;
				 String Notatp;
				 n1 = Float.valueOf(txtNota1.getText());
				 n2 = Float.valueOf(txtNota2.getText());
				 n3 = Float.valueOf(txtNota3.getText());
				 prom = (n1+n2+n3)/3;
				 txtPromedio.setText(Float.toString(prom));
				 Notatp = (String) cbNotaTp.getSelectedItem();
				 if(Notatp == "Desaprobado") {
					txtCondicion.setText("LIbre"); 
				 }else if(n1 < 6 || n2<6 || n3<6) {
					txtCondicion.setText("LIbre"); 
				 }else if(n1 >= 8 && n2>=8 && n3>=8 && (Notatp=="Aprobado")) {
					 txtCondicion.setText("Promocionado"); 
				 }else if ((n1>=6||n1<=8) && (n2>=6||n2<=8) && (n3>=6||n3<=8) && (Notatp=="Aprobado")) {
					 txtCondicion.setText("Regular");
					 }	 
						 
			}
		});
		
		JButton btnNuevo = new JButton("NUEVO");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(Object o : panel_1.getComponents()) {//metodo para limpiar los campos
					if(o instanceof JTextField) {
						((JTextField)o).setText(" ");
					}
				} 
				for(Object o : panel.getComponents()) {//metodo para limpiar los campos
					if(o instanceof JTextField) {
						((JTextField)o).setText(" ");
					}
				} 
				cbNotaTp.setSelectedIndex(0);
			}
		});
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				 
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(panel_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
						.addComponent(panel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnCalcular, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNuevo, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnSalir, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 225, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(89)
					.addComponent(btnCalcular, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addGap(27)
					.addComponent(btnNuevo, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addGap(27)
					.addComponent(btnSalir, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(170, Short.MAX_VALUE))
		);
		panel_1.setLayout(null);
		
		JLabel lblPromedio = new JLabel("Promedio : ");
		lblPromedio.setBounds(36, 56, 63, 14);
		panel_1.add(lblPromedio);
		
		JLabel lblCondicion = new JLabel("Condici\u00F3n :");
		lblCondicion.setBounds(36, 96, 63, 14);
		panel_1.add(lblCondicion);
		
		txtPromedio = new JTextField();
		txtPromedio.setBounds(122, 53, 86, 20);
		panel_1.add(txtPromedio);
		txtPromedio.setColumns(10);
		
		txtCondicion = new JTextField();
		txtCondicion.setBounds(122, 93, 86, 20);
		panel_1.add(txtCondicion);
		txtCondicion.setColumns(10);
		panel.setLayout(null);
		
		txtNota1 = new JTextField();
		txtNota1.setBounds(120, 21, 86, 20);
		panel.add(txtNota1);
		txtNota1.setColumns(10);
		
		JLabel lblNota1 = new JLabel("Nota 1 :");
		lblNota1.setBounds(49, 24, 46, 14);
		panel.add(lblNota1);
		
		txtNota2 = new JTextField();
		txtNota2.setBounds(120, 62, 86, 20);
		panel.add(txtNota2);
		txtNota2.setColumns(10);
		
		txtNota3 = new JTextField();
		txtNota3.setColumns(10);
		txtNota3.setBounds(120, 102, 86, 20);
		panel.add(txtNota3);
		
		JLabel lblNota2 = new JLabel("Nota 2 :");
		lblNota2.setBounds(49, 65, 46, 14);
		panel.add(lblNota2);
		
		JLabel lblNota3 = new JLabel("Nota 3 :");
		lblNota3.setBounds(49, 105, 46, 14);
		panel.add(lblNota3);
		
		JLabel lblTp = new JLabel("TP :");
		lblTp.setAutoscrolls(true);
		lblTp.setBounds(49, 144, 46, 14);
		panel.add(lblTp);
		contentPane.setLayout(gl_contentPane);
	}
	
	}

