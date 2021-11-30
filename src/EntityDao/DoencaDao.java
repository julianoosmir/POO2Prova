package EntityDao;

import dao.InterfaceDao;
import models.Doenca;
import server.ConnectionFactory;

import javax.swing.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DoencaDao implements InterfaceDao<Doenca> {
    private PreparedStatement stmt = null;

    @Override
    public void create(Doenca doenca) {
        try {
            stmt = con.prepareStatement("INSERT INTO Doenca(cid,nome)VALUES(?,?)");
            stmt.setString(1, doenca.getCID());
            stmt.setString(2, doenca.getNome());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    @Override
    public List<Doenca> findALL() {
        ResultSet rs = null;
        List<Doenca> doencas = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM Doenca");
            rs = stmt.executeQuery();

            while (rs.next()) {
                System.out.println(rs);
                Doenca doenca = new Doenca();

                doenca.setId(rs.getLong("id"));
                doenca.setCID(rs.getString("cid"));
                doenca.setNome(rs.getString("nome"));

                doencas.add(doenca);
            }

        } catch (SQLException ex) {
            Logger.getLogger(DoencaDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return doencas;

    }


    @Override
    public Doenca findById(Long id) {
        ResultSet rs = null;
        Doenca doenca = new Doenca();
        try {
            stmt = con.prepareStatement("SELECT * FROM Doenca where id = ?");
            stmt.setLong(1, id);
            rs = stmt.executeQuery();

            while (rs.next()) {
                System.out.println(rs);


                doenca.setId(rs.getLong("id"));
                doenca.setCID(rs.getString("cid"));
                doenca.setNome(rs.getString("nome"));


            }

        } catch (SQLException ex) {
            Logger.getLogger(DoencaDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return doenca;
    }
}
