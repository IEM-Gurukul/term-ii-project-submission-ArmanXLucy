class Doctor {

    public void treatPatient(Patient p) {

        if(p.getCondition().equals("Fever")) {
            Treatment t = new Medicine();
            t.treat(p);
        }

        else if(p.getCondition().equals("Injury")) {
            Treatment t = new FirstAid();
            t.treat(p);
        }

        else if(p.getCondition().equals("Heart Attack")) {
            Treatment t = new Surgery();
            t.treat(p);
        }
    }
}
