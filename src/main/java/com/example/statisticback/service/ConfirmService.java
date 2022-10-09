package com.example.statisticback.service;

import com.example.statisticback.entity.Confirm;
import com.example.statisticback.entity.Respose.Responce;

public interface ConfirmService {
    Responce sureConfirm(Confirm confirm);
}
