package ss12_Map.repository;

import ss12_Map.model.Product;

import java.util.ArrayList;

public interface IProductRepository {
    ArrayList<Product> displayAll();

    void addProduct(Product newProduct);
    void findProductByName(String productName);

    void deleteProduct(int ID);

    void editProduct(int ID);

    void sortByPrice(boolean option);

}
