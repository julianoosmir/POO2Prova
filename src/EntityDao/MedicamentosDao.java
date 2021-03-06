package EntityDao;

import Controllers.DoencaController;
import dao.InterfaceDao;
import models.Medicamento;

import javax.swing.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/*
 *  Nome: Juliano Cesar Osmir hein RA: 339112013098
 *  Curso: ciencia da computação data: 30/11/2021
 *
 */
public class MedicamentosDao implements InterfaceDao<Medicamento> {
    private PreparedStatement stmt = null;
    DoencaController doenca = new DoencaController();


    @Override
    public void create(Medicamento medicamento) {
        try {
            stmt = con.prepareStatement("INSERT INTO Medicamento(nome,laboratorioFabricante,principioAtivo,doenca) VALUES(?,?,?,?)");
            stmt.setString(1, medicamento.getNome());
            stmt.setString(2, medicamento.getLaboratorioFabricante());
            stmt.setString(3, medicamento.getPrincipioAtivo());
            stmt.setLong(4, medicamento.getDoenca().getId());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    @Override
    public List<Medicamento> findALL() {
        ResultSet rs = null;
        List<Medicamento> medicamentos = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM Medicamento");
            rs = stmt.executeQuery();

            while (rs.next()) {
                System.out.println(rs);
                Medicamento medicamento = new Medicamento();

                medicamento.setId(rs.getLong("id"));
                medicamento.setNome(rs.getString("nome"));
                medicamento.setLaboratorioFabricante(rs.getString("laboratorioFabricante"));
                medicamento.setPrincipioAtivo(rs.getString("principioAtivo"));
                medicamento.setDoenca(doenca.buscarDoenca(rs.getLong("doenca")));
                medicamentos.add(medicamento);
            }

        } catch (SQLException ex) {
            Logger.getLogger(DoencaDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return medicamentos;
    }

    @Override
    public Medicamento findById(Long id) {
        return null;
    }
}
