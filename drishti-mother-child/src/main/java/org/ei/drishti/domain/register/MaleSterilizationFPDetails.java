package org.ei.drishti.domain.register;

import java.util.List;

public class MaleSterilizationFPDetails extends SterilizationFPDetails {

    public MaleSterilizationFPDetails(String typeOfSterilization, String sterilizationDate, List<String> followupVisitDates, String remarks) {
        super(typeOfSterilization, sterilizationDate, followupVisitDates, remarks);
    }
}