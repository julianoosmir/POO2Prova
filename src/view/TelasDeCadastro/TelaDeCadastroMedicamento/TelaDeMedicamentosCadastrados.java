package view.TelasDeCadastro.TelaDeCadastroMedicamento;

import models.Medicamento;
import view.resouces.ViewAbstractTableModel;

import java.util.List;

public class TelaDeMedicamentosCadastrados extends ViewAbstractTableModel<Medicamento> {
    public TelaDeMedicamentosCadastrados(List<Medicamento> rows) {
        super(rows);
        columns = new String[]{
                "id", "nome", "laboratorio Fabricante",
                "Principio Ativo","Doença"
        };
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Medicamento medicamento = rows.get(columnIndex);

        switch (columnIndex) {
            case 0:
                return medicamento.getId();
            case 1:
                return medicamento.getNome();
            case 2:
                return medicamento.getLaboratorioFabricante();
            case 3:
                return medicamento.getPrincipioAtivo();
            case 4:
                return medicamento.getDoenca().getNome();
            default:
                return null;
        }
    }
}
