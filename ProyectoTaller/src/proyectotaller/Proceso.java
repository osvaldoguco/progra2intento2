package proyectotaller;

import java.util.ArrayList;

public class Proceso {

    ArrayList<Object> lista = new ArrayList<Object>();

    public Proceso() {
    }

    public Proceso(ArrayList<Object> lista) {
        this.lista = lista;
    }

    public void agregarRegistro(Producto p) {
        this.lista.add(p);
    }


    public Producto obtenerRegistro(int i) {
        return (Producto) lista.get(i);
    }

    public int cantidadRegistros() {
        return this.lista.size();
    }

    public int buscaCodigo(int codigo) {
        for (int x = 0; x < cantidadRegistros(); x++) {
            if (codigo == obtenerRegistro(x).getCodigo()) {
                return x;
            }
        }
        return -1;
    }
}
