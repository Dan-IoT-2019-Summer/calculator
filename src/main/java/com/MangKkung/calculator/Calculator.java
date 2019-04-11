package com.MangKkung.calculator;
import org.springframework.stereotype.Service;

@Service
public class Calculator{
    int sum(int a, int b){
        return a + b;
    }
    int dif(int a, int b){
        return a - b;
    }
    int mul(int a, int b){
        return a * b;
    }
    int div(int a, int b){
        return a / b;
    }
}
