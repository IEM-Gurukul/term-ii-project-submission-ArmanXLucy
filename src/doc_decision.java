class Doctor{
String docName;

Doctor(String docName){
this.docName=docName;
}

public void treatPatient(Patient p){

System.out.println("\nDoctor "+docName+" is checking "+p.getName());

Treatment t;

if(p.getCond().equalsIgnoreCase("fever")){
t=new Medicine();
}
else if(p.getCond().equalsIgnoreCase("injury")){
t=new FirstAid();
}
else if(p.getCond().equalsIgnoreCase("heart")){
t=new Surgery();
}
else{
t=new Treatment();
}

t.treat(p);
}
}
