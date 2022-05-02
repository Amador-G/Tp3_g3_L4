package TP4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;

public class Ejercicio_1 extends JFrame {

	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtTelefono;
	private JTextField txtFeDnac;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio_1 frame = new Ejercicio_1();
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
	public Ejercicio_1() {
		setTitle("Contactos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 404, 380);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		JLabel lblNombre = new JLabel("Nombre :");
		lblNombre.setBounds(30, 33, 112, 14);
		contentPane.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido :");
		lblApellido.setBounds(30, 78, 112, 14);
		contentPane.add(lblApellido);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setBounds(30, 123, 112, 14);
		contentPane.add(lblTelefono);
		
		JLabel lblFeDNac = new JLabel("Fecha de Nacimiento : ");
		lblFeDNac.setBounds(30, 163, 166, 14);
		contentPane.add(lblFeDNac);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(170, 30, 86, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setBounds(170, 75, 86, 20);
		contentPane.add(txtApellido);
		txtApellido.setColumns(10);
		
		txtTelefono = new JTextField();
		txtTelefono.setBounds(170, 120, 86, 20);
		contentPane.add(txtTelefono);
		txtTelefono.setColumns(10);
		
		txtFeDnac = new JTextField();
		txtFeDnac.setBounds(217, 160, 138, 20);
		contentPane.add(txtFeDnac);
		txtFeDnac.setColumns(10);
		
		JLabel lblResultado = new JLabel("");
		lblResultado.setBounds(10, 215, 246, 115);
		contentPane.add(lblResultado);
		
		JButton btnNewButton = new JButton("Mostrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				boolean camposincompletos = false;				
				
				if(txtNombre.getText().isEmpty()) {
					txtNombre.setBackground(Color.RED);
					camposincompletos = true;					
				}
				if(txtApellido.getText().isEmpty()) {
					txtApellido.setBackground(Color.RED);
					camposincompletos = true;					
				}
				if(txtTelefono.getText().isEmpty()) {
					txtTelefono.setBackground(Color.RED);
					camposincompletos = true;					
				}
				if(txtFeDnac.getText().isEmpty()) {
					txtFeDnac.setBackground(Color.RED);
					camposincompletos = true;					
				}
				if(camposincompletos) {
					lblResultado.setText("Debe completar todos los campos!!!intente otra vez");
				
					
				}
				else {
					
				lblResultado.setText("<html><body>Los datos ingresados fueron : <br>Nombre : "+txtNombre.getText()+"<br>Apellido : "+txtApellido.getText()+"<br>Telefono : "+txtTelefono.getText()+"<br>Fecha de Nacimiento : "+txtFeDnac.getText()+"</body></html>");
				for(Object o : contentPane.getComponents()) {//metodo para limpiar los campos
					if(o instanceof JTextField) {
						((JTextField)o).setText(" ");
					}
				} 
				}
			}
		});
		btnNewButton.setBounds(266, 211, 89, 23);
		contentPane.add(btnNewButton);
	}
}
