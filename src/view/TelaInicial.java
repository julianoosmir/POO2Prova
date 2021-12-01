package view;
/*
 *  Nome: Juliano Cesar Osmir hein RA: 339112013098
 *  Curso: ciencia da computação data: 30/11/2021
 *
 */
import javax.swing.*;

public class TelaInicial extends JFrame {
    Menu menu = new Menu();
    public TelaInicial(){
        setTitle("tela inicial");
        setSize(250,200);
        add(menu);

    }
}
