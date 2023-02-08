package co.edu.ucatolica.aves.aves.supertypeimp;

import co.edu.ucatolica.aves.aves.supertype.TipoNado;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SinNado implements TipoNado {

    public static final Logger logger = LoggerFactory.getLogger(SinNado.class);
    @Override
    public void nado() {
        logger.debug("<<No puedo nadar>>");
        System.out.println("<<No puedo nadar>>");
    }
}
