package br.com.aero.reserva;

import br.com.aero.reserva.dao.CidadeDao;
import br.com.aero.reserva.dao.DadosPessoaisDao;
import br.com.aero.reserva.dao.EnderecoDao;
import br.com.aero.reserva.modelos.Cidade;
import br.com.aero.reserva.modelos.DadosPessoais;
import br.com.aero.reserva.modelos.Endereco;
import br.com.aero.reserva.modelos.Passageiro;
import br.com.aero.reserva.util.JpaUtil;

import javax.persistence.EntityManager;

public class AeroApplicacao {
    public static void main(String[] args) {

        popularBancoDados();

    }

    public static void popularBancoDados() {
        DadosPessoais dadosPessoais1 = new DadosPessoais("Maria Santos", "028.452.858-77","(88)98888-0101","maria@email.com");
        Cidade cidade1 = new Cidade("São Paulo", "São Paulo", "SP");
        Endereco endereco1 = new Endereco("Rua Amarela", "11", "Casa", "Bairro Altiplano", "58011-000", cidade1);

        Passageiro passageiro1 = new Passageiro(dadosPessoais1, endereco1);

        EntityManager em = JpaUtil.getEntityManager();

        DadosPessoaisDao dadosPessoaisDao = new DadosPessoaisDao(em);
        CidadeDao cidadeDao = new CidadeDao(em);
        EnderecoDao enderecoDao = new EnderecoDao(em);

        em.getTransaction().begin();

        dadosPessoaisDao.cadastrar(dadosPessoais1);
        cidadeDao.cadastrar(cidade1);
        enderecoDao.cadastrar(endereco1);

        em.getTransaction().commit();

        em.close();
    }
}
