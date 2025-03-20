package edu.vedev404.gestaodeestoque.produto;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProdutoRepository extends JpaRepository<Produto, UUID> {
}
