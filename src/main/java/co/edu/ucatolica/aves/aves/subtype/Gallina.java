package co.edu.ucatolica.aves.aves.subtype;

import co.edu.ucatolica.aves.aves.supertypeimp.Grasnido;
import co.edu.ucatolica.aves.aves.supertypeimp.VueloConAlas;
import co.edu.ucatolica.aves.aves.type.Ave;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Gallina extends Ave {

    public static final Logger logger = LoggerFactory.getLogger(Gallina.class);

    public Gallina(){
        logger.debug("Instanciando una gallina");
        tipoSonido = new Grasnido();
        tipoVuelo = new VueloConAlas();
    }
}
