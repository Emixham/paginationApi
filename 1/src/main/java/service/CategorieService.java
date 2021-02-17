package service;

public class CategorieService {

    String [] ProductCategory = { "Produit", "Catégorie"};

    public String getProductCategory(boolean category) {
        if (category = ProductCategory[0] != null){
            return ProductCategory[0];
        }
        else
            return ProductCategory[1];
    }
}
