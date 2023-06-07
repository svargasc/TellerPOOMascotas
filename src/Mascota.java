import javax.swing.JOptionPane;

public class Mascota {
    int edad, codigo;
    String nombre, especie;
    public void IngresarDatos () {
    		codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo de la mascota"));
            nombre = JOptionPane.showInputDialog("Ingrese el nombre de la mascota");
            especie = JOptionPane.showInputDialog("Ingrese la especie de su mascota");
            edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de la mascota"));
		}

    public void GuardarDatos (int codigo, String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.codigo = codigo;
        this.edad = edad;
    }
}
