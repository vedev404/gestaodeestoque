package edu.vedev404.gestaodeestoque.produto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    @Autowired
    private  ProdutoMapper produtoMapper;

    public ProdutoDTO create( ProdutoDTO produto) {
        return produtoMapper.produtoDTO(repository.save(produtoMapper.toEntity(produto)));
    }

}
