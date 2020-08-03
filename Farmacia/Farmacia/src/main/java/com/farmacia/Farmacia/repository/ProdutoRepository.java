package com.farmacia.Farmacia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.farmacia.Farmacia.Model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository <Produto, Long> {


}
