package com.fssp.analyses.model;

import com.fssp.analyses.model.Enums.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement(name = "root") // замените "root" на имя корневого элемента в вашем XML файле
@XmlAccessorType(XmlAccessType.FIELD)
public class Enforcement {


        @XmlElement(name = "ExternalKey")
        private String externalKey;

        @XmlElement(name = "Barcode")
        private String barcode;

        @XmlElement(name = "DocType")
        private DocType docType;

        @XmlElement(name = "DocName")
        private String docName;

        @XmlElement(name = "DocDate")
        private String docDate;

        @XmlElement(name = "DeloNum")
        private String deloNum;

        @XmlElement(name = "AuthorName")
        private String authorName;

        @XmlElement(name = "AuthorAddress")
        private String authorAddress;

        @XmlElement(name = "AuthorPhone")
        private String authorPhone;

        @XmlElement(name = "AuthorFax")
        private String authorFax;

        @XmlElement(name = "AuthorEmail")
        private String authorEmail;

        @XmlElement(name = "AuthorOkogu")
        private String authorOkogu;

        @XmlElement(name = "AuthorShortName")
        private String authorShortName;

        @XmlElement(name = "MinistryName")
        private String ministryName;

        @XmlElement(name = "AuthorOkpo")
        private String authorOkpo;

        @XmlElement(name = "AuthorDivisionCode")
        private String authorDivisionCode;

        @XmlElement(name = "AuthorSignerPost")
        private String authorSignerPost;

        @XmlElement(name = "AuthorSignerPostCode")
        private String authorSignerPostCode;

        @XmlElement(name = "AuthorSignerName")
        private String authorSignerName;

        @XmlElement(name = "AuthorExecutorName")
        private String authorExecutorName;

        @XmlElement(name = "AuthorExecutorPhone")
        private String authorExecutorPhone;

        @XmlElement(name = "QueryKey")
        private String queryKey;

        @XmlElement(name = "QueryNumber")
        private String queryNumber;

        @XmlElement(name = "QueryDate")
        private LocalDate queryDate;

        @XmlElement(name = "PageNumber")
        private int PageNumber;

        @XmlElement(name = "PageCount")
        private int pageCount;

        @XmlElement(name = "SendList")
        private List<Receiver> SendList;


}
