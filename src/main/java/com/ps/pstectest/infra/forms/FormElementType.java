package com.ps.pstectest.infra.forms;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FormElementType {
    TEXT_FIELD,
    PHONE_FIELD,
    FAX_FIELD,
    STREET_NUMBER_FIELD,
    USERS_MAIL,
    ZIP_FIELD,
    TEXT_AREA,
    NUMBER_FIELD,
    CHECKBOXES_GROUP,
    SELECT_BOX,
    RADIOBUTTON_GROUP,
    UNHANDLED_TYPE

}
