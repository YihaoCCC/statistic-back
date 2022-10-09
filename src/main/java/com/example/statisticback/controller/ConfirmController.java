package com.example.statisticback.controller;

import com.example.statisticback.entity.Confirm;
import com.example.statisticback.entity.Respose.Responce;
import com.example.statisticback.service.ConfirmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfirmController {
    @Autowired
    private ConfirmService confirmService;

    @PostMapping("/confirm")
    private Responce useConfirmFood(@RequestBody Confirm confirm) {
        return confirmService.sureConfirm(confirm);
    }
}
