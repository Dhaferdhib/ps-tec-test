package com.ps.pstectest.infra;

import com.ps.pstectest.infra.forms.CheckBox;
import com.ps.pstectest.infra.forms.FormDefinition;
import com.ps.pstectest.infra.forms.FormElement;
import com.ps.pstectest.infra.forms.FormValidator;

import java.util.List;
import java.util.Optional;
import java.util.regex.Pattern;

import static com.ps.pstectest.infra.forms.FormElementType.*;
import static java.util.Collections.emptyList;

public interface FormAdapter {
    default Optional<FormDefinition> getForm(String formIdentifier) {
        return Optional.of(
                FormDefinition.builder()
                        .id("425958")
                        .name("CANDIDATE_FORM")
                        .formElement(FormElement.builder()
                                .name("candidate_first_name")
                                .type(TEXT_FIELD)
                                .validator(FormValidator.builder()
                                        .mandatory(true)
                                        .minSize(null)
                                        .maxSize(null)
                                        .regexp(Pattern.compile("[a-z]*"))
                                        .build())
                                .checkBoxes(emptyList())
                                .build())
                        .formElement(FormElement.builder()
                                .name("candidate_surname")
                                .type(TEXT_FIELD)
                                .validator(FormValidator.builder()
                                        .mandatory(true)
                                        .minSize(null)
                                        .maxSize(null)
                                        .regexp(Pattern.compile("[a-z]*"))
                                        .build())
                                .checkBoxes(emptyList())
                                .build())
                        .formElement(FormElement.builder()
                                .name("candidate_email")
                                .type(TEXT_FIELD)
                                .validator(FormValidator.builder()
                                        .mandatory(false)
                                        .minSize(null)
                                        .maxSize(600)
                                        .regexp(Pattern.compile("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$"))
                                        .build())
                                .checkBoxes(emptyList())
                                .build())
                        .formElement(FormElement.builder()
                                .name("candidate_phone_number")
                                .type(PHONE_FIELD)
                                .validator(FormValidator.builder()
                                        .mandatory(false)
                                        .minSize(null)
                                        .maxSize(null)
                                        .regexp(Pattern.compile("[a-z]*"))
                                        .regexp(null)
                                        .build())
                                .checkBoxes(emptyList())
                                .build())
                        .formElement(FormElement.builder()
                                .name("candidate_skills")
                                .type(CHECKBOXES_GROUP)
                                .validator(FormValidator.builder()
                                        .mandatory(false)
                                        .minSize(null)
                                        .maxSize(null)
                                        .regexp(null)
                                        .build())
                                .checkBoxes(List.of(
                                        CheckBox.builder().value("Backend").build(),
                                        CheckBox.builder().value("Front").build())
                                )
                                .build())
                        .formElement(FormElement.builder()
                                .name("candidate_notes")
                                .type(TEXT_AREA)
                                .validator(FormValidator.builder()
                                        .mandatory(false)
                                        .minSize(null)
                                        .maxSize(600)
                                        .regexp(null)
                                        .build())
                                .checkBoxes(emptyList())
                                .build())
                        .build());
    }
}
