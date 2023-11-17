package org.ymcasas.springboot.api.soccertournament.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.ymcasas.springboot.api.soccertournament.dto.PositionsTable;
import org.ymcasas.springboot.api.soccertournament.services.PositionsTableService;

import java.util.List;

@RestController
@RequestMapping("/grupos")
public class PositionsTableController {

    @Autowired
    private PositionsTableService positionsTableService;

    @GetMapping("{idGrupoTabla}/posiciones")
    public List<PositionsTable> obtenerTablaPosicionesGrupo(@PathVariable int idGrupoTabla) {
        return positionsTableService.obtenerTablaPosicionesGrupo(idGrupoTabla);
    }
}
