package com.wf.dwbs.service.impl;

import com.wf.dwbs.model.ProvisionCardRequest;
import com.wf.dwbs.model.ProvisionCardResponse;
import com.wf.dwbs.service.ProvisionCardService;

import java.util.Map;
import java.util.Optional;

public class ProvisionCardServiceImpl implements ProvisionCardService {
    @Override
    public ProvisionCardResponse processProvisionCardRequest(ProvisionCardRequest provisionCardRequest, Map<String, String> headerMap) {
        String workflowId = Optional.ofNullable(provisionCardRequest)
                .map(ProvisionCardRequest::getINterdic)
        return null;
    }
}
