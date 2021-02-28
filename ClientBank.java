import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.Naming;
import java.util.Scanner;
public class ClientBank {
private ClientBank() {}
public static void main(String[] args) {
 
 String host = (args.length < 1) ? null : args[0];

try {
//Registry reg = LocateRegistry.getRegistry(host);
Registry reg = LocateRegistry.getRegistry();

IBank stub = (IBank) reg.lookup("bankServeurClient");

  // création de compte 
 System.out.println(stub.creerCompte("one","ala","hamroun"));
 System.out.println("-------------------------");
 System.out.println(stub.ajouterSurCompte(1,"one",10000));
 System.out.println("-------------------------");
 System.out.println(stub.enleverSurCompte(1,"on",1001));
 System.out.println("-------------------------");
 System.out.println(stub.enleverSurCompte(1,"one",1001));
 System.out.println("-------------------------");
 // création de compte 
 System.out.println(stub.creerCompte("two","farid","adwani"));
 System.out.println("-------------------------");
 System.out.println(stub.ajouterSurCompte(2,"ter",10));
 System.out.println("-------------------------");
 System.out.println(stub.ajouterSurCompte(2,"two",10));
 System.out.println("-------------------------");
 System.out.println(stub.enleverSurCompte(2,"two",1));
 System.out.println("-------------------------");
 
 System.out.println(stub.transfertEntreComptes(1,"one",2 , 1000));
 System.out.println("-------------------------");
 System.out.println(stub.getValeur(1,"one"));
 System.out.println("-------------------------");
 System.out.println(stub.getValeur(2,"two"));
 System.out.println("-------------------------");
 System.out.println(stub.enleverSurCompte(2,"two", 100000));
 System.out.println("-------------------------"); 
 System.out.println(stub.getValeur(2,"two"));
 System.out.println("-------------------------");
 System.out.println(stub.etatCompte(1,"one"));
 System.out.println("-------------------------");
 System.out.println(stub.etatCompte(2,"two"));
 System.out.println("-------------------------");

} catch (Exception e) {
System.err.println("Client exception: " + e.toString());
e.printStackTrace();}}}