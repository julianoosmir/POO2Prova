package view;

import javax.swing.*;

public class TelaInicial extends JFrame {
    Menu menu = new Menu();
    public TelaInicial(){
        setTitle("tela inicial");
        setSize(250,200);
        add(menu);

    }
}
