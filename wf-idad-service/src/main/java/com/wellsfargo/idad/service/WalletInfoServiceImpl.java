package com.wellsfargo.idad.service;

import org.springframework.stereotype.Service;

@Service
public class WalletInfoServiceImpl implements WalletInfoService {
    @Override
    public String getWalletInfo() throws Exception {
        return "Hello Idad";
    }
}
