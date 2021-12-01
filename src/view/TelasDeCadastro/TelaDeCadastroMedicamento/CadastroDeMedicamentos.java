package view.TelasDeCadastro.TelaDeCadastroMedicamento;

import Controllers.DoencaController;
import Controllers.MediacamentoController;
import models.Medicamento;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*
 *  Nome: Juliano Cesar Osmir hein RA: 339112013098
 *  Curso: ciencia da computação data: 30/11/2021
 *
 */
public class CadastroDeMedicamentos extends JDialog {
    MediacamentoController con = new MediacamentoController();
    DoencaController doenca = new DoencaController();
    JButton buttonInserir = new JButton("inserir");

    public CadastroDeMedicamentos() {
        setSize(250, 300);
        setTitle("Cadastrar Doenças");

        setLayout(new FlowLayout());
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        add(new JLabel("nome :"));
        JTextField nome = new JTextField(20);
        add(nome);
        add(new JLabel("laboratorio Fabricante :"));
        JTextField laboratorioFabricante = new JTextField(20);
        add(laboratorioFabricante);
        add(new JLabel("principio Ativo:"));
        JTextField principioAtivo = new JTextField(20);
        add(principioAtivo);
        add(new JLabel("Aplicação em qual doença?"));
        JComboBox comboBox = new JComboBox();
        comboBox.setSize(200,200);
        doenca.todos().forEach(x -> comboBox.addItem(x.getNome().toString()));
        add(comboBox);

        buttonInserir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Inserir(comboBox.getSelectedIndex() +1 , nome.getText(),
                        laboratorioFabricante.getText(),principioAtivo.getText());
            }

        });
        add(buttonInserir);

    }

    private void Inserir(int index, String nome, String laboratorioFabricanteText, String principioAtivoText) {
        Medicamento medicamento = new Medicamento();
        medicamento.setDoenca(doenca.buscarDoenca(Long.valueOf(index)));
        medicamento.setNome(nome);
        medicamento.setPrincipioAtivo(principioAtivoText);
        medicamento.setLaboratorioFabricante(laboratorioFabricanteText);
        con.create(medicamento);
    }
}
