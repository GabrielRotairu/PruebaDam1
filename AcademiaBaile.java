package primerTrimestr;

import java.util.Calendar;
import java.util.Scanner;
import java.util.Random;

public class AcademiaBaile {
	static Calendar fecha = Calendar.getInstance();
	static Scanner scan = new Scanner(System.in);
	static Random rnd = new Random();
	static Baile b1 = new Baile();
	static Baile b2 = new Baile();
	static Baile b3 = new Baile();
	static Baile b4 = new Baile();
	public static String recogerDato;
	static Profesor p1 = new Profesor();
	static String crearClase;
	static Clase c1 = new Clase();
	static Clase c2 = new Clase();
	static Clase c3 = new Clase();
	static Clase c4 = new Clase();
	static Clase f = new Clase();
	static String salaElegida;
	public static String Sala;
	public static String Baile;

	public static int MostrarMenu() {
		int opcion = 0;
		StringBuilder cadena = new StringBuilder();
		cadena.append("Menú de opciones:");
		cadena.append("\n1. Consultar los Bailes existentes");
		cadena.append("\n2. Crear una clase de baile");
		cadena.append("\n3. Consultar las clases de baile");
		cadena.append("\n4. Modificar la sala de la clase");
		cadena.append("\n5. Asignar un nuevo profesor a la clase");
		cadena.append("\n0. Salir");
		System.out.println(cadena.toString());
		return scan.nextInt();
	}

	public static void MostrarOpciones() {
		Baile b1 = new Baile();
		Baile b2 = new Baile();
		Baile b3 = new Baile();
		Baile b4 = new Baile();

		b1.setTipoBaile("SALSA");
		b2.setTipoBaile("TANGO");
		b3.setTipoBaile("BALLET");
		b4.setTipoBaile("SHUFFLE");

		System.out.println(b1.getTipoBaile());
		System.out.println(b2.getTipoBaile());
		System.out.println(b3.getTipoBaile());
		System.out.println(b4.getTipoBaile());

	}

	public static String ElegirClase() {
		Baile b1 = new Baile();
		Baile b2 = new Baile();
		Baile b3 = new Baile();
		Baile b4 = new Baile();
		Profesor p1 = new Profesor();
		p1.setNombreProfesor("Juan");
		b1.setTipoBaile("SALSA");
		b2.setTipoBaile("TANGO");
		b3.setTipoBaile("BALLET");
		b4.setTipoBaile("SHUFFLE");
		Clase c1 = new Clase();
		Clase c2 = new Clase();
		Clase c3 = new Clase();
		Clase c4 = new Clase();
		Clase f = new Clase();
		c1.setSala("AIRE");
		c2.setSala("AGUA");
		c3.setSala("TIERRA");
		c4.setSala("FUEGO");
		int horaAleatoria = rnd.nextInt(9) + 1;
		System.out.println("Elige entre las existentes:");
		System.out.println(
				b1.getTipoBaile() + "/" + b2.getTipoBaile() + "/" + b3.getTipoBaile() + "/" + b4.getTipoBaile());
		Baile = scan.next();
		if (Baile.equals(b1.getTipoBaile())) {
			System.out.println("HAS ELEGIDO: " + b1.getTipoBaile());
		} else if (Baile.equals(b2.getTipoBaile())) {
			System.out.println("HAS ELEGIDO: " + b2.getTipoBaile());
		} else if (Baile.equals(b3.getTipoBaile())) {
			System.out.println("HAS ELEGIO: " + b3.getTipoBaile());
		} else if (Baile.equals(b4.getTipoBaile())) {
			System.out.println("HAS ELEGIDO: " + b4.getTipoBaile());
		}
		Clase h= new Clase();
		if (horaAleatoria == 1) {h.setHoraComienzo("19:00");}
		if (horaAleatoria == 2) {h.setHoraComienzo("19:15");}
		if (horaAleatoria == 3) {h.setHoraComienzo("19:30");}
		if (horaAleatoria == 4) {h.setHoraComienzo("19:45");}
		if (horaAleatoria == 5) {h.setHoraComienzo("20:00");}
		if (horaAleatoria == 6) {h.setHoraComienzo("20:15");}
		if (horaAleatoria == 7) {h.setHoraComienzo("20:30");}
		if (horaAleatoria == 8) {h.setHoraComienzo("20:45");}
		if (horaAleatoria == 9) {h.setHoraComienzo("21:00");}
System.out.println("HORA DE COMIENZO: "+h.getHoraComienzo());
		System.out
				.println("ELEGIR SALA: " + c1.getSala() + "/" + c2.getSala() + "/" + c3.getSala() + "/" + c4.getSala());
		Sala = scan.next();
		if (Sala.equals(c1.getSala())) {
			System.out.println("HAS ELEGIDO: " + c1.getSala());

		}
		if (Sala.equals(c2.getSala())) {
			System.out.println("HAS ELEGIDO: " + c2.getSala());

		}
		if (Sala.equals(c3.getSala())) {
			System.out.println("HAS ELEGIDO: " + c3.getSala());

		}
		if (Sala.equals(c4.getSala())) {
			System.out.println("HAS ELEGIDO: " + c4.getSala());

		}

		System.out.println("PROFESOR DE LA SALA: " + p1.getNombreProfesor());
		System.out.println("LA FECHA DE INICIO: " + fecha.get(Calendar.DATE) + "/" + fecha.get(Calendar.MONTH) + "/"
				+ fecha.get(Calendar.YEAR));

		recogerDato = "\t"+Baile + "\t" + Sala + "\t" + h.getHoraComienzo() + "\t" + p1.getNombreProfesor();
		return recogerDato;}

	public static void consultarSala() {

		System.out.println("**********************************************");
		System.out.println("\t BAILE \t SALA \t HORA \t PROFESOR");
		System.out.println("**********************************************");
		System.out.println(recogerDato);
		System.out.println("**********************************************");
	}

	public static void cambiarSala() {
		c1.setSala("SALSA");
		c2.setSala("TANGO");
		c3.setSala("BALLET");
		c4.setSala("SHUFFLE");
		String opcionSala;

		System.out.println("¿QUIERES CAMBIAR LA CLASE ACTUAL: " + Baile + "?1.Si - 2.No");
		String cambiarSala = scan.next();
		if (cambiarSala.toLowerCase().equals("si")) {

			System.out.println(
					"ELIGE UNA SALA:" + c1.getSala() + "/" + c2.getSala() + "/" + c3.getSala() + "/" + c4.getSala());
			opcionSala = scan.next();
			if (opcionSala.equals(c1.getSala())) {
				System.out.println("HAS CAMBIADO LA SALA A :" + c1.getSala());

			} else if (opcionSala.equals(c2.getSala())) {
				System.out.println("HAS CAMBIADO LA SALA A :" + c2.getSala());

			} else if (opcionSala.equals(c3.getSala())) {
				System.out.println("HAS CAMBIADO LA SALA A :" + c3.getSala());

			} else if (opcionSala.equals(c4.getSala())) {
				System.out.println("HAS CAMBIADO LA SALA A :" + c4.getSala());

			}
		}
	}

	public static void nuevoProfesor() {
		p1.setNombreProfesor("Juan");
		System.out.println("VAS A ASIGNAR UN NUEVO PROFESOR, EL ACTUAL ES: " + p1.getNombreProfesor());
		System.out.println("INDICA SU NOMBRE Y SU ID:");

		p1.setNombreProfesor(scan.next());
		System.out.println(p1.getNombreProfesor());
		System.out.println("EL NUEVO PROFESOR ASIGNADO ES: " + p1.getNombreProfesor());

		Profesor idProfesor = new Profesor();
		idProfesor.setIdProfesor(scan.nextInt());
		System.out.println("EL ID DE " + p1.getNombreProfesor() + " ES: " + idProfesor.getIdProfesor());

	}

	public static void main(String[] args) {
		boolean acabado = false;
		String sala = salaElegida;
		while (!acabado) {
			int opcion = MostrarMenu();
			switch (opcion) {
			case 1:
				MostrarOpciones();
				break;

			case 2:
				ElegirClase();

				break;
			case 3:
				consultarSala();

				break;
			case 4:
				cambiarSala();

				break;
			case 5:
				nuevoProfesor();

				break;
			case 0:
				System.out.println("--Adiós--");
				acabado = true;
				break;

			}
		}
	}
}
