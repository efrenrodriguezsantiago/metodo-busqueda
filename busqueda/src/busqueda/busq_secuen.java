package busqueda;

import javax.swing.JOptionPane;

public class busq_secuen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arreglo[] = {4,1,5,2,3};
		
		int dato;
		boolean bandera=false;
		dato = Integer.parseInt(JOptionPane.showInputDialog("digite el numero a buscar: "));
		//buscar el numero
		
		int i=0;
		
		while(i<5 && bandera==false) {
			if(arreglo[i]==dato) {
				bandera =true;
			}
			i++;
		}
		if(bandera==false) {
			JOptionPane.showMessageDialog(null, "no se ha encontrado en el arreglo: ");
		}
		else {
			JOptionPane.showMessageDialog(null, "se ha encontrado en el arreglo: "+(i-1));
		}
		
	}

}
