package org.ei.drishti.service;

import org.ei.drishti.domain.Action;
import org.ei.drishti.domain.Mother;
import org.ei.drishti.dto.ActionData;
import org.ei.drishti.dto.AlertPriority;
import org.ei.drishti.dto.BeneficiaryType;
import org.ei.drishti.repository.AllActions;
import org.ei.drishti.repository.AllChildren;
import org.ei.drishti.repository.AllMothers;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import static java.text.MessageFormat.format;
import static org.ei.drishti.dto.BeneficiaryType.mother;

@Service
public class ActionService {
    private AllActions allActions;
    private AllMothers allMothers;
    private AllChildren allChildren;
    private static Logger logger = LoggerFactory.getLogger(ActionService.class.toString());

    @Autowired
    public ActionService(AllActions allActions, AllMothers allMothers, AllChildren allChildren) {
        this.allActions = allActions;
        this.allMothers = allMothers;
        this.allChildren = allChildren;
    }

    public List<Action> getNewAlertsForANM(String anmIdentifier, long timeStamp) {
        return allActions.findByANMIDAndTimeStamp(anmIdentifier, timeStamp);
    }

    public void alertForBeneficiary(BeneficiaryType beneficiaryType, String caseID, String visitCode, AlertPriority alertPriority, DateTime startDate, DateTime expiryDate) {
        // TODO: Get rid of this horrible if-else after Motech-Platform fixes the bug related to metadata in motech-schedule-tracking.
        String anmIdentifier;
        if (mother.equals(beneficiaryType)) {
            anmIdentifier = allMothers.findByCaseId(caseID).anmIdentifier();
        }
        else {
            anmIdentifier = allChildren.findByCaseId(caseID).anmIdentifier();
        }

        allActions.add(new Action(caseID, anmIdentifier, ActionData.createAlert(beneficiaryType, visitCode, alertPriority, startDate, expiryDate)));
    }

    public void markAlertAsClosedForVisitForMother(String caseId, String anmIdentifier, String visitCode) {
        allActions.add(new Action(caseId, anmIdentifier, ActionData.markAlertAsClosed(visitCode)));
    }

    public void markAlertAsClosedForVisitForChild(String caseID, String anmIdentifier, String visitCode) {
        allActions.add(new Action(caseID, anmIdentifier, ActionData.markAlertAsClosed(visitCode)));
    }

    public void deleteAllAlertsForMother(String caseID) {
        Mother mother = allMothers.findByCaseId(caseID);

        allActions.addWithDelete(new Action(caseID, mother.anmIdentifier(), ActionData.deleteAllAlerts()), "alert");
    }

    public void deleteAllAlertsForChild(String caseID, String anmIdentifier) {
        allActions.addWithDelete(new Action(caseID, anmIdentifier, ActionData.deleteAllAlerts()), "alert");
    }

    public void registerEligibleCouple(String caseId, String ecNumber, String wife, String husband, String anmIdentifier, String village, String subCenter, String phc, Map<String, String> details) {
        allActions.add(new Action(caseId, anmIdentifier, ActionData.createEligibleCouple(wife, husband, ecNumber, village, subCenter, phc, details)));
    }

    public void closeEligibleCouple(String caseId, String anmIdentifier) {
        allActions.addWithDelete(new Action(caseId, anmIdentifier, ActionData.deleteEligibleCouple()), "alert");
    }

    public void registerPregnancy(String caseId, String ecCaseId, String thaayiCardNumber, String anmIdentifier, LocalDate lmpDate, Map<String, String> details) {
        allActions.add(new Action(caseId, anmIdentifier, ActionData.registerPregnancy(ecCaseId, thaayiCardNumber, lmpDate, details)));
    }

    public void closeANC(String caseId, String anmIdentifier, String reasonForClose) {
        allActions.add(new Action(caseId, anmIdentifier, ActionData.closeANC(reasonForClose)));
    }

    public void registerChildBirth(String caseId, String anmIdentifier, String thaayiCardNumber, LocalDate dateOfBirth, String gender) {
        Mother mother = allMothers.findByThaayiCardNumber(thaayiCardNumber);
        if (mother == null) {
            logger.warn(format("Found child birth without registered mother. Ignoring case: {0} for thaayiCardNumber: {1} for ANM: {2}",
                    caseId, thaayiCardNumber, anmIdentifier));
            return;
        }

        allActions.add(new Action(caseId, anmIdentifier, ActionData.registerChildBirth(mother.caseId(), dateOfBirth, gender)));
    }

    public void updateEligibleCoupleDetails(String caseId, String anmIdentifier, Map<String, String> details) {
        allActions.add(new Action(caseId, anmIdentifier, ActionData.updateEligibleCoupleDetails(details)));
    }

    public void updateMotherDetails(String caseId, String anmIdentifier, Map<String, String> details) {
        allActions.add(new Action(caseId, anmIdentifier, ActionData.updateMotherDetails(details)));
    }

    public void ancCareProvided(String caseId, String anmIdentifier, int visitNumber, LocalDate visitDate, int numberOfIFATabletsGiven) {
        allActions.add(new Action(caseId, anmIdentifier, ActionData.ancCareProvided(visitNumber, visitDate, numberOfIFATabletsGiven)));
    }

    public void registerOutOfAreaANC(String caseId, String wifeName, String husbandName, String anmIdentifier, String village, String subCenter, String phc, String thaayiCardNumber,
                                     LocalDate lmp, Map<String, String> details) {
        allActions.add(new Action(caseId, anmIdentifier, ActionData.registerOutOfAreaANC(wifeName, husbandName, village, subCenter, phc,
                thaayiCardNumber, lmp, details)));
    }
}