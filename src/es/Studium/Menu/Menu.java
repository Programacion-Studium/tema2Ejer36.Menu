package es.Studium.Menu;
import java.util.Scanner;
public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char opcion;
        Scanner teclado = new Scanner(System.in);

        do //Muestra el menu
        {
            System.out.println("* MENU *");
            System.out.println("1. Abrir");
            System.out.println("2. Cerrar");
            System.out.println("3. Modificar");
            System.out.println("4. Salir.");
            
            System.out.println("Introduzca una opción (1-4): ");
            opcion = teclado.next().charAt(0);
            

            switch(opcion)//Si el numero introducido es del 1 al 4, hace el caso corresponfiente
            {
                case '1': System.out.println("La opción elegida es ABRIR");
                    break;
                case '2': System.out.println("La opción elegida es CERRAR");
                    break;
                case '3': System.out.println("La opción elegida es MODIFICAR");
                	break;
                case '4': System.out.println("La opcion elegida es Salir");          
                	break;
                default:  System.out.println("La opcion elegida no es valida");
            }
        }
        while(opcion != '4');// pone la condicion para dejar de mostrar el menu
        teclado.close();
    }
}