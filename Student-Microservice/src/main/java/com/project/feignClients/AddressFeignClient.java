package com.project.feignClients;


import com.project.entity.Address;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value="address-service" ,path="/api/address")
public interface AddressFeignClient {

    @GetMapping("/getById/{id}")
    public Address getById(@PathVariable long id) ;
}
