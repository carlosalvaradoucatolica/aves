package co.edu.ucatolica.aves.aves.supertypeimp;

import co.edu.ucatolica.aves.aves.supertype.TipoSonido;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Canto implements TipoSonido {

    public static final Logger logger = LoggerFactory.getLogger(Canto.class);
    @Override
    public void makeSound() {
        logger.debug("Estoy Cantando");
        System.out.println("Estoy Cantando");
    }
}
