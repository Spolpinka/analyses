package com.fssp.analyses.model;

import com.fssp.analyses.model.Enums.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Enforcement {
    private long ExternalKey;
    private String Barcode;
    private DocType DocType;
    private String DocName;
    private LocalDate DocDate;
    private String DeloNum;
    private String AuthorName;
    private String AuthorAddress;
    private int AuthorPhone;
    private int AuthorFax;
    private String AuthorEmail;
    private int AuthorOkogu;
    private String AuthorShortName;
    private String MinistryName;
    private int AuthorOkpo;
    private int AuthorDivisionCode;
    private String AuthorSignerPost;
    private String AuthorSignerPostCode;
    private String AuthorSignerName;
    private String AuthorExecutorName;
    private int AuthorExecutorPhone;
    private int QueryKey;
    private int QueryNumber;
    private LocalDate QueryDate;
    private int PageNumber;
    private int PageCount;
    private List<Receiver> SendList;
}
