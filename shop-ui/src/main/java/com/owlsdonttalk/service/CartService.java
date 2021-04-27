package com.owlsdonttalk.service;

import com.owlsdonttalk.service.model.LineItem;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public interface CartService {

    void addProductQty(ProductRepr productRepr, int qty);

    void removeProductQty(ProductRepr productRepr, int qty);

    void removeProduct(ProductRepr productRepr);

    List<LineItem> getLineItems();

    void updateAllQty(Map<Long, Integer> productIdQtyMap);

    BigDecimal getSubTotal();
}
