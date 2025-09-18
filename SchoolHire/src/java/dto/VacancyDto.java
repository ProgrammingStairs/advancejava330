package dto;

import java.io.Serializable;

public class VacancyDto implements Serializable{
    private int vacancy,vacancyId,status;
    private String vacancyName,criteria,jobType,jobMode,salary,location,timings,bond,genderPre,joiningStatus,advDate,lastDate,reallocate;

    public VacancyDto() {
    }

    public int getVacancy() {
        return vacancy;
    }

    public void setVacancy(int vacancy) {
        this.vacancy = vacancy;
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

    public String getVacancyName() {
        return vacancyName;
    }

    public void setVacancyName(String vacancyName) {
        this.vacancyName = vacancyName;
    }

    public String getCriteria() {
        return criteria;
    }

    public void setCriteria(String criteria) {
        this.criteria = criteria;
    }

    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public String getJobMode() {
        return jobMode;
    }

    public void setJobMode(String jobMode) {
        this.jobMode = jobMode;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTimings() {
        return timings;
    }

    public void setTimings(String timings) {
        this.timings = timings;
    }

    public String getBond() {
        return bond;
    }

    public void setBond(String bond) {
        this.bond = bond;
    }

    public String getGenderPre() {
        return genderPre;
    }

    public void setGenderPre(String genderPre) {
        this.genderPre = genderPre;
    }

    public String getJoiningStatus() {
        return joiningStatus;
    }

    public void setJoiningStatus(String joiningStatus) {
        this.joiningStatus = joiningStatus;
    }

    public String getAdvDate() {
        return advDate;
    }

    public void setAdvDate(String advDate) {
        this.advDate = advDate;
    }

    public String getLastDate() {
        return lastDate;
    }

    public void setLastDate(String lastDate) {
        this.lastDate = lastDate;
    }

    public String getReallocate() {
        return reallocate;
    }

    public void setReallocate(String reallocate) {
        this.reallocate = reallocate;
    }
    
    
}
