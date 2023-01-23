import javax.sound.midi.SysexMessage;

public class Main {
    public static void main(String[] args) {
        //Condicional IF
        int numeroIf = 1;

        if (numeroIf > 0){
            System.out.println("El número " + numeroIf +" es positivo.");
        } else if (numeroIf < 0){
            System.out.println("El número " + numeroIf + " es negativo.");
        } else
            System.out.println("El número es igual a cero.");

        //Bucle While
        int numeroWhile = 1;

        while (numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        //Bucle Do-While
        do {
            System.out.println(numeroWhile);
            numeroWhile++;
        } while (numeroWhile < 3);

        //Bucle For
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor);
        }

        //Switch
        var estacion = "Verano";

        switch(estacion){
            case "Verano":
                System.out.println("Es verano.");
                break;
            case "Invierno":
                System.out.println("Es invierno.");
                break;
            case "Otoño":
                System.out.println("Es otoño.");
                break;
            case "Primavera":
                System.out.println("Es primavera.");
                break;
            default:
                System.out.println("La variable no contiene ninguna estación.");
        }
    }
}