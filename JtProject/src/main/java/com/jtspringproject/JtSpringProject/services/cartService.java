package com.jtspringproject.JtSpringProject.services;

import com.jtspringproject.JtSpringProject.dao.cartDao;
import com.jtspringproject.JtSpringProject.models.Cart;
import com.jtspringproject.JtSpringProject.models.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class cartService {

    @Autowired
    private cartDao cartDao;

    @Autowired
    public cartService(cartDao cartDao) {
        this.cartDao = cartDao;
    }

    public Cart addCart(Cart cart) {
        return cartDao.addCart(cart);
    }

    public List<Cart> getCarts() {
        return cartDao.getCarts();
    }

    public void updateCart(Cart cart) {
        cartDao.updateCart(cart);
    }

    public void deleteCart(Cart cart) {
        cartDao.deleteCart(cart);
    }

    public Cart getCartById(int Id) {
        return cartDao.getCartById(Id);
    }
}
