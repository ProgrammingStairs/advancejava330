package dto;

import java.io.Serializable;

public class AppliedVacancyDto implements Serializable{
    private int appliedVacancyId,candidateId,vacancyId,status;
    private String candidateName,email,vacancyName,applyStatus;

    public AppliedVacancyDto() {
    }

    public int getAppliedVacancyId() {
        return appliedVacancyId;
    }

    public void setAppliedVacancyId(int appliedVacancyId) {
        this.appliedVacancyId = appliedVacancyId;
    }

    public int getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(int candidateId) {
        this.candidateId = candidateId;
    }

    public int getVacancyId() {
        return vacancyId;
    }

    public void setVacancyId(int vacancyId) {
        this.vacancyId = vacancyId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getVacancyName() {
        return vacancyName;
    }

    public void setVacancyName(String vacancyName) {
        this.vacancyName = vacancyName;
    }

    public String getApplyStatus() {
        return applyStatus;
    }

    public void setApplyStatus(String applyStatus) {
        this.applyStatus = applyStatus;
    }
    
    
}
