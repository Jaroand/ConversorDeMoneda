import API.request;
import com.conversion.moneda.Moneda;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {

        //Declaración de variables
        int numeroMenu = 0;
        String base = "";
        String objetivo = "";
        String monto;

        String menu = """ 
                ********************************************
                Sea bienvenido al Conversor de Monedas 
                Seleccione una opción valida:
                1. Dólar            -> Peso Argentinos
                2. Peso Argentino   -> Dólar
                3. Dólar            -> Real Brasileños
                4. Real Brasileño   -> Dólar
                5. Dólar            -> Peso Colombiano
                6. Peso Colombiano  -> Dólar
                7. Salir
                ********************************************""";

        while (numeroMenu !=7){
        try{
            Scanner lectura = new Scanner(System.in);
            System.out.println(menu);
            numeroMenu = Integer.parseInt(lectura.nextLine());

            switch (numeroMenu) {

                case 1:
                    base = "Dólares";
                    objetivo = "Pesos Argentinos";
                    lectura = new Scanner(System.in);
                    Moneda.mensajeInicio(base, objetivo);
                    monto = lectura.nextLine();
                    Moneda Moneda1 = request.cambioDeMoneda("USD", "ARS", Double.valueOf(monto));
                    Moneda.mensajeFin(base, objetivo, Double.parseDouble(monto));
                    break;
                case 2:
                    base = "Pesos Argentinos";
                    objetivo = "Dólares";
                    lectura = new Scanner(System.in);
                    Moneda.mensajeInicio(base, objetivo);
                    monto = lectura.nextLine();
                    Moneda Moneda2 = request.cambioDeMoneda("ARS", "USD", Double.valueOf(monto));
                    Moneda.mensajeFin(base, objetivo, Double.parseDouble(monto));
                    break;
                case 3:
                    base = "Dólares";
                    objetivo = "Reales Brasileños";
                    lectura = new Scanner(System.in);
                    Moneda.mensajeInicio(base, objetivo);
                    monto = lectura.nextLine();
                    Moneda Moneda3 = request.cambioDeMoneda("USD", "BRL", Double.valueOf(monto));
                    Moneda.mensajeFin(base, objetivo, Double.parseDouble(monto));
                    break;
                case 4:
                    base = "Reales Brasileños";
                    objetivo = "Dólares";
                    lectura = new Scanner(System.in);
                    Moneda.mensajeInicio(base, objetivo);
                    monto = lectura.nextLine();
                    Moneda Moneda4 = request.cambioDeMoneda("BRL", "USD", Double.valueOf(monto));
                    Moneda.mensajeFin(base, objetivo, Double.parseDouble(monto));
                    break;
                case 5:
                    base = "Dólares";
                    objetivo = "Pesos Colombianos";
                    lectura = new Scanner(System.in);
                    Moneda.mensajeInicio(base, objetivo);
                    monto = lectura.nextLine();
                    Moneda Moneda5 = request.cambioDeMoneda("USD", "COP", Double.valueOf(monto));
                    Moneda.mensajeFin(base, objetivo, Double.parseDouble(monto));
                    break;
                case 6:
                    base = "Pesos Colombianos";
                    objetivo = "Dólares";
                    lectura = new Scanner(System.in);
                    Moneda.mensajeInicio(base, objetivo);
                    monto = lectura.nextLine();
                    Moneda Moneda6 = request.cambioDeMoneda("COP", "USD", Double.valueOf(monto));
                    Moneda.mensajeFin(base, objetivo, Double.parseDouble(monto));
                    break;
                case 7:
                    System.out.println("Gracias por utilizar el convertidor de monedas");
                    break;
                default:
                    System.out.println("Opción no valida");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error! Digite un número");
        }
        }
    }
}