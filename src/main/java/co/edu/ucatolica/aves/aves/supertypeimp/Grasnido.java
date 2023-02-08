package co.edu.ucatolica.aves.aves.supertypeimp;

import co.edu.ucatolica.aves.aves.supertype.TipoSonido;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Grasnido implements TipoSonido {

    public static final Logger logger = LoggerFactory.getLogger(Grasnido.class);
    @Override
    public void makeSound() {
        logger.debug("Grasnando");
        System.out.println("Grasnando");
    }
}
