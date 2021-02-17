package service;

public class CategorieService {

    String [] ProductCategory = { "Produit", "Catégorie"};

    public String[] getProductCategory(String category) {
        if (category = ProductCategory[0]){
            return ProductCategory[0];
        }
        else
            return ProductCategory[1];
    }
}
