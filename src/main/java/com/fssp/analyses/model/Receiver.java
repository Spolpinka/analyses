package com.fssp.analyses.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement(name = "root") // замените "root" на имя корневого элемента в вашем XML файле ТОЧНО СЮДА?
@XmlAccessorType(XmlAccessType.FIELD)
public class Receiver {

    @XmlElement(name = "Receiver")
    private String receiver;

    @XmlElement(name = "ReceiverAddrType")
    private String receiverAddrType;

    @XmlElement(name = "ReceiverAddr")
    private String receiverAddr;
}
