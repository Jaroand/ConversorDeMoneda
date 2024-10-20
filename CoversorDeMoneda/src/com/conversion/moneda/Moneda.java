package com.conversion.moneda;

public class Moneda {
    //Declaración de variables
    static double conversion_result;
    String target_code;
    double conversion_rate;

    //Constructor
    public Moneda(recordMoneda resultado) {
        conversion_result = Double.parseDouble(resultado.conversion_result());
        this.target_code = resultado.target_code();
        this.conversion_rate = Double.parseDouble(resultado.conversion_rate());
    }

    public double getConversion_result() {
        return conversion_result;
    }

    public String getTarget_code() {
        return target_code;
    }

    public double getConversion_rate() {
        return conversion_rate;
    }
    public static void mensajeInicio(String base, String objetivo) {
        System.out.println("Por favor ingrese la cantidad de dinero en " +base+ " que desea convertir a "+ objetivo+ " : ");
    }
    public static void mensajeFin (String base, String objetivo, double monto){
        System.out.println("Valor consultado: " + monto + " " + base);
        System.out.println("Valor convertido: " + conversion_result + " " + objetivo);
    }
}
