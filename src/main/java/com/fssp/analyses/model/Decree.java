package com.fssp.analyses.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Decree {
    private long OIpId;

    private long IpId;

    private String DocNumber;

    private String DocDate;

    private String DocType;

    private String DocTypeName;

    private List<Correspondent> correspondentList;
}
