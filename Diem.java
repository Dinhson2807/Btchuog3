package Btchuong3;
import java.util.Scanner;
public class Diem {
public	int x,y;

public Diem nhapDiem(int x,int y)
{	this.x=x;
	this.y=y;
Scanner sc= new Scanner(System.in);
System.out.println("Nhập vào tọa độ của điểm");
x=sc.nextInt();
y=sc.nextInt();
return null;
}
}
public class DUONGTRON extends Diem {
public double r;
super(x,y)
void nhapTĐĐuongtron(int x,int y,double r){
    this.r=r;
    Scanner s= new Scanner(System.in);
    System.out.println("Nhập vào bán kính đường tròn");
     r = s.nextDouble();
    System.out.println("Nhập vào tọa độ tâm đường tròn");
    Diem C= nhapDiem(x,y);
    C.nhapDiem(x, y);
}   
public static double chuviDtron(double r)
    {
        return r*2*3.14;
    }
    public static double DtichDtron(double r)
    {
        return r*r*3.14;
    }
}
public class bt3_2{

public static void main(String[]args){
    double m;
    int a,b;
    DUONGTRON g= new DUONGTRON();
    g.nhapTĐĐuongtron(a, b, m);
    System.out.println("Chu vi đường tròn là :"+chuviDtron(m));
    System.out.println("Diện tích đường tròn là:"+DtichDtron(m));
}

private static String DtichDtron(double m) {
    return null;
}

private static String chuviDtron(double m) {
    return null;
}
}
	