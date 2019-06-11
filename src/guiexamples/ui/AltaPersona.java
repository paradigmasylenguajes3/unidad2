package guiexamples.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import guiexamples.ui.grillas.GrillaEmpleado;
import objects.AreaTrabajo;
import objects.Empleado;
import objects.TipoDocumento;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AltaPersona extends JFrame {

	private JPanel contentPane;
	private JTextField jtfNombre;
	private JTextField jtfApellido;
	private JTextField jtfCodigo;
	

	private Collection<TipoDocumento> tiposDocumentos = new LinkedList<>();
	private ArrayList<Empleado> empleados = new ArrayList<>();
	private GrillaEmpleado grillaEmpleado;
	private JTable jtListadoPersonas;
	private JTable jtListadoPersona;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AltaPersona frame = new AltaPersona();
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
	public AltaPersona() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 803, 397);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		jtListadoPersona = new JTable();
		jtListadoPersona.setBounds(38, 203, 689, 144);
		contentPane.add(jtListadoPersona);
		
		
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(10, 11, 94, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(10, 56, 94, 14);
		contentPane.add(lblApellido);
		
		JLabel lblTipoDocumento = new JLabel("Tipo Documento");
		lblTipoDocumento.setBounds(10, 98, 94, 14);
		contentPane.add(lblTipoDocumento);
		
		JLabel lblCodigo = new JLabel("Codigo");
		lblCodigo.setBounds(10, 143, 94, 14);
		contentPane.add(lblCodigo);
		
		jtfNombre = new JTextField();
		jtfNombre.setBounds(64, 8, 287, 20);
		contentPane.add(jtfNombre);
		jtfNombre.setColumns(10);
		
		jtfApellido = new JTextField();
		jtfApellido.setBounds(64, 53, 287, 20);
		jtfApellido.setColumns(10);
		contentPane.add(jtfApellido);
		
		jtfCodigo = new JTextField();
		jtfCodigo.setHorizontalAlignment(SwingConstants.CENTER);
		jtfCodigo.setBounds(64, 140, 298, 20);
		jtfCodigo.setColumns(10);
		contentPane.add(jtfCodigo);
		
		JComboBox jcbTipoDocumento = new JComboBox();
		jcbTipoDocumento.setBounds(114, 95, 183, 20);
		contentPane.add(jcbTipoDocumento);
	
	/////////////////////////////////////////////////////
		
		
//////////////////////////////////////////////////////////////////////////////
//Seteo del ComboBox
this.tiposDocumentos.add(new TipoDocumento("DNI", "Documento"));
this.tiposDocumentos.add(new TipoDocumento("PASS", "Pasaporte"));
DefaultComboBoxModel model = new DefaultComboBoxModel(tiposDocumentos.toArray());
jcbTipoDocumento.setModel(model);
/////////////////////////////////////////////////////////////////////////////////
//Seteo de la Grilla

empleados.add(new Empleado("Hugo", "Chanampe", new AreaTrabajo("Personal"), new TipoDocumento("DNI", "Documento")));
empleados.add(new Empleado("Juan", "Perez", new AreaTrabajo("Liquidacion"), new TipoDocumento("DNI", "Documento")));
grillaEmpleado = new GrillaEmpleado(empleados);

jtListadoPersona.setModel(grillaEmpleado);
JButton btnGuardar = new JButton("Guardar");
btnGuardar.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent arg0) {
		Empleado e = new Empleado(jtfNombre.getText(), jtfApellido.getText(), new AreaTrabajo("Personal"),(TipoDocumento)jcbTipoDocumento.getSelectedItem());
		empleados.add(e);
		
		GrillaEmpleado ge = new GrillaEmpleado(empleados);
		
		jtListadoPersona.setModel(ge);
	}
});
btnGuardar.setBounds(147, 171, 89, 23);
contentPane.add(btnGuardar);
	
	
	}
}
