package ss17_product_manager.product.service;

import ss17_product_manager.product.model.Product;
import ss17_product_manager.product.repository.IProductRepository;
import ss17_product_manager.product.repository.ProductRepository;

import java.util.List;
import java.util.Scanner;

public class Service implements IService {
    IProductRepository iProductRepository = new ProductRepository();


    @Override
    public void find() {
        Scanner sc = new Scanner(System.in);
        List<Product> productList = iProductRepository.getAll();
        System.out.println("nhập sản phẩm tìm kiếm");
        String name = sc.nextLine();
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getNameProduct().equals(name)) {
                iProductRepository.display(i);
            }
        }
    }

    @Override
    public void display() {
        List<Product> productList = iProductRepository.getAll();
        for (Product temp : productList
        ) {
            System.out.println(temp);
        }

    }

    @Override
    public void add() {
        List<Product> list = iProductRepository.getAll();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã sản phẩm:");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên sản phẩm:");
        String name = sc.nextLine();
        System.out.println("Nhập giá:");
        String cost = sc.nextLine();
        System.out.println("Nhập hàng sản xuất:");
        String producer = sc.nextLine();
        System.out.println("Mô tả sản phẩm:");
        String describe = sc.nextLine();
        Product product = new Product(id, name, cost, producer, describe);
        list.add(product);
        iProductRepository.add(list);

    }
}
