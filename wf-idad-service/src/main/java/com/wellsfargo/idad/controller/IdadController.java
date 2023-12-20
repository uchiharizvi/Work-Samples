package com.wellsfargo.idad.controller;

import com.wellsfargo.idad.service.WalletInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1")
@RestController
public class IdadController {
    @Autowired
    private WalletInfoService walletInfoService;

    @GetMapping("/wallet-info")
    public String getWalletInfo() throws Exception {
        return walletInfoService.getWalletInfo();
    }
}
