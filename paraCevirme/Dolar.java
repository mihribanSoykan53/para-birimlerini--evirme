
public class Dolar {
	int cent;
	int dolar;
	static final double dolar_kuru=1.30;
	static final double euro_kuru=1.60;
	  
	public Dolar() {
		
		dolar=0;
		cent=0 ;
			
			
		}
	
	
	public Dolar(int dolar) {
		this.dolar=dolar;
		cent=0;
	}

	public Dolar(int dolar , int cent) {
		this.dolar=dolar;
		this.cent=cent;
		System.out.format(" %d dolar %d cent ",dolar,cent);
	}
	
	
	
	
	public void getDolar() {
		System.out.format("%d dolar: ",dolar);
	}

	public void getCent() {
		System.out.format("%d cent",cent);
	}

	
	public void getYTL(int dolar,int cent) {
		double a=0.01*cent;
		double b=dolar+a;
		double c=b*dolar_kuru;
		System.out.format("paranizin karsiligi %f ytl",c);
	}


	public void getEuro(int dolar,int cent){
	     
		double a=0.01*cent;
		double b=dolar+a;
		double c =b*euro_kuru;
		System.out.format("paranizin karsiligi %f euro",c);
	}

	
	public void set(int dolar ,int cent) {
		int temp;
		temp=dolar;
		dolar=cent;
		cent=temp;
			
			

		}

	
	
	public void set(Dolar y) { 
		int dolar1=0;
		int cent1 = 0;
		y.cent=cent1;
		y.dolar=dolar1;
	}

	public void setYTL(YTL d) {
		double a;
		a =d.kurus*0.01;
		double b=d.lira+a;
		double c=b/dolar_kuru;
		System.out.format("%f ytl'nin karsiligi %f dolar'dir.",a,c);
	}

	public void setEuro(Euro e) {
		double a;
		a =e.cent*0.01;
		double b=e.euro+a;
		double c=b/euro_kuru;
		System.out.format("%f euro'nun karsiligi %f dolar'dir.",a,c);
		
	}
	
	
	
	public boolean eguals(Dolar p) {
		if(	p.dolar==this.dolar && p.cent==this.cent)
			
			return true;
		else
			return false;
		}

		public boolean eguals(YTL p) {
			
		double a;
		a=p.kurus/(dolar_kuru/100);
		double b;
		b=p.lira/dolar_kuru;
			
		if(a==this.cent && b==this.dolar) {
			System.out.println("true : ytl ve dolar degerleri esittir");
			return true;
		}
		else
			System.out.println("false : ytl ve dolar degerleri esit degildir");
			return false;
		}

	
	
		
		
		public boolean eguals(Euro p) {
			double a;
			a=p.cent/(euro_kuru/100);
			double b;
			b=p.euro/euro_kuru;
				
			if(a==this.cent && b==this.dolar) {
				return true;
			}
			else
				return false;
			
		}


		public void tostring() {
			int a=this.dolar;	
			System.out.format("%d dolar: ",a);
			int b=this.cent;
			System.out.format("%d cent: ",b);
		}

	
		
		public static void paraTopla(Dolar p1, Dolar p2) {
			
			int a=p1.dolar+p2.dolar	;
			int b= p1.cent+p2.cent;
			double c=(b*0.01)*a;
				
				
				
			}

			public void topla(Dolar p) {
				
			int a=p.cent;
			int b=p.dolar;
			double toplam =this.dolar+(a*0.01)+b;
				
				
			}

		
			public void dolar(YTL p) {
				double a =p.kurus/(dolar_kuru/100);
				double b =p.lira/dolar_kuru;
				double c=this.cent+a;
				double n=this.dolar+b;
				double toplam=n+(c*0.01);
			}


			public void euro(Euro p) {
				double a =p.cent/(euro_kuru/100);
				double b =p.euro/euro_kuru;
				double c=this.cent+a;
				double n=this.dolar+b;
				double toplam=n+(c*0.01);
			}



		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
}
