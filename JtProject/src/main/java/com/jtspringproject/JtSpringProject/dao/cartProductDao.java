package com.jtspringproject.JtSpringProject.dao;

import com.jtspringproject.JtSpringProject.models.Cart;
import com.jtspringproject.JtSpringProject.models.CartProduct;
import com.jtspringproject.JtSpringProject.models.Product;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class cartProductDao {
    @PersistenceContext
    private EntityManager entityManager;

    public void addCartProduct(CartProduct cartProduct) {
        entityManager.persist(cartProduct);
    }

    public List<CartProduct> getCartProducts() {
        String hql = "FROM CART_PRODUCT";
        return entityManager.createQuery(hql, CartProduct.class).getResultList();
    }

    public void updateCartProduct(CartProduct cartProduct) {
        entityManager.merge(cartProduct);
    }

    public void deleteCartProduct(CartProduct cartProduct) {
        CartProduct managedCartProduct = entityManager.merge(cartProduct);
        entityManager.remove(managedCartProduct);
    }

    // Método adicional útil
    public CartProduct getCartProductById(int id) {
        return entityManager.find(CartProduct.class, id);
    }
}
