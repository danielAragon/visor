package pe.com.core.dao;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import pe.com.core.entity.Proveedor;


/**
 * Clase que tiene los metodos de Acceso a Datos para la tabla Producto
 * @author 	Marcelo Fernando Rios Berru
 * @email 	marcesftwr2@gmail.com
 */

public class ProveedorDao extends Conexion<Proveedor> {

	@Override
	public Proveedor insertar(Proveedor t) throws Exception {
		try {
            cn = obtenerConexion();
            String sql = "INSERT INTO PROVEEDOR (nombre, numeroTelefonico, tipoPago) VALUES (?,?,?)";
            pr = cn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            pr.setString(1, t.getNombre().toUpperCase());
            pr.setString(2, t.getNumeroTelefonico());
            pr.setString(3, t.getTipoPago().toUpperCase());
            pr.executeUpdate();
            rs = pr.getGeneratedKeys();
            rs.next();
            t.setIdProveedor(rs.getInt(1));
        } finally {
        	rs.close();
            pr.close();
            cn.close();
        }
        return t;
	}

	@Override
	public Proveedor actualizar(Proveedor t) throws Exception {
		try {
			cn = obtenerConexion();
			String sql = "UPDATE PROVEEDOR SET nombre=?, numeroTelefonico=?, tipoPago=?, existeDeuda=? WHERE id=?";
			pr = cn.prepareStatement(sql);
			pr.setString(1, t.getNombre().toUpperCase());
			pr.setString(2, t.getNumeroTelefonico());
			pr.setString(3, t.getTipoPago().toUpperCase());
			pr.setBoolean(4, t.getExisteDeuda());
			pr.setInt(5, t.getIdProveedor());
			pr.executeUpdate();
		} finally {
			pr.close();
			cn.close();
		}
		return t;
	}

	@Override
	public Proveedor eliminar(Proveedor t) throws Exception {
		try {
			cn = obtenerConexion();
			String sql = "DELETE FROM CATEGORIA WHERE id=?";
			pr = cn.prepareStatement(sql);
			pr.setInt(1, t.getIdProveedor());
			pr.executeUpdate();
		} finally {
			pr.close();
			cn.close();
		}
		return t;
	}

	@Override
	public Proveedor obtener(Proveedor t) throws Exception {
		Proveedor proveedor = null;
		try {
			cn = obtenerConexion();
			String sql = "SELECT * FROM PROVEEDOR WHERE idProveedor=? ORDER BY nombre";
			pr = cn.prepareStatement(sql);
			pr.setLong(1, t.getIdProveedor());
			rs = pr.executeQuery();
			while (rs.next()) {
				proveedor = new Proveedor();
				proveedor.setIdProveedor(rs.getInt("idProveedor"));
				proveedor.setNombre(rs.getString("nombre").toUpperCase());
				proveedor.setNumeroTelefonico(rs.getString("numeroTelefonico"));
				proveedor.setTipoPago(rs.getString("tipoPago"));
				proveedor.setExisteDeuda(rs.getBoolean("existeDeuda"));
			}
		} finally {
			rs.close();
			pr.close();
			cn.close();
		}
		return proveedor;
	}

	@Override
	public List<Proveedor> listar() throws Exception {
		List<Proveedor> proveedores = new ArrayList<Proveedor>();
		Proveedor proveedor;
		try {
			cn = obtenerConexion();
			String sql = "SELECT * FROM PROVEEDOR ORDER BY nombre";
			pr = cn.prepareStatement(sql);
			rs = pr.executeQuery();
			while (rs.next()) {
				proveedor = new Proveedor();
				proveedor.setIdProveedor(rs.getInt("idProveedor"));
				proveedor.setNombre(rs.getString("nombre").toUpperCase());
				proveedor.setNumeroTelefonico(rs.getString("numeroTelefonico"));
				proveedor.setTipoPago(rs.getString("tipoPago"));
				proveedor.setExisteDeuda(rs.getBoolean("existeDeuda"));
				proveedores.add(proveedor);
			}
		} finally {
			rs.close();
			pr.close();
			cn.close();
		}
		return proveedores;
	}
	public List<Proveedor> listar(String nombre) throws Exception {
		List<Proveedor> proveedores = new ArrayList<Proveedor>();
		Proveedor proveedor;
		try {
			cn = obtenerConexion();
			String sql = "SELECT * FROM PROVEEDOR ";
			sql += " WHERE UCASE(nombre) LIKE '%" + nombre + "%'";
			sql += " ORDER BY nombre";
			pr = cn.prepareStatement(sql);
			rs = pr.executeQuery();
			while (rs.next()) {
				proveedor = new Proveedor();
				proveedor.setIdProveedor(rs.getInt("idProveedor"));
				proveedor.setNombre(rs.getString("nombre").toUpperCase());
				proveedor.setNumeroTelefonico(rs.getString("numeroTelefonico"));
				proveedor.setTipoPago(rs.getString("tipoPago"));
				proveedor.setExisteDeuda(rs.getBoolean("existeDeuda"));
				proveedores.add(proveedor);
			}
		} finally {
			rs.close();
			pr.close();
			cn.close();
		}
		return proveedores;
	}

}