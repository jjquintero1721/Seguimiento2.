package Ejercicio2;

public class MedicalAppointment {
    public String appointmentCode;
    public String date;
    public String time;
    public String office;
    public String patientName;
    private String medicalCenter;

    public String createAppointment(){
        return appointmentCode;
    }
    public String getAppointmentDetails(){
        return medicalCenter;
    }
    public String changeTime(){
        return time;
    }

    public String getAppointmentCode() {
        return appointmentCode;
    }

    public void setAppointmentCode(String appointmentCode) {
        this.appointmentCode = appointmentCode;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getMedicalCenter() {
        return medicalCenter;
    }

    public void setMedicalCenter(String medicalCenter) {
        this.medicalCenter = medicalCenter;
    }
}

