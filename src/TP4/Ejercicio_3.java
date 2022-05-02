package TP4;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio_3 extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup btngSop = new ButtonGroup();
	private JTextField txtHoras;
	private JButton btnAceptar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio_3 frame = new Ejercicio_3();
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
	public Ejercicio_3() {
		setTitle("Seleccion Multiple");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 414, 49);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblsistema = new JLabel("Elija un sistema operativo :");
		lblsistema.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblsistema.setBounds(10, 11, 141, 14);
		panel.add(lblsistema);
		
		JRadioButton rdbtnwindows = new JRadioButton("windows");
		btngSop.add(rdbtnwindows);
		rdbtnwindows.setBounds(157, 7, 97, 23);
		panel.add(rdbtnwindows);
		
		JRadioButton rdbtnMac = new JRadioButton("Mac");
		btngSop.add(rdbtnMac);
		rdbtnMac.setBounds(256, 7, 54, 23);
		panel.add(rdbtnMac);
		
		JRadioButton rdbtnLinux = new JRadioButton("Linux");
		btngSop.add(rdbtnLinux);
		rdbtnLinux.setBounds(312, 7, 109, 23);
		panel.add(rdbtnLinux);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 71, 414, 117);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblEspecialidad = new JLabel("Elije una especialidad :");
		lblEspecialidad.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEspecialidad.setBounds(10, 54, 166, 14);
		panel_1.add(lblEspecialidad);
		
		JCheckBox cbxProgramacion = new JCheckBox("Programacion");
		cbxProgramacion.setBounds(243, 19, 97, 23);
		panel_1.add(cbxProgramacion);
		
		JCheckBox cbxAdmin = new JCheckBox("Administracion");
		cbxAdmin.setBounds(243, 50, 97, 23);
		panel_1.add(cbxAdmin);
		
		JCheckBox cbxDiseño = new JCheckBox("Dise\u00F1o grafico");
		cbxDiseño.setBounds(243, 76, 97, 23);
		panel_1.add(cbxDiseño);
		
		JLabel lblhoras = new JLabel("Cantidad de hs en el computador :");
		lblhoras.setBounds(10, 211, 184, 14);
		contentPane.add(lblhoras);
		
		txtHoras = new JTextField();
		txtHoras.setBounds(201, 208, 45, 20);
		contentPane.add(txtHoras);
		txtHoras.setColumns(10);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Seleccion="";
				if(rdbtnwindows.isSelected()) {
					Seleccion+=rdbtnwindows.getText();
					}else if(rdbtnMac.isSelected()) {
					Seleccion+=rdbtnMac.getText();
					}else if(rdbtnLinux.isSelected()){
						Seleccion+=rdbtnLinux.getText();
					}
				if(cbxProgramacion.isSelected()) {
					Seleccion+=" - "+cbxProgramacion.getText()+" - ";
				}
				if(cbxDiseño.isSelected()) {
					Seleccion+=" - "+cbxDiseño.getText()+" - ";
				}
				if(cbxAdmin.isSelected()){
					Seleccion+=" - "+cbxAdmin.getText()+" - ";
				}
				
				Seleccion+=txtHoras.getText()+"Hs";
				
				JOptionPane.showMessageDialog(null, Seleccion);
			}
		});
		btnAceptar.setBounds(335, 227, 89, 23);
		contentPane.add(btnAceptar);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
}
