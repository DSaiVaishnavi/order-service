package io.javabrains.orderservice;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Repository
public class OrderDao {

    public List<Order> getOrders(){
        return Stream.of(new Order(101,"Mobile",1,10000),
                new Order(101,"Laptop",1,30000),
                new Order(101,"HeadSets",1,2000)).collect(Collectors.toList());



    }
}