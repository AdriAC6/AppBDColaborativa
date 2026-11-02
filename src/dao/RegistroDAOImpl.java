package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dto.RegistroConAlumnoDTO;
import util.JbdcUtil;

public class RegistroDAOImpl implements RegistroDAO {

    @Override
    public List<RegistroConAlumnoDTO> listarConAlumno() {
        String sql = """
                SELECT id_alumno, alumno.nombre AS nombreAlumno, alumno.apellidos AS apellidosAlumno, reg.id AS idRegistro, reg.nombre AS nombreRegistro, reg.fecha AS fechaRegistro, reg.puntuacion AS puntuacionRegistro FROM registro_ejercicios reg INNER JOIN alumnos alumno ON reg.id_alumno = alumno.id;
                """;

        List<RegistroConAlumnoDTO> listaConAlumnos = new ArrayList<>();
        try (Connection con = JbdcUtil.getConnection();
                Statement stm = con.createStatement();
                ResultSet rs = stm.executeQuery(sql);) {

            while (rs.next()) {
                listaConAlumnos.add(new RegistroConAlumnoDTO(
                        rs.getInt("id_alumno"),
                        rs.getString("nombreAlumno"),
                        rs.getString("apellidosAlumno"),
                        rs.getInt("idRegistro"),
                        rs.getString("nombreRegistro"),
                        rs.getDate("fechaRegistro"),
                        rs.getInt("puntuacionRegistro")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listaConAlumnos;
    }

}
