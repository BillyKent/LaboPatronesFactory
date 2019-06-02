package factories.impl;

import factories.FactoryPais;
import modelos.Pais;

public class FactoryPaisImpl implements FactoryPais
{

    @Override
    public Pais fabricarPais() {
        return new Pais();
    }
}