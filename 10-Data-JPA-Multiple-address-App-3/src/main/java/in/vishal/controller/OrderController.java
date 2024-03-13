package in.vishal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.vishal.dto.OrderRequest;
import in.vishal.dto.OrderResponse;
import in.vishal.entity.Customer;
import in.vishal.repo.CustomerRepository;
import in.vishal.repo.ProductRepository;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/place")
    public Customer placeOrder(@RequestBody OrderRequest request){
       return customerRepository.save(request.getCustomer());
    }

    @GetMapping("/findAll")
    public List<Customer> findAllOrders(){
        return customerRepository.findAll();
    }

    @GetMapping("/get")
    public List<OrderResponse> getJoinInformation(){
        return customerRepository.getJoinInformation();
    }
}