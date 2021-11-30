package view;

import javax.swing.*;

public class TelaInicial extends JFrame {
    Menu menu = new Menu();
    public TelaInicial(){
        setTitle("tela inicial");
        setSize(400,400);
        add(menu);

    }
}
