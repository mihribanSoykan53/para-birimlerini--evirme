import java.util.Scanner;

public class paraTest {
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner scan=new Scanner(System.in);
		System.out.println("paran�z� lira yerine gecen kismini giriniz:");
		int o=scan.nextInt();
		System.out.println("paran�z� kurus yerine gecen kismini giriniz:");
		int k=scan.nextInt();
		YTL ytl=new YTL(8,5);

		Dolar dolar=new Dolar(4,7);
		Euro euro=new Euro(8,4);
		System.out.print("\n");
		ytl.eguals(dolar);
		System.out.print("\n");
		ytl.eguals(euro);
		System.out.print("\n");
	System.out.println("1.Parayi girin\n2.Paranin turunu degistirin.\n3.Paranin YTL,Dolar,Euro turunu yazd�r�n.\n4.programdan bitir.\nL�tfen yapmak istediginiz islemi seciniz:");
	
		int a=scan.nextInt();
		
		switch(a) {
		case 1:
			System.out.println("1.YTL\n2.Dolar\n3.Euro\nparanin turunu giriniz.");
			int b=scan.nextInt();
		
			if(b==1) {
				
				YTL y =new YTL(o,k);
				y.toString();
				}
		
				else if(b==2) {
					Dolar d=new Dolar(o,k);
					d.tostring();
				}
				
				else if(b==3) {
					Euro e=new Euro(o,k);
					e.toString();
				}
		break;
		case 2:System.out.println("1.YTL\n2.Dolar\n3.Euro\nparanizin turu hangisidir?");
		       int h =scan.nextInt();
		       YTL n=new YTL();
		       switch (h) {
		       case 1:System.out.println("1.Dolar\n2.Euro\n paran�z� hangisine �evirmek istersiniz?");
		       int f=scan.nextInt();
		       if(f==1) {
		    	   
		    	  
		    	   n.getdolar(o,k);
		    	   
		    	 
		       }
		       else {
		    	  n.getEuro(o,k);
		       }break;
		       
		       case 2:System.out.println("1.YTL\n2.Euro\n paran�z� hangisine �evirmek istersiniz?");
		       int g=scan.nextInt();
		       Dolar d=new Dolar();
		       if(g==1) {
		    	 
		    	 d.getYTL(o,k);
		       }
		       else {
		    	  d.getEuro(o,k); 
		       }break;
		       case 3:System.out.println("1.YTL\n2.Dolar\n paran�z� hangisine �evirmek istersiniz?");
		       int p=scan.nextInt();
		       Euro i=new Euro();
		       if(p==1) {
		    	   i.getYTL(o,k);
		    	   
		       }
		       else {
		    	   i.getdolar(o,k);
		       }break;
		         }break;
		
		case 3:
			YTL j=new YTL(o,k);
			Dolar w=new Dolar(o,k);
			Euro z=new Euro(o,k);
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
