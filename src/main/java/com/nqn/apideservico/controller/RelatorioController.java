package com.nqn.apideservico.controller;

import com.nqn.apideservico.model.Relatorio;
import com.nqn.apideservico.service.RelatorioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("relatorio")
public class RelatorioController {

    @Autowired
    private RelatorioService relatorioService;

    @PostMapping
    public Relatorio salvar(@RequestBody Relatorio relatorio){
        return relatorioService.salvar(relatorio);
    }

//    @GetMapping
//    public List<Relatorio> buscarRelatorios(){
//        return relatorioService.buscarRelatorios();
//    }

    @GetMapping
    public List<Relatorio> buscarRelatorios(){
        return relatorioService.buscarRelatoriosOrdenadosPorData();
    }

    @GetMapping("{id}")
    public Relatorio buscarRelatorioPorId(@PathVariable String id){
        return relatorioService.buscarRelatorioPorID(id);
    }

    @PutMapping("{id}")
    public Relatorio alterarRelatorioPorId(@PathVariable("id") String id, @RequestBody Relatorio relatorio){
        return relatorioService.alterarRelatorioPorId(id, relatorio);
    }

    @GetMapping("data/{dataDoServico}")
    public Relatorio buscarRelatorioPorDataDoServico(@PathVariable("dataDoServico") LocalDate dataDoServico){
        return relatorioService.buscarRelatorioPorData(dataDoServico);
    }
}
