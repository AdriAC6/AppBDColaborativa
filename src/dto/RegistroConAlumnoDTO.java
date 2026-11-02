package dto;

import java.sql.Date;

/**
 * RegistroConAlumnoDTO
 */
public class RegistroConAlumnoDTO {
    int idAlumno;
    String nombreAlumno;
    String apellidosAlumno;
    int idRegistro;
    String nombreRegistro;
    Date fecha;
    int puntuacion;

    public RegistroConAlumnoDTO(int idAlumno, String nombreAlumno, String apellidosAlumno, int idRegistro,
            String nombreRegistro, Date fecha, int puntuacion) {
        this.idAlumno = idAlumno;
        this.nombreAlumno = nombreAlumno;
        this.apellidosAlumno = apellidosAlumno;
        this.idRegistro = idRegistro;
        this.nombreRegistro = nombreRegistro;
        this.fecha = fecha;
        this.puntuacion = puntuacion;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public String getApellidosAlumno() {
        return apellidosAlumno;
    }

    public void setApellidosAlumno(String apellidosAlumno) {
        this.apellidosAlumno = apellidosAlumno;
    }

    public int getIdRegistro() {
        return idRegistro;
    }

    public void setIdRegistro(int idRegistro) {
        this.idRegistro = idRegistro;
    }

    public String getNombreRegistro() {
        return nombreRegistro;
    }

    public void setNombreRegistro(String nombreRegistro) {
        this.nombreRegistro = nombreRegistro;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    @Override
    public String toString() {
        return "RegistroConAlumnoDTO [idAlumno=" + idAlumno + ", nombreAlumno=" + nombreAlumno + ", apellidosAlumno="
                + apellidosAlumno + ", idRegistro=" + idRegistro + ", nombreRegistro=" + nombreRegistro + ", fecha="
                + fecha + ", puntuacion=" + puntuacion + "]";
    }
}
