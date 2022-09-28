package com.ps.pstectest.infra.forms;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.regex.Pattern;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FormValidator {
    boolean mandatory;
    Pattern regexp;
    Integer minSize;
    Integer maxSize;
}
