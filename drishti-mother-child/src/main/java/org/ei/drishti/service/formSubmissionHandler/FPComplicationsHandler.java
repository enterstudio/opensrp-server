package org.ei.drishti.service.formSubmissionHandler;

import org.ei.drishti.dto.form.FormSubmission;
import org.ei.drishti.service.ECService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FPComplicationsHandler implements FormSubmissionHandler {
    private ECService ecService;

    @Autowired
    public FPComplicationsHandler(ECService ecService) {
        this.ecService = ecService;
    }

    @Override
    public void handle(FormSubmission submission) {
        ecService.reportFPComplications(submission);
    }
}
