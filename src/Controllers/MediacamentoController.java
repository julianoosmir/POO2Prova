package Controllers;

import EntityDao.MedicamentosDao;
import models.Medicamento;

import java.util.List;

public class MediacamentoController {
    MedicamentosDao dao = new MedicamentosDao();

    public void create(Medicamento medicamento) {
        dao.create(medicamento);
    }
    public List<Medicamento> todos(){
        return dao.findALL();
    }
}
