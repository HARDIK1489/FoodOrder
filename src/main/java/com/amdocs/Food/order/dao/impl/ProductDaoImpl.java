package com.amdocs.Food.order.dao.impl;

import com.amdocs.Food.order.Entity.Category;
import com.amdocs.Food.order.Entity.Product;
import com.amdocs.Food.order.Repository.ProductRepository;
import com.amdocs.Food.order.dao.ProductDao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductDaoImpl implements ProductDao {

    @Autowired
    ProductRepository productRepository;

    public Product getProductDetails(Long productId) {

        return productRepository.findByIdAndIsActiveTrue(productId);
    }

//    public List<Category> getCategories() {
////
////        Session session = this.sessionFactory.openSession();
////        Transaction transaction = session.beginTransaction();
////
////        String query = "from Category";
////        Query query2 = session.createQuery(query);
////
////        Object object = query2.list();
////
////        List<Category> list = (List<Category>) object;
////
////        transaction.commit();
////        session.close();
////        return list;
//    }

}
