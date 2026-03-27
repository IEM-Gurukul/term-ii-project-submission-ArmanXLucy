class Treatment{
public void treat(Patient p){
System.out.println("General treatment for "+p.getName());
}
}

class FirstAid extends Treatment{
public void treat(Patient p){
System.out.println("Providing first aid to "+p.getName());
}
}

class Surgery extends Treatment{
public void treat(Patient p){
System.out.println("Performing surgery for "+p.getName());
}
}

class Medicine extends Treatment{
public void treat(Patient p){
System.out.println("Giving medicine to "+p.getName());
}
}
