import java.util.Scanner;

public class G2ejercicio1{
    public static void main(String[] args) {
        double valor, resultado;
        String unidad;
        
        resultado = 0;
        
        System.out.print("Programa para convertir valores a pulgadas" + "\n" + "Digite la unidad de medida: \n" + "\n" + "P para pies"
        + "\n" + "C para centímetros" + "\n" + "L para legua" + "\n" + "Y para yarda" + "\n");
        
        Scanner teclado = new Scanner(System.in);
        unidad = teclado.nextLine();
        
        while (!unidad.equals("P")  && !unidad.equals("C") && !unidad.equals("L") && !unidad.equals("Y")) {
            
            System.out.print("Ingrese un valor correcto " + "\n");
            unidad = teclado.nextLine();
         
        }
        
        System.out.print("Digite el valor a convertir " + "\n");
        
        valor = teclado.nextDouble();
        
        if (unidad.equals("P")) {
            resultado = valor / 0.0833;
        }
        else if (unidad.equals("C")) {
            resultado = valor / 2.54;
        }
        else if (unidad.equals("L")) {
            resultado = valor * 190080.02;
        }
        else if (unidad.equals("Y")) {
            resultado = valor * 36;
        }
        
        System.out.print("El valor " + valor +  " eqivale a : " + resultado + " pulgadas \n");
        
        

        
    }
}