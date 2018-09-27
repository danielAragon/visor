package pe.com.core.dao;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import pe.com.core.entity.Producto;
import pe.com.core.entity.Proveedor;
import pe.com.core.entity.Categoria;

/**
 * Clase que tiene los metodos de Acceso a Datos para la tabla Producto
 * @author 	Marcelo Fernando Rios Berru
 * @email 	marcesftwr2@gmail.com
 */
public class ProductoDao extends Conexion<Producto> {

    @Override
    public Producto insertar(Producto e) throws Exception {
        try {
            cn = obtenerConexion();
            String sql = "INSERT INTO PRODUCTO (nombre,idCategoria,idProveedor,esNacional,tieneGarantia) VALUES (?,?,?,?,?)";
            pr = cn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            pr.setString(1, e.getNombre().toUpperCase());
            if(e.getCategoria()!=null){
            	pr.setInt(2, e.getCategoria().getIdCategoria());
            }else{
            	pr.setInt(2, e.getIdCategoria());
            }
            
            if(e.getProveedor()!=null){
            	pr.setInt(3, e.getProveedor().getIdProveedor());
            }else {
            	pr.setInt(3, e.getIdProveedor());
            }
            pr.setInt(4, e.getEsNacional() ? 1 : 0);
            pr.setInt(5, e.getTieneGarantia() ? 1 : 0);
            pr.executeUpdate();
            rs = pr.getGeneratedKeys();
            rs.next();
            e.setIdProducto(rs.getInt(1));
        } finally {
        	rs.close();
            pr.close();
            cn.close();
        }
        return e;
    }

    @Override
    public Producto actualizar(Producto e) throws Exception {
       try{
            cn = obtenerConexion();
            String sql = "UPDATE PRODUCTO SET nombre=?,idCategoria=?,idProveedor=?,esNacional=?,tieneGarantia=? WHERE idProducto=?";
            pr = cn.prepareStatement(sql);
            pr.setString(1, e.getNombre().toUpperCase());
            if(e.getCategoria()!=null){
            	pr.setInt(2, e.getCategoria().getIdCategoria());
            }else{
            	pr.setInt(2, e.getIdCategoria());
            }
            if(e.getProveedor()!=null) {
            	pr.setInt(3, e.getProveedor().getIdProveedor());
            }else {
            	pr.setInt(3, e.getIdProveedor());
            }
            pr.setBoolean(4, e.getEsNacional());
            pr.setBoolean(5, e.getTieneGarantia());
            pr.setInt(6, e.getIdProducto());
            pr.executeUpdate();
        }finally{
            pr.close();
            cn.close();
        }
       return e;
    }

    @Override
    public Producto eliminar(Producto e) throws Exception {
        try{
            cn = obtenerConexion();
            String sql = "DELETE FROM Producto WHERE idProducto=?";
            pr = cn.prepareStatement(sql);
            pr.setInt(1, e.getIdProducto());
            pr.executeUpdate();
        }finally{
            pr.close();
            cn.close();
        }
        return e;
    }

    @Override
    public Producto obtener(Producto e) throws Exception {
        Producto producto = null;
        try{
            cn = obtenerConexion();
            String sql = "select p.*, c.nombre as categoria from producto p inner join categoria c on p.idCategoria = c.idCategoria WHERE p.idProducto=? ORDER BY nombre";
            pr = cn.prepareStatement(sql);
            pr.setInt(1, e.getIdProducto());
            rs = pr.executeQuery();
            while(rs.next()){
                producto = new Producto();
                producto.setIdProducto(rs.getInt("idProducto"));
                producto.setNombre(rs.getString("nombre").toUpperCase());
                producto.setIdCategoria(rs.getInt("idCategoria"));
                producto.setEsNacional(rs.getBoolean("esNacional"));
                producto.setTieneGarantia(rs.getBoolean("tieneGarantia"));
                producto.setCategoria(new Categoria());
                producto.getCategoria().setIdCategoria(rs.getInt("idCategoria"));
                producto.getCategoria().setNombre(rs.getString("categoria").toUpperCase());
                producto.setIdProveedor(rs.getInt("idProveedor"));
                producto.setProveedor(new Proveedor());
                producto.getProveedor().setIdProveedor(rs.getInt("idProveedor"));
                producto.getProveedor().setNombre(rs.getString("proveedor").toUpperCase());
            }
        }finally{
            rs.close();
            pr.close();
            cn.close();
        }
        return producto;
    }

    @Override
    public List<Producto> listar() throws Exception {
       List<Producto> productos = new ArrayList<Producto>();
        Producto producto;
        try{
            cn = obtenerConexion();
            String sql = "select p.*, c.nombre as categoria from producto p inner join categoria c on p.idCategoria = c.idCategoria ORDER BY nombre";
            pr = cn.prepareStatement(sql);
            rs = pr.executeQuery();
            while(rs.next()){
                producto = new Producto();
                producto.setIdProducto(rs.getInt("idProducto"));
                producto.setNombre(rs.getString("nombre").toUpperCase());
                producto.setIdCategoria(rs.getInt("idCategoria"));
                producto.setEsNacional(rs.getBoolean("esNacional"));
                producto.setTieneGarantia(rs.getBoolean("tieneGarantia"));
                producto.setCategoria(new Categoria());
                producto.getCategoria().setIdCategoria(rs.getInt("idCategoria"));
                producto.getCategoria().setNombre(rs.getString("categoria").toUpperCase());
                producto.setIdProveedor(rs.getInt("idProveedor"));
                producto.setProveedor(new Proveedor());
                producto.getProveedor().setIdProveedor(rs.getInt("idProveedor"));
                producto.getProveedor().setNombre(rs.getString("proveedor").toUpperCase());
                productos.add(producto);
            }
        }finally{
            rs.close();
            pr.close();
            cn.close();
        }
        return productos;
    }
    
    
    public List<Producto> listar(String nombre) throws Exception {
        List<Producto> productos = new ArrayList<Producto>();
         Producto producto;
         try{
             cn = obtenerConexion();
             String sql = "select p.*, c.nombre as categoria from producto p inner join categoria c on p.idCategoria = c.idCategoria ";
             sql+=" WHERE UCASE(p.nombre) LIKE '%" + nombre + "%'" ;
             sql+=" ORDER BY nombre";
             pr = cn.prepareStatement(sql);
             rs = pr.executeQuery();

             while(rs.next()){
                 producto = new Producto();
                 producto.setIdProducto(rs.getInt("idProducto"));
                 producto.setNombre(rs.getString("nombre").toUpperCase());
                 producto.setEsNacional(rs.getBoolean("esNacional"));
                 producto.setTieneGarantia(rs.getBoolean("tieneGarantia"));
                 producto.setIdCategoria(rs.getInt("idCategoria"));
                 producto.setCategoria(new Categoria());
                 producto.getCategoria().setIdCategoria(rs.getInt("idCategoria"));
                 producto.getCategoria().setNombre(rs.getString("categoria").toUpperCase());
                 producto.setIdProveedor(rs.getInt("idProveedor"));
                 producto.setProveedor(new Proveedor());
                 producto.getProveedor().setIdProveedor(rs.getInt("idProveedor"));
                 
                 System.out.println(producto.getProveedor().getNombre());
                 //producto.getProveedor().setNombre(rs.getString("proveedor").toUpperCase());

                 productos.add(producto);

             }
         }finally{
             rs.close();
             pr.close();
             cn.close();
         }
         return productos;
     }

}
