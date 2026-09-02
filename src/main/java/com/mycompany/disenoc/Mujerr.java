
package com.mycompany.disenoc;

public class Mujerr extends Persona{
    private String facultad;
    private String folio;

    public Mujerr(String nombre, String paterno, String materno, int edad, String facultad, String folio) {
        super(nombre, paterno, materno, edad);
        this.facultad = facultad;
        this.folio = folio;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    @Override
    public String toString() {
        return "Mujer{" + "folio=" + folio + ", nombre=" + getNombre() + ", paterno=" + getPaterno() +
               ", materno=" + getMaterno() + ", edad=" + getEdad() + ", facultad=" + facultad + '}';
    }
}