package br.AgendamentoEstetica.Principal.dao;

import br.AgendamentoEstetica.Principal.Model.Esteticista;
import br.AgendamentoEstetica.Principal.Model.Pessoa;

import javax.persistence.TypedQuery;
import java.util.*;

public class EsteticistaDao extends Dao<Esteticista, Long> {
    public List<Esteticista> EsteticistaDetail(String Enome){
        List<Esteticista> lista = new ArrayList<>();
        Esteticista et;

        try {
            TypedQuery<Esteticista> query = em.createQuery("SELECT E FROM Pessoa E WHERE tipo_pessoa = ?1 and nome like ?2",Esteticista.class);
            query.setParameter(1,"ESTETICISTA");
            query.setParameter(2, Enome);
            lista.addAll(query.getResultList());
        }catch (Exception e){
            lista = null;
        }
        return lista;
    }
}
