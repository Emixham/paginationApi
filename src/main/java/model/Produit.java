package model;

public class Produit {
	
	private Long id;
	private String nom;
	private Float prix;
	private String SKU;
	private String description;
	private String options;
	
	Produit(Long id, String nom, Float prix, String sku, String description, String options){
		setId(id);
		setNom(nom);
		setPrix(prix);
		setSKU(sku);
		setDescription(description);
		setOptions(options);
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Float getPrix() {
		return prix;
	}
	public void setPrix(Float prix) {
		this.prix = prix;
	}
	public String getSKU() {
		return SKU;
	}
	public void setSKU(String sKU) {
		SKU = sKU;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getOptions() {
		return options;
	}
	public void setOptions(String options) {
		this.options = options;
	}
	
	

}
