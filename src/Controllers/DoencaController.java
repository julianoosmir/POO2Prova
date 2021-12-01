package Controllers;

import EntityDao.DoencaDao;
import models.Doenca;

import java.util.List;
/*
 *  Nome: Juliano Cesar Osmir hein RA: 339112013098
 *  Curso: ciencia da computação data: 30/11/2021
 *
 */
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
