class Hospital{
public static void main(String[] args){

patient p1 = new patient("Arman","Fever");
patient p2 = new patient("Rahul","Injury");
patient p3 = new patient("Ali","Heart");

Treatment t;

System.out.println(p1.getName() + " condition: " + p1.getCond());
if(p1.getCond().equals("Fever")){
t = new Medicine();
t.treat(p1);
}

System.out.println(p2.getName() + " condition: " + p2.getCond());
if(p2.getCond().equals("Injury")){
t = new FirstAid();
t.treat(p2);
}

System.out.println(p3.getName() + " condition: " + p3.getCond());
if(p3.getCond().equals("Heart")){
t = new Surgery();
t.treat(p3);
}

}
}
