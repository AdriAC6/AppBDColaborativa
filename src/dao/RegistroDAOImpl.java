package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import dto.RegistroDTO;

public class RegistroDAOImpl implements RegistroDAO {
    private Connection con;

    public RegistroDAOImpl(Connection con) {
        this.con = con; 
    }

    @Override
    public boolean insertar(RegistroDTO registro) {
        String sql = """
            INSERT INTO registro_ejercicios (nombre, fecha, id_alumno, puntuacion)
            VALUES (?, ?, ?, ?)
        """;

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, registro.getNombre());
            ps.setDate(2, Date.valueOf(registro.getFecha()));
            ps.setInt(3, registro.getId_alumno());
            
            if (registro.getPuntuacion() != null) {
                ps.setInt(4, registro.getPuntuacion());
            } else {
                ps.setNull(4, java.sql.Types.INTEGER);
            }

            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error SQL: " + e.getMessage());

            return false;
        }
    }
    
}
