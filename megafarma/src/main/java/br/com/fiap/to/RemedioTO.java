package br.com.fiap.to;

import java.time.LocalDate;

public class RemedioTO {
    private Long codigo;
    private String nome;
    private Double preco;
    private LocalDate dataDeFabricacao;
    private LocalDate dataDeValidade;

    public RemedioTO(){

    }

    public RemedioTO(Long codigo, String nome, Double preco, LocalDate dataDeFabricacao, LocalDate dataDeValidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.dataDeFabricacao = dataDeFabricacao;
        this.dataDeValidade = dataDeValidade;
    }

    public Long getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

    public LocalDate getDataDeFabricacao() {
        return dataDeFabricacao;
    }

    public LocalDate getDataDeValidade() {
        return dataDeValidade;
    }
}
