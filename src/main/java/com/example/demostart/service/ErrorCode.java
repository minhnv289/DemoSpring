package com.example.demostart.service;

import com.example.demostart.model.Customer;
import com.google.gson.Gson;
import org.springframework.boot.json.GsonJsonParser;

import java.util.List;

public class ErrorCode {
    private String errorCode;
    private String msgErrCode;
    private Object T;
    private List<Customer> customers;

    public static String return00() {
        ErrorCode errorCode = new ErrorCode();
        errorCode.errorCode = "00";
        errorCode.msgErrCode = "Thành Công";
        return new Gson().toJson(errorCode);
    }
    public static String returnErrorCode(String errorCodeCode) {
        ErrorCode errorCode = new ErrorCode();
        errorCode.errorCode = errorCodeCode;
        errorCode.msgErrCode = "Lỗi tìm kiếm";
        return new Gson().toJson(errorCode);
    }
    public static String return00Customer(Object T) {
        ErrorCode errorCode = new ErrorCode();
        errorCode.errorCode = "00";
        errorCode.msgErrCode = "Thành Công";
        errorCode.T = T;
        return new Gson().toJson(errorCode);
    }

    public static String return00Customer(List<Customer> customers) {
        ErrorCode errorCode = new ErrorCode();
        errorCode.errorCode = "00";
        errorCode.msgErrCode = "Thành Công";
        errorCode.customers = customers;
        return new Gson().toJson(errorCode);
    }
}
