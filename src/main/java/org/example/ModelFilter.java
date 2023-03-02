package org.example;

public class ModelFilter {
    private String area;
    private String code;
    private String product;

    public ModelFilter() {
    }

    public ModelFilter(String area, String code, String product) {
        this.area = area;
        this.code = code;
        this.product = product;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }
}
