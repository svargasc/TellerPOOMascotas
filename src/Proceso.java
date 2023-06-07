import java.util.HashMap;

import javax.swing.JOptionPane;

public class Proceso {
	int opc, buscarCodigo, codigo, edad;
	String nombre, tipo, buscarNombre;
	HashMap <Integer, Mascota> mapaMascotas = new HashMap <Integer, Mascota>();
	public void iniciar() {
			String menu = "menu de opciones\n";
			menu+= "1. Ingresar Mascotas:\n";
			menu+= "2. Buscar mascotas por codigo:\n";
			menu+= "3. Buscar mascotas por nombres:\n";
			menu+= "4. Mostrar la lista de mascotas:\n";
			menu+="5.salir del programa\n";
			menu+="Ingrese una opcion";
			do {
			opc = Integer.parseInt(JOptionPane.showInputDialog(menu));
			validar();
			} while (opc != 5);	
}
	
	public void validar() {
			switch (opc) {
			case 1:
				Mascota animal = new Mascota();
				animal.IngresarDatos();
				animal.GuardarDatos(animal.codigo, animal.nombre, animal.especie, animal.edad);
				mapaMascotas.put(animal.codigo, animal);
				break;
			case 2:
				buscarMascotas();
				break;
			case 3:
				buscarNombre();
				break;
			case 4:
				imprimirLista();
				break;
			case 5: System.out.println("salio del programa, vuelva pronto!");
				break;
			default:
				System.out.println("ingrese una opcion correta");
				break;
			}
	}
	public void buscarMascotas () {
		
		buscarCodigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo de su mascota"));
	    Mascota mascota = mapaMascotas.get(buscarCodigo);
	    codigo = mascota.codigo;
	    nombre = mascota.nombre;
	    tipo = mascota.especie;
	    edad = mascota.edad;
	    System.out.println("codigo: "+codigo + "\nnombre: " + nombre + "\ntipo: " + tipo + "\nedad: " + edad );
	}
	
	public void buscarNombre () {
		
		buscarNombre = JOptionPane.showInputDialog("Ingrese el nombre de su mascota");
		for (Mascota mascota: mapaMascotas.values()) {
			if (buscarNombre == mascota.nombre) {
				codigo = mascota.codigo;
			}
		}
		
		Mascota mascota = mapaMascotas.get(codigo);
		codigo = mascota.codigo;
		nombre = mascota.nombre;
		tipo = mascota.especie;
		edad = mascota.edad;
		System.out.println("Codigo: "+codigo +"\n" 
		+"Nombre: "+ nombre+ "\n" 
		+"Tipo: "+ tipo +"\n"
		+"AÃ±os:" + edad );
		
	}
	
	public void imprimirLista() {
		
		for (Mascota mascota : mapaMascotas.values()) {
			System.out.println("Codigo: " + mascota.codigo);
			System.out.println("Nombre: " + mascota.nombre);
			System.out.println("Especie: " + mascota.especie);
			System.out.println("Edad: " + mascota.edad);
			System.out.println("---------------------------");
			}

		
	}
	

	

}
