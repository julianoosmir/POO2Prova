package view.TelasDeCadastro.TelaDeCadastroDoencas;

import Controllers.DoencaController;
import models.Doenca;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroDoenca extends JDialog {
    JButton buttonInserir = new JButton("inserir");
    private TabelaDeDoencas tab;
    DoencaController con = new DoencaController();
    public CadastroDoenca() {
        setSize(450, 400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        add(new JLabel("nome :"));
        JTextField nome = new JTextField(10);
        add(nome);
        add(new JLabel("CID :"));
        JTextField cid = new JTextField(10);
        add(cid);
        add(buttonInserir);
        tab = new  TabelaDeDoencas(con.todos());
        add(new JTable(tab));
        buttonInserir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inserir(nome.getText(),cid.getText(),tab);
                tab.fireTableDataChanged();
            }
        });
    }
    public void inserir(String nome, String cid,TabelaDeDoencas tabela ){
        Doenca doenca =new Doenca();
        doenca.setNome(nome);
        doenca.setCID(cid);
        con.create(doenca);
        tabela.fireTableDataChanged();
    }


}
