package dao;

import server.ConnectionFactory;

import java.sql.Connection;
import java.util.List;

public interface InterfaceDao<T> {
    Connection con = ConnectionFactory.getConnection();
    void create(T t);
    List<T> findALL();
    T findById(Long id);
}
