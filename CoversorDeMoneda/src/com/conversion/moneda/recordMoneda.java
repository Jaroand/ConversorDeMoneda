package com.conversion.moneda;
//Este record guarda la informacion del cambio de moneda y pasa los datos a la clase Moneda
public record recordMoneda(String base_code, String target_code, String conversion_rate, String conversion_result) {
}
