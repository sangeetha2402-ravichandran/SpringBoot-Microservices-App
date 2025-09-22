package com.project.feignClients;


import com.project.entity.Address;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@LoadBalancerClient(value="address-service")
public class AddressLoadBalance {

    @LoadBalanced
    @Bean
    public Feign.Builder feignBuilder(){
        return feign.builder();
    }
}
