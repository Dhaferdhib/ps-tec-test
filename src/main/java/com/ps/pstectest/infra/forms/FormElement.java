package com.ps.pstectest.infra.forms;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FormElement {
    String id;
    String name;
    FormElementType type;

    /**
     * Represents the type of the field on the form builder provider.
     */
    FormValidator validator;
    List<CheckBox> checkBoxes;
    List<RadioButton> radioButtons;
    List<Option> options;
}
