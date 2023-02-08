package co.edu.ucatolica.aves.aves.subtype;

import co.edu.ucatolica.aves.aves.supertypeimp.Grasnido;
import co.edu.ucatolica.aves.aves.supertypeimp.Nado;
import co.edu.ucatolica.aves.aves.supertypeimp.VueloConAlas;
import co.edu.ucatolica.aves.aves.type.Ave;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Pato extends Ave {

    public static  final Logger logger = LoggerFactory.getLogger(Pato.class);

    public Pato(){
        logger.debug("Instanciando un pato");
        tipoSonido = new Grasnido();
        tipoVuelo = new VueloConAlas();
        tipoNado = new Nado();
    }
}
