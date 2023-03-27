package ss17_product_manager.product.repository;

import ss17_product_manager.product.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> getAll();

    void add(List<Product> list);

    void display(int i);
}
