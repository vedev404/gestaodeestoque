package edu.vedev404.gestaodeestoque.produto;

import java.util.UUID;

public record ProdutoDTO(UUID id, String nome, int  quantidade, double preco) {
}
