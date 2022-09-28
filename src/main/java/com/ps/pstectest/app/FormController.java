package com.ps.pstectest.app;

import com.ps.pstectest.service.FormService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class FormController implements FormApi{
    FormService formService;

}
