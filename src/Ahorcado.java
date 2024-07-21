import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {

        Scanner  scanner = new Scanner(System.in);

        String palabraSecreta = "inteligencia";
        int intentosMaximos = 10;
        int intentos = 0; 
        boolean palabraAdividana = false;

        // arreglos: 

        char[] letrasAdivinadas = new char[palabraSecreta.length()];


        for(int i = 0 ; i< letrasAdivinadas.length; i++){
            letrasAdivinadas[i]= '_';
        
        }

        while(!palabraAdividana  && intentos < intentosMaximos){


            System.out.println("Palabra a adivinar: "+String.valueOf(letrasAdivinadas)+ " ("+palabraSecreta.length()+" letras)");

            System.out.println("introduce una letra: ");
            char letra = Character.toLowerCase(scanner.next().charAt(0));
            

            boolean letraCorrecta = false;

            for(int i=0; i<palabraSecreta.length(); i++){

                if(palabraSecreta.charAt(i)== letra){
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                }
            }

            if(!letraCorrecta){
                intentos++;
                System.err.println("!letra incorrecta te quedan "+(intentosMaximos-intentos)+ " intentos.");
            }

            if(String.valueOf(letrasAdivinadas).equals(palabraSecreta)){

                palabraAdividana = true;
                System.out.println("Felicidades has adivinado la palabra secreta: "+palabraSecreta);

            }


        }
        if(!palabraAdividana){
            System.out.println("te has quedado sin intentos");
        }

        scanner.close();



    }
}
