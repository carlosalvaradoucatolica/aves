package co.edu.ucatolica.aves.aves.subtype;

import co.edu.ucatolica.aves.aves.supertypeimp.Canto;
import co.edu.ucatolica.aves.aves.supertypeimp.VueloConAlas;
import co.edu.ucatolica.aves.aves.type.Ave;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Canario extends Ave {

    public static final Logger logger = LoggerFactory.getLogger(Canario.class);

    public Canario(){
        logger.debug("Instanciando canario");
        tipoSonido = new Canto();
        tipoVuelo = new VueloConAlas();
    }
}
