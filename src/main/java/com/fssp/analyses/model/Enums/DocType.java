package com.fssp.analyses.model.Enums;

public enum DocType {
    PROGRESS_NOTIFICATION("Уведомление о ходе исполнительного производства"),
    REFUSAL("Уведомление об отказе в предоставлении информации об исполнительном производстве"),
    ABSENCE("Уведомление об отсутствии исполнительного производства"),
    MESSAGE("Сообщение (уведомление) с ответом на запрос");


    private String name;

    DocType(String name) {
        this.name = name;
    }

    public static DocType getDocTypeByName(String name) {
        return DocType.valueOf(name);
    }
}
