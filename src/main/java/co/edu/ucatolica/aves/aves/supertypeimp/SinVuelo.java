package co.edu.ucatolica.aves.aves.supertypeimp;

import co.edu.ucatolica.aves.aves.supertype.TipoVuelo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SinVuelo implements TipoVuelo {

    public static final Logger logger = LoggerFactory .getLogger(SinVuelo.class);

    @Override
    public void vuelo() {
        logger.debug("No puedo volar");
        System.out.println("No puedo volar");
    }

}
