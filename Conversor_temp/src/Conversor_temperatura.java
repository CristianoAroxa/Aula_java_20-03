/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dsm-2
 */
public class Conversor_temperatura {
    private double celsius;
    private double fahrenheit;
    
    public Conversor_temperatura(){
        this(0.0,0.0);
    }

    public Conversor_temperatura(double celsius, double fahrenheit) {
        this.celsius = celsius;
        this.fahrenheit = fahrenheit;
    }

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }
    public void calcularTempCelsius(double F){
        this.setCelsius((F-32)*(5/9.0));
        System.out.println("A conversão do Fahrenheit para Célsius é: "+getCelsius());
    }
    public void calcularTempFahrenheit(double C){
        this.setFahrenheit(C*1.8+32);
        System.out.println("A conversão do Célsius  para Fahrenheit é: "+getFahrenheit());
    }
}
