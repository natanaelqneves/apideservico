package com.nqn.apideservico.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public record RelatoriORequestDTO(
                                LocalDate dataDoServico,
                                String placaDaViatura,
                                Integer kmInicial,
                                Integer kmFinal,
                                String avarias,
                                Boolean abastecida) {
}
