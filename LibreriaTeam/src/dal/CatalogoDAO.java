package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entities.Autore;
import entities.Catalogo;
import entities.Editore;
import entities.Libro;


public class CatalogoDAO implements CatalogoIDAO {
	private Connection con = null;
	private Statement statement = null;
	private PreparedStatement ps=null;
	private ResultSet rs = null;

	private Connessione c = new Connessione();
	@Override
	public Catalogo getAL(String titolo) throws SQLException {
		Catalogo al = null;
		this.con = c.connetti();
		try {
			this.statement = this.con.createStatement();
			this.rs = this.statement.executeQuery(GET_ONELIBRO + titolo);
            this.rs.next();
            al = new Catalogo();
            al.getLibro().setTitolo(rs.getString("titolo"));
            //al.getEditore().setNome(rs.getString("editore"));
            al.getAutore().setNome(rs.getString("autore"));
           // al.getLibro().setPrezzo(rs.getDouble("prezzo"));         
           
		} catch (SQLException f) {
			// TODO Auto-generated catch block
			f.printStackTrace();
		}

		return al;
	}

	@Override
	public List<Catalogo> getAL() throws SQLException {
	List<Catalogo> all = new ArrayList<>();
		
		con = c.connetti();
		ps = con.prepareStatement(GET_ALL);
		rs = ps.executeQuery();
		
		  
		    
		while(rs.next()) {
		 	Libro l = new Libro();
		    Editore e = new Editore();
		    Autore a = new Autore();
			Catalogo al = new Catalogo(l,a,e);
            al.getLibro().setTitolo(rs.getString("titolo"));
            al.getEditore().setNome(rs.getString("editore"));
            al.getAutore().setNome(rs.getString("autore"));
            al.getLibro().setPrezzo(rs.getDouble("prezzo"));   
            all.add(al);
		}
		
		return all;
	}

	@Override
	public Catalogo getALi(String autore) throws SQLException {
		Catalogo al = null;
		this.con = c.connetti();
		try {
			this.statement = this.con.createStatement();
			this.rs = this.statement.executeQuery(GET_ONEAUTORE + autore);
            this.rs.next();
            al = new Catalogo();
            al.getLibro().setTitolo(rs.getString("titolo"));
            //al.getEditore().setNome(rs.getString("editore"));
            al.getAutore().setNome(rs.getString("autore"));
           // al.getLibro().setPrezzo(rs.getDouble("prezzo"));         
           
		} catch (SQLException f) {
			// TODO Auto-generated catch block
			f.printStackTrace();
		}
		return al;
	}

}
