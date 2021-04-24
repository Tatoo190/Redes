
package archivos.pilas;

import mis.clases.Comprobante;

public interface IPila {
    public void apilar(Comprobante item);
    public Comprobante desapilar();
    public boolean estaVacia();
}
