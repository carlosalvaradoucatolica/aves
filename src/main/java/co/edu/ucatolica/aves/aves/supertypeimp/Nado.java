package co.edu.ucatolica.aves.aves.supertypeimp;

import co.edu.ucatolica.aves.aves.supertype.TipoNado;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class Nado implements TipoNado {

    public static final Logger logger = LoggerFactory.getLogger(Nado.class);
    @Override
    public void nado() {
        logger.debug("Estoy Nadando");
        System.out.println("Estoy Nadando");
    }
}
