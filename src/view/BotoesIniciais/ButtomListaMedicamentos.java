package view.BotoesIniciais;

import Controllers.MediacamentoController;
import view.TelasDeCadastro.TelaDeCadastroMedicamento.TelaDeMedicamentos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
