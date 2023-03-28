package ss17_product_manager.product.model;

import com.sun.xml.internal.ws.developer.Serialization;

import java.lang.annotation.Annotation;

public class Product implements Serialization {
    private int id;
    private String nameProduct;
    private String costProduct;
    private String productor;
    private String description;

    public Product() {
    }

    public Product(int id, String nameProduct, String costProduct, String productor, String description) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.costProduct = costProduct;
        this.productor = productor;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getCostProduct() {
        return costProduct;
    }

    public void setCostProduct(String costProduct) {
        this.costProduct = costProduct;
    }

    public String getProductor() {
        return productor;
    }

    public void setProductor(String productor) {
        this.productor = productor;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", nameProduct='" + nameProduct + '\'' +
                ", costProduct='" + costProduct + '\'' +
                ", productor='" + productor + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }

    @Override
    public String encoding() {
        return null;
    }
}
