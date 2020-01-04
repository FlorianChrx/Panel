package dao;

import java.sql.SQLException;
import java.util.List;

public interface DAO<T, E> {
	public E findById(T key) throws SQLException;

	public void create(E e) throws SQLException;

	public List<E> findAll() throws SQLException;

	public void delete(T key) throws SQLException;

	public void update(T key, E e) throws SQLException;
}