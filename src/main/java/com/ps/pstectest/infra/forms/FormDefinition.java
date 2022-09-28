package com.ps.pstectest.infra.forms;

import lombok.*;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FormDefinition {
    String id;
    String name;
    @Singular
    List<FormElement> formElements;
}
