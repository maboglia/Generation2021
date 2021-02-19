package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Libro;

public class LibroDAO implements LibroIDAO {
	private Connection con = null;
	private Statement statement = null;
	private PreparedStatement ps=null;
	private ResultSet rs = null;

	private Connessione c = new Connessione();

	public Libro getLibro(int id) {
		Libro l = null;
		this.con = c.connetti();
		try {
			this.statement = this.con.createStatement();
			this.rs = this.statement.executeQuery("select * from libro where id=" + id);
            this.rs.next();
            l=new Libro();
            l.setId(rs.getInt("id"));
            l.setTitolo(rs.getString("titolo"));
            l.setPagine(rs.getInt("pagine"));
            l.setEditore_id(rs.getInt("editore_id"));
			l.setPrezzo(rs.getDouble("prezzo"));
//			l.setP_iva(rs.getDouble("p_iva"));
			
            
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return l;

	}
	public List<Libro> getLibri(){
		List<Libro> libri = new ArrayList<>();
		this.con = c.connetti();
		try {
			this.statement = this.con.createStatement();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			this.rs = this.statement.executeQuery(FIND_ALL);
			while(this.rs.next()) {
				Libro l = new Libro();
				l.setId(rs.getInt("id"));
				l.setPagine(rs.getInt("pagine"));
				l.setEditore_id(rs.getInt("editore_id"));
				l.setPrezzo(rs.getDouble("prezzo"));
//				l.setP_iva(rs.getDouble("p_iva"));
				l.setTitolo(rs.getString("titolo"));
				libri.add(l);
				
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return libri;
	}


@Override
public void addLibro(Libro l) throws SQLException {
	this.con = c.connetti();

	this.ps= this.con.prepareStatement("insert into libro (titolo,pagine,prezzo,p_iva,editore_id)values(?,?,?,?,?) ");
	this.ps.setString(1, l.getTitolo());
	this.ps.setInt(2, l.getPagine());
	this.ps.setDouble(3, l.getPrezzo());
//	this.ps.setDouble(4, l.getP_iva());
	this.ps.setInt(5, l.getEditore_id());
	this.ps.executeUpdate();

	
}
@Override
public void deleteLibro(Libro l) throws SQLException {
	this.con = c.connetti();
	this.statement= this.con.createStatement();
	this.statement.executeUpdate("delete from libro where id= " + l.getId());
	
	
}
@Override
public void updateLibro(Libro l) throws SQLException {
	this.con = c.connetti();
	this.ps= this.con.prepareStatement("update libro set titolo=?,pagine=?,prezzo=?,p_iva=?,editore_id=? where id=?" );
	this.ps.setString(1, l.getTitolo());
	this.ps.setInt(2, l.getPagine());
	this.ps.setDouble(3, l.getPrezzo());
//	this.ps.setDouble(4, l.getP_iva());
	this.ps.setInt(5, l.getEditore_id());
	this.ps.setInt(6, l.getId());
	this.ps.executeUpdate();
	
	
	
}
}
