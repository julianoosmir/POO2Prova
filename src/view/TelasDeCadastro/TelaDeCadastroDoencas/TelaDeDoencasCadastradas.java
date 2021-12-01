package view.TelasDeCadastro.TelaDeCadastroDoencas;

import models.Doenca;

import javax.swing.*;
import java.util.List;

public class TelaDeDoencasCadastradas extends JDialog {
    public TelaDeDoencasCadastradas(List<Doenca> doencas) {
        TabelaDeDoencas tab = new TabelaDeDoencas(doencas);
        JDialog listaDeDoencas = new JDialog();
        listaDeDoencas.add(new JScrollPane(new JTable(tab)));
        listaDeDoencas.setSize(500, 400);
        listaDeDoencas.setTitle("Cadastro Doenças");
        listaDeDoencas.setVisible(true);
    }
}
