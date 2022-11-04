package graficos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class consulta extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					consulta frame = new consulta();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * public void setDato(String id,String nombre,String apellido,String sexo,String espe, String interes) {
		Transferencia modelo=general.transferencia;
	}
	 */
	String id,nombre,apellido,sexo,espe,interes;
	
	public consulta() {
		
		
		
		
		setTitle("consultas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 362, 576);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Id:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(54, 75, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblid = new JLabel("New label");
		lblid.setBounds(214, 75, 94, 14);
		contentPane.add(lblid);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(54, 125, 58, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblname = new JLabel("New label");
		lblname.setBounds(214, 125, 94, 14);
		contentPane.add(lblname);
		
		JLabel lblNewLabel_3 = new JLabel("Apellido:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(54, 174, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblape = new JLabel("New label");
		lblape.setBounds(214, 174, 94, 14);
		contentPane.add(lblape);
		
		JLabel lblNewLabel_4 = new JLabel("Sexo:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(54, 228, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblsex = new JLabel("New label");
		lblsex.setBounds(214, 228, 94, 14);
		contentPane.add(lblsex);
		
		JLabel lblNewLabel_5 = new JLabel("Especialidad:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_5.setBounds(54, 284, 68, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblespe = new JLabel("New label");
		lblespe.setBounds(214, 284, 94, 14);
		contentPane.add(lblespe);
		
		JLabel lblNewLabel_6 = new JLabel("Intereses:");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_6.setBounds(54, 341, 68, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblinteres = new JLabel("New label");
		lblinteres.setBounds(214, 341, 94, 14);
		contentPane.add(lblinteres);
		
		JLabel lblNewLabel_7 = new JLabel("Consultar");
		lblNewLabel_7.setFont(new Font("Yu Gothic", Font.BOLD, 17));
		lblNewLabel_7.setBounds(123, 11, 94, 28);
		contentPane.add(lblNewLabel_7);
		
		JButton btnsalir2 = new JButton("Salir");
		btnsalir2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnsalir2.setBounds(247, 503, 89, 23);
		contentPane.add(btnsalir2);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				lblid.setText(id);
				lblname.setText(nombre);
				lblape.setText(apellido);
				lblsex.setText(sexo);
				lblespe.setText(espe);
				lblinteres.setText(interes);
			}
		});
	}

}
