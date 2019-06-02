package factories.impl;

import factories.FactoryCliente;
import modelos.Cliente;

public class FactoryClienteImpl implements FactoryCliente
{


    @Override
    public Cliente fabricarCliente() {
        return new Cliente();
    }
}