package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import entities.Student;
import javax.swing.JTabbedPane;
import java.awt.Toolkit;
import java.time.LocalDate;
import java.time.LocalDateTime;


import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.Icon;
import javax.swing.ImageIcon;

import java.awt.Font;
import java.awt.Image;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.border.BevelBorder;

@SuppressWarnings("serial")
public class SimplePresentationScreen extends JFrame {

	private JPanel contentPane;
	private JPanel tabInformation;
	private JTabbedPane tabbedPane;
	private Student studentData;
	private JTextField txtF_LU;
	private JTextField txtF_Apellido;
	private JTextField txtF_Nombre;
	private JTextField txtF_Email;
	private JTextField txtF_GitHub;
	private JLabel Jlbl_IMG;
	private JTextField txtF_Horario;

	
	public SimplePresentationScreen(Student studentData) {
		setBackground(Color.WHITE);
		setIconImage(Toolkit.getDefaultToolkit().getImage(SimplePresentationScreen.class.getResource("/images/tdp.png")));
		this.studentData = studentData;
		
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setTitle("TdP-DCIC-UNS 2021 :: Pantalla de presentacion");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(625, 265));
		setResizable(false);
		setContentPane(contentPane);
		
		init();
	}
	
	private void init() {
		contentPane.setLayout(null);
		// Tabbed Pane to student personal data
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(5, 5, 403, 192);
		tabInformation = new JPanel();
		tabInformation.setBackground(Color.LIGHT_GRAY);
		tabInformation.setFont(new Font("Tahoma", Font.PLAIN, 11));
		tabInformation.setPreferredSize(new Dimension(425, 275));
		tabbedPane.addTab("Informacion del alumno", null, tabInformation, "Muestra la informacion declarada por el alumno");
		
		JLabel Jlbl_LU = new JLabel("LU");
		Jlbl_LU.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel Jlbl_Apellido = new JLabel("Apellido");
		Jlbl_Apellido.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel Jlbl_Nombre = new JLabel("Nombre");
		Jlbl_Nombre.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel Jlbl_Email = new JLabel("E-mail");
		Jlbl_Email.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		txtF_LU = new JTextField();
		txtF_LU.setBorder(new LineBorder(Color.BLACK));
		txtF_LU.setBackground(Color.WHITE);
		txtF_LU.setEditable(false);
		txtF_LU.setColumns(10);
		txtF_LU.setText(Integer.toString(studentData.getId()));
		
		txtF_Apellido = new JTextField();
		txtF_Apellido.setEditable(false);
		txtF_Apellido.setBorder(new LineBorder(Color.BLACK));
		txtF_Apellido.setBackground(Color.WHITE);
		txtF_Apellido.setColumns(10);
		txtF_Apellido.setText(studentData.getLastName());
		
		txtF_Nombre = new JTextField();
		txtF_Nombre.setEditable(false);
		txtF_Nombre.setBorder(new LineBorder(Color.BLACK));
		txtF_Nombre.setBackground(Color.WHITE);
		txtF_Nombre.setColumns(10);
		txtF_Nombre.setText(studentData.getFirstName());
		
		txtF_Email = new JTextField();
		txtF_Email.setEditable(false);
		txtF_Email.setBorder(new LineBorder(Color.BLACK));
		txtF_Email.setBackground(Color.WHITE);
		txtF_Email.setColumns(10);
		txtF_Email.setText(studentData.getMail());
		
		txtF_GitHub = new JTextField();
		txtF_GitHub.setEditable(false);
		txtF_GitHub.setBorder(new LineBorder(Color.BLACK));
		txtF_GitHub.setBackground(Color.WHITE);
		txtF_GitHub.setColumns(10);
		txtF_GitHub.setText(studentData.getGithubURL());
		
		JLabel Jlbl_Github = new JLabel("Github URL");
		Jlbl_Github.setFont(new Font("Tahoma", Font.BOLD, 11));
		GroupLayout gl_tabInformation = new GroupLayout(tabInformation);
		gl_tabInformation.setHorizontalGroup(
			gl_tabInformation.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tabInformation.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING)
						.addComponent(Jlbl_LU)
						.addComponent(Jlbl_Apellido)
						.addComponent(Jlbl_Nombre)
						.addComponent(Jlbl_Email)
						.addComponent(Jlbl_Github))
					.addGap(20)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING, false)
						.addComponent(txtF_LU, GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
						.addComponent(txtF_Apellido)
						.addComponent(txtF_Nombre)
						.addComponent(txtF_Email)
						.addComponent(txtF_GitHub))
					.addContainerGap(32, Short.MAX_VALUE))
		);
		gl_tabInformation.setVerticalGroup(
			gl_tabInformation.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tabInformation.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING)
						.addComponent(txtF_LU, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(Jlbl_LU))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.BASELINE)
						.addComponent(Jlbl_Apellido)
						.addComponent(txtF_Apellido, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.BASELINE)
						.addComponent(Jlbl_Nombre)
						.addComponent(txtF_Nombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.BASELINE)
						.addComponent(Jlbl_Email)
						.addComponent(txtF_Email, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtF_GitHub, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(Jlbl_Github))
					.addContainerGap(13, Short.MAX_VALUE))
		);
		tabInformation.setLayout(gl_tabInformation);
		contentPane.add(tabbedPane);
		
		Jlbl_IMG = new JLabel("New label");
		Jlbl_IMG.setBounds(418, 28, 181, 169);
		contentPane.add(Jlbl_IMG);
		ImageIcon imgIcon = new
				ImageIcon(getClass().getResource(studentData.getPathPhoto()));
		Image imgEscalada = imgIcon.getImage().getScaledInstance(Jlbl_IMG.getWidth(),
                Jlbl_IMG.getHeight(), Image.SCALE_SMOOTH);
        Icon iconoEscalado = new ImageIcon(imgEscalada);
        Jlbl_IMG.setIcon(iconoEscalado);
        
        txtF_Horario = new JTextField();
        txtF_Horario.setBorder(null);
        txtF_Horario.setBackground(Color.LIGHT_GRAY);
        txtF_Horario.setFont(new Font("Tahoma", Font.BOLD, 11));
        txtF_Horario.setBounds(5, 205, 403, 20);
        contentPane.add(txtF_Horario);
        txtF_Horario.setColumns(10);
        String hora = + LocalDateTime.now().getHour() +":" + LocalDateTime.now().getMinute() + ":" + LocalDateTime.now().getSecond();
        String fecha = LocalDate.now().getDayOfMonth() + "/" + LocalDate.now().getMonthValue() + "/" + LocalDate.now().getYear();
		txtF_Horario.setText("Esta ventada fue generada el "+fecha+" a las: " + hora );
		
        
	}
}
