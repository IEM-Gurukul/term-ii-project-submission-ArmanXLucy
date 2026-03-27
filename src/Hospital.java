import java.util.Scanner;

public class Hospital{
public static void main(String[] args){

Scanner sc=new Scanner(System.in);

while(true){

System.out.print("\nEnter Patient Name: ");
String name=sc.nextLine();

System.out.print("Enter Disease (fever/injury/heart): ");
String cond=sc.nextLine();

System.out.println("Select Doctor:");
System.out.println("1. Dr. Sharma");
System.out.println("2. Dr. Khan");
System.out.println("3. Dr. Roy");

int choice=sc.nextInt();
sc.nextLine();

Doctor d;

if(choice==1){
d=new Doctor("Sharma");
}
else if(choice==2){
d=new Doctor("Khan");
}
else{
d=new Doctor("Roy");
}

Patient p=new Patient(name,cond);

d.treatPatient(p);

System.out.print("\nAdd another patient? (yes/no): ");
String again=sc.nextLine();

if(!again.equalsIgnoreCase("yes")){
break;
}
}

System.out.println("\nSystem Closed");

}
}
