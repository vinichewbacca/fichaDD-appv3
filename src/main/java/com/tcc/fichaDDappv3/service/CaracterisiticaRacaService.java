package com.tcc.fichaDDappv3.service;

import com.tcc.fichaDDappv3.model.CaracteristicaRaca;
import com.tcc.fichaDDappv3.repository.CaracteristicaRacaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CaracterisiticaRacaService
{
    @Autowired
    CaracteristicaRacaRepository caracteristicaRacaRepository;

    public List<CaracteristicaRaca> findAllCaractRaca()
    {
        return caracteristicaRacaRepository.findAll();
    }

    public CaracteristicaRaca findByIdCaractRaca (Long id)
    {
        return caracteristicaRacaRepository.findById(id).get();
    }

    public CaracteristicaRaca saveCaractRaca (CaracteristicaRaca caracteristicaRaca)
    {
        return caracteristicaRacaRepository.save(caracteristicaRaca);
    }

    public void deleteCaractRaca (Long id)
    {
        caracteristicaRacaRepository.findById(id);
            boolean b = caracteristicaRacaRepository.existsById(id);

        if (!b){
            throw new IllegalStateException("Caracteristica de raça com o id "+ id +" não existe");
        }
        caracteristicaRacaRepository.deleteById(id);
    }
}
