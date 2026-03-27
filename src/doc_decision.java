class Doctor {

    public void treatPatient(patient p) {

        if(p.getCond().equals("Fever")) {
            Treatment t = new Medicine();
            t.treat(p);
        }

        else if(p.getCond().equals("Injury")) {
            Treatment t = new FirstAid();
            t.treat(p);
        }

        else if(p.getCond().equals("Heart Attack")) {
            Treatment t = new Surgery();
            t.treat(p);
        }
    }
}

