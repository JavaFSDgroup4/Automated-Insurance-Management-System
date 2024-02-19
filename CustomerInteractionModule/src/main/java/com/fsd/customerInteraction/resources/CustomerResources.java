package com.fsd.customerInteraction.resources;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fsd.customerInteraction.exceptions.ResourceNotFoundException;
import com.fsd.customerInteraction.repository.CustomerRepository;
import com.fsd.customerInteraction.resource.Customer;

//CustomerController.java
@RestController
@RequestMapping("/customers")
public class CustomerResources {

 @Autowired
 private CustomerRepository customerRepository;

 @GetMapping("/allCustomers")
 public List<Customer> getAllCustomers() {
     return customerRepository.findAll();
 }

 @GetMapping("/getCustomerById/{id}")
 public ResponseEntity<Customer> getCustomerById(@PathVariable(value = "id") Long customerId) {
     Customer customer = customerRepository.findById(customerId)
         .orElseThrow(() -> new ResourceNotFoundException("Customer not found with id: " + customerId));
     return ResponseEntity.ok().body(customer);
 }

 @PostMapping("/createCustomer")
 public Customer createCustomer(@Validated @RequestBody Customer customer) {
     return customerRepository.save(customer);
 }

 @PutMapping("/updateCustomer/{id}")
 public ResponseEntity<Customer> updateCustomer(@PathVariable(value = "id") Long customerId,
                                                @Validated @RequestBody Customer customerDetails) {
     Customer customer = customerRepository.findById(customerId)
         .orElseThrow(() -> new ResourceNotFoundException("Customer not found with id: " + customerId));
     customer.setName(customerDetails.getName());
     customer.setEmail(customerDetails.getEmail());
     customer.setAddress(customerDetails.getAddress());
     customer.setDateOfBirth(customerDetails.getDateOfBirth());
     customer.setPhoneNumber(customerDetails.getPhoneNumber());
     final Customer updatedCustomer = customerRepository.save(customer);
     return ResponseEntity.ok(updatedCustomer);
 }

 @DeleteMapping("/deleteCustomer/{id}")
 public Map<String, Boolean> deleteCustomer(@PathVariable(value = "id") Long customerId) {
     Customer customer = customerRepository.findById(customerId)
         .orElseThrow(() -> new ResourceNotFoundException("Customer not found with id: " + customerId));
     customerRepository.delete(customer);
     Map<String, Boolean> response = new HashMap<>();
     response.put("deleted", Boolean.TRUE);
     return response;
 }

 @GetMapping("/getCustomersByDateOfBirth/dob/{dateOfBirth}")
 public List<Customer> getCustomersByDateOfBirth(@PathVariable(value = "dateOfBirth") LocalDate dateOfBirth) {
     return customerRepository.findByDateOfBirth(dateOfBirth);
 }
}
