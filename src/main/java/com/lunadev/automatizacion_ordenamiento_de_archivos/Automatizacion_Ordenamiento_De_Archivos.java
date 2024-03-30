package com.lunadev.automatizacion_ordenamiento_de_archivos;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Clase que proporciona funcionalidad para automatizar el ordenamiento de archivos.
 */
public class Automatizacion_Ordenamiento_De_Archivos {
    
    /**
     * Ordena los archivos de una carpeta según la extensión especificada y los mueve a una carpeta destino.
     * 
     * @param pathCarpeta Path de la carpeta que se analizará.
     * @param extension Extensión de los archivos que se moverán.
     * @param pathCarpetaDestino Path de la carpeta destino donde se guardarán los archivos ordenados.
     */
    public void ordenarArchivos(String pathCarpeta, String extension, String pathCarpetaDestino) {
        // Verificar si la carpeta destino existe, y crearla si no
        File carpetaDestino = new File(pathCarpetaDestino);
        if (!carpetaDestino.exists()) {
            carpetaDestino.mkdirs(); // Crear la carpeta y sus subdirectorios si no existen
        }
        
        // Obtener la lista de archivos en la carpeta seleccionada
        File carpetaSeleccionada = new File(pathCarpeta);
        File[] archivos = carpetaSeleccionada.listFiles();
        
        // Recorrer los archivos y mover los que tengan la extensión especificada
        for (File archivo : archivos) {
            if (archivo.isFile() && archivo.getName().endsWith(extension)) {
                // Mover el archivo a la carpeta destino
                try {
                    Path origen = Paths.get(archivo.getAbsolutePath());
                    Path destino = Paths.get(pathCarpetaDestino + File.separator + archivo.getName());
                    Files.move(origen, destino);
                    System.out.println("Archivo movido correctamente: " + archivo.getName());
                } catch (IOException e) {
                    System.out.println("Error al mover el archivo: " + archivo.getName());
                    e.printStackTrace();
                }
            }
        }
    }
}
