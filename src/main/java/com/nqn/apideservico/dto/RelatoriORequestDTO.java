package com.nqn.apideservico.dto;

import java.time.LocalDate;

public record RelatoriORequestDTO(String placaDaViatura,
                                  Integer kmInicial,
                                  Integer kmFinal,
                                  String avarias,
                                  Boolean abastecida) {
    public void dataDoServico(LocalDate now) {

    }
}
