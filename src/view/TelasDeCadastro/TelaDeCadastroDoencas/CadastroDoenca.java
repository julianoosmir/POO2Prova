package view.TelasDeCadastro.TelaDeCadastroDoencas;

import javax.swing.*;
import java.awt.*;

public class CadastroDoenca extends JDialog {
    JButton buttonInserir = new JButton("inserir");
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
    }


}
