package com.nqn.apideservico.service;

import com.nqn.apideservico.model.Relatorio;
import com.nqn.apideservico.repository.RelatorioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.time.LocalDate;
import java.util.List;

@Service
public class RelatorioService {

    @Autowired
    private RelatorioRepository relatorioRepository;

    public Relatorio salvar(@RequestBody Relatorio relatorio){
        relatorio.setDataDoServico(LocalDate.now());
        return relatorioRepository.save(relatorio);
    }

//    public List<Relatorio> buscarRelatorios(){
//        return relatorioRepository.findAll();
//    }

    public List<Relatorio> buscarRelatoriosOrdenadosPorData(){
        return relatorioRepository.findAllByOrderByDataDoServico();
    }

    public Relatorio buscarRelatorioPorID(String id){
        return relatorioRepository.findById(id).orElse(null);
    }

    public Relatorio alterarRelatorioPorId(String id, Relatorio relatorio){
        relatorio.setId(id);
        return relatorioRepository.save(relatorio);
    }

    public Relatorio buscarRelatorioPorData(LocalDate dataDoServico){
        return relatorioRepository.findAllByDataDoServico(dataDoServico);
    }

    public void deletarRelatorioPorId(String id){
        relatorioRepository.deleteById(id);
    }
}
