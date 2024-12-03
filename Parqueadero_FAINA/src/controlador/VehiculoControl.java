package controlador;

import conexion.Conexion;
import modelo.Vehiculo;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author royer
 */
//Metodo para registrar ingreso vehiculo
public class VehiculoControl {

    public boolean guardar(Vehiculo objeto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("insert into tb_vehiculo values (?,?,?,?,?,?,?)");

            consulta.setInt(1, 0);
            consulta.setString(2, objeto.getPlaca());
            consulta.setString(3, objeto.getTipoVehiculo());
            consulta.setString(4, objeto.getHoraEntrada());
            consulta.setString(5, objeto.getHoraSalida());
            consulta.setDouble(6, objeto.getTotalValor());
            consulta.setString(7, objeto.getEstado());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
        } catch (SQLException e) {
            System.out.println("Error al ingresar el vehiculo" + e);
        }
        return respuesta;
    }

    public ArrayList<Vehiculo> listaVehiculo = new ArrayList<>();

    public ArrayList buscaVehiculosPlacaFecha(String placaCarro, String fecha) {
        String sql = "";

        fecha = fecha.replace("/", "-");
        if (!placaCarro.isEmpty() && !fecha.isBlank()) {
            sql = "select * FROM tb_vehiculo WHERE placa LIKE  '%" + placaCarro + "%' AND hora_entrada LIKE '" + fecha + "%';";
        } else if (!placaCarro.isEmpty()) {
            sql = "select * FROM tb_vehiculo WHERE placa LIKE  '%" + placaCarro + "%';";

        } else if (!fecha.isEmpty()) {
            sql = "select * FROM tb_vehiculo WHERE hora_entrada LIKE '" + fecha + "%';";

        }
        Statement st;

        try {
            Connection cn = Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            Vehiculo vehiculo;

            while (rs.next()) {
                vehiculo = new Vehiculo();
                vehiculo.setIdVehiculo(rs.getInt("id_vehiculo"));
                vehiculo.setPlaca(rs.getString("placa"));
                vehiculo.setTipoVehiculo(rs.getString("tipo_vehiculo"));
                vehiculo.setHoraEntrada(rs.getString("hora_entrada"));
                vehiculo.setHoraSalida(rs.getString("hora_salida"));
                vehiculo.setTotalValor(rs.getDouble("valor_pagado"));
                vehiculo.setEstado(rs.getString("estado"));

                listaVehiculo.add(vehiculo);
            }

        } catch (SQLException e) {
            System.out.println("Error al consultar vehiculo" + e);
        }
        return listaVehiculo;
    }

    public boolean actualizar(Vehiculo objeto, int idVehiculo) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("update tb_vehiculo set hora_salida =?, valor_pagado=?,"
                    + " estado=? where id_vehiculo = '" + idVehiculo + "';");
            consulta.setString(1, objeto.getHoraSalida());
            consulta.setDouble(2, objeto.getTotalValor());
            consulta.setString(3, objeto.getEstado());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }

        } catch (SQLException e) {
            System.out.println("Error al actualizar vehiculo" + e);

        }

        return respuesta;
    }

}
