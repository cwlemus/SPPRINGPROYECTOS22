package udb.net.modulo1.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class EstudianteRepositoryPlantilla {
	@Autowired
	private JdbcTemplate plantilla;
	
	String sql="";
	public List<Estudiante> buscarTodos(){
		sql="select codigo as codigo,nombre as nombre,apellido as apellido,cuota as cuotaMensual from estudiante";		
		return plantilla.query(sql, new BeanPropertyRowMapper<Estudiante>(Estudiante.class));
	}
	
	public void borrar(Estudiante estudiante) {
		sql="delete from estudiante where codigo=?";
		plantilla.update(sql,estudiante.getCodigo());
	}
	
	public void insertar(Estudiante e) {
		sql ="insert into estudiante (codigo,nombre,apellido,cum,cuota) values (?,?,?,?,?)";
		plantilla.update(sql, e.getCodigo(),e.getNombre(),e.getApellido(),e.getCum(),e.getCuotaMensual());
	}
	
	public void actualizar(Estudiante estudiante) {
		sql = "update estudiante set nombre=?, apellido=?, cum=?, cuota=? where codigo=?";
		plantilla.update(sql,estudiante.getNombre(),estudiante.getApellido(),estudiante.getCum(),estudiante.getCuotaMensual(),estudiante.getCodigo());
	}
}
