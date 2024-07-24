package com.group.libraryapp.controller.calculator;

//ctrl+alt+o
import com.group.libraryapp.dto.calculator.request.CalculatorAddRequest;
import com.group.libraryapp.dto.calculator.request.CalculatorMultiplyRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController { //한 Controller Class에 여러 API를 추가할 수 있음

    @GetMapping("/add") //GET /add
    public int addTwoNumbers(CalculatorAddRequest request) {
        return request.getNumber1()+ request.getNumber2();
    }

    @PostMapping("/multiply") //POST /multiply
    public int multiplyTwoNumbers(@RequestBody CalculatorMultiplyRequest request) {
        return request.getNumber1() * request.getNumber2();
    }
}
