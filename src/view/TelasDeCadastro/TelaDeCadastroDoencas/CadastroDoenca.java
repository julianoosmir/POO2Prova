package view.TelasDeCadastro.TelaDeCadastroDoencas;

import Controllers.DoencaController;
import models.Doenca;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
/*
 *  Nome: Juliano Cesar Osmir hein RA: 339112013098
 *  Curso: ciencia da computação data: 30/11/2021
 *
 */
public class CadastroDoenca extends JDialog {
    JButton buttonInserir = new JButton("inserir");
    JButton buttonMostrar = new JButton("mostrar");

    DoencaController con = new DoencaController();

    public CadastroDoenca() {
        setSize(500, 200);
        setTitle("Cadastrar Doenças");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        add(new JLabel("nome :"));
        JTextField nome = new JTextField(10);
        add(nome);
        add(new JLabel("CID :"));
        JTextField cid = new JTextField(10);
        add(cid);

        buttonInserir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inserir(nome.getText(), cid.getText());
            }
        });
        buttonMostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrar(con.todos());
            }
        });
        add(buttonInserir);
        add(buttonMostrar);
    }

    public void inserir(String nome, String cid) {
        Doenca doenca = new Doenca();
        doenca.setNome(nome);
        doenca.setCID(cid);
        con.create(doenca);
    }

    public void mostrar(List<Doenca> doencas) {
       new TelaDeDoencasCadastradas(doencas).setVisible(true);
    }

}
