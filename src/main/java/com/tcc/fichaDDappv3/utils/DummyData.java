package com.tcc.fichaDDappv3.utils;

import com.tcc.fichaDDappv3.model.Personagem;
import com.tcc.fichaDDappv3.repository.PersonagemRepository;
import com.tcc.fichaDDappv3.service.PersonagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class DummyData
{
    @Autowired
    PersonagemService personagemService;

    //@PostConstruct
    public void savePersonagem()
    {
        List<Personagem> personagemList = new ArrayList<>();
        Personagem p = new Personagem();
        p.setJogador("Vinicius Souza");
        p.setNome("Lone Sloane");
        p.setRaca("Elfo da Floresta");
        p.setForca(12);
        p.setModFor(1);
        p.setDestreza(17);
        p.setModDes(3);
        p.setConstituicao(13);
        p.setModCon(1);
        p.setInteligencia(12);
        p.setModInt(1);
        p.setSabedoria(12);
        p.setModSab(1);
        p.setCarisma(10);
        p.setModCar(0);

        /*Personagem p1 = new Personagem();
        p1.setJogador("Cleo Pires");
        p1.setNome("Yarjerit Torinn");
        p1.setRaca("Draconato");
        p1.setForca(17);
        p1.setModFor(3);
        p1.setDestreza(14);
        p1.setModDes(2);
        p1.setConstituicao(13);
        p1.setModCon(1);
        p1.setInteligencia(12);
        p1.setModInt(1);
        p1.setSabedoria(11);
        p1.setModSab(0);
        p1.setCarisma(11);
        p1.setModCar(0);*/

        personagemList.add(p);
        //personagemList.add(p1);

        for (Personagem personagem: personagemList)
        {
            Personagem persSaved = personagemService.save(personagem);
            System.out.println(persSaved.getId());
        }
    }
}
