package edu.neumont.csc150.Model.Patient;

public class PatientFactory {

    public static Patient getInstance() {

        return new PatientImpl();

    }

    public static PatientImpl getInstance(String fn, String ln, long id, String ip, String igi, String p, double a, double pc, String pn){

        return new PatientImpl(fn, ln, id, ip, igi, p, a, pc, pn);

    }

}
