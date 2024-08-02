package Ejercicio7;

public class Complaint {
    public int complaintNumber;
    private String personName;
    private String subject;
    public String complaintDescription;
    private String complaintStatus;

    public String validateComplaintStatus(){
        if(complaintStatus.equals("Active")){
            complaintStatus = "Active";
        }
        return complaintStatus;
    }

    public String receptionMessage(){
        return complaintDescription;
    }
}

