package br.AgendamentoEstetica.Principal.App;

import br.AgendamentoEstetica.Principal.Model.Procedimento;
import br.AgendamentoEstetica.Principal.dao.PessoaDao;
import br.AgendamentoEstetica.Principal.dao.ProcedimentoDao;

public class Main {

	public static void main(String[] args) {
	
		Procedimento proc = new Procedimento();
		proc.setDescricao("estetica");
		proc.setNomeProtocolo("maq");
		proc.setValor(200);
		proc.setEsteticista(null);
		
		ProcedimentoDao procDao = new ProcedimentoDao();
		procDao.save(proc);
		PessoaDao pd = new PessoaDao();

	}

}
