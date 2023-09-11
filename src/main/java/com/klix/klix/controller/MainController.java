package com.klix.klix.controller;

import com.klix.klix.controller.dto.PostApplicationDTO;
import com.klix.klix.integration.bank.dto.Base.BaseBankResponse;
import com.klix.klix.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api")
public class MainController {

    @Autowired
    private MainService mainService;

    @PostMapping("/application")
    public ResponseEntity<?> postApplication(@RequestBody PostApplicationDTO bankRequest) {
        try {
            return ResponseEntity.ok(mainService.createApplication(bankRequest));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }

    @GetMapping("/application")
    public ResponseEntity<?> getApplication(@RequestBody Map<String, String> bankIdMap) {
        try {
            return ResponseEntity.ok(mainService.getBankResponse(bankIdMap));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }

}