package arraylist3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		ArrayList<Persona> a=new ArrayList<Persona>();
		while(true) {
			System.out.println("1. Paso de frontera");
			System.out.println("2. Mostrar personas");
			System.out.println("3. Búsqueda por nombre");
			System.out.println("4. Búsqueda por dni");
			System.out.println("5. Salir");
			System.out.print("Introduce lo que quieras hacer--> ");
			System.out.println("-------------------------------");

			int num=entrada.nextInt();
			if (num==1) {
				pasofrontera(a);
			}
			else if (num==2) {
				infofront(a);
			}
			else if (num==3) {
				dni(a);
			}
			else if (num==4) {
				info(a);
			}
			else {
				break;
			}
			System.out.println("-------------------------------");
		}
		
		
	}
	
	public static void pasofrontera(ArrayList<Persona> a) {
		Scanner entrada=new Scanner(System.in);
		System.out.print("Introduce el nombre de la persona-->");
		String nombre=entrada.next();
		Persona x = new Persona(nombre);
		a.add(x);
	}
	
	public static void infofront(ArrayList<Persona> a) {
		for(int i=0; i<a.size(); i++) {
			System.out.println(a.get(i).toString());
		}
	}
	
	public static void dni(ArrayList<Persona> a) {
		Scanner entrada=new Scanner(System.in);
		System.out.print("Por favor, introduce el nombre de quién quieras saber el dni-->");
		String nombre=entrada.next();
		for(int i=0; i<a.size(); i++) {
			if(nombre.equals(a.get(i).getNombre())) {
				System.out.println(a.get(i).toString());
			}
		}
	}
	
	public static void info(ArrayList<Persona> a) {
		Scanner entrada=new Scanner(System.in);
		System.out.print("Por favor, introduce el dni de quién quieras saber el nombre-->");
		String dni=entrada.next();
		for(int i=0; i<a.size(); i++) {
			if(dni.equals(a.get(i).getDni())) {
				System.out.println(a.get(i).toString());
			}
		}
	}
}
