package view.BotoesIniciais;

import view.TelasDeCadastro.TelaDeCadastroDoencas.CadastroDoenca;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtomCadastraDoencas extends JButton {
    public ButtomCadastraDoencas(){
        setText("Cadastrar Doenças");
        setBounds(500, 340, 100, 20);
        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new CadastroDoenca().setVisible(true);
            }
        });
    }
}
