package com.ps.pstectest.app.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@ApiModel(
        description = "a form field."
)
public class Field {
    @JsonProperty("name")
    private String name;
    @JsonProperty("value")
    private String value;
    @JsonProperty("values")
    @Valid
    private List<String> values = null;

    public Field() {
    }

    public Field name(String name) {
        this.name = name;
        return this;
    }

    @ApiModelProperty(
            example = "contactFirstName",
            required = true,
            value = "The name of the element"
    )
    @NotNull
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Field value(String value) {
        this.value = value;
        return this;
    }

    @ApiModelProperty(
            example = "John",
            value = "The value"
    )
    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Field values(List<String> values) {
        this.values = values;
        return this;
    }

    public Field addValuesItem(String valuesItem) {
        if (this.values == null) {
            this.values = new ArrayList();
        }

        this.values.add(valuesItem);
        return this;
    }

    @ApiModelProperty(
            example = "[\"displayOnInvoice\",\"displayOnLogisticNotes\"]",
            value = "The values"
    )
    public List<String> getValues() {
        return this.values;
    }

    public void setValues(List<String> values) {
        this.values = values;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Field field = (Field)o;
            return Objects.equals(this.name, field.name) && Objects.equals(this.value, field.value) && Objects.equals(this.values, field.values);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.name, this.value, this.values});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FieldRequest {\n");
        sb.append("    name: ").append(this.toIndentedString(this.name)).append("\n");
        sb.append("    value: ").append(this.toIndentedString(this.value)).append("\n");
        sb.append("    values: ").append(this.toIndentedString(this.values)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }

}
