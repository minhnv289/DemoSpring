package com.example.demostart.api;

import com.example.demostart.exception.ApplicationError;
import com.example.demostart.exception.CustomerNotFoundException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@RestController
public class ErrorHandler extends ResponseEntityExceptionHandler {
    @Value("${api_doc_url}")
    private String details;


    @ExceptionHandler(CustomerNotFoundException.class)
    public ResponseEntity<ApplicationError> handlerCustomerNotFound(CustomerNotFoundException exception, WebRequest webRequest) {
        ApplicationError applicationError = new ApplicationError();
        applicationError.setCode(101);
        applicationError.setMessage(exception.getMessage());
        applicationError.setDetails(details);
        return new ResponseEntity<>(applicationError, HttpStatus.NOT_FOUND);
    }
}
