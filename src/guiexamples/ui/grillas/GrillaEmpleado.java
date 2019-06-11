package guiexamples.ui.grillas;

import java.util.ArrayList;
import java.util.Collection;

import javax.swing.table.AbstractTableModel;
import objects.*;

public class GrillaEmpleado extends AbstractTableModel {
	
	private ArrayList<Empleado> empleados = new ArrayList<>();
	
	
	public GrillaEmpleado(ArrayList<Empleado> empleados2) {
		empleados = empleados2;
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return empleados.size();
	}

	@Override
	public Object getValueAt(int arg0, int arg1) {
		Empleado empleadoa = empleados.get(arg0);
		
		switch(arg1){
        case 0: return empleadoa.getNombre();
        case 1: return empleadoa.getApellido();
        case 2: return empleadoa.getTipoDocumento();
        case 3: return empleadoa.getAreaTrabajo();
        default: return "";
    }  
		
	}

	@Override
	public String getColumnName(int column) {
		 switch(column){
         case 0: return "Nombre";
         case 1: return "Apellido";
         case 2: return "Tipo Documento";
         case 3: return "Area de Trabajo";
         default: return "";
     
     
     }
	}
	
	

}
