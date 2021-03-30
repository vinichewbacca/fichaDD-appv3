package com.tcc.fichaDDappv3.repository;

import com.tcc.fichaDDappv3.model.Personagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonagemRepository extends JpaRepository<Personagem, Long>
{

}
