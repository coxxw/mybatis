package com.how2java;


import com.how2java.pojo.Category;
import com.how2java.pojo.Product;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) throws IOException {
//        String resource="mybatis-config.xml";
//        InputStream inputStream= Resources.getResourceAsStream(resource);
//        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
//        SqlSession session=sqlSessionFactory.openSession();

//        List<Category>cs=session.selectList("listCategory");
//        for(Category c:cs){
//            System.out.println(c.getName());
//        }
//        Category c=new Category();
//        c.setName("XIN");
//        session.insert("addCategory",c);
//        listAll(session);
//        session.commit();
//        session.close();
//    }
//
//    private static void listAll(SqlSession session) {
//        List<Category>cs=session.selectList("listCategory");
//        for(Category c:cs){
//            System.out.println(c.getName());
//        }
//        String resource="mybatis-config.xml";
//        InputStream inputStream=Resources.getResourceAsStream(resource);
//        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
//        SqlSession session=sqlSessionFactory.openSession();
//
//        Category c=new Category();
//        c.setId(2);
//        session.delete("deleteCategory",c);
//        listAll(session);
//        session.commit();
//        session.close();
//
//    }
//
//    private static void listAll(SqlSession session) {
//        List<Category> cs=session.selectList("listCategory");
//        for(Category c:cs){
//            System.out.println(c.getName());
//        }
//        String resource="mybatis-config.xml";
//        InputStream inputStream=Resources.getResourceAsStream(resource);
//        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
//        SqlSession session=sqlSessionFactory.openSession();
//
//        Category c=session.selectOne("getCategory",1);
//        c.setName("bb");
//        session.update("updateCategory",c);
//        listAll(session);
//        session.commit();
//        session.close();
//    }
//
//    private static void listAll(SqlSession session) {
//        List<Category>cs=session.selectList("listCategory");
//        for(Category c:cs){
//            System.out.println(c.getName());
//        }
        String resource="mybatis-config.xml";
        InputStream inputStream=Resources.getResourceAsStream(resource);
        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session=factory.openSession();

//        List<Category>cs=session.selectList("listCategoryByName","cat");
//        for(Category c:cs){
//            System.out.println(c.getName());
//        }
//        session.commit();
//        session.close();
        Map<String,Object>params=new HashMap<>();
        params.put("id",1);
        params.put("name","ca");


        List<Category>cs=session.selectList("listCategoryByIdAndName",params);
        for(Category c:cs){
            System.out.println(c.getName());
        }
        session.commit();
        session.close();


//        String resource="mybatis-config.xml";
//        InputStream inputStream=Resources.getResourceAsStream(resource);
//        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(inputStream);
//        SqlSession session=factory.openSession();

//        List<Category>cs=session.selectList("listCategory");
//        for(Category c:cs){
//            System.out.println(c);
//            List<Product>ps=c.getProducts();
//            for(Product p:ps){
//                System.out.println(p);
//            }
//        }
//        session.commit();
//        session.close();
//        List<Product>ps= session.selectList("listProduct");
//        for(Product p:ps){
//            System.out.println(p+"对应的分类是："+p.getCategory());
//        }
//        session.commit();
//        session.close();
    }

}
