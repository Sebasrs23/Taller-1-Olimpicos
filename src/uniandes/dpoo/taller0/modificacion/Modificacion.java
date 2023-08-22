package uniandes.dpoo.taller0.modificacion;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Modificacion {
	public static void main(String[] args) throws FileNotFoundException, IOException {
        System.out.println("Hola, mundo!");
        CalculadoraEstadisticas calc = LoaderOlimpicos.cargarArchivo("./data/atletas.csv");
        System.out.println(calc.paisConMasMedallistas());
    }
}
