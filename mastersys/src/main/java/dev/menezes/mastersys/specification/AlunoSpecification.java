package dev.menezes.mastersys.specification;

import dev.menezes.mastersys.domain.Aluno;
import dev.menezes.mastersys.dto.AlunoFiltroRequest;
import org.springframework.data.jpa.domain.Specification;

public class AlunoSpecification {

    public static Specification<Aluno> comFiltros(AlunoFiltroRequest filtro) {
        return Specification.allOf(
                nomeContem(filtro.nome()),
                emailContem(filtro.email()),
                celularContem(filtro.celular()),
                cidadeContem(filtro.cidade()),
                estadoIgual(filtro.estado())
        );
    }

    public static Specification<Aluno> nomeContem(String nome) {
        return (root, query, cb) ->
                nome == null || nome.isBlank()
                        ? null
                        : cb.like(cb.lower(root.get("nome")), "%" + nome.toLowerCase() + "%");
    }

    public static Specification<Aluno> emailContem(String email) {
        return (root, query, cb) ->
                email == null || email.isBlank()
                        ? null
                        : cb.like(cb.lower(root.get("email")), "%" + email.toLowerCase() + "%");
    }

    public static Specification<Aluno> celularContem(String celular) {
        return (root, query, cb) ->
                celular == null || celular.isBlank()
                        ? null
                        : cb.like(root.get("celular"), "%" + celular + "%");
    }

    public static Specification<Aluno> cidadeContem(String cidade) {
        return (root, query, cb) ->
                cidade == null || cidade.isBlank()
                        ? null
                        : cb.like(cb.lower(root.get("cidade")), "%" + cidade.toLowerCase() + "%");
    }

    public static Specification<Aluno> estadoIgual(String estado) {
        return (root, query, cb) ->
                estado == null || estado.isBlank()
                        ? null
                        : cb.equal(cb.upper(root.get("estado")), estado.toUpperCase());
    }
}
