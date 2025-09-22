package com.project.service;

import com.project.entity.Address;
import com.project.entity.Student;
import com.project.feignClients.AddressFeignClient;
import com.project.repository.StudentRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;


@Service
public class StudentService {

	private final StudentRepository studentRepository;

    private final WebClient webClient;

    private final AddressFeignClient addressFeignClient;




    public StudentService(StudentRepository studentRepository, WebClient webClient, AddressFeignClient addressFeignClient) {
        this.studentRepository = studentRepository;
        this.webClient = webClient;
        this.addressFeignClient = addressFeignClient;
    }

     public Student createStudent(Student createStudentRequest) {
            return studentRepository.save(createStudentRequest);
	}
	
	public Student getById (long id) {
        return studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found with id: " + id));
	}


    public Address getAddressById (long id) {
       Mono<Address> address =  webClient.get().uri("/getById/"+id).
               retrieve().bodyToMono(Address.class);
               return address.block();
    }

    public Address getAddressById2 (long id) {
        return addressFeignClient.getById(id);
    }
}
