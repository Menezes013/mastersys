package dev.menezes.mastersys.controller;


import dev.menezes.mastersys.projection.AlunosPorCidadeProjection;
import dev.menezes.mastersys.projection.FaturamentoMensalProjection;
import dev.menezes.mastersys.projection.FaturasEmAbertoProjection;
import dev.menezes.mastersys.repository.RelatorioAcademiaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/relatorios")
@RequiredArgsConstructor
public class RelatorioAcademiaController {

    private final RelatorioAcademiaRepository relatorioAcademiaRepository;

    @GetMapping("/faturamento-mensal")
    public List<FaturamentoMensalProjection> faturamentoMensal() {
        return relatorioAcademiaRepository.faturamentoMensal();
    }

    @GetMapping("/alunos-por-cidade")
    public List<AlunosPorCidadeProjection> alunosPorCidade() {
        return relatorioAcademiaRepository.alunosPorCidade();
    }

    @GetMapping("/faturas-em-aberto")
    public List<FaturasEmAbertoProjection> faturasEmAberto() {
        return relatorioAcademiaRepository.faturasEmAberto();
    }
}
