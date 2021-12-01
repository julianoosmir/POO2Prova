package view.BotoesIniciais;

import Controllers.MediacamentoController;
import view.TelasDeCadastro.TelaDeCadastroMedicamento.TelaDeMedicamentos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*
 *  Nome: Juliano Cesar Osmir hein RA: 339112013098
 *  Curso: ciencia da computação data: 30/11/2021
 *
 */
public class ButtomListaMedicamentos extends JButton {
    MediacamentoController mei = new MediacamentoController();
    public ButtomListaMedicamentos() {
        setText("Visualização dos Medicamentos");
        setBounds(500, 340, 100, 20);
        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new TelaDeMedicamentos(mei.todos()).setVisible(true);
            }
        });
    }
}
