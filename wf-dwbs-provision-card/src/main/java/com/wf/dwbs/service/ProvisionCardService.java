package com.wf.dwbs.service;

import com.wf.dwbs.model.ProvisionCardRequest;
import com.wf.dwbs.model.ProvisionCardResponse;

import java.util.Map;

public interface ProvisionCardService {
    ProvisionCardResponse processProvisionCardRequest(ProvisionCardRequest provisionCardRequest, Map<String, String> headerMap);
}
