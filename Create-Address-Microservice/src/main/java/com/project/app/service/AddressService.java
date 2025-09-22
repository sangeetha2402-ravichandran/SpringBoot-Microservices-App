package com.project.app.service;

import com.project.app.entity.Address;
import com.project.app.repository.AddressRepository;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

import static org.slf4j.LoggerFactory.getLogger;

@Slf4j
@Service
public class AddressService {



    private final AddressRepository addressRepository;

    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    public Address createAddress(Address createAddressRequest) {
        return addressRepository.save(createAddressRequest);
    }

    public Address getById (long id) {
        return addressRepository.findById(id) .orElseThrow(() -> new RuntimeException("Student not found with id: " + id));
    }

}