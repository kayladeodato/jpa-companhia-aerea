package br.com.aero.reserva.modelos;

import javax.persistence.Embeddable;
@Embeddable
public class DadosPessoais {

        private String nome;
        private String cpf;
        private String telefone;
        private String email;

        public DadosPessoais() {
        }

        public DadosPessoais(String nome, String cpf, String telefone, String email) {
                this.nome = nome;
                this.cpf = cpf;
                this.telefone = telefone;
                this.email = email;
        }

        public String getNome() {
                return nome;
        }

        public String getCpf() {
                return cpf;
        }

        public String getTelefone() {
                return telefone;
        }

        public String getEmail() {
                return email;
        }
}
