package view;

import view.BotoesIniciais.ButtomCadastraDoencas;
import view.BotoesIniciais.ButtomCadastroMedicamentos;
import view.BotoesIniciais.ButtomListaMedicamentos;

import javax.swing.*;
/*
 *  Nome: Juliano Cesar Osmir hein RA: 339112013098
 *  Curso: ciencia da computação data: 30/11/2021
 *
 */
public class Menu extends JPanel {
    ButtomCadastraDoencas b1 = new ButtomCadastraDoencas();
    ButtomCadastroMedicamentos b2 = new ButtomCadastroMedicamentos();
    ButtomListaMedicamentos b3 = new ButtomListaMedicamentos();
    public Menu() {
        add(b1);
        add(b2);
        add(b3);
    }


}
