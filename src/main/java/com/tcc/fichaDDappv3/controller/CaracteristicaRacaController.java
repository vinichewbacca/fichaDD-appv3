package com.tcc.fichaDDappv3.controller;

import com.tcc.fichaDDappv3.model.CaracteristicaRaca;
import com.tcc.fichaDDappv3.service.CaracterisiticaRacaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "fichaddappv3/caracteristicaRaca")
public class CaracteristicaRacaController
{
    @Autowired
    CaracterisiticaRacaService caracterisiticaRacaService;

    @GetMapping("/listarcaracteristicasRaca")
    public List<CaracteristicaRaca> getCaracteristicasRaca ()
    {
        return caracterisiticaRacaService.findAllCaractRaca();
    }

    @GetMapping("/buscaIdCaractRaca/{idCaractRaca}")
    public CaracteristicaRaca getCaracteristicaRaca(@PathVariable("idCaractRaca") Long id)
    {
        return caracterisiticaRacaService.findByIdCaractRaca(id);
    }

    @PostMapping("/salvarCaractRaca")
    public void registerNewCaracteristicaRaca (@RequestBody CaracteristicaRaca caracteristicaRaca)
    {
        caracterisiticaRacaService.saveCaractRaca(caracteristicaRaca);
    }

    @DeleteMapping("/deleteCaractRaca/{idCaractRaca}")
    public void deleteCaracteristicaRaca(@PathVariable("idCaractRaca") Long id)
    {
       caracterisiticaRacaService.deleteCaractRaca(id);
    }
}
