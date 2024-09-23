package uniandes.dpoo.aerolinea.tarifas;

import uniandes.dpoo.aerolinea.modelo.Aeropuerto;
import uniandes.dpoo.aerolinea.modelo.Ruta;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public abstract class CalculadoraTarifas {

    public static double IMPUESTO = 0.28;

    public int calcularTarifa(Vuelo vuelo, Cliente cliente){
        // Calcula la tarifa del vuelo (impuestos se calculan después de aplicar descuentos)
        int costoBase = calcularCostoBase(vuelo, cliente);
        double porcentajeDescuento = calcularPorcentajeDescuento(cliente);
        int costoPreImpuestos = costoBase - (int) (costoBase * porcentajeDescuento);
        return costoPreImpuestos + calcularValorImpuestos(costoPreImpuestos);
    }

    protected abstract int calcularCostoBase(Vuelo vuelo, Cliente cliente);
    protected abstract double calcularPorcentajeDescuento(Cliente cliente);

    protected static int calcularDistanciaVuelo(Ruta ruta){
         return Aeropuerto.calcularDistancia(ruta.getAeropuertoOrigen(), ruta.getAeropuertoDestino());
    }

    protected int calcularValorImpuestos(int costoBase){
        return (int) (costoBase * IMPUESTO);
    }

}
