package Controllers;

import EntityDao.MedicamentosDao;
import models.Medicamento;

import java.util.List;
/*
 *  Nome: Juliano Cesar Osmir hein RA: 339112013098
 *  Curso: ciencia da computação data: 30/11/2021
 *
 */
public class MediacamentoController {
    MedicamentosDao dao = new MedicamentosDao();

    public void create(Medicamento medicamento) {
        dao.create(medicamento);
    }
    public List<Medicamento> todos(){
        return dao.findALL();
    }
}
