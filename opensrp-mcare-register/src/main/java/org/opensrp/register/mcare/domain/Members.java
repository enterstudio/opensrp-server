/**
 * @author Asifur
 */

package org.opensrp.register.mcare.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.ektorp.support.TypeDiscriminator;
import org.motechproject.model.MotechBaseDataObject;

@JsonIgnoreProperties(ignoreUnknown = true)
@TypeDiscriminator("doc.type === 'Members'")
public class Members extends MotechBaseDataObject {
	@JsonProperty
	private String caseId;
	@JsonProperty
	private String INSTANCEID;
	@JsonProperty
	private String PROVIDERID;
	@JsonProperty
	private String LOCATIONID;
	@JsonProperty
	private String HH_Member;
	@JsonProperty
	private String Reg_No;
	@JsonProperty
	private String BDH;
	@JsonProperty
	private String Member_Fname;
	@JsonProperty
	private String Member_LName;
	@JsonProperty
	private String Gender;
	@JsonProperty
	private String DoB;	
	@JsonProperty
	private String Type_DoB;
	@JsonProperty
	private String age; 
	@JsonProperty
	private String Marital_Status;
	@JsonProperty
	private String Couple_No;
	@JsonProperty
	private String LMP;
	@JsonProperty
	private String EDD;
	@JsonProperty
	private String GA;
	@JsonProperty
	private String Pregnancy_Status; 
	@JsonProperty
	private String Unique_ID;
	@JsonProperty
	private String NID;
	@JsonProperty
	private String BRID;
	@JsonProperty
	private String HID;
	@JsonProperty
	private String Education;
	@JsonProperty
	private String Occupation;
	@JsonProperty
	private String Is_TT;
	@JsonProperty
	private String Is_Measles;
	@JsonProperty
	private String Is_FP;
	@JsonProperty
	private String Is_NewBorn;
	@JsonProperty
	private String Member_COUNTRY;
	@JsonProperty
	private String Member_DIVISION;
	@JsonProperty
	private String Member_DISTRICT;
	@JsonProperty
	private String Member_UPAZILLA;
	@JsonProperty
	private String Member_UNION;
	@JsonProperty
	private String Member_WARD;
	@JsonProperty
	private String Member_GOB_HHID;
	@JsonProperty
	private String Member_GPS;	
	@JsonProperty
	private String TODAY;
	@JsonProperty
	private String START;
	@JsonProperty
	private String END;
	@JsonProperty
	private String relationalid;
	@JsonProperty
	private String Member_Address_line;
	@JsonProperty
	private String Member_HIE_facilities;
	@JsonProperty
	private String HH_Address;
	@JsonProperty
	private String Member_type;
	@JsonProperty
	private String Member_Unique_ID;
	@JsonProperty
	private String Member_NID;
	@JsonProperty
	private String Member_BRID;
	@JsonProperty
	private String Member_HID;
	@JsonProperty
	private String member_birth_date_known;
	@JsonProperty
	private String member_birth_date;
	@JsonProperty
	private String calc_age;
	@JsonProperty
	private String calc_dob;
	@JsonProperty
	private String calc_dob_confirm;
	@JsonProperty
	private String calc_dob_estimated;
	@JsonProperty
	private String calc_age_confirm;
	@JsonProperty
	private String birth_date_note;
	@JsonProperty
	private String note_age;
	@JsonProperty
	private String Father_name;
	@JsonProperty
	private String Husband_name;
	@JsonProperty
	private String WomanInfo;
	@JsonProperty
	private String pregnant;
	@JsonProperty
	private String FP_USER;
	@JsonProperty
	private String FP_Methods;
	@JsonProperty
	private String edd_lmp;
	@JsonProperty
	private String edd;
	@JsonProperty
	private String lmp;
	@JsonProperty
	private String ultrasound_date;
	@JsonProperty
	private String ultrasound_weeks;
	@JsonProperty
	private String edd_calc_lmp;
	@JsonProperty
	private String edd_calc_ultrasound;
	@JsonProperty
	private String edd_calc_lmp_formatted;
	@JsonProperty
	private String edd_calc_ultrasound_formatted;
	@JsonProperty
	private String lmp_calc_edd;
	@JsonProperty
	private String lmp_calc_ultrasound;
	@JsonProperty
	private String lmp_calc_edd_formatted;
	@JsonProperty
	private String lmp_calc_ultrasound_formatted;
	@JsonProperty
	private String final_edd;
	@JsonProperty
	private String final_lmp;
	@JsonProperty
	private String ga_edd;
	@JsonProperty
	private String ga_lmp;
	@JsonProperty
	private String ga_ult;
	@JsonProperty
	private String final_edd_note;
	@JsonProperty
	private String final_lmp_note;
	@JsonProperty
	private String final_ga;
	@JsonProperty
	private String final_ga_note;
	@JsonProperty
	private String vaccines;
	@JsonProperty
	private String tt1_retro;
	@JsonProperty
	private String tt_1_dose;
	@JsonProperty
	private String tt2_retro;
	@JsonProperty
	private String tt_2_dose;
	@JsonProperty
	private String tt3_retro;
	@JsonProperty
	private String tt_3_dose;
	@JsonProperty
	private String tt4_retro;
	@JsonProperty
	private String tt_4_dose;
	@JsonProperty
	private String vaccines_2;
	@JsonProperty
	private String tt1;
	@JsonProperty
	private String tt_1_dose_today;
	@JsonProperty
	private String tt2;
	@JsonProperty
	private String tt_2_dose_today;
	@JsonProperty
	private String tt3;
	@JsonProperty
	private String tt_3_dose_today;
	@JsonProperty
	private String tt4;
	@JsonProperty
	private String tt_4_dose_today;
	@JsonProperty
	private String tt5;
	@JsonProperty
	private String tt_5_dose_today;
	@JsonProperty
	private String Child_birth_date_known;
	@JsonProperty
	private String Child_birth_date;
	@JsonProperty
	private String Child_age;
	@JsonProperty
	private String Child_calc_age;
	@JsonProperty
	private String Child_calc_dob;
	@JsonProperty
	private String Child_dob;
	@JsonProperty
	private String Child_dob_estimated;
	@JsonProperty
	private String Child_age_days;
	@JsonProperty
	private String Child_birth_date_note;
	@JsonProperty
	private String Birth_Weigtht;
	@JsonProperty
	private String Newborn_Care_Received;
	@JsonProperty
	private String Child_gender;
	@JsonProperty
	private String Child_mother_name;
	@JsonProperty
	private String Child_father_name;
	@JsonProperty
	private String epi_card_number;
	@JsonProperty
	private String child_was_suffering_from_a_disease_at_birth;
	@JsonProperty
	private String reminders_approval;
	@JsonProperty
	private String contact_phone_number;
	@JsonProperty
	private String child_vaccines;
	@JsonProperty
	private String bcg_retro;
	@JsonProperty
	private String opv0_retro;
	@JsonProperty
	private String opv0_dose;
	@JsonProperty
	private String pcv1_retro;
	@JsonProperty
	private String pcv1_dose;
	@JsonProperty
	private String opv1_retro;
	@JsonProperty
	private String opv1_dose;
	@JsonProperty
	private String penta1_retro;
	@JsonProperty
	private String penta1_dose;
	@JsonProperty
	private String pcv2_retro;
	@JsonProperty
	private String pcv2_dose;
	@JsonProperty
	private String opv2_retro;
	@JsonProperty
	private String opv2_dose;
	@JsonProperty
	private String penta2_retro;
	@JsonProperty
	private String penta2_dose;
	@JsonProperty
	private String pcv3_retro;
	@JsonProperty
	private String pcv3_dose;
	@JsonProperty
	private String opv3_retro;
	@JsonProperty
	private String opv3_dose;
	@JsonProperty
	private String penta3_retro;
	@JsonProperty
	private String penta3_dose;
	@JsonProperty
	private String ipv_retro;
	@JsonProperty
	private String measles1_retro;
	@JsonProperty
	private String measles1_dose;
	@JsonProperty
	private String measles2_retro;
	@JsonProperty
	private String measles2_dose;
	@JsonProperty
	private String bcg;
	@JsonProperty
	private String opv0;
	@JsonProperty
	private String opv0_dose_today;
	@JsonProperty
	private String pcv1;
	@JsonProperty
	private String pcv1_dose_today;
	@JsonProperty
	private String opv1;
	@JsonProperty
	private String opv1_dose_today;
	@JsonProperty
	private String penta1;
	@JsonProperty
	private String penta1_dose_today;
	@JsonProperty
	private String pcv2;
	@JsonProperty
	private String pcv2_dose_today;
	@JsonProperty
	private String opv2;
	@JsonProperty
	private String opv2_dose_today;
	@JsonProperty
	private String penta2;
	@JsonProperty
	private String penta2_dose_today;
	@JsonProperty
	private String pcv3;
	@JsonProperty
	private String pcv3_dose_today;
	@JsonProperty
	private String opv3;
	@JsonProperty
	private String opv3_dose_today;
	@JsonProperty
	private String penta3;
	@JsonProperty
	private String penta3_dose_today;
	@JsonProperty
	private String ipv;
	@JsonProperty
	private String measles1;
	@JsonProperty
	private String measles1_dose_today;
	@JsonProperty
	private String measles2;
	@JsonProperty
	private String measles2_dose_today;
	@JsonProperty
	private String Is_woman;
	@JsonProperty
	private String Is_child;
	@JsonProperty
	private String PVF;
	@JsonProperty
	private Map<String, String> details;
	@JsonProperty
	private Map<String, String> TTVisitOne;
	@JsonProperty
	private Map<String, String> TTVisitTwo;
	@JsonProperty
	private Map<String, String> TTVisitThree;
	@JsonProperty
	private Map<String, String> TTVisitFour;
	@JsonProperty
	private Map<String, String> TTVisitFive;
	@JsonProperty
	private Map<String, String> MeaslesVisit;
	@JsonProperty
	private Map<String, String> general;
	@JsonProperty
	private Map<String, String> PCV1;
	@JsonProperty
	private Map<String, String> PCV2;
	@JsonProperty
	private Map<String, String> PCV3;
	@JsonProperty
	private Map<String, String> PENTA1;
	@JsonProperty
	private Map<String, String> PENTA2;
	@JsonProperty
	private Map<String, String> PENTA3;
	@JsonProperty
	private Map<String, String> OPV0;
	@JsonProperty
	private Map<String, String> OPV1;
	@JsonProperty
	private Map<String, String> OPV2;
	@JsonProperty
	private Map<String, String> OPV3;
	@JsonProperty
	private Map<String, String> MR;
	@JsonProperty
	private Map<String, String> Measles2;
	@JsonProperty
	private Map<String, String> IPV;
	@JsonProperty
	private Map<String, String> BCG;
	@JsonProperty
	private String isClosed;
	public Members() {
		this.details = new HashMap<>();
		this.TTVisitOne = new HashMap<>(); 
		this.TTVisitTwo = new HashMap<>();
		this.TTVisitThree = new HashMap<>();
		this.TTVisitFour = new HashMap<>();
		this.TTVisitFive = new HashMap<>();
		this.MeaslesVisit = new HashMap<>();
		this.general = new HashMap<>();
		this.PCV1 = new HashMap<>();
		this.PCV2 = new HashMap<>();
		this.PCV3 = new HashMap<>();
		this.PENTA1 = new HashMap<>();
		this.PENTA2 = new HashMap<>();
		this.PENTA3 = new HashMap<>();
		this.OPV0 = new HashMap<>();
		this.OPV1 = new HashMap<>();
		this.OPV2 = new HashMap<>();
		this.OPV3 = new HashMap<>();
		this.MR = new HashMap<>();
		this.Measles2 = new HashMap<>();
		this.IPV = new HashMap<>();
		this.BCG = new HashMap<>();
		this.setIsClosed(false);
	}
	
	public Members withCaseId(String caseId) {
		this.caseId = caseId;
		return this;
	}

	public Members withINSTANCEID(String INSTANCEID) {
		this.INSTANCEID = INSTANCEID;
		return this;
	}

	public Members withPROVIDERID(String PROVIDERID) {
		this.PROVIDERID = PROVIDERID;
		return this;
	}

	public Members withLOCATIONID(String LOCATIONID) {
		this.LOCATIONID = LOCATIONID;
		return this;
	}

	public Members withMember_Fname(String Member_Fname) {
		this.Member_Fname = Member_Fname;
		return this;
	}

	public Members withHH_Member(String HH_Member) {
		this.HH_Member = HH_Member;
		return this;
	}
	public Members withReg_No(String Reg_No) {
		this.Reg_No = Reg_No;
		return this;
	}
	public Members withBDH(String BDH) {
		this.BDH = BDH;
		return this;
	}
	public Members withMember_LName(String Member_LName) {
		this.Member_LName = Member_LName;
		return this;
	}
	public Members withGender(String Gender) {
		this.Gender = Gender;
		return this;
	}
	public Members withDoB(String DoB) {
		this.DoB = DoB;
		return this;
	}
	
	public Members withType_DoB(String Type_DoB) {
		this.Type_DoB = Type_DoB;
		return this;
	}

	public Members withage(String age) {
		this.age = age;
		return this;
	}
	
	public Members withMarital_Status(String Marital_Status) {
		this.Marital_Status = Marital_Status;
		return this;
	}

	public Members withCouple_No(String Couple_No) {
		this.Couple_No = Couple_No;
		return this;
	}
	
	public Members withLMP(String LMP) {
		this.LMP = LMP;
		return this;
	}
	
	public Members withEDD(String EDD) {
		this.EDD = EDD;
		return this;
	}
	
	public Members withGA(String GA) {
		this.GA = GA;
		return this;
	}
	
	public Members withPregnancy_Status(String Pregnancy_Status) {
		this.Pregnancy_Status = Pregnancy_Status;
		return this;
	}

	public Members withHID(String HID) {
		this.HID = HID;
		return this;
	}

	public Members withUnique_ID(String Unique_ID) {
		this.Unique_ID = Unique_ID;
		return this;
	}

	public Members withNID(String NID) {
		this.NID = NID;
		return this;
	}
	
	public Members withBRID(String BRID) {
		this.BRID = BRID;
		return this;
	}
	
	public Members withEducation(String Education) {
		this.Education = Education;
		return this;
	}

	public Members withOccupation(String Occupation) {
		this.Occupation = Occupation;
		return this;
	}

	public Members withIs_TT(String Is_TT) {
		this.Is_TT = Is_TT;
		return this;
	}
	
	public Members withIs_Measles(String Is_Measles) {
		this.Is_Measles = Is_Measles;
		return this;
	}

	public Members withIs_FP(String Is_FP) {
		this.Is_FP = Is_FP;
		return this;
	}
	
	public Members withIs_NewBorn(String Is_NewBorn) {
		this.Is_NewBorn = Is_NewBorn;
		return this;
	}
	
	public Members withMember_COUNTRY(String Member_COUNTRY) {
		this.Member_COUNTRY = Member_COUNTRY;
		return this;
	}
	
	public Members withMember_DIVISION(String Member_DIVISION) {
		this.Member_DIVISION = Member_DIVISION;
		return this;
	}
	
	public Members withMember_DISTRICT(String Member_DISTRICT) {
		this.Member_DISTRICT = Member_DISTRICT;
		return this;
	}
	
	public Members withMember_UPAZILLA(String Member_UPAZILLA) {
		this.Member_UPAZILLA = Member_UPAZILLA;
		return this;
	}
	
	public Members withMember_UNION(String Member_UNION) {
		this.Member_UNION = Member_UNION;
		return this;
	}
	
	public Members withMember_WARD(String Member_WARD) {
		this.Member_WARD = Member_WARD;
		return this;
	}
	
	public Members withMember_GOB_HHID(String Member_GOB_HHID) {
		this.Member_GOB_HHID = Member_GOB_HHID;
		return this;
	}
	
	public Members withMember_GPS(String Member_GPS) {
		this.Member_GPS = Member_GPS;
		return this;
	}
	
	public Members withTODAY(String TODAY) {
		this.TODAY = TODAY;
		return this;
	}

	public Members withSTART(String START) {
		this.START = START;
		return this;
	}

	public Members withEND(String END) {
		this.END = END;
		return this;
	}
	public Members withRelationalid(String relationalid) {
		this.relationalid = relationalid;
		return this;
	}
	public Members withDetails(Map<String, String> details) {
        this.details = new HashMap<>(details);
        return this;
    }
	public Members withTTVisitOne(Map<String, String> TTVisitOne) {
        this.TTVisitOne = new HashMap<>(TTVisitOne);
        return this;
    }
	public Members withTTVisitTwo(Map<String, String> TTVisitTwo) {
        this.TTVisitTwo = new HashMap<>(TTVisitTwo);
        return this;
    }
	public Members withTTVisitThree(Map<String, String> TTVisitThree) {
        this.TTVisitThree = new HashMap<>(TTVisitThree);
        return this;
    }
	public Members withTTVisitFour(Map<String, String> TTVisitFour) {
        this.TTVisitFour = new HashMap<>(TTVisitFour);
        return this;
    }
	public Members withTTVisitFive(Map<String, String> TTVisitFive) {
        this.TTVisitFive = new HashMap<>(TTVisitFive);
        return this;
    }
	public Members withMeaslesVisit(Map<String, String> MeaslesVisit) {
        this.MeaslesVisit = new HashMap<>(MeaslesVisit);
        return this;
    }
	public Members withgeneral(Map<String, String> general) {
        this.general = new HashMap<>(general);
        return this;
    }
	public Members withPCV1(Map<String, String> PCV1) {
        this.PCV1 = new HashMap<>(PCV1);
        return this;
    }
	public Members withPCV2(Map<String, String> PCV2) {
        this.PCV2 = new HashMap<>(PCV2);
        return this;
    }
	public Members withPCV3(Map<String, String> PCV3) {
        this.PCV3 = new HashMap<>(PCV3);
        return this;
    }
	public Members withPENTA1(Map<String, String> PENTA1) {
        this.PENTA1 = new HashMap<>(PENTA1);
        return this;
    }
	public Members withPENTA2(Map<String, String> PENTA2) {
        this.PENTA2 = new HashMap<>(PENTA2);
        return this;
    }
	public Members withPENTA3(Map<String, String> PENTA3) {
        this.PENTA3 = new HashMap<>(PENTA3);
        return this;
    }
	public Members withOPV0(Map<String, String> OPV0) {
        this.OPV0 = new HashMap<>(OPV0);
        return this;
    }
	public Members withOPV1(Map<String, String> OPV1) {
        this.OPV1 = new HashMap<>(OPV1);
        return this;
    }
	public Members withOPV2(Map<String, String> OPV2) {
        this.OPV2 = new HashMap<>(OPV2);
        return this;
    }
	public Members withOPV3(Map<String, String> OPV3) {
        this.OPV3 = new HashMap<>(OPV3);
        return this;
    }
	public Members withMR(Map<String, String> MR) {
        this.MR = new HashMap<>(MR);
        return this;
    }
	public Members withMeasles2(Map<String, String> Measles2) {
        this.Measles2 = new HashMap<>(Measles2);
        return this;
    }
	public Members withIPV(Map<String, String> IPV) {
        this.IPV = new HashMap<>(IPV);
        return this;
    }
	public Members withBCG(Map<String, String> BCG) {
        this.BCG = new HashMap<>(BCG);
        return this;
    }
	public Members setMember_Address_line(String member_Address_line) {
		Member_Address_line = member_Address_line;
		return this;
	}
	public Members setMember_HIE_facilities(String member_HIE_facilities) {
		Member_HIE_facilities = member_HIE_facilities;
		return this;
	}
	public Members setHH_Address(String hH_Address) {
		HH_Address = hH_Address;
		return this;
	}
	public Members setMember_type(String member_type) {
		Member_type = member_type;
		return this;
	}
	public Members setReg_No(String reg_No) {
		Reg_No = reg_No;
		return this;
	}
	public Members setMember_Unique_ID(String member_Unique_ID) {
		Member_Unique_ID = member_Unique_ID;
		return this;
	}
	public Members setMember_NID(String member_NID) {
		Member_NID = member_NID;
		return this;
	}
	public Members setMember_BRID(String member_BRID) {
		Member_BRID = member_BRID;
		return this;
	}
	public Members setMember_HID(String member_HID) {
		Member_HID = member_HID;
		return this;
	}
	public Members setMember_birth_date_known(String member_birth_date_known) {
		this.member_birth_date_known = member_birth_date_known;
		return this;
	}
	public Members setMember_birth_date(String member_birth_date) {
		this.member_birth_date = member_birth_date;
		return this;
	}
	public Members setAge(String age) {
		this.age = age;
		return this;
	}
	public Members setCalc_age(String calc_age) {
		this.calc_age = calc_age;
		return this;
	}
	public Members setCalc_dob(String calc_dob) {
		this.calc_dob = calc_dob;
		return this;
	}
	public Members setCalc_dob_confirm(String calc_dob_confirm) {
		this.calc_dob_confirm = calc_dob_confirm;
		return this;
	}
	public Members setCalc_dob_estimated(String calc_dob_estimated) {
		this.calc_dob_estimated = calc_dob_estimated;
		return this;
	}
	public Members setCalc_age_confirm(String calc_age_confirm) {
		this.calc_age_confirm = calc_age_confirm;
		return this;
	}
	public Members setBirth_date_note(String birth_date_note) {
		this.birth_date_note = birth_date_note;
		return this;
	}
	public Members setNote_age(String note_age) {
		this.note_age = note_age;
		return this;		
	}
	public Members setFather_name(String father_name) {
		Father_name = father_name;
		return this;
	}
	public Members setHusband_name(String husband_name) {
		Husband_name = husband_name;
		return this;
	}
	public Members setCouple_No(String couple_No) {
		Couple_No = couple_No;
		return this;
	}
	public Members setWomanInfo(String womanInfo) {
		WomanInfo = womanInfo;
		return this;
	}
	public Members setPregnant(String pregnant) {
		this.pregnant = pregnant;
		return this;
	}
	public Members setFP_USER(String fP_USER) {
		FP_USER = fP_USER;
		return this;
	}
	public Members setFP_Methods(String fP_Methods) {
		FP_Methods = fP_Methods;
		return this;
	}
	public Members setEdd_lmp(String edd_lmp) {
		this.edd_lmp = edd_lmp;
		return this;
	}
	public Members setEdd(String edd) {
		this.edd = edd;
		return this;
	}
	public Members setLmp(String lmp) {
		this.lmp = lmp;
		return this;
	}
	public Members setUltrasound_date(String ultrasound_date) {
		this.ultrasound_date = ultrasound_date;
		return this;
	}
	public Members setUltrasound_weeks(String ultrasound_weeks) {
		this.ultrasound_weeks = ultrasound_weeks;
		return this;
	}
	public Members setEdd_calc_lmp(String edd_calc_lmp) {
		this.edd_calc_lmp = edd_calc_lmp;
		return this;
	}
	public Members setEdd_calc_ultrasound(String edd_calc_ultrasound) {
		this.edd_calc_ultrasound = edd_calc_ultrasound;
		return this;
	}
	public Members setEdd_calc_lmp_formatted(String edd_calc_lmp_formatted) {
		this.edd_calc_lmp_formatted = edd_calc_lmp_formatted;
		return this;
	}
	public Members setEdd_calc_ultrasound_formatted(
			String edd_calc_ultrasound_formatted) {
		this.edd_calc_ultrasound_formatted = edd_calc_ultrasound_formatted;
		return this;
	}
	public Members setLmp_calc_edd(String lmp_calc_edd) {
		this.lmp_calc_edd = lmp_calc_edd;
		return this;
	}
	public Members setLmp_calc_ultrasound(String lmp_calc_ultrasound) {
		this.lmp_calc_ultrasound = lmp_calc_ultrasound;
		return this;
	}
	public Members setLmp_calc_edd_formatted(String lmp_calc_edd_formatted) {
		this.lmp_calc_edd_formatted = lmp_calc_edd_formatted;
		return this;
	}
	public Members setLmp_calc_ultrasound_formatted(
			String lmp_calc_ultrasound_formatted) {
		this.lmp_calc_ultrasound_formatted = lmp_calc_ultrasound_formatted;
		return this;
	}
	public Members setFinal_edd(String final_edd) {
		this.final_edd = final_edd;
		return this;
	}
	public Members setFinal_lmp(String final_lmp) {
		this.final_lmp = final_lmp;
		return this;
	}
	public Members setGa_edd(String ga_edd) {
		this.ga_edd = ga_edd;
		return this;
	}
	public Members setGa_lmp(String ga_lmp) {
		this.ga_lmp = ga_lmp;
		return this;
	}
	public Members setGa_ult(String ga_ult) {
		this.ga_ult = ga_ult;
		return this;
	}
	public Members setFinal_edd_note(String final_edd_note) {
		this.final_edd_note = final_edd_note;
		return this;
	}
	public Members setFinal_lmp_note(String final_lmp_note) {
		this.final_lmp_note = final_lmp_note;
		return this;
	}
	public Members setFinal_ga(String final_ga) {
		this.final_ga = final_ga;
		return this;
	}
	public Members setFinal_ga_note(String final_ga_note) {
		this.final_ga_note = final_ga_note;
		return this;
	}
	public Members setVaccines(String vaccines) {
		this.vaccines = vaccines;
		return this;
	}
	public Members setTt1_retro(String tt1_retro) {
		this.tt1_retro = tt1_retro;
		return this;
	}
	public Members setTt_1_dose(String tt_1_dose) {
		this.tt_1_dose = tt_1_dose;
		return this;
	}
	public Members setTt2_retro(String tt2_retro) {
		this.tt2_retro = tt2_retro;
		return this;
	}
	public Members setTt_2_dose(String tt_2_dose) {
		this.tt_2_dose = tt_2_dose;
		return this;
	}
	public Members setTt3_retro(String tt3_retro) {
		this.tt3_retro = tt3_retro;
		return this;
	}
	public Members setTt_3_dose(String tt_3_dose) {
		this.tt_3_dose = tt_3_dose;
		return this;
	}
	public Members setTt4_retro(String tt4_retro) {
		this.tt4_retro = tt4_retro;
		return this;
	}
	public Members setTt_4_dose(String tt_4_dose) {
		this.tt_4_dose = tt_4_dose;
		return this;
	}
	public Members setVaccines_2(String vaccines_2) {
		this.vaccines_2 = vaccines_2;
		return this;
	}
	public Members setTt1(String tt1) {
		this.tt1 = tt1;
		return this;
	}
	public Members setTt_1_dose_today(String tt_1_dose_today) {
		this.tt_1_dose_today = tt_1_dose_today;
		return this;
	}
	public Members setTt2(String tt2) {
		this.tt2 = tt2;
		return this;
	}
	public Members setTt_2_dose_today(String tt_2_dose_today) {
		this.tt_2_dose_today = tt_2_dose_today;
		return this;
	}
	public Members setTt3(String tt3) {
		this.tt3 = tt3;
		return this;
	}
	public Members setTt_3_dose_today(String tt_3_dose_today) {
		this.tt_3_dose_today = tt_3_dose_today;
		return this;
	}
	public Members setTt4(String tt4) {
		this.tt4 = tt4;
		return this;
	}
	public Members setTt_4_dose_today(String tt_4_dose_today) {
		this.tt_4_dose_today = tt_4_dose_today;
		return this;
	}
	public Members setTt5(String tt5) {
		this.tt5 = tt5;
		return this;
	}
	public Members setTt_5_dose_today(String tt_5_dose_today) {
		this.tt_5_dose_today = tt_5_dose_today;
		return this;
	}
	public Members setChild_birth_date_known(String child_birth_date_known) {
		Child_birth_date_known = child_birth_date_known;
		return this;
	}
	public Members setChild_birth_date(String child_birth_date) {
		Child_birth_date = child_birth_date;
		return this;
	}
	public Members setChild_age(String child_age) {
		Child_age = child_age;
		return this;
	}
	public Members setChild_calc_age(String child_calc_age) {
		Child_calc_age = child_calc_age;
		return this;
	}
	public Members setChild_calc_dob(String child_calc_dob) {
		Child_calc_dob = child_calc_dob;
		return this;
	}
	public Members setChild_dob(String child_dob) {
		Child_dob = child_dob;
		return this;
	}
	public Members setChild_dob_estimated(String child_dob_estimated) {
		Child_dob_estimated = child_dob_estimated;
		return this;
	}
	public Members setChild_age_days(String child_age_days) {
		Child_age_days = child_age_days;
		return this;
	}
	public Members setChild_birth_date_note(String child_birth_date_note) {
		Child_birth_date_note = child_birth_date_note;
		return this;
	}
	public Members setBirth_Weigtht(String birth_Weigtht) {
		Birth_Weigtht = birth_Weigtht;
		return this;
	}
	public Members setNewborn_Care_Received(String newborn_Care_Received) {
		Newborn_Care_Received = newborn_Care_Received;
		return this;
	}
	public Members setChild_gender(String child_gender) {
		Child_gender = child_gender;
		return this;
	}
	public Members setChild_mother_name(String child_mother_name) {
		Child_mother_name = child_mother_name;
		return this;
	}
	public Members setChild_father_name(String child_father_name) {
		Child_father_name = child_father_name;
		return this;
	}
	public Members setEpi_card_number(String epi_card_number) {
		this.epi_card_number = epi_card_number;
		return this;
	}
	public Members setChild_was_suffering_from_a_disease_at_birth(
			String child_was_suffering_from_a_disease_at_birth) {
		this.child_was_suffering_from_a_disease_at_birth = child_was_suffering_from_a_disease_at_birth;
		return this;
	}
	public Members setReminders_approval(String reminders_approval) {
		this.reminders_approval = reminders_approval;
		return this;
	}
	public Members setContact_phone_number(String contact_phone_number) {
		this.contact_phone_number = contact_phone_number;
		return this;
	}
	public Members setChild_vaccines(String child_vaccines) {
		this.child_vaccines = child_vaccines;
		return this;
	}
	public Members setBcg_retro(String bcg_retro) {
		this.bcg_retro = bcg_retro;
		return this;
	}
	public Members setOpv0_retro(String opv0_retro) {
		this.opv0_retro = opv0_retro;
		return this;
	}
	public Members setOpv0_dose(String opv0_dose) {
		this.opv0_dose = opv0_dose;
		return this;
	}
	public Members setPcv1_retro(String pcv1_retro) {
		this.pcv1_retro = pcv1_retro;
		return this;
	}
	public Members setPcv1_dose(String pcv1_dose) {
		this.pcv1_dose = pcv1_dose;
		return this;
	}
	public Members setOpv1_retro(String opv1_retro) {
		this.opv1_retro = opv1_retro;
		return this;
	}
	public Members setOpv1_dose(String opv1_dose) {
		this.opv1_dose = opv1_dose;
		return this;
	}
	public Members setPenta1_retro(String penta1_retro) {
		this.penta1_retro = penta1_retro;
		return this;
	}
	public Members setPenta1_dose(String penta1_dose) {
		this.penta1_dose = penta1_dose;
		return this;
	}
	public Members setPcv2_retro(String pcv2_retro) {
		this.pcv2_retro = pcv2_retro;
		return this;
	}
	public Members setPcv2_dose(String pcv2_dose) {
		this.pcv2_dose = pcv2_dose;
		return this;
	}
	public Members setOpv2_retro(String opv2_retro) {
		this.opv2_retro = opv2_retro;
		return this;
	}
	public Members setOpv2_dose(String opv2_dose) {
		this.opv2_dose = opv2_dose;
		return this;
	}
	public Members setPenta2_retro(String penta2_retro) {
		this.penta2_retro = penta2_retro;
		return this;
	}
	public Members setPenta2_dose(String penta2_dose) {
		this.penta2_dose = penta2_dose;
		return this;
	}
	public Members setPcv3_retro(String pcv3_retro) {
		this.pcv3_retro = pcv3_retro;
		return this;
	}
	public Members setPcv3_dose(String pcv3_dose) {
		this.pcv3_dose = pcv3_dose;
		return this;
	}
	public Members setOpv3_retro(String opv3_retro) {
		this.opv3_retro = opv3_retro;
		return this;
	}
	public Members setOpv3_dose(String opv3_dose) {
		this.opv3_dose = opv3_dose;
		return this;
	}
	public Members setPenta3_retro(String penta3_retro) {
		this.penta3_retro = penta3_retro;
		return this;
	}
	public Members setPenta3_dose(String penta3_dose) {
		this.penta3_dose = penta3_dose;
		return this;
	}
	public Members setIpv_retro(String ipv_retro) {
		this.ipv_retro = ipv_retro;
		return this;
	}
	public Members setMeasles1_retro(String measles1_retro) {
		this.measles1_retro = measles1_retro;
		return this;
	}
	public Members setMeasles1_dose(String measles1_dose) {
		this.measles1_dose = measles1_dose;
		return this;
	}
	public Members setMeasles2_retro(String measles2_retro) {
		this.measles2_retro = measles2_retro;
		return this;
	}
	public Members setMeasles2_dose(String measles2_dose) {
		this.measles2_dose = measles2_dose;
		return this;
	}
	public Members setBcg(String bcg) {
		this.bcg = bcg;
		return this;
	}
	public Members setOpv0(String opv0) {
		this.opv0 = opv0;
		return this;
	}
	public Members setOpv0_dose_today(String opv0_dose_today) {
		this.opv0_dose_today = opv0_dose_today;
		return this;
	}
	public Members setPcv1(String pcv1) {
		this.pcv1 = pcv1;
		return this;
	}
	public Members setPcv1_dose_today(String pcv1_dose_today) {
		this.pcv1_dose_today = pcv1_dose_today;
		return this;
	}
	public Members setOpv1(String opv1) {
		this.opv1 = opv1;
		return this;
	}
	public Members setOpv1_dose_today(String opv1_dose_today) {
		this.opv1_dose_today = opv1_dose_today;
		return this;
	}
	public Members setPenta1(String penta1) {
		this.penta1 = penta1;
		return this;
	}
	public Members setPenta1_dose_today(String penta1_dose_today) {
		this.penta1_dose_today = penta1_dose_today;
		return this;
	}
	public Members setPcv2(String pcv2) {
		this.pcv2 = pcv2;
		return this;
	}
	public Members setPcv2_dose_today(String pcv2_dose_today) {
		this.pcv2_dose_today = pcv2_dose_today;
		return this;
	}
	public Members setOpv2(String opv2) {
		this.opv2 = opv2;
		return this;
	}
	public Members setOpv2_dose_today(String opv2_dose_today) {
		this.opv2_dose_today = opv2_dose_today;
		return this;
	}
	public Members setPenta2(String penta2) {
		this.penta2 = penta2;
		return this;
	}
	public Members setPenta2_dose_today(String penta2_dose_today) {
		this.penta2_dose_today = penta2_dose_today;
		return this;
	}
	public Members setPcv3(String pcv3) {
		this.pcv3 = pcv3;
		return this;
	}
	public Members setPcv3_dose_today(String pcv3_dose_today) {
		this.pcv3_dose_today = pcv3_dose_today;
		return this;
	}
	public Members setOpv3(String opv3) {
		this.opv3 = opv3;
		return this;
	}
	public Members setOpv3_dose_today(String opv3_dose_today) {
		this.opv3_dose_today = opv3_dose_today;
		return this;
	}
	public Members setPenta3(String penta3) {
		this.penta3 = penta3;
		return this;
	}
	public Members setPenta3_dose_today(String penta3_dose_today) {
		this.penta3_dose_today = penta3_dose_today;
		return this;
	}
	public Members setIpv(String ipv) {
		this.ipv = ipv;
		return this;
	}
	public Members setMeasles1(String measles1) {
		this.measles1 = measles1;
		return this;
	}
	public Members setMeasles1_dose_today(String measles1_dose_today) {
		this.measles1_dose_today = measles1_dose_today;
		return this;
	}
	public Members setMeasles2(String measles2) {
		this.measles2 = measles2;
		return this;
	}
	public Members setMeasles2_dose_today(String measles2_dose_today) {
		this.measles2_dose_today = measles2_dose_today;
		return this;
	}
	public Members setIs_woman(String is_woman) {
		Is_woman = is_woman;
		return this;
	}
	public Members setIs_child(String is_child) {
		Is_child = is_child;
		return this;
	}
	public Members setPVF(String pVF) {
		PVF = pVF;
		return this;
	}
	public String caseId() {
		return caseId;
	}

	public String INSTANCEID() {
		return INSTANCEID;
	}

	public String PROVIDERID() {
		return PROVIDERID;
	}

	public String LOCATIONID() {
		return LOCATIONID;
	}

	public String Member_Fname() {
		return Member_Fname;
	}
	public String HH_Member() {
		return HH_Member;
	}
	public String Reg_No() {
		return Reg_No;
	}
	public String BDH() {
		return BDH;
	}
	public String Member_LName() {
		return Member_LName;
	}
	public String Gender() {
		return Gender;
	}
	public String DoB() {
		return DoB;
	}

	public String Type_DoB() {
		return Type_DoB;
	}

	public String age() {
		return age;
	}
	
	public String Marital_Status() {
		return Marital_Status;
	}

	public String Couple_No() {
		return Couple_No;
	}
	
	public String LMP() {
		return LMP;
	}

	public String EDD() {
		return EDD;
	}
	
	public String GA() {
		return GA;
	}
	
	public String Pregnancy_Status() {
		return Pregnancy_Status;
	}
	
	public String HID() {
		return HID;
	}
	
	public String Unique_ID() {
		return Unique_ID;
	}
	
	public String NID() {
		return NID;
	}
	
	public String BRID() {
		return BRID;
	}

	public String Education() {
		return Education;
	}

	public String Occupation() {
		return Occupation;
	}

	public String Is_TT() {
		return Is_TT;
	}
	
	public String Is_Measles() {
		return Is_Measles;
	}

	public String Is_FP() {
		return Is_FP;
	}
	
	public String Is_NewBorn() {
		return Is_NewBorn;
	}

	public String Member_COUNTRY() {
		return Member_COUNTRY;
	}
	
	public String Member_DIVISION() {
		return Member_DIVISION;
	}
	
	public String Member_DISTRICT() {
		return Member_DISTRICT;
	}
	
	public String Member_UPAZILLA() {
		return Member_UPAZILLA;
	}
	
	public String Member_UNION() {
		return Member_UNION;
	}
	
	public String Member_WARD() {
		return Member_WARD;
	}
	
	public String Member_GOB_HHID() {
		return Member_GOB_HHID;
	}
	
	public String Member_GPS() {
		return Member_GPS;
	}

	public String isClosed() {
		return isClosed;
	}
	public String TODAY() {
		return TODAY;
	}
	public String START() {
		return START;
	}

	public String END() {
		return END;
	}
	
	public String relationalid() {
		return relationalid;
	}

	private String getCaseId() {
		return caseId;
	}
	
	public String getMember_Address_line() {
		return Member_Address_line;
	}
	public String getMember_HIE_facilities() {
		return Member_HIE_facilities;
	}
	public String getHH_Address() {
		return HH_Address;
	}
	public String getMember_type() {
		return Member_type;
	}
	public String getReg_No() {
		return Reg_No;
	}
	public String getMember_Unique_ID() {
		return Member_Unique_ID;
	}
	public String getMember_NID() {
		return Member_NID;
	}
	public String getMember_BRID() {
		return Member_BRID;
	}
	public String getMember_HID() {
		return Member_HID;
	}
	public String getMember_birth_date_known() {
		return member_birth_date_known;
	}
	public String getMember_birth_date() {
		return member_birth_date;
	}
	public String getAge() {
		return age;
	}
	public String getCalc_age() {
		return calc_age;
	}
	public String getCalc_dob() {
		return calc_dob;
	}
	public String getCalc_dob_confirm() {
		return calc_dob_confirm;
	}
	public String getCalc_dob_estimated() {
		return calc_dob_estimated;
	}
	public String getCalc_age_confirm() {
		return calc_age_confirm;
	}
	public String getBirth_date_note() {
		return birth_date_note;
	}
	public String getNote_age() {
		return note_age;
	}
	public String getFather_name() {
		return Father_name;
	}
	public String getHusband_name() {
		return Husband_name;
	}
	public String getCouple_No() {
		return Couple_No;
	}
	public String getWomanInfo() {
		return WomanInfo;
	}
	public String getPregnant() {
		return pregnant;
	}
	public String getFP_USER() {
		return FP_USER;
	}
	public String getFP_Methods() {
		return FP_Methods;
	}
	public String getEdd_lmp() {
		return edd_lmp;
	}
	public String getEdd() {
		return edd;
	}
	public String getLmp() {
		return lmp;
	}
	public String getUltrasound_date() {
		return ultrasound_date;
	}
	public String getUltrasound_weeks() {
		return ultrasound_weeks;
	}
	public String getEdd_calc_lmp() {
		return edd_calc_lmp;
	}
	public String getEdd_calc_ultrasound() {
		return edd_calc_ultrasound;
	}
	public String getEdd_calc_lmp_formatted() {
		return edd_calc_lmp_formatted;
	}
	public String getEdd_calc_ultrasound_formatted() {
		return edd_calc_ultrasound_formatted;
	}
	public String getLmp_calc_edd() {
		return lmp_calc_edd;
	}
	public String getLmp_calc_ultrasound() {
		return lmp_calc_ultrasound;
	}
	public String getLmp_calc_edd_formatted() {
		return lmp_calc_edd_formatted;
	}
	public String getLmp_calc_ultrasound_formatted() {
		return lmp_calc_ultrasound_formatted;
	}
	public String getFinal_edd() {
		return final_edd;
	}
	public String getFinal_lmp() {
		return final_lmp;
	}
	public String getGa_edd() {
		return ga_edd;
	}
	public String getGa_lmp() {
		return ga_lmp;
	}
	public String getGa_ult() {
		return ga_ult;
	}
	public String getFinal_edd_note() {
		return final_edd_note;
	}
	public String getFinal_lmp_note() {
		return final_lmp_note;
	}
	public String getFinal_ga() {
		return final_ga;
	}
	public String getFinal_ga_note() {
		return final_ga_note;
	}
	public String getVaccines() {
		return vaccines;
	}
	public String getTt1_retro() {
		return tt1_retro;
	}
	public String getTt_1_dose() {
		return tt_1_dose;
	}
	public String getTt2_retro() {
		return tt2_retro;
	}
	public String getTt_2_dose() {
		return tt_2_dose;
	}
	public String getTt3_retro() {
		return tt3_retro;
	}
	public String getTt_3_dose() {
		return tt_3_dose;
	}
	public String getTt4_retro() {
		return tt4_retro;
	}
	public String getTt_4_dose() {
		return tt_4_dose;
	}
	public String getVaccines_2() {
		return vaccines_2;
	}
	public String getTt1() {
		return tt1;
	}
	public String getTt_1_dose_today() {
		return tt_1_dose_today;
	}
	public String getTt2() {
		return tt2;
	}
	public String getTt_2_dose_today() {
		return tt_2_dose_today;
	}
	public String getTt3() {
		return tt3;
	}
	public String getTt_3_dose_today() {
		return tt_3_dose_today;
	}
	public String getTt4() {
		return tt4;
	}
	public String getTt_4_dose_today() {
		return tt_4_dose_today;
	}
	public String getTt5() {
		return tt5;
	}
	public String getTt_5_dose_today() {
		return tt_5_dose_today;
	}
	public String getChild_birth_date_known() {
		return Child_birth_date_known;
	}
	public String getChild_birth_date() {
		return Child_birth_date;
	}
	public String getChild_age() {
		return Child_age;
	}
	public String getChild_calc_age() {
		return Child_calc_age;
	}
	public String getChild_calc_dob() {
		return Child_calc_dob;
	}
	public String getChild_dob() {
		return Child_dob;
	}
	public String getChild_dob_estimated() {
		return Child_dob_estimated;
	}
	public String getChild_age_days() {
		return Child_age_days;
	}
	public String getChild_birth_date_note() {
		return Child_birth_date_note;
	}
	public String getBirth_Weigtht() {
		return Birth_Weigtht;
	}
	public String getNewborn_Care_Received() {
		return Newborn_Care_Received;
	}
	public String getChild_gender() {
		return Child_gender;
	}
	public String getChild_mother_name() {
		return Child_mother_name;
	}
	public String getChild_father_name() {
		return Child_father_name;
	}
	public String getEpi_card_number() {
		return epi_card_number;
	}
	public String getChild_was_suffering_from_a_disease_at_birth() {
		return child_was_suffering_from_a_disease_at_birth;
	}
	public String getReminders_approval() {
		return reminders_approval;
	}
	public String getContact_phone_number() {
		return contact_phone_number;
	}
	public String getChild_vaccines() {
		return child_vaccines;
	}
	public String getBcg_retro() {
		return bcg_retro;
	}
	public String getOpv0_retro() {
		return opv0_retro;
	}
	public String getOpv0_dose() {
		return opv0_dose;
	}
	public String getPcv1_retro() {
		return pcv1_retro;
	}
	public String getPcv1_dose() {
		return pcv1_dose;
	}
	public String getOpv1_retro() {
		return opv1_retro;
	}
	public String getOpv1_dose() {
		return opv1_dose;
	}
	public String getPenta1_retro() {
		return penta1_retro;
	}
	public String getPenta1_dose() {
		return penta1_dose;
	}
	public String getPcv2_retro() {
		return pcv2_retro;
	}
	public String getPcv2_dose() {
		return pcv2_dose;
	}
	public String getOpv2_retro() {
		return opv2_retro;
	}
	public String getOpv2_dose() {
		return opv2_dose;
	}
	public String getPenta2_retro() {
		return penta2_retro;
	}
	public String getPenta2_dose() {
		return penta2_dose;
	}
	public String getPcv3_retro() {
		return pcv3_retro;
	}
	public String getPcv3_dose() {
		return pcv3_dose;
	}
	public String getOpv3_retro() {
		return opv3_retro;
	}
	public String getOpv3_dose() {
		return opv3_dose;
	}
	public String getPenta3_retro() {
		return penta3_retro;
	}
	public String getPenta3_dose() {
		return penta3_dose;
	}
	public String getIpv_retro() {
		return ipv_retro;
	}
	public String getMeasles1_retro() {
		return measles1_retro;
	}
	public String getMeasles1_dose() {
		return measles1_dose;
	}
	public String getMeasles2_retro() {
		return measles2_retro;
	}
	public String getMeasles2_dose() {
		return measles2_dose;
	}
	public String getBcg() {
		return bcg;
	}
	public String getOpv0() {
		return opv0;
	}
	public String getOpv0_dose_today() {
		return opv0_dose_today;
	}
	public String getPcv1() {
		return pcv1;
	}
	public String getPcv1_dose_today() {
		return pcv1_dose_today;
	}
	public String getOpv1() {
		return opv1;
	}
	public String getOpv1_dose_today() {
		return opv1_dose_today;
	}
	public String getPenta1() {
		return penta1;
	}
	public String getPenta1_dose_today() {
		return penta1_dose_today;
	}
	public String getPcv2() {
		return pcv2;
	}
	public String getPcv2_dose_today() {
		return pcv2_dose_today;
	}
	public String getOpv2() {
		return opv2;
	}
	public String getOpv2_dose_today() {
		return opv2_dose_today;
	}
	public String getPenta2() {
		return penta2;
	}
	public String getPenta2_dose_today() {
		return penta2_dose_today;
	}
	public String getPcv3() {
		return pcv3;
	}
	public String getPcv3_dose_today() {
		return pcv3_dose_today;
	}
	public String getOpv3() {
		return opv3;
	}
	public String getOpv3_dose_today() {
		return opv3_dose_today;
	}
	public String getPenta3() {
		return penta3;
	}
	public String getPenta3_dose_today() {
		return penta3_dose_today;
	}
	public String getIpv() {
		return ipv;
	}
	public String getMeasles1() {
		return measles1;
	}
	public String getMeasles1_dose_today() {
		return measles1_dose_today;
	}
	public String getMeasles2() {
		return measles2;
	}
	public String getMeasles2_dose_today() {
		return measles2_dose_today;
	}
	public String getIs_woman() {
		return Is_woman;
	}
	public String getIs_child() {
		return Is_child;
	}
	public String getPVF() {
		return PVF;
	}

	public String getRelationalid() {
		return relationalid;
	}

	public Map<String, String> details() {
		if (details == null)
			this.details = new HashMap<>();
		return details;
	}
	
	public String getDetail(String name) {
		return details.get(name);
	}
	
	public Map<String, String> TTVisitOne() {
		if (TTVisitOne == null)
			this.TTVisitOne = new HashMap<>();
		return TTVisitOne;
	}
	public Map<String, String> TTVisitTwo() {
		if (TTVisitTwo == null)
			this.TTVisitTwo = new HashMap<>();
		return TTVisitTwo;
	}
	public Map<String, String> TTVisitThree() {
		if (TTVisitThree == null)
			this.TTVisitThree = new HashMap<>();
		return TTVisitThree;
	}
	public Map<String, String> TTVisitFour() {
		if (TTVisitFour == null)
			this.TTVisitFour = new HashMap<>();
		return TTVisitFour;
	}
	public Map<String, String> TTVisitFive() {
		if (TTVisitFive == null)
			this.TTVisitFive = new HashMap<>();
		return TTVisitFive;
	}
	public Map<String, String> MeaslesVisit() {
		if (MeaslesVisit == null)
			this.MeaslesVisit = new HashMap<>();
		return MeaslesVisit;
	}
	public Map<String, String> general() {
		if (general == null)
			this.general = new HashMap<>();
		return general;
	}
	public Map<String, String> PCV1() {
		if (PCV1 == null)
			this.PCV1 = new HashMap<>();
		return PCV1;
	}
	public Map<String, String> PCV2() {
		if (PCV2 == null)
			this.PCV2 = new HashMap<>();
		return PCV2;
	}
	public Map<String, String> PCV3() {
		if (PCV3 == null)
			this.PCV3 = new HashMap<>();
		return PCV3;
	}
	public Map<String, String> PENTA1() {
		if (PENTA1 == null)
			this.PENTA1 = new HashMap<>();
		return PENTA1;
	}
	public Map<String, String> PENTA2() {
		if (PENTA2 == null)
			this.PENTA2 = new HashMap<>();
		return PENTA2;
	}
	public Map<String, String> PENTA3() {
		if (PENTA3 == null)
			this.PENTA3 = new HashMap<>();
		return PENTA3;
	}
	public Map<String, String> OPV0() {
		if (OPV0 == null)
			this.OPV0 = new HashMap<>();
		return OPV0;
	}
	public Map<String, String> OPV1() {
		if (OPV1 == null)
			this.OPV1 = new HashMap<>();
		return OPV1;
	}
	public Map<String, String> OPV2() {
		if (OPV2 == null)
			this.OPV2 = new HashMap<>();
		return OPV2;
	}
	public Map<String, String> OPV3() {
		if (OPV3 == null)
			this.OPV3 = new HashMap<>();
		return OPV3;
	}
	public Map<String, String> MR() {
		if (MR == null)
			this.MR = new HashMap<>();
		return MR;
	}
	public Map<String, String> Measles2() {
		if (Measles2 == null)
			this.Measles2 = new HashMap<>();
		return Measles2;
	}
	public Map<String, String> IPV() {
		if (IPV == null)
			this.IPV = new HashMap<>();
		return IPV;
	}
	public Map<String, String> BCG() {
		if (BCG == null)
			this.BCG = new HashMap<>();
		return BCG;
	}
    public Members setIsClosed(boolean isClosed) {
        this.isClosed = Boolean.toString(isClosed);
        return this;
    }
	@Override
	public boolean equals(Object o) {
		return EqualsBuilder.reflectionEquals(this, o, "id", "revision");
	}

	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this, "id", "revision");
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
