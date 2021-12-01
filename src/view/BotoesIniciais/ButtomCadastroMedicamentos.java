package view.BotoesIniciais;

import view.TelasDeCadastro.TelaDeCadastroMedicamento.CadastroDeMedicamentos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtomCadastroMedicamentos extends JButton {
    public ButtomCadastroMedicamentos() {
        setText("Cadastrar medicamentos");
        setBounds(900, 340, 100, 20);
        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new CadastroDeMedicamentos().setVisible(true);
            }
        });
    }
}
