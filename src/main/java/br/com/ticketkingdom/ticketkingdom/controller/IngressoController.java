package br.com.ticketkingdom.ticketkingdom.controller;


import br.com.ticketkingdom.ticketkingdom.entity.Ingresso;
import br.com.ticketkingdom.ticketkingdom.repository.IngressoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/ingressos")
public class IngressoController {

    private IngressoRepository ingressoRepository;

    public IngressoController(IngressoRepository ingressoRepository) {
        this.ingressoRepository = ingressoRepository;
    }

    @PostMapping("/salvar")
    public Ingresso salvar(@RequestBody Ingresso ingresso) {
        System.out.println("Ingresso: " + ingresso);

        var id = UUID.randomUUID().toString();
        ingresso.setId(id);
        ingressoRepository.save(ingresso);

        return ingresso;
    }

    @GetMapping("/{id}")
    public Ingresso obterPorId(@PathVariable("id") String id) {

        return ingressoRepository.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable("id") String id) {
        ingressoRepository.deleteById(id);
    }


    @PutMapping("/{id}")
    public void atualizarEvento(@PathVariable("id") String id, @RequestBody Ingresso ingresso) {

        ingresso.setId(id);
        ingressoRepository.save(ingresso);

    }

    @GetMapping("/buscar")
    public List<Ingresso> buscar(@RequestParam("evento") String evento) {
        return ingressoRepository.findByEvento(evento);
    }
}
