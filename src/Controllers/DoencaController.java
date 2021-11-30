package Controllers;

import EntityDao.DoencaDao;
import models.Doenca;

import java.util.List;

public class DoencaController {
    DoencaDao dao = new DoencaDao();

    public void create(Doenca doenca){
        dao.create(doenca);
    }
    public List<Doenca> todos() {
        return dao.findALL();
    }
    public Doenca buscarDoenca(Long id){
        return dao.findById(id);
    }
}
