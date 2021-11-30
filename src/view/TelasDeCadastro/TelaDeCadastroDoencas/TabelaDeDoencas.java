package view.TelasDeCadastro.TelaDeCadastroDoencas;

import models.Doenca;
import view.resouces.ViewAbstractTableModel;

import java.util.List;
/*
Nome: Juliano Cesar Osmir Hein RA: 339112013098
Curso: Ciência da Computação Data: 29/09/2021
*/
public class TabelaDeDoencas extends ViewAbstractTableModel<Doenca> {
    public TabelaDeDoencas(List<Doenca> rows) {
        super(rows);
        columns = new String[]{
               "id", "nome", "CID",
        };
    }



    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Doenca doenca =  rows.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return doenca.getId();
            case 1:
                return doenca.getNome();
            case 2:
                return doenca.getCID();
            default:
                return null;
        }
    }
}
