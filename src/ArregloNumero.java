import java.util.Scanner;
public class ArregloNumero {
	
	

	
	 
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner mi_s= new Scanner(System.in);
		 int Arreglo[];
		 System.out.print("-----------------------Ingrese los numeros------------------");
		 Arreglo= new int [mi_s.nextInt()];
		 for (int i=0; i<Arreglo.length; i++){
			System.out.print("Ingrese numero "+i+":");
				Arreglo [i]=mi_s.nextInt();
				// Creamos un arreglo en cual ingresamos los numeros que deseamos usando [], 
			}
			System.out.println("\n Agenda");
			System.out.println("--------");
			for (int i=0; i<Arreglo.length; i++){
				System.out.println(Arreglo[i]);
				// creamos un sop para que nos imprima los numeros del arreglo
			}
			System.out.println("--------");
			}
	}


