package graficos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.ButtonGroup;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class aplicacion extends JFrame {

	private JPanel contentPane;
	private JTextField txtid;
	private JTextField txtname;
	private JTextField txtape;
	private final ButtonGroup grupo = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					aplicacion frame = new aplicacion();
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
	public aplicacion() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				/**grupo.add(rbman);
				grupo.add(rbwoman);*/
			}
		});
		setTitle("Personal App");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 362, 576);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registro de Usuarios");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(89, 11, 168, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		lblNewLabel_1.setFont(new Font("Yu Gothic", Font.BOLD, 12));
		lblNewLabel_1.setBounds(10, 128, 56, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Apellido:");
		lblNewLabel_1_1.setFont(new Font("Yu Gothic", Font.BOLD, 12));
		lblNewLabel_1_1.setBounds(10, 166, 56, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Especialidad:");
		lblNewLabel_1_2.setFont(new Font("Yu Gothic", Font.BOLD, 12));
		lblNewLabel_1_2.setBounds(10, 256, 82, 20);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Sexo:");
		lblNewLabel_1_3.setFont(new Font("Yu Gothic", Font.BOLD, 12));
		lblNewLabel_1_3.setBounds(10, 212, 56, 20);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Id:");
		lblNewLabel_1_3_1.setFont(new Font("Yu Gothic", Font.BOLD, 12));
		lblNewLabel_1_3_1.setBounds(10, 82, 56, 20);
		contentPane.add(lblNewLabel_1_3_1);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Intereses:");
		lblNewLabel_1_2_1.setFont(new Font("Yu Gothic", Font.BOLD, 12));
		lblNewLabel_1_2_1.setBounds(10, 306, 82, 20);
		contentPane.add(lblNewLabel_1_2_1);
		
		JRadioButton rbman = new JRadioButton("Masculino");
		grupo.add(rbman);
		rbman.setBounds(89, 208, 109, 23);
		contentPane.add(rbman);
		
		JRadioButton rbwoman = new JRadioButton("Femenino");
		grupo.add(rbwoman);
		rbwoman.setBounds(210, 208, 109, 23);
		contentPane.add(rbwoman);
		
		JCheckBox chxmusico = new JCheckBox("Musico");
		chxmusico.setBounds(89, 302, 97, 23);
		contentPane.add(chxmusico);
		
		JCheckBox chxdeporte = new JCheckBox("Deportista");
		chxdeporte.setBounds(210, 302, 97, 23);
		contentPane.add(chxdeporte);
		
		JCheckBox chxartista = new JCheckBox("Artista");
		chxartista.setBounds(89, 346, 97, 23);
		contentPane.add(chxartista);
		
		JCheckBox chxotro = new JCheckBox("Otro");
		chxotro.setBounds(210, 346, 97, 23);
		contentPane.add(chxotro);
		
		JComboBox cbespe = new JComboBox();
		cbespe.setModel(new DefaultComboBoxModel(new String[] {"Elige una Opccion", "Ing. Software", "Ing. Ambiental", "Modelador Grafico", "Dise\u00F1ador Grafico"}));
		cbespe.setBounds(102, 252, 155, 22);
		contentPane.add(cbespe);
		
		txtid = new JTextField();
		txtid.setBounds(89, 79, 168, 20);
		contentPane.add(txtid);
		txtid.setColumns(10);
		
		txtname = new JTextField();
		txtname.setColumns(10);
		txtname.setBounds(89, 122, 168, 20);
		contentPane.add(txtname);
		
		txtape = new JTextField();
		txtape.setColumns(10);
		txtape.setBounds(89, 160, 168, 20);
		contentPane.add(txtape);
		
		JButton btnregistro = new JButton("Registrar");
		btnregistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				consulta ventana=new consulta();
				ventana.id = txtid.getText();
				ventana.nombre = txtname.getText();
				ventana.apellido = txtape.getText();
				if(rbman.isSelected()==true)
					ventana.sexo="Masculino";
				else
					ventana.sexo="Femenino";
				ventana.espe = cbespe.getSelectedItem().toString();
				
				ventana.interes="";
				if(chxmusico.isSelected()==true)
					ventana.interes=ventana.interes+"Musico, ";
				if(chxdeporte.isSelected()==true)
					ventana.interes=ventana.interes+"Deportista, ";
				if(chxartista.isSelected()==true)
					ventana.interes=ventana.interes+"Artista, ";
				if(chxotro.isSelected()==true)
					ventana.interes=ventana.interes+"Otros";
				ventana.setVisible(true);
				dispose();
					
			}
		});
		btnregistro.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnregistro.setBounds(43, 418, 97, 23);
		contentPane.add(btnregistro);
		
		JButton btncancel = new JButton("Cancelar");
		btncancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtid.setText("");
				txtname.setText("");
				txtape.setText("");
				rbman.setSelected(false);
				rbwoman.setSelected(false);
				cbespe.setSelectedIndex(0);
				chxmusico.setSelected(false);
				chxartista.setSelected(false);
				chxdeporte.setSelected(false);
				chxotro.setSelected(false);
				
			}
		});
		btncancel.setFont(new Font("Tahoma", Font.BOLD, 13));
		btncancel.setBounds(210, 419, 97, 23);
		contentPane.add(btncancel);
		
		JButton btnsalir = new JButton("SALIR");
		btnsalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnsalir.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnsalir.setBounds(236, 503, 83, 23);
		contentPane.add(btnsalir);
	}
}
