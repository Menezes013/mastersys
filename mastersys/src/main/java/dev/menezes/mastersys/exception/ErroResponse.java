package dev.menezes.mastersys.exception;

import dev.menezes.mastersys.domain.Aluno;

import java.time.LocalDateTime;
import java.util.List;

public record ErroResponse(
        LocalDateTime timestamp,
        Integer status,
        String erro,
        List<String> mensagens
) {
}
