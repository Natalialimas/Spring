package com.MinhaRedeSocial.MinhaRedeSocial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.MinhaRedeSocial.MinhaRedeSocial.Model.TemaModel;

@Repository
public interface TemaRepository extends JpaRepository<TemaModel, Long>{

}
