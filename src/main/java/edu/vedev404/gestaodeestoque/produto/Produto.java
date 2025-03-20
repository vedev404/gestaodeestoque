package edu.vedev404.gestaodeestoque.produto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "produtos")
public class Produto {
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String nome;
    private int quantidade;
    private double preco;

    public Produto(ProdutoDTO data) {
        this.nome = data.nome();
        this.quantidade = data.quantidade();
        this.preco = data.preco();
    }

}
