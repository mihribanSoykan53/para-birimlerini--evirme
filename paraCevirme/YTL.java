
public class YTL {
int lira;
int kurus;

static final double dolar_kuru=1.30;
static final double euro_kuru=1.60;
  

public YTL() {
	
lira=0;
kurus=0 ;
toString();	
	
}

public YTL(int lira) {
	this.lira=lira;
	kurus=0;
}

public YTL(int lira , int kurus) {
	this.lira=lira;
	this.kurus=kurus;
	System.out.format(" %d ytl %d ykr ",lira,kurus);
	
}

public void getLira() {
	System.out.format("%d ytl: ",lira);
}

public void getKurus() {
	System.out.format("%d ykr",kurus);
}


public void getdolar(int lira,int kurus) {
	double a=0.01*kurus;
	double b=lira+a;
	double c=b/dolar_kuru;
	System.out.format("paranizin dolar karsiligi %f dolar",c);
}


public void getEuro(int lira,int kurus){
     
	double a=0.01*kurus;
	double b=lira+a;
	double c =b/euro_kuru;
	System.out.format("paranizin euro karsiligi %f euro",c);
}


public void set(int lira ,int kurus) {
int temp;
temp=lira;
lira=kurus;
kurus=temp;
	
	

}


public void set(YTL y) { 
	int lira1=0;
	int kurus1 = 0;
	y.kurus=kurus1;
	y.lira=lira1;
}

public void setDolar(Dolar d) {
	double a;
	a =d.cent*0.01;
	double b=d.dolar+a;
	double c=b*dolar_kuru;
	System.out.format("%f dolarýn karsiligi %f ytl'dir.",a,c);
}

public void setEuro(Euro e) {
	double a;
	a =e.cent*0.01;
	double b=e.euro+a;
	double c=b*euro_kuru;
	System.out.format("%f euro'nun karsiligi %f ytl'dir.",a,c);
	
}


public boolean eguals(YTL p) {
if(	p.lira==this.lira && p.kurus==this.kurus)
	return true;
else
	return false;
}

public boolean eguals(Dolar p) {
	
double a;
a=p.cent*(dolar_kuru/100);
double b;
b=p.dolar*dolar_kuru;
	
if(a==this.kurus && b==this.lira) {
	System.out.println("true : ytl ve dolar degerleri esittir");
	return true;
	
}
else
	System.out.println("false: ytl ve dolar degerleri esit degildir ");
	return false;
}

public boolean eguals(Euro p) {
	double a;
	a=p.cent*(euro_kuru/100);
	double b;
	b=p.euro*euro_kuru;
		
	if(a==this.kurus && b==this.lira) {
		System.out.println("true : ytl ve euro degerleri esittir");
		return true;
	}
	else
		System.out.println("false : ytl ve euro degerleri esit degildir");
		return false;
	
}


public  void tostring() {
	int a=this.lira;
 System.out.format("%d ytl: "+a);
	int b=this.kurus;
	System.out.format("%d ykr: "+b);
}


public static void paraTopla(YTL p1, YTL p2) {
	
int a=p1.lira+p2.lira	;
int b= p1.kurus+p2.kurus;
double c=(b*0.01)*a;
	
	
	
}

public void topla(YTL p) {
	
int a=p.kurus;
int b=p.lira;
double toplam =this.lira+(a*0.01)+b;
	
	
}

public void dolar(Dolar p) {
	double a =p.cent*(dolar_kuru/100);
	double b =p.dolar*dolar_kuru;
	double c=this.kurus+a;
	double n=this.lira+b;
	double toplam=n+(c*0.01);
}


public void euro(Euro p) {
	double a =p.cent*(euro_kuru/100);
	double b =p.euro*euro_kuru;
	double c=this.kurus+a;
	double n=this.lira+b;
	double toplam=n+(c*0.01);
}




}
