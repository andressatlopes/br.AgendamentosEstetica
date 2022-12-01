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
        //Class<? extends Query> cliente;
         Pessoa cliente = new Pessoa();
        try {
        		TypedQuery<Pessoa> query = em.createQuery("SELECT e FROM Pessoa e WHERE e.email = null and e.nome = ?1 ", Pessoa.class);
                query.setParameter(1, Cnome);
                cliente = query.getResultList().get(0);
        }catch (Exception e){
            //query = null;
        }
        try{
        	//em.clear();
            TypedQuery<Agendamento> query2 = em.createQuery("SELECT e FROM Agendamento e  WHERE e.id = ?1 ", Agendamento.class);
           // String id = Long.toString();
            query2.setParameter(1, cliente.getId());
        	//employee = em.createNativeQuery("SELECT e FROM Agendamento e  WHERE e.id like " +  Long.toString(cliente.getId()), Agendamento.class ).getResultList();
            employee = query2.getResultList();
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
