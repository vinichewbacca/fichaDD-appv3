package com.tcc.fichaDDappv3.controller;

import com.tcc.fichaDDappv3.model.Personagem;
import com.tcc.fichaDDappv3.service.PersonagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "fichaddappv3/personagem")
public class PersonagemController
{
    @Autowired
    PersonagemService personagemService;

    @GetMapping("/listarpersonagens")
    public List<Personagem> getPersonagens ()
    {
        return personagemService.findAll();
    }

    @GetMapping("/buscaIdPersonagem/{idPersonagem}")
    public Personagem getPersonagem(@PathVariable("idPersonagem") Long id)
    {
        return personagemService.findById(id);
    }

    @PostMapping("/salvarPersonagem")
    public void registerNewPersonagem (@RequestBody Personagem personagem)
    {
        personagemService.save(personagem);
    }

    @DeleteMapping("/deletepersonagem/{idpersonagem}")
    public void deletePersonagem(@PathVariable("idpersonagem") Long id)
    {
        personagemService.delete(id);
    }

}
