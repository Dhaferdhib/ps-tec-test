package com.ps.pstectest.app.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FormSubmission {
    @JsonProperty("fields")
    @Valid
    private List<Field> fields = new ArrayList();

    public FormSubmission() {
    }

    public FormSubmission fields(List<Field> fields) {
        this.fields = fields;
        return this;
    }

    public FormSubmission addFieldsItem(Field fieldsItem) {
        this.fields.add(fieldsItem);
        return this;
    }

    @ApiModelProperty(
            example = "[{\"name\":\"a name\",\"value\":\"a value\"},{\"name\":\"CheckBoxGroupe1\",\"values\":[\"checkboxValue1\",\"checkboxValue2\"]}]",
            required = true,
            value = "Represents an object containing an array of form fields"
    )
    @NotNull
    @Valid
    @Size(
            min = 1
    )
    public List<Field> getFields() {
        return this.fields;
    }

    public void setFields(List<Field> fields) {
        this.fields = fields;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            FormSubmission FormSubmission = (FormSubmission)o;
            return Objects.equals(this.fields, FormSubmission.fields);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.fields});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FromSubmission {\n");
        sb.append("    fields: ").append(this.toIndentedString(this.fields)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }

}
