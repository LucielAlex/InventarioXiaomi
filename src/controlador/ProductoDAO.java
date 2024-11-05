package controlador;

import java.sql.Connection;
import controlador.ConexionBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.ProductoDTO;

public class ProductoDAO {
    ConexionBD conexion = new ConexionBD();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public List listarAlta(){
    String sql = "SELECT * FROM productos WHERE cat_pro = 'alta';";
    List<ProductoDTO> lista = new ArrayList<>();
    try{
      con = conexion.ConectarBaseDatos();
      ps = con.prepareStatement(sql);
      rs = ps.executeQuery();
        while (rs.next()) {
         ProductoDTO producto = new ProductoDTO();
         producto.setId(rs.getInt(1));
         producto.setNombre(rs.getString(2));
         producto.setCategoria(rs.getString(3));
         producto.setPrecio(rs.getDouble(4));
         producto.setCantidad(rs.getInt(5));
         producto.setEstado(rs.getString(6));
         producto.setIdtienda(rs.getInt(7));
         lista.add(producto);
        }
    }catch(Exception e){
        System.out.println("Error listar:"+e);
    }
    return lista;
    }
     public List listarMedia(){
    String sql = "SELECT * FROM productos WHERE cat_pro = 'media';";
    List<ProductoDTO> lista = new ArrayList<>();
    try{
      con = conexion.ConectarBaseDatos();
      ps = con.prepareStatement(sql);
      rs = ps.executeQuery();
        while (rs.next()) {
         ProductoDTO producto = new ProductoDTO();
         producto.setId(rs.getInt(1));
         producto.setNombre(rs.getString(2));
         producto.setCategoria(rs.getString(3));
         producto.setPrecio(rs.getDouble(4));
         producto.setCantidad(rs.getInt(5));
         producto.setEstado(rs.getString(6));
         producto.setIdtienda(rs.getInt(7));
         lista.add(producto);
        }
    }catch(Exception e){
        System.out.println("Error listar:"+e);
    }
    return lista;
    }
      public List listarBaja(){
    String sql = "SELECT * FROM productos WHERE cat_pro = 'baja';";
    List<ProductoDTO> lista = new ArrayList<>();
    try{
      con = conexion.ConectarBaseDatos();
      ps = con.prepareStatement(sql);
      rs = ps.executeQuery();
        while (rs.next()) {
         ProductoDTO producto = new ProductoDTO();
         producto.setId(rs.getInt(1));
         producto.setNombre(rs.getString(2));
         producto.setCategoria(rs.getString(3));
         producto.setPrecio(rs.getDouble(4));
         producto.setCantidad(rs.getInt(5));
         producto.setEstado(rs.getString(6));
         producto.setIdtienda(rs.getInt(7));
         lista.add(producto);
        }
    }catch(Exception e){
        System.out.println("Error listar:"+e);
    }
    return lista;
    }
}
