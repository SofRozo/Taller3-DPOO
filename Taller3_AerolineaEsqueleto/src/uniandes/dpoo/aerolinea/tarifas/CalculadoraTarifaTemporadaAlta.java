package uniandes.dpoo.aerolinea.tarifas;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class CalculadoraTarifaTemporadaAlta extends CalculadoraTarifas {
    
    protected static final int COSTO_POR_KM = 1000;
     

    @Override
    protected int calcularCostoBase(Vuelo vuelo, Cliente cliente) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularCostoBasse'");
    }

    @Override
    protected double calcularPorcentajeDescuento(Cliente cliente) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularPorcentajeDescuento'");
    }
    
}
