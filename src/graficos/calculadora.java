package graficos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField txtPantalla;
	private JButton btnSuma;
	private JButton btn3;
	private JButton btn2;
	private JButton btn1;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btnMenos;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btnMulti;
	private JButton btnPunto;
	private JButton btn0;
	private JButton btnIgual;
	private JButton btnDivicion;
	//variables
			double num1;
			double num2;
			double total;
			String operacion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculadora frame = new calculadora();
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
	public calculadora() {
		setTitle("calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 280, 354);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		txtPantalla = new JTextField();
		txtPantalla.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtPantalla.setHorizontalAlignment(SwingConstants.CENTER);
		txtPantalla.setBounds(10, 11, 234, 33);
		contentPane.add(txtPantalla);
		txtPantalla.setColumns(10);
		
		JButton btnLimpiar = new JButton("C");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtPantalla.setText("");
			}
		});
		btnLimpiar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnLimpiar.setBounds(193, 55, 51, 40);
		contentPane.add(btnLimpiar);
		
		btnSuma = new JButton("+");
		btnSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(txtPantalla.getText());
				txtPantalla.setText("");
				operacion="+";
			}
		});
		btnSuma.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSuma.setBounds(193, 106, 51, 40);
		contentPane.add(btnSuma);
		
		btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Inum = txtPantalla.getText()+btn3.getText();
				txtPantalla.setText(Inum);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn3.setBounds(132, 106, 51, 40);
		contentPane.add(btn3);
		
		btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Inum = txtPantalla.getText()+btn2.getText();
				txtPantalla.setText(Inum);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn2.setBounds(71, 106, 51, 40);
		contentPane.add(btn2);
		
		btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Inum = txtPantalla.getText()+btn1.getText();
				txtPantalla.setText(Inum);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn1.setBounds(10, 106, 51, 40);
		contentPane.add(btn1);
		
		btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Inum = txtPantalla.getText()+btn4.getText();
				txtPantalla.setText(Inum);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn4.setBounds(10, 157, 51, 40);
		contentPane.add(btn4);
		
		btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Inum = txtPantalla.getText()+btn5.getText();
				txtPantalla.setText(Inum);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn5.setBounds(71, 157, 51, 40);
		contentPane.add(btn5);
		
		btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Inum = txtPantalla.getText()+btn6.getText();
				txtPantalla.setText(Inum);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn6.setBounds(132, 157, 51, 40);
		contentPane.add(btn6);
		
		btnMenos = new JButton("-");
		btnMenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(txtPantalla.getText());
				txtPantalla.setText("");
				operacion="-";
			}
		});
		btnMenos.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnMenos.setBounds(193, 157, 51, 40);
		contentPane.add(btnMenos);
		
		btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Inum = txtPantalla.getText()+btn7.getText();
				txtPantalla.setText(Inum);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn7.setBounds(10, 210, 51, 40);
		contentPane.add(btn7);
		
		btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Inum = txtPantalla.getText()+btn8.getText();
				txtPantalla.setText(Inum);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn8.setBounds(71, 210, 51, 40);
		contentPane.add(btn8);
		
		btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Inum = txtPantalla.getText()+btn9.getText();
				txtPantalla.setText(Inum);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn9.setBounds(132, 210, 51, 40);
		contentPane.add(btn9);
		
		btnMulti = new JButton("x");
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(txtPantalla.getText());
				txtPantalla.setText("");
				operacion="*";
			}
		});
		btnMulti.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnMulti.setBounds(193, 210, 51, 40);
		contentPane.add(btnMulti);
		
		btnPunto = new JButton(".");
		btnPunto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Inum = txtPantalla.getText()+btnPunto.getText();
				txtPantalla.setText(Inum);
			}
		});
		btnPunto.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnPunto.setBounds(10, 264, 51, 40);
		contentPane.add(btnPunto);
		
		btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Inum = txtPantalla.getText()+btn0.getText();
				txtPantalla.setText(Inum);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn0.setBounds(71, 264, 51, 40);
		contentPane.add(btn0);
		
		btnIgual = new JButton("=");
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String select;
				num2=Double.parseDouble(txtPantalla.getText());
				if (operacion=="+") {
					total=num1+num2;
					select=String.format("%.2f", total);
					txtPantalla.setText(select);
				}
				else if (operacion=="-") {
					total=num1-num2;
					select=String.format("%.2f", total);
					txtPantalla.setText(select);
				}
				else if (operacion=="*") {
					total=num1*num2;
					select=String.format("%.2f", total);
					txtPantalla.setText(select);
				}
				else if (operacion=="/") {
					total=num1/num2;
					select=String.format("%.2f", total);
					txtPantalla.setText(select);
				}
			}
		});
		btnIgual.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnIgual.setBounds(132, 264, 51, 40);
		contentPane.add(btnIgual);
		
		btnDivicion = new JButton("/");
		btnDivicion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(txtPantalla.getText());
				txtPantalla.setText("");
				operacion="/";
			}
		});
		btnDivicion.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnDivicion.setBounds(193, 264, 51, 40);
		contentPane.add(btnDivicion);
	}
}
