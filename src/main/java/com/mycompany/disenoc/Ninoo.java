
package com.mycompany.disenoc;

public class Ninoo extends Persona{
    private String tutor;
    private String telefono;
    private String escuela;
    private String folio;

    public Ninoo(String nombre, String paterno, String materno, int edad, String tutor, String telefono, String escuela, String folio) {
        super(nombre, paterno, materno, edad);
        this.tutor = tutor;
        this.telefono = telefono;
        this.escuela = escuela;
        this.folio = folio;
    }

    public String getTutor() {
        return tutor;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    @Override
    public String toString() {
        return "Niño{" + "folio=" + folio + ", nombre=" + getNombre() + ", paterno=" + getPaterno() +
               ", materno=" + getMaterno() + ", edad=" + getEdad() + ", tutor=" + tutor +
               ", teléfono=" + telefono + ", escuela=" + escuela + '}';
    }
}
