package com.empregado.CrudEmpregado.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.empregado.CrudEmpregado.entity.Empregado;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "empregado", path= "empregados")
public interface EmpregadoRepository extends JpaRepository<Empregado, Integer> {

}
