package com.lunadev.automatizacion_ordenamiento_de_archivos;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa una lista de registros para la automatización de ordenamiento de archivos.
 */
public class ListaDeRegistro {

    private List<Registro> listaRegistros;

    /**
     * Constructor de la clase ListaDeRegistro.
     */
    public ListaDeRegistro() {
        this.listaRegistros = new ArrayList<>();
    }

    /**
     * Agrega un nuevo registro a la lista.
     * 
     * @param clave Clave del registro.
     * @param carpetaDestino Carpeta destino del registro.
     * @param ruta Ruta del registro.
     */
    public void agregarRegistro(String clave, String carpetaDestino, String ruta) {
        Registro nuevoRegistro = new Registro(clave, carpetaDestino, ruta);
        listaRegistros.add(nuevoRegistro);
    }

    /**
     * Obtiene la lista de registros.
     * 
     * @return Lista de registros.
     */
    public List<Registro> obtenerRegistros() {
        return listaRegistros;
    }

    /**
     * Obtiene el tamaño de la lista de registros.
     * 
     * @return Tamaño de la lista de registros.
     */
    public int tamañoLista() {
        return listaRegistros.size();
    }

    /**
     * Obtiene la clave de un registro en el índice especificado.
     * 
     * @param index Índice del registro.
     * @return Clave del registro en el índice especificado.
     */
    public String obtenerClaveIndex(int index) {
        if (index >= 0 && index < listaRegistros.size()) {
            return listaRegistros.get(index).getClave();
        } else {
            return null;
        }
    }

    /**
     * Obtiene la carpeta destino de un registro en el índice especificado.
     * 
     * @param index Índice del registro.
     * @return Carpeta destino del registro en el índice especificado.
     */
    public String obtenerDestinoIndex(int index) {
        if (index >= 0 && index < listaRegistros.size()) {
            return listaRegistros.get(index).getCarpetaDestino();
        } else {
            return null;
        }
    }

    /**
     * Obtiene la ruta de un registro en el índice especificado.
     * 
     * @param index Índice del registro.
     * @return Ruta del registro en el índice especificado.
     */
    public String obtenerRutaIndex(int index) {
        if (index >= 0 && index < listaRegistros.size()) {
            return listaRegistros.get(index).getRuta();
        } else {
            return null;
        }
    }

    /**
     * Borra un registro de la lista en el índice especificado.
     * 
     * @param index Índice del registro a borrar.
     * @return true si el registro se borra correctamente, false si el índice es inválido.
     */
    public boolean borrarRegistroIndex(int index) {
        if (index >= 0 && index < listaRegistros.size()) {
            listaRegistros.remove(index);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Clase interna que representa un registro en la lista.
     */
    private class Registro {

        private String clave;
        private String CarpetaDestino;
        private String ruta;

        /**
         * Constructor de la clase Registro.
         * 
         * @param clave Clave del registro.
         * @param CarpetaDestino Carpeta destino del registro.
         * @param ruta Ruta del registro.
         */
        public Registro(String clave, String CarpetaDestino, String ruta) {
            this.clave = clave;
            this.CarpetaDestino = CarpetaDestino;
            this.ruta = ruta;
        }

        /**
         * Obtiene la clave del registro.
         * 
         * @return Clave del registro.
         */
        public String getClave() {
            return clave;
        }

        /**
         * Obtiene la carpeta destino del registro.
         * 
         * @return Carpeta destino del registro.
         */
        public String getCarpetaDestino() {
            return CarpetaDestino;
        }

        /**
         * Obtiene la ruta del registro.
         * 
         * @return Ruta del registro.
         */
        public String getRuta() {
            return ruta;
        }
    }
}
