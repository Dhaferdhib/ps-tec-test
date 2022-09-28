package com.ps.pstectest.infra.forms;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.List;


@Data
@Builder
public class Field {
    @NotNull
    String name;
    String value;
    List<String> values;
}
