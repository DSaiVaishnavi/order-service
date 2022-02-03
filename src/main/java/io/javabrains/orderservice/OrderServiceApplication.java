package io.javabrains.orderservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@SpringBootApplication
public class OrderServiceApplication {
	@Autowired
	private OrderDao orderDao;

	@GetMapping("/orders")
	public List<Order> fetchOrders(){
		return orderDao.getOrders();

	}


	public static void main(String[] args) {
		SpringApplication.run(OrderServiceApplication.class, args);
	}

}



