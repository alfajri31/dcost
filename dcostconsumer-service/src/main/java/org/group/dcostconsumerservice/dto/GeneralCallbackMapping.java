package org.group.dcostconsumerservice.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.jackson.Jacksonized;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GeneralCallbackMapping {
    @JsonProperty("userId")
    private String userId;
    @JsonProperty("requestId")
    private String requestId;
    @JsonProperty("requestName")
    private String requestName;
    @JsonProperty("paidAmount")
    private Integer paidAmount;
    @JsonProperty("date")
    private String date;
}

