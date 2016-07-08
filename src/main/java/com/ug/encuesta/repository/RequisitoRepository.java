package com.ug.encuesta.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.ug.encuesta.dominio.Requisito;
import com.ug.encuesta.dominio.Subgrupo;

public interface RequisitoRepository extends CrudRepository<Requisito, Integer>{
@Query(value="select r.* from requisitos r where r.subgrupo_id=?1",nativeQuery=true)
	
	
	List<Requisito> getRequisitoBySubGrupo(int subgrupo_id);
}
