package com.tcc.fichaDDappv3.repository;

import com.tcc.fichaDDappv3.model.CaracteristicaRaca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CaracteristicaRacaRepository extends JpaRepository<CaracteristicaRaca, Long>
{

}
