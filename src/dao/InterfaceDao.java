package dao;

import server.ConnectionFactory;

import java.sql.Connection;
import java.util.List;
/*
 *  Nome: Juliano Cesar Osmir hein RA: 339112013098
 *  Curso: ciencia da computação data: 30/11/2021
 *
 */
public interface InterfaceDao<T> {
    Connection con = ConnectionFactory.getConnection();
    void create(T t);
    List<T> findALL();
    T findById(Long id);
}
