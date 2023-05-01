package co.edu.unbosque.controller;

import java.util.Iterator;

import co.edu.unbosque.model.Huesped;
import co.edu.unbosque.view.viewConsole;

public class Controller {
	private viewConsole con;
	private Huesped[]habitaciones;
	
	public Controller() {
		con=new viewConsole();
		habitaciones = new Huesped[12];
	}
	public void ejecutarPrograma() {
		cicloprincipal:while(true) {
			con.impresionConSalto("Bienvenidos al hotel!! ");
			con.impresionConSalto("¿Que operacion desea realizar? ");
			con.impresionConSalto("1) Check in");
			con.impresionConSalto("2) Check out");
			con.impresionConSalto("3) Listar las habitacions");
			con.impresionConSalto("4) Salir del programa");
			int operacion=con.leerEntero();
			switch (operacion) {
			case 1:{
				checkIn();
				break;
			}
			case 2:{
				checkOut();
				break;
			}
			case 3:{
				listarHabitaciones();
				break;
			}
			case 4:{
				break cicloprincipal;
			}
				default:
					con.impresionConSalto("OPERACION SELECCIONADA INVALIDA");
			}
		}
	}
	public void checkIn() {
		con.impresionConSalto("REALIZANDO CHECK IN");
		con.impresionConSalto("INSERTE SU NOMBRE COMPLETO");
		con.quemarLinea();
		String nombre=con.leerLinea();
		con.impresionConSalto("INSERTE LA EDAD DEL HUESPED");
		int edad=con.leerEntero();
		con.impresionConSalto("CIUDADANIA");
		con.quemarLinea();
		String ciudadania=con.leerLinea();
		con.impresionConSalto("INSERTE LA CANTIDAD DEL PERSONAS EN LA HABITACION");
		int noPersonas=con.leerEntero();
		
		con.impresionConSalto("¿EN QUE HABITACION DESEA HOSPEDARSE?[0-11] ");
		int habitacion=con.leerEntero();
		if(habitacion>11 || habitacion<0) {
			con.impresionConSalto("LA HABITACION SELECCIONADA NO EXISTE");
		}else {
			habitaciones[habitacion]=new Huesped(nombre, edad, ciudadania, noPersonas);
			con.impresionConSalto("HUESPED CREADO CON EXITO");
		}
	}
	public void checkOut() {
		con.impresionConSalto("REALIZANDO CHECK OUT");
		con.impresionConSalto("¿QUE HABITACION DESEA LIBERAR?");
		int pos=con.leerEntero();
		if(habitaciones[pos]==null) {
			con.impresionConSalto("YA ESTABA LIBRE LA HABITACION");
		}else {
			habitaciones[pos]=null;
			con.impresionConSalto("HABITACION LIBERADA CON EXITO!!");
		}
	}
		public void listarHabitaciones() {
			con.impresionConSalto("LISTANDO LAS HABITACIONES DEL HOTEL");
			for (int i = 0; i < habitaciones.length; i++) {
				if (habitaciones[i]!=null) {
					con.impresionConSalto("HABITACION #"+i);
					con.impresionConSalto("NOMBRE: "+habitaciones[i].getNombreCompleto());
					con.impresionConSalto("EDAD: "+habitaciones[i].getEdad());
					con.impresionConSalto("NUMERO DE PERSONAS: "+habitaciones[i].getNoPersonas());
					con.impresionConSalto("CIUDADANIA: "+habitaciones[i].getCiudadania());
					 
				}
					
				
			}
		}
}

