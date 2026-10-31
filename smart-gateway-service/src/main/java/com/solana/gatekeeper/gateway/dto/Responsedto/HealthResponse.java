package com.solana.gatekeeper.gateway.dto.Responsedto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HealthResponse {
    private String serviceName;
    private String serviceDescription;
    private String appStatus;
}
