package com.wf.dwbs.controller;

import com.wf.dwbs.model.ProvisionCardRequest;
import com.wf.dwbs.model.ProvisionCardResponse;
import com.wf.dwbs.service.ProvisionCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import static com.wf.dwbs.constants.ProvisionCardConstants.API_ENDPOINT_PROVISION_CARD;

@RestController
public class ProvisionCardController {
    private final ProvisionCardService provisionCardService;

    @Autowired//Why did we do this?
    public ProvisionCardController(ProvisionCardService provisionCardService) {
        this.provisionCardService = provisionCardService;
    }

    @PostMapping(value = API_ENDPOINT_PROVISION_CARD)
    public ProvisionCardResponse getCardProvisioned(@RequestHeader Map<String, String> headers, @RequestBody ProvisionCardRequest provisionCardRequest) {
        return provisionCardService.processProvisionCardRequest(provisionCardRequest, headers);
    }
}
