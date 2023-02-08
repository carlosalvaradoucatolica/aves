package co.edu.ucatolica.aves.aves.supertypeimp;

import co.edu.ucatolica.aves.aves.supertype.TipoVuelo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VueloConAlas implements TipoVuelo {

    public static final Logger logger = LoggerFactory.getLogger(VueloConAlas.class);

    @Override
    public void vuelo(){
        logger.debug("Estoy volando aleteando");
        System.out.println("Estoy volando aleteando");
    }
}
