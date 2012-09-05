package org.ei.drishti.controller;

import org.ei.drishti.scheduler.router.Action;
import org.ei.drishti.scheduler.router.AlertRouter;
import org.ei.drishti.scheduler.router.Matcher;
import org.ei.drishti.scheduler.router.MilestoneEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Map;

import static org.ei.drishti.scheduler.DrishtiSchedules.*;
import static org.ei.drishti.scheduler.router.Matcher.any;
import static org.ei.drishti.scheduler.router.Matcher.anyOf;
import static org.ei.drishti.scheduler.router.Matcher.eq;
import static org.motechproject.scheduletracking.api.domain.WindowName.due;
import static org.motechproject.scheduletracking.api.domain.WindowName.late;
import static org.motechproject.scheduletracking.api.domain.WindowName.max;

@Component
public class AlertController {
    @Autowired
    public AlertController(AlertRouter router, @Qualifier("ANMGroupSMSAction") Action anmGroupSMS,
                           @Qualifier("ForceFulfillAction") Action forceFulfill, @Qualifier("AlertCreationAction") Action alertCreation) {
        router.addRoute(eq(SCHEDULE_ANC), any(), eq(max.toString()), forceFulfill);
        router.addRoute(eq(SCHEDULE_LAB), any(), eq(max.toString()), forceFulfill);
        router.addRoute(motherSchedules(), any(), anyOf(due.toString(), late.toString()), alertCreation).addExtraData("beneficiaryType", "mother");
        router.addRoute(childSchedules(), any(), anyOf(due.toString(), late.toString()), doNothingAction()).addExtraData("beneficiaryType", "child");
        router.addRoute(any(), any(), any(), anmGroupSMS);
    }

    private Matcher childSchedules() {
        return anyOf(CHILD_SCHEDULE_BCG, CHILD_SCHEDULE_DPT, CHILD_SCHEDULE_HEPATITIS, CHILD_SCHEDULE_MEASLES, CHILD_SCHEDULE_OPV);
    }

    private Matcher motherSchedules() {
        return anyOf(SCHEDULE_ANC, SCHEDULE_TT, SCHEDULE_IFA, SCHEDULE_LAB, SCHEDULE_EDD);
    }

    private Action doNothingAction() {
        return new Action() {
            @Override
            public void invoke(MilestoneEvent event, Map<String, String> extraData) {
            }
        };
    }
}