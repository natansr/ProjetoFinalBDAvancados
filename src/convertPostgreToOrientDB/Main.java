package convertPostgreToOrientDB;

import java.sql.*;
import daoOrientDB.*;
import daoPostgreSQL.*;

public class Main {

	public static void main(String[] args) throws SQLException {
		
		ConexaoPostgreSQL c = new ConexaoPostgreSQL("PostgreSql","localhost","5432","ProjetoFinal","postgres","blonde");
		c.conect();
		
		ResultSet rs = c.query("SELECT * FROM pghydro.pghft_drainage_line");
		
		while(rs.next()){
			
			int pk = rs.getInt("drn_pk");
			
			System.out.println(pk);
			
			
		}
		
		
		c.disconect();
	}

}
