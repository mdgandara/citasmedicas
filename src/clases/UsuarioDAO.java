/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;


/**
 *
 * @author Sena
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {
    private final Connection connection;

    public UsuarioDAO(Connection connection) {
        this.connection = connection;
    }

    public void insert(Usuario usuario) throws SQLException {
        String query = "INSERT INTO usuarios (cedula_usuario, nombre_usuario, apellidos_usuario, celular_usuario, direccion_usuario, email_usuario) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, usuario.getCedula());
            statement.setString(2, usuario.getNombre());
            statement.setString(3, usuario.getApellidos());
            statement.setString(4, usuario.getCelular());
            statement.setString(5, usuario.getDireccion());
            statement.setString(6, usuario.getEmail());

            statement.executeUpdate();
        }
    }

    public Usuario getById(int cedula) throws SQLException {
        String query = "SELECT * FROM usuarios WHERE cedula_usuario = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, cedula);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    Usuario usuario = new Usuario();
                    usuario.setCedula(resultSet.getInt("cedula_usuario"));
                    usuario.setNombre(resultSet.getString("nombre_usuario"));
                    usuario.setApellidos(resultSet.getString("apellidos_usuario"));
                    usuario.setCelular(resultSet.getString("celular_usuario"));
                    usuario.setDireccion(resultSet.getString("direccion_usuario"));
                    usuario.setEmail(resultSet.getString("email_usuario"));
                    return usuario;
                }
            }
        }
        return null;
    }

    public void update(Usuario usuario) throws SQLException {
        String query = "UPDATE usuarios SET nombre_usuario = ?, apellidos_usuario = ?, celular_usuario = ?, direccion_usuario = ?, email_usuario = ? WHERE cedula_usuario = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, usuario.getNombre());
            statement.setString(2, usuario.getApellidos());
            statement.setString(3, usuario.getCelular());
            statement.setString(4, usuario.getDireccion());
            statement.setString(5, usuario.getEmail());
            statement.setInt(6, usuario.getCedula());

            statement.executeUpdate();
        }
    }

    public void delete(int cedula) throws SQLException {
        String query = "DELETE FROM usuarios WHERE cedula_usuario = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, cedula);
            statement.executeUpdate();
        }
    }

    public List<Usuario> getAll() throws SQLException {
        List<Usuario> usuarios = new ArrayList<>();
        String query = "SELECT * FROM usuarios";
        try (PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                Usuario usuario = new Usuario();
                usuario.setCedula(resultSet.getInt("cedula_usuario"));
                usuario.setNombre(resultSet.getString("nombre_usuario"));
                usuario.setApellidos(resultSet.getString("apellidos_usuario"));
                usuario.setCelular(resultSet.getString("celular_usuario"));
                usuario.setDireccion(resultSet.getString("direccion_usuario"));
                usuario.setEmail(resultSet.getString("email_usuario"));
                usuarios.add(usuario);
            }
        }
        return usuarios;
    }
}

