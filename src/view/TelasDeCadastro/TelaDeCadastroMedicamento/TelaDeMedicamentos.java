package view.TelasDeCadastro.TelaDeCadastroMedicamento;

import models.Medicamento;

import javax.swing.*;
import java.util.List;

public class TelaDeMedicamentos extends JDialog {

    public TelaDeMedicamentos(List<Medicamento> todos) {
        TelaDeMedicamentosCadastrados tab = new TelaDeMedicamentosCadastrados(todos);
        add(new JScrollPane(new JTable(tab)));
        setSize(500, 400);
        setTitle("Cadastro medicamentos");
        setVisible(true);
    }
}
