import java.util.*;
import java.io.*;
import java.util.ArrayList;
class test 
{
Scanner sc=new Scanner(System.in);
static int b,c,d,e;
char ch=' ';
static int k,l,m;
static String ss1;
public void add()
{
String []shortform={"B.Tech","B.Com","BBA"};
String []fullform={"Bachelor of Technology","Bachelors in commerce","Bachelor of Business Administration"};
System.out.println(" \t\t\t  COURSES  \t\t\t");
for(int i=0;i<shortform.length;i++)
{
System.out.println("\t  "+(i+1)+"."+shortform[i]+"\t\t\t  "+fullform[i]);
}
System.out.println("Enter SNO to select the course");
b=sc.nextInt();
switch(b)
{
case 1:
     System.out.println(" 1.CSE");
     System.out.println(" 2.ECE");
     System.out.println("In which branch are you?");
     c=sc.nextInt();
     break;
case 2:
     System.out.println(" 1.Financial Accounting");
     System.out.println(" 2.Marketing Management");
     System.out.println("In which branch are you?");
     d=sc.nextInt();
     break;
case 3:
     System.out.println(" 1.Accounting");
     System.out.println(" 2.Economics");
     System.out.println("In which branch are you?");
     e=sc.nextInt();
     break;
}
}
}


class test1 extends test 
{

public void add()
{
super.add();
do
{
if(c==1)
{
String []subject={"Java","C++","Python"};
String []date={"23-5-2020","24-5-2020","25-5-2020"};
String []timings={"01:30","01:30","01:30"};
for(int i=0;i<subject.length;i++)
{
System.out.println("\t  "+(i+1)+"."+subject[i]+"\t\t\t  "+date[i]+"\t\t\t  "+timings[i]);
}
System.out.println("Do you want register"+"Enter y/Y for registration");
ch=sc.next().charAt(0);
if(ch=='Y' || ch=='y') 
{
System.out.println("select which subject you want to register 1 for java 2 for c++ 3 for python ");
k=sc.nextInt();
}
}
}while(ch=='Y' || ch=='y');


do
{
if(c==2)
{
String []subject={"ece1","ece2","ece3"};
String []date={"23-5-2020","24-5-2020","25-5-2020"};
String []timings={"10:30","10:30","10:30"};
for(int i=0;i<subject.length;i++)
{
System.out.println("\t  "+(i+1)+"."+subject[i]+"\t\t\t  "+date[i]+"\t\t\t  "+timings[i]);
}
System.out.println("Do you want register"+"Enter y/Y for registration");
ch=sc.next().charAt(0);
if(ch=='Y' || ch=='y') 
{
System.out.println("select which subject you want to register 1 for ece1 2 for ece2 3 for ece3 ");
k=sc.nextInt();
}
}
}while(ch=='Y' || ch=='y');


do
{
if(d==1)
{
String []subject={"aaa","bbb","ccc"};
String []date={"20-5-2020","21-5-2020","22-5-2020"};
String []timings={"01:30","01:30","01:30"};
for(int i=0;i<subject.length;i++)
{
System.out.println("\t  "+(i+1)+"."+subject[i]+"\t\t\t  "+date[i]+"\t\t\t  "+timings[i]);
}
System.out.println("Do you want register"+"Enter y/Y for registration");
ch=sc.next().charAt(0);
if(ch=='Y' || ch=='y') 
{
System.out.println("select which subject you want to register 1 for aaa 2 for bbb 3 for ccc ");
k=sc.nextInt();
}
}
}while(ch=='Y' || ch=='y');


do
{
if(d==2)
{
String []subject={"ddd","eee","fff"};
String []date={"20-5-2020","21-5-2020","22-5-2020"};
String []timings={"10:30","10:30","10:30"};
for(int i=0;i<subject.length;i++)
{
System.out.println("\t  "+(i+1)+"."+subject[i]+"\t\t\t  "+date[i]+"\t\t\t  "+timings[i]);
}
System.out.println("Do you want register"+"Enter y/Y for registration");
ch=sc.next().charAt(0);
if(ch=='Y' || ch=='y') 
{
System.out.println("select which subject you want to register 1 for ddd 2 for eee 3 for fff ");
k=sc.nextInt();
}
}
}while(ch=='Y' || ch=='y');


do
{
if(e==1)
{
String []subject={"ggg","hhh","iii"};
String []date={"17-5-2020","18-5-2020","19-5-2020"};
String []timings={"01:30","01:30","01:30"};
for(int i=0;i<subject.length;i++)
{
System.out.println("\t  "+(i+1)+"."+subject[i]+"\t\t\t  "+date[i]+"\t\t\t  "+timings[i]);
}
System.out.println("Do you want register"+"Enter y/Y for registration");
ch=sc.next().charAt(0);
if(ch=='Y' || ch=='y') 
{
System.out.println("select which subject you want to register 1 for ggg 2 for hhh 3 for iii ");
k=sc.nextInt();
}
}
}while(ch=='Y' || ch=='y');


do
{
if(e==2)
{
String []subject={"jjj","kkk","lll"};
String []date={"17-5-2020","18-5-2020","19-5-2020"};
String []timings={"10:30","10:30","10:30"};
for(int i=0;i<subject.length;i++)
{
System.out.println("\t  "+(i+1)+"."+subject[i]+"\t\t\t  "+date[i]+"\t\t\t  "+timings[i]);
}
System.out.println("Do you want register"+"Enter y/Y for registration");
ch=sc.next().charAt(0);
if(ch=='Y' || ch=='y') 
{
System.out.println("select which subject you want to register 1 for jjj 2 for kkk 3 for lll ");
k=sc.nextInt();
}
}
}while(ch=='Y' || ch=='y');
}
}



class test3
{
void show()
{
Scanner sc0=new Scanner(System.in);
System.out.println("Enter registartion number for searching");
String r=sc0.next();
String line=" ";
try
{
FileInputStream fin=new FileInputStream("z16.txt");
Scanner sc9=new Scanner(fin);
while(sc9.hasNextLine())
{
line=sc9.nextLine();
if(line.startsWith(r))
{
System.out.println(line);
}
}
sc9.close();
}
catch(IOException ioe)
{
ioe.printStackTrace();
}
}
}


class test9 
{
public void xxx() throws Exception
{
FileOutputStream fos=new FileOutputStream("z28.txt");
PrintWriter pw=new PrintWriter(fos);
String s="------------------------------------------------------------";
String s1="REGISTRATION NUMBER \t\t\t score";
String s2="-----------------------------------------------------------";
pw.println(s);
pw.println(s1);
pw.println(s2);
FileInputStream fin=new FileInputStream("z25.txt");
Scanner sc=new Scanner(fin);
String line=" ";
int i=0;
while(sc.hasNextLine())
{
line=sc.nextLine();
pw.println(line+"\t\t\t\t\t"+i);
i=i+1;
}
pw.close();
}
}

class test4 
{
void show1()
{
Scanner sc0=new Scanner(System.in);
System.out.println("Enter registartion number for searching");
String r=sc0.next();
String line1=" ";
try
{
FileInputStream fin1=new FileInputStream("z28.txt");
Scanner sc9=new Scanner(fin1);
while(sc9.hasNextLine())
{
line1=sc9.nextLine();
if(line1.startsWith(r))
{
System.out.println(line1);
}
}
sc9.close();
}
catch(IOException ioe)
{
ioe.printStackTrace();
}
}
}


class outerclass extends test
{
static int btechfee=350;
static int bcomfee=400;
static int bbafee=450;
static class staticnestedclass 
{
Scanner sc5=new Scanner(System.in);
static int z;
void display()
{
String []shortform={"B.Tech","B.Com","BBA"};
String []fullform={"Bachelor of Technology","Bachelors in commerce","Bachelor of Business Administration"};
System.out.println(" \t\t\t  COURSES  \t\t\t");
for(int i=0;i<shortform.length;i++)
{
System.out.println("\t  "+(i+1)+"."+shortform[i]+"\t\t\t  "+fullform[i]);
}
System.out.println("Enter SNO to select the course");
z=sc5.nextInt();
if(z==1)
{
System.out.println("Any BTECH fee is"+btechfee);
}
else if(z==2)
{
System.out.println("Any BCOM fee is"+bcomfee);
}
else
{
System.out.println("Any BBA fee is"+bbafee);
}
}
}
}



class test5 
{
void show2()
{
Scanner sc0=new Scanner(System.in);
System.out.println("Enter registartion number for searching");
String r=sc0.next();
String line=" ";
try
{
FileInputStream fin=new FileInputStream("z20.txt");
Scanner sc9=new Scanner(fin);
while(sc9.hasNextLine())
{
line=sc9.nextLine();
if(line.startsWith(r))
{
System.out.println("REGISTRATION NUMBER \t\t RoomNumber \t\t Column \t\t Row");
System.out.println(line);
}
}
sc9.close();
}
catch(IOException ioe)
{
ioe.printStackTrace();
}
}
}


class test7
{
void show4()
{
try
{
FileInputStream fin=new FileInputStream("exampolicy.txt");
Scanner sc=new Scanner(fin);
String line=" ";
while(sc.hasNextLine())
{
line=sc.nextLine();
System.out.println(line);
}
}
catch(IOException ioe)
{
ioe.printStackTrace();
}
}
}




class test8
{
void show6()
{
try
{
FileInputStream fin=new FileInputStream("z25.txt");
Scanner sc=new Scanner(fin);
FileOutputStream fos=new FileOutputStream("z27.txt",true);
PrintWriter pw=new PrintWriter(fos);
int row=1;
int col=2;
int roomnumber=1;
String line=" ";
pw.println("------------------------------------------------------------------------------");
pw.println("REG NO  \t\t  ROOM NO \t\t ROW \t\t  col");
pw.println("------------------------------------------------------------------------------");
System.out.println("------------------------------------------------------------------------------");
System.out.println("REG NO  \t\t  ROOM NO \t\t ROW \t\t  col");
System.out.println("------------------------------------------------------------------------------");
while(sc.hasNextLine())
{
line=sc.nextLine();
pw.println(line +"\t\t "+" "+roomnumber+"\t\t\t "+" "+row +"\t\t "+"   "+col);
System.out.println(line +"\t\t "+" "+roomnumber+"\t\t\t "+" "+row +"\t\t "+"   "+col);
row=row+1;
col=col+1;
ArrayList<Integer>a=new ArrayList<Integer>();
a.add(3);
a.add(5);
a.add(7);
a.add(9);
if(row==6)
{
row=1;
col=a.get(0);
a.remove(1);
}
if(row==6 && col==9)
{
roomnumber=roomnumber+1;
row=1;
col=1;
}
}
pw.close();
}
catch(IOException ioe)
{
ioe.printStackTrace();
}
}
}
//public
class CA2 extends test
{
public static void main(String[]args) throws Exception
{
System.out.println(" \t\t\t-------------------------------------- \t\t\t");
System.out.println(" \t\t\t   EXAMINATION MANAGEMENT SYSTEM \t\t\t");
System.out.println(" \t\t\t-------------------------------------- \t\t\t");
Scanner sc1=new Scanner(System.in);
char ch;
int a;
do
{
System.out.println(" 1.Course Management");
System.out.println(" 2.My Registrations");
System.out.println(" 3.Fee Details");
System.out.println(" 4.Examination Policies");
System.out.println(" 5.Result");
System.out.println(" 6.Seating Plan");
System.out.println(" Enter 1 for course management,2 for session management,3 for fee details,4 for examination policies,5 for result,6 for seating plan");
a=sc1.nextInt();
System.out.println("You want to see more Press Y or any other key for exit");
ch=sc1.next().charAt(0);
}while(ch=='Y' || ch=='y');

if(a==1)
{
test1 t=new test1();
t.add();
}
int row=1;
int col=5;
int roomnumber=2;
//String g="REGISTRATION NUMBER \t\t RoomNumber \t\t Column \t\t Row";

if(b==1 && c==1 && k==1)
{
FileOutputStream fos1=new FileOutputStream("z16.txt",true);
PrintWriter pw1=new PrintWriter(fos1);
String s109="\n\n-----------------------------------------------------------------------------------";
String s107="-----------------------------------------------------------------------------------";
String s106=" SELECTED\t\t JAVA \t\t C++ \t\t PYTHON";
String s108="\t\t BTECH---COMPUTER SCIENCE ENGINEERING";
String ss1=" ";
System.out.println("Enter registartion number:");
ss1=sc1.next();
if(ss1.length()>8)
{
System.out.println("You have entered an invalid registartion number");
}
else
{
pw1.println(s109);
pw1.println(s108);
pw1.println(s107);
pw1.println(s106);
pw1.write(ss1+"\t\t yes \t\t no \t\t no");
System.out.println("you have successfully registered");
FileOutputStream fos2=new FileOutputStream("z17.txt",true);
PrintWriter pw2=new PrintWriter(fos2);
pw2.println(ss1);
pw2.close();
FileOutputStream fos4=new FileOutputStream("z25.txt",true);
PrintWriter pw4=new PrintWriter(fos4);
//pw4.println(g);
pw4.println(ss1);
pw4.close();
}
pw1.close();

}
if(b==1 && c==1 && k==2)
{
FileOutputStream fos1=new FileOutputStream("z16.txt",true);
PrintWriter pw1=new PrintWriter(fos1);
String s109="\n\n-----------------------------------------------------------------------------------";
String s107="-----------------------------------------------------------------------------------";
String s106=" SELECTED\t\t JAVA \t\t C++ \t\t PYTHON";
String s108="\t\t BTECH---COMPUTER SCIENCE ENGINEERING";
System.out.println("Enter registartion number:");
String ss1=sc1.next();
if(ss1.length()>8)
{
System.out.println("You have entered an invalid registartion number");
}
else
{
pw1.println(s109);
pw1.println(s108);
pw1.println(s107);
pw1.println(s106);
pw1.write(ss1+"\t\t no \t\t yes \t\t no");
System.out.println("you have successfully registered");
FileOutputStream fos2=new FileOutputStream("z17.txt",true);
PrintWriter pw2=new PrintWriter(fos2);
pw2.println(ss1);
pw2.close();
FileOutputStream fos4=new FileOutputStream("z25.txt",true);
PrintWriter pw4=new PrintWriter(fos4);
//pw4.println(g);
pw4.println(ss1);
pw4.close();
}
pw1.close();

}
if(b==1 && c==1 && k==3)
{

FileOutputStream fos1=new FileOutputStream("z16.txt",true);
PrintWriter pw1=new PrintWriter(fos1);
String s109="\n\n-----------------------------------------------------------------------------------";
String s107="-----------------------------------------------------------------------------------";
String s106=" SELECTED\t\t JAVA \t\t C++ \t\t PYTHON";
String s108="\t\t BTECH---COMPUTER SCIENCE ENGINEERING";
System.out.println("Enter registartion number:");
String ss1=sc1.next();
if(ss1.length()>8)
{
System.out.println("You have entered an invalid registartion number");
}
else
{
pw1.println(s109);
pw1.println(s108);
pw1.println(s107);
pw1.println(s106);
pw1.write(ss1+"\t\t no \t\t no \t\t yes");
System.out.println("you have successfully registered");
FileOutputStream fos2=new FileOutputStream("z17.txt",true);
PrintWriter pw2=new PrintWriter(fos2);
pw2.println(ss1);
pw2.close();
FileOutputStream fos4=new FileOutputStream("z25.txt",true);
PrintWriter pw4=new PrintWriter(fos4);
//pw4.println(g);
pw4.println(ss1);
pw4.close();
}
pw1.close();
row++;
}
if(b==1 && c==2 && k==1)
{

FileOutputStream fos1=new FileOutputStream("z16.txt",true);
PrintWriter pw1=new PrintWriter(fos1);
String s109="\n\n-----------------------------------------------------------------------------------";
String s107="-----------------------------------------------------------------------------------";
String s110=" SELECTED\t\t ECE1 \t\t ECE2 \t\t ECE3";
String s111="\t\t BTECH---ELECTRONICS AND COMMUNICATION";
System.out.println("Enter registartion number:");
String ss1=sc1.next();
if(ss1.length()>8)
{
System.out.println("You have entered an invalid registartion number");
}
else
{
pw1.println(s109);
pw1.println(s111);
pw1.println(s107);
pw1.println(s110);
pw1.write(ss1+"\t\t yes \t\t no \t\t no");
System.out.println("you have successfully registered");
FileOutputStream fos2=new FileOutputStream("z17.txt",true);
PrintWriter pw2=new PrintWriter(fos2);
pw2.println(ss1);
pw2.close();
FileOutputStream fos4=new FileOutputStream("z25.txt",true);
PrintWriter pw4=new PrintWriter(fos4);
//pw4.println(g);
pw4.println(ss1);
pw4.close();
}
pw1.close();
row++;
}
if(b==1 && c==2 && k==2)
{

FileOutputStream fos1=new FileOutputStream("z16.txt",true);
PrintWriter pw1=new PrintWriter(fos1);
String s109="\n\n-----------------------------------------------------------------------------------";
String s107="-----------------------------------------------------------------------------------";
String s110=" SELECTED\t\t ECE1 \t\t ECE2 \t\t ECE3";
String s111="\t\t BTECH---ELECTRONICS AND COMMUNICATION";
System.out.println("Enter registartion number:");
String ss1=sc1.next();
if(ss1.length()>8)
{
System.out.println("You have entered an invalid registartion number");
}
else
{
pw1.println(s109);
pw1.println(s111);
pw1.println(s107);
pw1.println(s110);
pw1.write(ss1+"\t\t no \t\t yes \t\t no");
System.out.println("you have successfully registered");
FileOutputStream fos2=new FileOutputStream("z17.txt",true);
PrintWriter pw2=new PrintWriter(fos2);
pw2.println(ss1);
pw2.close();
FileOutputStream fos4=new FileOutputStream("z25.txt",true);
PrintWriter pw4=new PrintWriter(fos4);
//pw4.println(g);
pw4.println(ss1);
pw4.close();
}
pw1.close();
row++;
}
if(b==1 && c==2 && k==3)
{

FileOutputStream fos1=new FileOutputStream("z16.txt",true);
PrintWriter pw1=new PrintWriter(fos1);
String s109="\n\n-----------------------------------------------------------------------------------";
String s107="-----------------------------------------------------------------------------------";
String s110=" SELECTED\t\t ECE1 \t\t ECE2 \t\t ECE3";
String s111="\t\t BTECH---ELECTRONICS AND COMMUNICATION";
System.out.println("Enter registartion number:");
String ss1=sc1.next();
if(ss1.length()>8)
{
System.out.println("You have entered an invalid registartion number");
}
else
{
pw1.println(s109);
pw1.println(s111);
pw1.println(s107);
pw1.println(s110);
pw1.write(ss1+"\t\t no \t\t no \t\t yes");
System.out.println("you have successfully registered");
FileOutputStream fos2=new FileOutputStream("z17.txt",true);
PrintWriter pw2=new PrintWriter(fos2);
pw2.println(ss1);
pw2.close();
FileOutputStream fos4=new FileOutputStream("z25.txt",true);
PrintWriter pw4=new PrintWriter(fos4);
//pw4.println(g);
pw4.println(ss1);
pw4.close();
}
pw1.close();
row++;
}
if(b==2 && d==1 && k==1)
{
row=row+7;
FileOutputStream fos1=new FileOutputStream("z16.txt",true);
PrintWriter pw1=new PrintWriter(fos1);
String s109="\n\n-----------------------------------------------------------------------------------";
String s107="-----------------------------------------------------------------------------------";
String s112=" SELECTED\t\t AAA \t\t BBB \t\t CCC";
String s113="\t\t BCOM---FINANCIAL ACCOUNTING";
System.out.println("Enter registartion number:");
String ss1=sc1.next();
if(ss1.length()>8)
{
System.out.println("You have entered an invalid registartion number");
}
else
{
pw1.println(s109);
pw1.println(s113);
pw1.println(s107);
pw1.println(s112);
pw1.write(ss1+"\t\t yes \t\t no \t\t no");
System.out.println("you have successfully registered");
FileOutputStream fos2=new FileOutputStream("z17.txt",true);
PrintWriter pw2=new PrintWriter(fos2);
pw2.println(ss1);
pw2.close();
FileOutputStream fos4=new FileOutputStream("z25.txt",true);
PrintWriter pw4=new PrintWriter(fos4);
//pw4.println(g);
pw4.println(ss1);
pw4.close();
}
pw1.close();
row++;
}
if(b==2 && d==1 && k==2)
{

FileOutputStream fos1=new FileOutputStream("z16.txt",true);
PrintWriter pw1=new PrintWriter(fos1);
String s109="\n\n-----------------------------------------------------------------------------------";
String s107="-----------------------------------------------------------------------------------";
String s112=" SELECTED\t\t AAA \t\t BBB \t\t CCC";
String s113="\t\t BCOM---FINANCIAL ACCOUNTING";
System.out.println("Enter registartion number:");
String ss1=sc1.next();
if(ss1.length()>8)
{
System.out.println("You have entered an invalid registartion number");
}
else
{
pw1.println(s109);
pw1.println(s113);
pw1.println(s107);
pw1.println(s112);
pw1.write(ss1+"\t\t no \t\t yes \t\t no");
System.out.println("you have successfully registered");
FileOutputStream fos2=new FileOutputStream("z17.txt",true);
PrintWriter pw2=new PrintWriter(fos2);
pw2.println(ss1);
pw2.close();
FileOutputStream fos4=new FileOutputStream("z25.txt",true);
PrintWriter pw4=new PrintWriter(fos4);
//pw4.println(g);
pw4.println(ss1);
pw4.close();
}
pw1.close();
row++;
}
if(b==2 && d==1 && k==3)
{

FileOutputStream fos1=new FileOutputStream("z16.txt",true);
PrintWriter pw1=new PrintWriter(fos1);
String s109="\n\n-----------------------------------------------------------------------------------";
String s107="-----------------------------------------------------------------------------------";
String s112=" SELECTED\t\t AAA \t\t BBB \t\t CCC";
String s113="\t\t BCOM---FINANCIAL ACCOUNTING";
System.out.println("Enter registartion number:");
String ss1=sc1.next();
if(ss1.length()>8)
{
System.out.println("You have entered an invalid registartion number");
}
else
{
pw1.println(s109);
pw1.println(s113);
pw1.println(s107);
pw1.println(s112);
pw1.write(ss1+"\t\t no \t\t no \t\t yes");
System.out.println("you have successfully registered");
FileOutputStream fos2=new FileOutputStream("z17.txt",true);
PrintWriter pw2=new PrintWriter(fos2);
pw2.println(ss1);
pw2.close();
FileOutputStream fos4=new FileOutputStream("z25.txt",true);
PrintWriter pw4=new PrintWriter(fos4);
//pw4.println(g);
pw4.println(ss1);
pw4.close();
}
pw1.close();
row++;
}
if(b==2 && d==2 && k==1)
{

FileOutputStream fos1=new FileOutputStream("z16.txt",true);
PrintWriter pw1=new PrintWriter(fos1);
String s109="\n\n-----------------------------------------------------------------------------------";
String s107="-----------------------------------------------------------------------------------";
String s114=" SELECTED\t\t DDD \t\t EEE \t\t FFF";
String s115="\t\t BCOM---MARKETING MANAGEMENT";
System.out.println("Enter registartion number:");
String ss1=sc1.next();
if(ss1.length()>8)
{
System.out.println("You have entered an invalid registartion number");
}
else
{
pw1.println(s109);
pw1.println(s115);
pw1.println(s107);
pw1.println(s114);
pw1.write(ss1+"\t\t yes \t\t no \t\t no");
System.out.println("you have successfully registered");
FileOutputStream fos2=new FileOutputStream("z17.txt",true);
PrintWriter pw2=new PrintWriter(fos2);
pw2.println(ss1);
pw2.close();
FileOutputStream fos4=new FileOutputStream("z25.txt",true);
PrintWriter pw4=new PrintWriter(fos4);
//pw4.println(g);
pw4.println(ss1);
pw4.close();
}
pw1.close();
row++;
}
if(b==2 && d==2 && k==2)
{

FileOutputStream fos1=new FileOutputStream("z16.txt",true);
PrintWriter pw1=new PrintWriter(fos1);
String s109="\n\n-----------------------------------------------------------------------------------";
String s107="-----------------------------------------------------------------------------------";
String s114=" SELECTED\t\t DDD \t\t EEE \t\t FFF";
String s115="\t\t BCOM---MARKETING MANAGEMENT";
System.out.println("Enter registartion number:");
String ss1=sc1.next();
if(ss1.length()>8)
{
System.out.println("You have entered an invalid registartion number");
}
else
{
pw1.println(s109);
pw1.println(s115);
pw1.println(s107);
pw1.println(s114);
pw1.write(ss1+"\t\t no \t\t yes \t\t no");
System.out.println("you have successfully registered");
FileOutputStream fos2=new FileOutputStream("z17.txt",true);
PrintWriter pw2=new PrintWriter(fos2);
pw2.println(ss1);
pw2.close();
FileOutputStream fos4=new FileOutputStream("z25.txt",true);
PrintWriter pw4=new PrintWriter(fos4);
//pw4.println(g);
pw4.println(ss1);
pw4.close();
}
pw1.close();
row++;
}
if(b==2 && d==2 && k==3)
{

FileOutputStream fos1=new FileOutputStream("z16.txt",true);
PrintWriter pw1=new PrintWriter(fos1);
String s109="\n\n-----------------------------------------------------------------------------------";
String s107="-----------------------------------------------------------------------------------";
String s114=" SELECTED\t\t DDD \t\t EEE \t\t FFF";
String s115="\t\t BCOM---MARKETING MANAGEMENT";
System.out.println("Enter registartion number:");
String ss1=sc1.next();
if(ss1.length()>8)
{
System.out.println("You have entered an invalid registartion number");
}
else
{
pw1.println(s109);
pw1.println(s115);
pw1.println(s107);
pw1.println(s114);
pw1.write(ss1+"\t\t no \t\t no \t\t yes");
System.out.println("you have successfully registered");
FileOutputStream fos2=new FileOutputStream("z17.txt",true);
PrintWriter pw2=new PrintWriter(fos2);
pw2.println(ss1);
pw2.close();
FileOutputStream fos4=new FileOutputStream("z25.txt",true);
PrintWriter pw4=new PrintWriter(fos4);
//pw4.println(g);
pw4.println(ss1);
pw4.close();
}
pw1.close();
row++;
}
if(b==3 && e==1 && k==1)
{

FileOutputStream fos1=new FileOutputStream("z16.txt",true);
PrintWriter pw1=new PrintWriter(fos1);
String s109="\n\n-----------------------------------------------------------------------------------";
String s107="-----------------------------------------------------------------------------------";
String s116=" SELECTED\t\t GGG \t\t HHH \t\t III";
String s117="\t\t BBA---ACCOUNTING";
System.out.println("Enter registartion number:");
String ss1=sc1.next();
if(ss1.length()>8)
{
System.out.println("You have entered an invalid registartion number");
}
else
{
pw1.println(s109);
pw1.println(s117);
pw1.println(s107);
pw1.println(s116);
pw1.write(ss1+"\t\t yes \t\t no \t\t no");
System.out.println("you have successfully registered");
FileOutputStream fos2=new FileOutputStream("z17.txt",true);
PrintWriter pw2=new PrintWriter(fos2);
pw2.println(ss1);
pw2.close();
FileOutputStream fos4=new FileOutputStream("z25.txt",true);
PrintWriter pw4=new PrintWriter(fos4);
//pw4.println(g);
pw4.println(ss1);
pw4.close();
}
pw1.close();
row++;
}
if(b==3 && e==1 && k==2)
{

FileOutputStream fos1=new FileOutputStream("z16.txt",true);
PrintWriter pw1=new PrintWriter(fos1);
String s109="\n\n-----------------------------------------------------------------------------------";
String s107="-----------------------------------------------------------------------------------";
String s116=" SELECTED\t\t GGG \t\t HHH \t\t III";
String s117="\t\t BBA---ACCOUNTING";
System.out.println("Enter registartion number:");
String ss1=sc1.next();
if(ss1.length()>8)
{
System.out.println("You have entered an invalid registartion number");
}
else
{
pw1.println(s109);
pw1.println(s117);
pw1.println(s107);
pw1.println(s116);
pw1.write(ss1+"\t\t no \t\t yes \t\t no");
System.out.println("you have successfully registered");
FileOutputStream fos2=new FileOutputStream("z17.txt",true);
PrintWriter pw2=new PrintWriter(fos2);
pw2.println(ss1);
pw2.close();
FileOutputStream fos4=new FileOutputStream("z25.txt",true);
PrintWriter pw4=new PrintWriter(fos4);
//pw4.println(g);
pw4.println(ss1);
pw4.close();
}
pw1.close();
row++;
}
if(b==3 && e==1 && k==3)
{

FileOutputStream fos1=new FileOutputStream("z16.txt",true);
PrintWriter pw1=new PrintWriter(fos1);
String s109="\n\n-----------------------------------------------------------------------------------";
String s107="-----------------------------------------------------------------------------------";
String s116=" SELECTED\t\t GGG \t\t HHH \t\t III";
String s117="\t\t BBA---ACCOUNTING";
System.out.println("Enter registartion number:");
String ss1=sc1.next();
if(ss1.length()>8)
{
System.out.println("You have entered an invalid registartion number");
}
else
{
pw1.println(s109);
pw1.println(s117);
pw1.println(s107);
pw1.println(s116);
pw1.write(ss1+"\t\t no \t\t no \t\t yes");
System.out.println("you have successfully registered");
FileOutputStream fos2=new FileOutputStream("z17.txt",true);
PrintWriter pw2=new PrintWriter(fos2);
pw2.println(ss1);
pw2.close();
FileOutputStream fos4=new FileOutputStream("z25.txt",true);
PrintWriter pw4=new PrintWriter(fos4);
//pw4.println(g);
pw4.println(ss1);
pw4.close();
}
pw1.close();
row++;
}
if(b==3 && e==2 && k==1)
{

FileOutputStream fos1=new FileOutputStream("z16.txt",true);
PrintWriter pw1=new PrintWriter(fos1);
String s109="\n\n-----------------------------------------------------------------------------------";
String s107="-----------------------------------------------------------------------------------";
String s118=" SELECTED\t\t JJJ \t\t KKK \t\t LLL";
String s119="\t\t BBA---COMMERCE";
System.out.println("Enter registartion number:");
String ss1=sc1.next();
if(ss1.length()>8)
{
System.out.println("You have entered an invalid registartion number");
}
else
{
pw1.println(s109);
pw1.println(s119);
pw1.println(s107);
pw1.println(s118);
pw1.write(ss1+"\t\t yes \t\t no \t\t no");
System.out.println("you have successfully registered");
FileOutputStream fos2=new FileOutputStream("z17.txt",true);
PrintWriter pw2=new PrintWriter(fos2);
pw2.println(ss1);
pw2.close();
FileOutputStream fos4=new FileOutputStream("z25.txt",true);
PrintWriter pw4=new PrintWriter(fos4);
//pw4.println(g);
pw4.println(ss1);
pw4.close();
}
pw1.close();
row++;
}
if(b==3 && e==2 && k==2)
{

FileOutputStream fos1=new FileOutputStream("z16.txt",true);
PrintWriter pw1=new PrintWriter(fos1);
String s109="\n\n-----------------------------------------------------------------------------------";
String s107="-----------------------------------------------------------------------------------";
String s118=" SELECTED\t\t JJJ \t\t KKK \t\t LLL";
String s119="\t\t BBA---COMMERCE";
System.out.println("Enter registartion number:");
String ss1=sc1.next();
if(ss1.length()>8)
{
System.out.println("You have entered an invalid registartion number");
}
else
{
pw1.println(s109);
pw1.println(s119);
pw1.println(s107);
pw1.println(s118);
pw1.write(ss1+"\t\t no \t\t yes \t\t no");
System.out.println("you have successfully registered");
FileOutputStream fos2=new FileOutputStream("z17.txt",true);
PrintWriter pw2=new PrintWriter(fos2);
pw2.println(ss1);
pw2.close();
FileOutputStream fos4=new FileOutputStream("z25.txt",true);
PrintWriter pw4=new PrintWriter(fos4);
//pw4.println(g);
pw4.println(ss1);
pw4.close();
}
pw1.close();
row++;
}
if(b==3 && e==2 && k==3)
{

FileOutputStream fos1=new FileOutputStream("z16.txt",true);
PrintWriter pw1=new PrintWriter(fos1);
String s109="\n\n-----------------------------------------------------------------------------------";
String s107="-----------------------------------------------------------------------------------";
String s118=" SELECTED\t\t JJJ \t\t KKK \t\t LLL";
String s119="\t\t BBA---COMMERCE";
System.out.println("Enter registartion number:");
String ss1=sc1.next();
if(ss1.length()>8)
{
System.out.println("You have entered an invalid registartion number");
}
else
{
pw1.println(s109);
pw1.println(s119);
pw1.println(s107);
pw1.println(s118);
pw1.write(ss1+"\t\t no \t\t no \t\t yes");
System.out.println("you have successfully registered");
FileOutputStream fos2=new FileOutputStream("z17.txt",true);
PrintWriter pw2=new PrintWriter(fos2);
pw2.println(ss1);
pw2.close();
FileOutputStream fos4=new FileOutputStream("z25.txt",true);
PrintWriter pw4=new PrintWriter(fos4);
//pw4.println(g);
pw4.println(ss1);
pw4.close();
}
pw1.close();
row++;
}


if(a==5)
{


FileOutputStream fos=new FileOutputStream("z28.txt");
PrintWriter pw=new PrintWriter(fos);
String s="------------------------------------------------------------";
String s1="REGISTRATION NUMBER \t\t score";
String s2="-----------------------------------------------------------";
pw.println(s);
pw.println(s1);
pw.println(s2);
FileInputStream fin=new FileInputStream("z25.txt");
Scanner sc=new Scanner(fin);
String line=" ";
int i=0;
while(sc.hasNextLine())
{
line=sc.nextLine();
pw.println(line+"\t\t\t"+"7"+i);
i=i+1;
}
pw.close();




test4 t2=new test4();
t2.show1();
}


if(a==2)
{
test3 t1=new test3();
t1.show();
}
if(a==3)
{
outerclass.staticnestedclass nestedobject=new outerclass.staticnestedclass();
nestedobject.display();
}

if(a==4)
{
test7 t5=new test7();
t5.show4();
}

if(a==6)
{
test8 t9=new test8();
t9.show6();
}

}
}

















