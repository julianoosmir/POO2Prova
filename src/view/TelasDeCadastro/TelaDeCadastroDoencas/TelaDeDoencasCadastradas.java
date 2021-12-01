package view.TelasDeCadastro.TelaDeCadastroDoencas;

import models.Doenca;

import javax.swing.*;
import java.util.List;
/*
 *  Nome: Juliano Cesar Osmir hein RA: 339112013098
 *  Curso: ciencia da computação data: 30/11/2021
 *
 */
public class TelaDeDoencasCadastradas extends JDialog {
    public TelaDeDoencasCadastradas(List<Doenca> doencas) {
        TabelaDeDoencas tab = new TabelaDeDoencas(doencas);
        add(new JScrollPane(new JTable(tab)));
        setSize(500, 400);
        setTitle("Cadastro Doenças");
        setVisible(true);
    }
}
