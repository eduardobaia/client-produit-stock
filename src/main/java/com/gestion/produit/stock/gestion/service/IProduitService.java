package com.gestion.produit.stock.gestion.service;

import java.util.List;

import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Producer;

import com.gestion.produit.stock.gestion.entity.Produit;

public interface IProduitService {

	List<Produit> getProduit();
	
	void addProduit(Produit produit);
	
	void updateProduit(Produit produit);
	
	void deleteProduit (String ref);
	
	
}
