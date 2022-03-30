package udb.net.modulo1.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EstudianteRepository {
	@Autowired
	DataSource dataSource;
	
	String sql="";
	public List<Estudiante> buscarTodos(){
		sql="select * from estudiante";
		List<Estudiante> lista =new ArrayList<Estudiante>();
		try {
			Connection connection = getConexion();
			PreparedStatement sentencia =
					connection.prepareStatement(sql);
			ResultSet rs = sentencia.executeQuery();
			while(rs.next()) {
				Estudiante e = new Estudiante();
				e.setCodigo(Integer.parseInt(rs.getString("codigo")));
				e.setNombre(rs.getString("nombre"));
				e.setApellido(rs.getString("apellido"));
				e.setCum(Double.parseDouble(rs.getString("cum")));
				e.setCuotaMensual(Double.parseDouble(rs.getString("cuota")));
				lista.add(e);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return lista;
	}
	
	public void borrar(Integer codigo) {
		sql="delete from estudiante where codigo=?";
		try {
			Connection cn = getConexion();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void insertar(Estudiante e) {
		sql ="insert into estudiante (codigo,nombre,apellido,cum,cuota) values (?,?,?,?,?)";
		try {
			Connection connection = getConexion();
			PreparedStatement sentencia = connection.prepareStatement(sql);
			sentencia.setInt(1, e.getCodigo());
			sentencia.setString(2, e.getNombre());
			sentencia.setString(3, e.getApellido());
			sentencia.setDouble(4, e.getCum());
			sentencia.setDouble(5, e.getCuotaMensual());
			sentencia.execute();
		} catch (Exception e2) {
			// TODO: handle exception
			e2.printStackTrace();
		}
	}
	
	
	private Connection getConexion() throws SQLException {
//		Connection conexion = DriverManager.getConnection(
//			"jdbc:mysql://localhost/spring?serverTimezone=UTC","root","");
//		Connection conexion = MiDataSource.getInstance().getConnection();
		Connection conexion = dataSource.getConnection();
		return conexion;
	}
}
