import java.lang.StringBuilder;
import java.util.Arrays;
import java.util.Scanner;
public class proyectoCreacionProteinas {

    public static void main (String args[]) {

        int controlCadena = 1;

        String [][] cadenaARN = new String [1][controlCadena];

        System.out.println("Esto es un creador de ARN");

        System.out.println("Pon el primer codón de la cadena");

        Scanner sc = new Scanner(System.in);
        
        String output = sc.nextLine();

        StringBuilder cadenaCompleta = new StringBuilder();

        cadenaCompleta.append(sc).append(" ");

        System.out.println("Pon el siguiente codón");

        Scanner sc1 = new Scanner(System.in);

        String output1 = sc1.nextLine();

        cadenaCompleta.append(sc1).append(" ");

        System.out.println("Pon el siguiente codón");

        Scanner sc2 = new Scanner(System.in);

        String output2 = sc2.nextLine();

        cadenaCompleta.append(sc2).append(" ");
        
        String variableControl;

        System.out.println("¿Deseas agregar otro codón?");

        Scanner respuestaloop = new Scanner (System.in);

        String respuesta = respuestaloop.nextLine();

        while (respuesta == "Sí" || respuesta == "si" || respuesta == "sí" || respuesta == "Si" ){
            
            System.out.println("Pon el condón");

            Scanner sc3 = new Scanner(System.in);

            String output3 = sc3.nextLine();

            cadenaCompleta.append(sc).append(" ");
            
            //if ()

        }
        System.out.println("Pon el condon final");

        Scanner scfinal = new Scanner(System.in);

        String outputfinal = scfinal.nextLine();

        cadenaCompleta.append(scfinal).append(" ");

        System.out.println("Cadena completa");

        System.out.println(cadenaCompleta.toString());

        int cambioCadena = 6;
        String [][] ARN = new String [1][cambioCadena];
    
        ;
                }



            }
         
