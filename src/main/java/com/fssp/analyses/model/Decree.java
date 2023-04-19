package com.fssp.analyses.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlElement;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Decree {

    @XmlElement(name = "OIpId")
    private long oIpId;

    @XmlElement(name = "IpId")
    private long ipId;

    @XmlElement(name = "DocNumber")
    private String docNumber;

    @XmlElement(name = "DocDate")
    private String docDate;

    @XmlElement(name = "DocType")
    private String DocType;

    @XmlElement(name = "DocTypeName")
    private String docTypeName;

    @XmlElement(name = "Correspondents")
    private List<Correspondent> correspondentList;
}
