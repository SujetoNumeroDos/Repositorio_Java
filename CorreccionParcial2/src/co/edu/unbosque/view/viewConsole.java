package co.edu.unbosque.view;
import java.util.Scanner;

public class viewConsole {
	private Scanner leer;
	
	public viewConsole() {
		leer = new Scanner(System.in);
	}
	//funciones de lectura para no usar siempre nextInt 
	public int leerEntero() {
		return leer.nextInt();//de esta manera solo una vez debo hacer el nextInt solo se usa el leerEntero
	}
		public long leerLargo() {
			return leer.nextLong();
	}
		public float leerfloatante() {
			return leer.nextFloat();
		}
		public double leerDoble() {
			return leer.nextDouble();
		}
		
		public String leerPalabra() {
			return leer.next();
		}
		public String leerLinea() {
			return leer.nextLine();
		}
		public boolean leerBoleano() {
			String aux = leerPalabra();
			if (aux.equalsIgnoreCase("Si")){//verifica dos palabras sin importar las mayusculas
				return true;
			}else {
				return false;
			}
		}
		// Visibilidad Tipo retorno Nombre (Parametro)
		public void impresionConSalto(String dato) {
			System.out.println(dato);
		}
		public void impresionSinSalto(String dato) {
			System.out.print(dato);
		}
		public void quemarLinea() {
			leer.nextLine();
		}
		
}
