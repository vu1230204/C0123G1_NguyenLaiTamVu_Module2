package ss17_product_manager.product.repository;

import ss17_product_manager.product.model.Product;
import ss17_product_manager.product.util.ReadFile;
import ss17_product_manager.product.util.WriteFile;

import java.util.List;

public class ProductRepository implements IProductRepository {
    static List<Product> productList = ReadFile.read("src\\ss17_product_manager\\product\\data\\data.txt");


    @Override
    public List<Product> getAll() {
        return ReadFile.read("src\\ss17_product_manager\\product\\data\\data.txt");
    }

    @Override
    public void add(List<Product> list) {
        WriteFile.writeFile("src\\ss17_product_manager\\product\\data\\data.txt", list);
    }

    @Override
    public void display(int i) {
        System.out.println(productList.get(i));
    }
}
