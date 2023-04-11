package com.fssp.analyses.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Receiver {
    private String Receiver;
    private String ReceiverAddrType;
    private String ReceiverAddr;
}
