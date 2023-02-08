package co.edu.ucatolica.aves.aves.type;

import co.edu.ucatolica.aves.aves.supertype.TipoSonido;
import co.edu.ucatolica.aves.aves.supertype.TipoVuelo;

/**
 * @author Carlos Alvarado Mancera cod 67000392
 * @version 1.0.0
 * @lastModified 2023-02-08
 */
public abstract class Ave {
    public TipoSonido tipoSonido;
    public TipoVuelo tipoVuelo;

    public void realizaVuelo(){
        tipoVuelo.vuelo();
    }

    public void  realizaSonido(){
        tipoSonido.makeSound();
    }
}
