package org.ymcasas.springboot.api.soccertournament.services;

import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Service;
import org.ymcasas.springboot.api.soccertournament.dto.PositionsTable;

import java.util.List;

@Service
public class PositionsTableService {

    @PersistenceContext
    private EntityManager entityManager;

    public List<PositionsTable> obtenerTablaPosicionesGrupo(int idGrupoTabla) {
        return entityManager.createStoredProcedureQuery("fTablaPosicionesGrupo", PositionsTable.class)
                .registerStoredProcedureParameter("idGrupo", Integer.class, ParameterMode.IN)
                .setParameter("idGrupo", idGrupoTabla)
                .getResultList();
    }

}
