package com.lunadev.automatizacion_ordenamiento_de_archivos;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;

/**
 * Clase que proporciona funcionalidad para el manejo de carpetas en la interfaz gráfica.
 */
public class ManejoCarpeta {
    private String carpeta_a_ordenar;

    /**
     * Constructor de la clase ManejoCarpeta.
     */
    public ManejoCarpeta() {
        this.carpeta_a_ordenar = "";
    }

    /**
     * Obtiene la ruta de la carpeta seleccionada.
     * 
     * @return Ruta de la carpeta seleccionada.
     */
    public String getCarpetaSeleccionada() {
        return carpeta_a_ordenar;
    }

    /**
     * Permite al usuario seleccionar una carpeta.
     */
    public void seleccionarCarpeta() {
        JFileChooser fileChooser = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        fileChooser.setDialogTitle("Seleccionar Carpeta a Ordenar");
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        int seleccion = fileChooser.showOpenDialog(null);

        if (seleccion == JFileChooser.APPROVE_OPTION) {
            carpeta_a_ordenar = fileChooser.getSelectedFile().getAbsolutePath();
        } else {
            System.out.println("Operacion cancelada por el usuario");
        }
    }
}
