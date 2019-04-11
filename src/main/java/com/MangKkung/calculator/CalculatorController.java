package com.MangKkung.calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
class CalculatorController{
    @Autowired
        private Calculator calculator;
    @RequestMapping("/sum")
        String sum(@RequestParam("a") Integer a,
                   @RequestParam("b") Integer b) {
            return String.valueOf(calculator.sum(a, b));
        }
    @RequestMapping("/dif")
        string dif(@RequestParam("a") Integer a,
                   @RequestParam("b") Integer b){
            return String.valueOf(calculator.dif(a,b));
        }
   @RequestMapping("/mul")
        string dif(@RequestParam("a") Integer a,
                   @RequestParam("b") Integer b){
            return String.valueOf(calculator.mul(a,b));
        }
    @RequestMapping("/div")
        string dif(@RequestParam("a") Integer a,
                   @RequestParam("b") Integer b){
            return String.valueOf(calculator.div(a,b)); 
        }
}
