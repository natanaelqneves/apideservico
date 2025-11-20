package com.nqn.apideservico.repository;

import com.nqn.apideservico.model.Relatorio;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface RelatorioRepository extends JpaRepository<Relatorio, String> {

    Optional<Relatorio> findById(String id);

    List<Relatorio> findAllByOrderByDataDoServico();

    List<Relatorio> findAllByDataDoServicoBetween(LocalDate dataDoServico, LocalDate dataFinal);

    Relatorio findByDataDoServico(LocalDate dataDoServico);
}
