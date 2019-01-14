/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.Part;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named(value = "subirimagenBean")
@RequestScoped
//@ManagedBean
//@RequestScoped
public class SubirimagenBean {

    private Part fileUpload;
    private String nombre;

    private List<String> lstimagen = new ArrayList<>();

    public List<String> getLstimagen() {
        lstimagen = new ArrayList<>();
        lstimagen.add("IMG_20181106_195207.jpg");
        lstimagen.add("MURIEL.jpg");
        lstimagen.add("SUMACC  SACHA  S.A.C..jpg");
        lstimagen.add("Grupo_Niche_-_Entregr.mp3");
        lstimagen.add("libro de reclamos marcona.jpg");
        lstimagen.add("VID-20181127-WA0002.mp4");
        lstimagen.add("1544209981680-1196942037.jpg");
        return lstimagen;
    }

    public void setLstimagen(List<String> lstimagen) {
        this.lstimagen = lstimagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(String publicacion) {
        this.publicacion = publicacion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    private String publicacion;
    private String fecha;

    /**
     * Creates a new instance of SubirimagenBean
     */
    public SubirimagenBean() {
    }

    public Part getFileUpload() {
        return fileUpload;
    }

    public void setFileUpload(Part fileUpload) {
        this.fileUpload = fileUpload;
    }

    public void susbir() {

        try {
            if (fileUpload != null) {
                System.out.println("Nombre publicació: " + nombre);
                System.out.println("publicació: " + publicacion);
                System.out.println("Fecha: " + fecha);

                System.out.println("Nombre de imagen: " + fileUpload.getSubmittedFileName());
                System.out.println("tipo de archivo: " + fileUpload.getContentType());
                System.out.println("tamaño: " + fileUpload.getSize());
                fileUpload.write("D:\\Biaster\\Subir_imagenJSF\\web\\resources\\img\\" + fileUpload.getSubmittedFileName());

                nombre = "";
                publicacion = "";
                fecha = "";
            } else {
            }

        } catch (IOException ex) {
            Logger.getLogger(SubirimagenBean.class.getName()).log(Level.SEVERE, null, ex);

        }
    }
}
