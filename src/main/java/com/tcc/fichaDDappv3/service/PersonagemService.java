package com.tcc.fichaDDappv3.service;

import com.tcc.fichaDDappv3.model.Personagem;
import com.tcc.fichaDDappv3.repository.PersonagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonagemService
{
    @Autowired
    PersonagemRepository personagemRepository;


    public List<Personagem> findAll() {
        return personagemRepository.findAll();
    }


    public Personagem findById(Long id) {
        return personagemRepository.findById(id).get();
    }


    public Personagem save(Personagem pers) {
        return personagemRepository.save(pers);
    }

    public void delete(Long idPersonagem)
    {
        personagemRepository.findById(idPersonagem);
            boolean b = personagemRepository.existsById(idPersonagem);

            if (!b){
                throw new IllegalStateException("Personagem com o id "+ idPersonagem +" não existe");
            }
            personagemRepository.deleteById(idPersonagem);
    }
}
