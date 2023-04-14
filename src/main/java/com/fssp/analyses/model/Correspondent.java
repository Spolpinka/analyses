package com.fssp.analyses.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlElement;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Correspondent {

    @XmlElement(name = "CorrespondentName")
    private String correspondentName;
}
