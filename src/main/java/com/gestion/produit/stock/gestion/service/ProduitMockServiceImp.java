package com.gestion.produit.stock.gestion.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.gestion.produit.stock.gestion.entity.Produit;

@Service
public class ProduitMockServiceImp implements IProduitService{

	private List<Produit> produits;

	
	public ProduitMockServiceImp() {
		produits = new ArrayList<Produit>();
		
		produits.add(new Produit("Livre",40,50));
		produits.add(new Produit("Stylo",20,70));
		produits.add(new Produit("Cachier",10,24));
		
	}
	
	@Override
	public List<Produit> getProduit() {
		return produits;
	}

	@Override
	public void addProduit(Produit produit) {
		produits.add(produit);
		
	}

	@Override
	public void updateProduit(Produit produit) {
		produits.remove(produit);
		produits.add(produit);
		
	}

	@Override
	public void deleteProduit(String ref) {
		Produit produit = new Produit();
		produit.setRef(ref);
		produits.remove(produit);
	}
	
}
