package com.payroll.employeeservice.controller;

import com.payroll.employeeservice.exception.ResourceNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController
{
public static final Logger logger= LoggerFactory.getLogger(HelloController.class);
@GetMapping("/hello/{id}")
public String hello(@PathVariable ("id") int id)
{
   logger.info("Receive request for id {}",id);
  if(id<=0) {
      logger.error("Invalid Id {}", id);
      throw new ResourceNotFoundException("ID must be positive.");
  }
  return "Hello user with id"+id;
}
}
