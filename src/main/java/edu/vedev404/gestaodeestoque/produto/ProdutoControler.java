package edu.vedev404.gestaodeestoque.produto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoControler {

    @Autowired
    ProdutoService service;

    @Autowired
    ProdutoRepository repotitory;

    @PostMapping
    @ResponseStatus( code = HttpStatus.CREATED)
    public ProdutoDTO create(@RequestBody ProdutoDTO produto) {
        return service.create(produto);
    }

}
