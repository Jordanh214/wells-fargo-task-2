package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue
    private long portfolioId;

    @Column(nullable=false)
    private String name;

    @Column(nullable=false)
    private LocalDate creationDate;

    @Column(nullable=false)
    private LocalDate updateDate;

    @OneToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;

    protected Portfolio(){

    }

    public Portfolio (String name, LocalDate creationDate, LocalDate updateDate, Client client){
        this.name = name;
        this.creationDate = creationDate;
        this.updateDate = updateDate;
        this.client = client;
    }

    public long getPortfolioId() {
        return portfolioId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public LocalDate getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDate updateDate) {
        this.updateDate = updateDate;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
