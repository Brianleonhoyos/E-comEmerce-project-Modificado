package com.jtspringproject.JtSpringProject.dao;

import java.util.List;

import com.jtspringproject.JtSpringProject.models.Cart;
import com.jtspringproject.JtSpringProject.models.Category;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class cartDao {

    @PersistenceContext
    private EntityManager entityManager;

    public Cart addCart(Cart cart) {
        entityManager.persist(cart);
        return cart;
    }

    public List<Cart> getCarts() {
        String hql = "FROM CART";
        return entityManager.createQuery(hql, Cart.class).getResultList();
    }

    public void updateCart(Cart cart) {
        entityManager.merge(cart);
    }

    public void deleteCart(Cart cart) {
        Cart managedCart = entityManager.merge(cart);
        entityManager.remove(managedCart);
    }

    // Método adicional opcional
    public Cart getCartById(int id) {
        return entityManager.find(Cart.class, id);
    }
}
