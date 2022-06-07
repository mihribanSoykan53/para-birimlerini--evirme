
public class Euro {
int euro;
int cent;


static final double dolar_kuru=1.30;
static final double euro_kuru=1.60;
  

public Euro() {
	
euro=0;
cent=0 ;
	
	
}

public Euro(int euro) {
	this.euro=euro;
	cent=0;
}

public Euro(int euro , int cent) {
	this.euro=euro;
	this.cent=cent;
	System.out.format(" %d euro %d cent ",euro,cent);
}

public void getEuro() {
	System.out.format("%d euro: ",euro);
}

public void getCent() {
	System.out.format("%d cent",cent);
}


public void getdolar(int euro,int cent) {
	double a=0.01*cent;
	double b=euro+a;
	double c=b/dolar_kuru;
	System.out.format("paranizin karsiligi %f ytl",c);
}


public void getYTL(int euro,int cent){
     
	double a=0.01*cent;
	double b=euro+a;
	double c =b*euro_kuru;
	System.out.format("paranizin karsiligi %f ytl",c);
}


public void set(int euro ,int cent) {
int temp;
temp=euro;
euro=cent;
cent=temp;
	
	

}


public void set(Euro y) { 
	int euro1=0;
	int cent1 = 0;
	y.cent=cent1;
	y.euro=euro1;
}

public void setDolar(Dolar d) {
	double a;
	a =d.cent*0.01;
	double b=d.dolar+a;
	double c=b*dolar_kuru;
	System.out.format("%f dolarýn karsiligi %f euro'dur.",a,c);
}

public void setYTL(YTL e) {
	double a;
	a =e.kurus*0.01;
	double b=e.lira+a;
	double c=b*euro_kuru;
	System.out.format("%f euro'nun karsiligi %f ytl'dir.",a,c);
	
}


public boolean eguals(Euro p) {
if(	p.euro==this.euro && p.cent==this.cent)
	return true;
else
	return false;
}

public boolean eguals(Dolar p) {
	
double a;
a=p.cent*(dolar_kuru/100);
double b;
b=p.dolar*dolar_kuru;
	
if(a==this.cent && b==this.euro) {
	return true;
}
else
	return false;
}

public boolean eguals(YTL p) {
	double a;
	a=p.kurus*(euro_kuru/100);
	double b;
	b=p.lira*euro_kuru;
		
	if(a==this.cent && b==this.euro) {
		System.out.println("true : ytl ve euro degerleri esittir");
		return true;
	}
	else
		System.out.println("false : ytl ve euro degerleri esit deðildir");
		return false;
	
}


public void tostring() {
	int a=this.euro;	
	System.out.format("%d euro: ",a);
	int b=this.cent;
	System.out.format("%d cent: ",b);
}


public static void paraTopla(Euro p1, Euro p2) {
	
int a=p1.euro+p2.euro	;
int b= p1.cent+p2.cent;
double c=(b*0.01)*a;
	
	
	
}

public void topla(Euro p) {
	
int a=p.cent;
int b=p.euro;
double toplam =this.euro+(a*0.01)+b;
	
	
}

public void dolar(Dolar p) {
	double a =p.cent*(dolar_kuru/100);
	double b =p.dolar*dolar_kuru;
	double c=this.cent+a;
	double n=this.euro+b;
	double toplam=n+(c*0.01);
}


public void YTL(YTL p) {
	double a =p.kurus*(euro_kuru/100);
	double b =p.lira*euro_kuru;
	double c=this.cent+a;
	double n=this.euro+b;
	double toplam=n+(c*0.01);
}
























































}
