package view.TelasDeCadastro.TelaDeCadastroDoencas;

import models.Doenca;

import javax.swing.*;
import java.util.List;

public class TelaDeDoencasCadastradas extends JDialog {
    public TelaDeDoencasCadastradas(List<Doenca> doencas) {
        TabelaDeDoencas tab = new TabelaDeDoencas(doencas);
        add(new JScrollPane(new JTable(tab)));
        setSize(500, 400);
        setTitle("Cadastro Doenças");
        setVisible(true);
    }
}
