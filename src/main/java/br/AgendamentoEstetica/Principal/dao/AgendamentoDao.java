package br.AgendamentoEstetica.Principal.dao;

import br.AgendamentoEstetica.Principal.Model.Agendamento;
import br.AgendamentoEstetica.Principal.Model.Atendente;
import br.AgendamentoEstetica.Principal.Model.Cliente;
import br.AgendamentoEstetica.Principal.Model.Pessoa;

import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;

public class AgendamentoDao extends Dao<Agendamento, Long> {
    
	@SuppressWarnings("unchecked")
	public List<Agendamento> AgendaCliente(String Cnome){
        List<Agendamento> employee = new ArrayList<Agendamento>();
        Class<? extends Query> cliente;
        try {
                cliente = em.createNativeQuery("SELECT * FROM Pessoa WHERE tipo_pessoa = ?1 and nome like ?2 ", Pessoa.class).getClass();
                /*query.setParameter(1, "CLIENTE");
                query.setParameter(2, Cnome);
                cliente = query.getSingleResult();*/
        }catch (Exception e){
            cliente = null;
        }
        try{
            employee = em.createNativeQuery("SELECT * FROM Agendamento  WHERE cliente_id = ?1", Agendamento.class ).getResultList();
        }catch (Exception e){
            employee = null;
        }
        return employee;
    }

    public List<Agendamento> AgendaAtendente(String Anome){
        List<Agendamento> employee =  new ArrayList<>();
        Pessoa atendente;
        try {
            TypedQuery<Atendente> query = em.createQuery("SELECT E FROM Pessoa WHERE tipo_pessoa = ?1 and nome LIKE ?2 ", Atendente.class);
            query.setParameter(1, "ATENDENTE");
            query.setParameter(2, Anome);
            atendente = query.getSingleResult();
        }catch (Exception e){
            atendente = null;
        }
        try{
            TypedQuery<Agendamento> query2 = em.createQuery("SELECT E FROM Agendamento E WHERE E.atendente_id = ?1", Agendamento.class);
            query2.setParameter(1,Long.toString(atendente.getId()));
            employee.addAll(query2.getResultList());
        }catch (Exception e){
            employee = null;
        }
        return employee;
    }

}
