package com.nqn.apideservico.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public record RelatoriORequestDTO(
                                @NotNull
                                LocalDate dataDoServico,
                                @NotNull
                                @Size(max = 7, min = 7)
                                String placaDaViatura,
                                @NotNull
                                Integer kmInicial,
                                Integer kmFinal,
                                String avarias,
                                Boolean abastecida) {
}
