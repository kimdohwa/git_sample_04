package com.shopping.service;

import com.shopping.entity.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductService {

    private final Map<Long, Product> productMap = new HashMap<>();

    public ProductService() {
        productMap.put(1L, new Product(1L, "귤의 정원", 4500, "제주도 귤의 정원 체럼", "/images/image17_02.png"));
        productMap.put(2L, new Product(2L, "아메리카노", 5000, "커피는 역시 아메리카노^^", "/images/myimage.png"));
        productMap.put(3L, new Product(3L, "남산 도서관", 3000, "서울 남산 도서관의 경치", "/images/yourimage.png"));
    }

    public List<Product> getAllProducts() {
        return new ArrayList<>(productMap.values());
    }

    public Product getProductById(Long id) {
        return productMap.get(id);
    }
}