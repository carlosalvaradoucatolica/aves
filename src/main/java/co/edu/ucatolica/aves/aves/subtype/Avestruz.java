package co.edu.ucatolica.aves.aves.subtype;

import co.edu.ucatolica.aves.aves.supertypeimp.SinCanto;
import co.edu.ucatolica.aves.aves.supertypeimp.SinNado;
import co.edu.ucatolica.aves.aves.supertypeimp.SinVuelo;
import co.edu.ucatolica.aves.aves.type.Ave;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Avestruz extends Ave {

    public static final Logger logger = LoggerFactory.getLogger(Avestruz.class);

    public Avestruz(){
        logger.debug("Instanciando avestruz");
        tipoSonido = new SinCanto();
        tipoVuelo = new SinVuelo();
        tipoNado = new SinNado();
    }
}
