package ss17_product_manager.product.controller;

import ss17_product_manager.product.service.IService;
import ss17_product_manager.product.service.Service;

import java.util.Scanner;

public class MenuController {
    IService iService = new Service();

    public void menuProduct() {
        String choose;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("vui lòng chọn chức năng");
            System.out.println("1. Hiển thị sản phẩm");
            System.out.println("2. Thêm sản phẩm");
            System.out.println("3. Tìm kiếm sản phẩm");
            System.out.println("4. Thoát");

            choose = sc.nextLine();
            switch (choose) {
                case "1":
                    iService.display();
                    break;
                case "2":
                    iService.add();
                break;
                case "3":
                    iService.find();
                    break;
                case "4":
                    break;
            }

        } while (!choose.equals("4"));
    }
}

