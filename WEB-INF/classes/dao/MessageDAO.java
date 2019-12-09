package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import data.DataBaseConnection;
import model.Message;

public class MessageDAO implements DAO<Integer, Message>{

	@Override
	public Message findById(Integer key) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void create(Message e) throws SQLException {
		
		String query = "select max(id) from personne";
		PreparedStatement ps;
		int id = 0;
		try {
			ps = DataBaseConnection.getConnection().prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			rs.next();
			id = rs.getInt(1) + 1;
		} catch (ClassNotFoundException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		query = "insert into message values (?,?,?,?,?)";
		try {
			ps = DataBaseConnection.getConnection().prepareStatement(query);
			ps.setInt(1, id);
			ps.setString(1, e.getName());
			ps.setString(1, e.getMail());
			ps.setString(1, e.getSubject());
			ps.setString(1, e.getMessage());
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	@Override
	public List<Message> findAll() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Integer key) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Integer key, Message e) throws SQLException {
		// TODO Auto-generated method stub
		
	}

}
