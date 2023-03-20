
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dsm-2
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conversor_temperatura conv = new Conversor_temperatura();
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a temperatura em Fahrenheit: ");
        double F = scan.nextDouble();
        conv.calcularTempCelsius(F);
        System.out.println("Digite a temperatura em Fahrenheit: ");
        double C = scan.nextDouble();
        conv.calcularTempFahrenheit(C);
    }
    
}
