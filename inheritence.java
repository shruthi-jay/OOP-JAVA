// ALGORITHM:
// Step 1: Start
// Step 2: Create a superclass with its own data members 
// and methods if any
// Step 3: Implement Inheritance concepts
//  3.1:For single inheritance
//  3.1.1:Create a subclass by extending the 
// Super Class
//  3.2:For Multilevel inheritance
//  3.2.1:create a classes extending first 
// subclass,which is a child class Superclass
//  3.3:For Heirarchical inheritance
//  3.3.1:create two subclasses extending 
// Superclass
//  3.4:For Multiple inheritance
//  3.4.1: create a baseclass by Inheriting a 
// single inherited baseclass and an interface
//  3.5:For Hybrid inheritance
//  3.5.1:Create baseclass combining Multiple 
// and Multilevel inheritance
// Step 4: Create main method inside main class and call 
// inheritance classes
// Step 5: Stop
package OopAssignment;
//Java Program for Demonstrating Inheritance Feature
// Creating SuperClass
class Superclass {
 public void print_superclass() {
 System.out.println("inside superclass");
 }
}
// Single Inheritance
class Single_baseclass extends Superclass {// Inheriting SuperClass in 
Single_baseclass
 public void print_Single_baseclass() {
 System.out.println("inside single inherited child class");
 }
}
// Multilevel Inheritance
// Inheriting single inherited Single_baseclass in Multilevel Inheritance
class Multi_baseclass extends Single_baseclass {
 public void print_multi_baseclass() {
 System.out.println("inside multilevel inherited child class");
 }
}
// Hierarchical Inheritance
// Inheriting Heirar_baseclass1 from Superclass
class Heirar_baseclass1 extends Superclass{
 public void print_heirar_baseclass1() {
 System.out.println("inside first heirarchically inherited child 
class");
 }
}
// Inheriting Heirar_baseclass1 from Superclass
class Heirar_baseclass2 extends Superclass {
 public void print_heirar_baseclass2() {
 System.out.println("inside second heirarchically inherited child 
class");
 }
}
//creating interface(ie) a ParentInterface
interface Parent_interface{
 void print_methord1();
}
//If we try to extend multiple classes it will show a compiler error saying 
can't extend multiple class.so we use interface
class Multiple_baseclass extends Superclass implements Parent_interface {
 @Override
 public void print_methord1() {
 System.out.println("this is the methord 1 of multiple baseclass");
 }
 void printModel() {
 print_superclass();
 print_methord1();
 }
}
//combining Multiple and Multilevel inheritance for hybrid inheritance
class Hybrid_baseclass extends Multiple_baseclass implements 
Parent_interface{
 void print_hybridbaseclass()
11
 {
 System.out.println("inside hybrid baseclass");
 }
}
public class Inheritance {
 public static void main(String [] args){
 System.out.println(" --------------------\n| Single Inheritance |\n--------------------\n");
 Single_baseclass obj1 = new Single_baseclass();//creating object of singly inherited child class
 obj1.print_superclass();//calling print_superclass() from superclass
 obj1.print_Single_baseclass();//calling its own method 
print_Single_baseclass()
 System.out.println("\n ----------------------\n| Multilevel Inheritance |\n ------------------------\n");
 Multi_baseclass obj2 = new Multi_baseclass();//creating object of multi level inherited child class
 obj2.print_superclass();//calling print_superclass() from superclass
 obj2.print_Single_baseclass();//calling print_Single_baseclass() from singly inherited child class
 obj2.print_multi_baseclass();//calling its own method 
print_multi_baseclass()
 System.out.println("\n ------------------------\n| Hierarchical Inheritance|\n ------------------------");
 Heirar_baseclass1 obj3 = new Heirar_baseclass1();//creating object of heirarchically inherited child class
 Heirar_baseclass2 obj4 = new Heirar_baseclass2();//creating object of heirarchically inherited child class
 obj3.print_superclass();//calling print_superclass() from superclass
 obj3.print_heirar_baseclass1();//calling its own method 
print_heirar_baseclass1()
 obj4.print_superclass();//calling print_superclass() from superclass
 obj4.print_heirar_baseclass2();//calling its own method 
print_heirar_baseclass1()
 System.out.println("\n ---------------------\n| Multiple Inheritance|\n --------------------\n");
 Multiple_baseclass obj5=new Multiple_baseclass();//creating object of multiple inherited childclass
 obj5.print_superclass();//calling print_superclass() from superclass
 obj5.print_methord1();//calling its own method print_methord1()
 System.out.println("\n --------------------\n| Hybrid Inheritance|\n --------------------\n");
 Hybrid_baseclass obj6=new Hybrid_baseclass();
 obj6.print_superclass();//calling print_superclass() from superclass
 obj6.print_methord1();//calling method print_methord1() of multiple inherited childclass
 obj6.print_hybridbaseclass();//calling its own method 
print_hybridbaseclass()
 }
