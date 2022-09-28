package com.ps.pstectest.app;

import com.ps.pstectest.app.dto.FormSubmission;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public interface FormApi {
    default ResponseEntity<FormSubmission> submitForm(FormSubmission formSubmission) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }
}
