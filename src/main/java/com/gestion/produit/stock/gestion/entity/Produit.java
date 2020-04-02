package com.gestion.produit.stock.gestion.entity;

public class Produit {

    private String ref;
    private int quantite;
    private double prixUnitaire;
    
    
    
	public Produit() {
		
	}
    
	 
	public Produit(String ref, int quantite, double prixUnitaire) {
		super();
		this.ref = ref;
		this.quantite = quantite;
		this.prixUnitaire = prixUnitaire;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(prixUnitaire);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + quantite;
		result = prime * result + ((ref == null) ? 0 : ref.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produit other = (Produit) obj;
		if (Double.doubleToLongBits(prixUnitaire) != Double.doubleToLongBits(other.prixUnitaire))
			return false;
		if (quantite != other.quantite)
			return false;
		if (ref == null) {
			if (other.ref != null)
				return false;
		} else if (!ref.equals(other.ref))
			return false;
		return true;
	}
	public String getRef() {
		return ref;
	}
	public void setRef(String ref) {
		this.ref = ref;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public double getPrixUnitaire() {
		return prixUnitaire;
	}
	public void setPrixUnitaire(double prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}
    
    


}
