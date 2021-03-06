package projet;
import java.io.Console;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

public class Test {	
	
	public static boolean isDate(String date) {
	    if ((date.charAt(2) != '/') || (date.charAt(5) != '/') || (date.length() != 10))
			return false;
	    else
			return true;
	}
	
	public static String currentday() {
	 	DateFormat df = new SimpleDateFormat("dd/MM/yyyy");// current day
        Date dateobj = new Date();
        String dd = df.format(dateobj);
        return dd ;
	}
	
	// Menu pricipale
	public static int choix_menu_principale() {
		Scanner clavier = new Scanner(System.in) ; 
		int n ;
		System.out.println(ConsoleColors.BLUE+StringUtils.rightPad("+", 120 - 1, "-") + "+"+ConsoleColors.RESET);
	    System.out.println(ConsoleColors.BLUE_BOLD+StringUtils.center(StringUtils.center("MENU", 120 - 2), 120, "|")+ConsoleColors.RESET);
	    System.out.println(ConsoleColors.BLUE+StringUtils.rightPad("+", 120 - 1, "-") + "+"+ConsoleColors.RESET);
	        
	    System.out.println(ConsoleColors.BLUE+StringUtils.rightPad("+", 120 - 1, "-") + "+"+ConsoleColors.RESET);
	    System.out.println(ConsoleColors.BLUE_BOLD+StringUtils.center(StringUtils.center(
	        		  "1- A propos   "
	        		+ "2- Centre     "
	        		+ "3- Personne   "
	        		+ "4- Gouvernorat     "
	        		+ "5- Gestion totale ", 120 - 2), 120, "|")+ConsoleColors.RESET);
	    System.out.println(ConsoleColors.BLUE+StringUtils.rightPad("+", 120 - 1, "-") + "+"+ConsoleColors.RESET);
	        
		do {
        	System.out.println(ConsoleColors.RED_BOLD+"Tapez un num?ro entre 1 et 5 :"+ConsoleColors.RESET);
        	n=clavier.nextInt();
        }while(n<1||n>5);
		return n ;
	}
	
	public static int choix_menu_centre() {
		 Scanner clavier = new Scanner(System.in) ;
		 System.out.println(ConsoleColors.BLUE+StringUtils.rightPad("+", 120 - 1, "-") + "+"+ConsoleColors.RESET);
         System.out.println(ConsoleColors.BLUE_BOLD+StringUtils.center(StringUtils.center("Centre", 120 - 2), 120, "|")+ConsoleColors.RESET);
         System.out.println(ConsoleColors.BLUE+StringUtils.rightPad("+", 120 - 1, "-") + "+"+ConsoleColors.RESET);
         
         System.out.println(ConsoleColors.BLUE+StringUtils.rightPad("+", 120 - 1, "-") + "+"+ConsoleColors.RESET);
         System.out.println(ConsoleColors.BLUE_BOLD+StringUtils.center(StringUtils.center(
         		  "1- Ajout   "
        		+ "2- Affichage   "
        		+ "3- Personne   "
         		+ "4- Chambre     "
         		+ "5- Statistique ", 120 - 2), 120, "|")+ConsoleColors.RESET);
         System.out.println(ConsoleColors.BLUE+StringUtils.rightPad("+", 120 - 1, "-") + "+"+ConsoleColors.RESET);
         int n2;
         do {
         	System.out.println(ConsoleColors.RED_BOLD+"Tapez un num?ro entre 1 et 5 :"+ConsoleColors.RESET);
         	n2=clavier.nextInt();
         }while(n2<1||n2>5);
         return n2;
	}
	
	public static int choix_menu_gouvernorat() {
		Scanner clavier = new Scanner(System.in) ;
		
		int p ;
	
		System.out.println(ConsoleColors.BLUE+StringUtils.rightPad("+", 120 - 1, "-") + "+"+ConsoleColors.RESET);
		System.out.println(ConsoleColors.BLUE_BOLD+StringUtils.center(StringUtils.center(
  		  "1- Gestion des centres   "
  		+ "2- Information     "
  		+ "3- Statistique ", 120 - 2), 120, "|")+ConsoleColors.RESET);
		System.out.println(ConsoleColors.BLUE+StringUtils.rightPad("+", 120 - 1, "-") + "+"+ConsoleColors.RESET);
		do {
			System.out.println(ConsoleColors.RED_BOLD+"Tapez un num?ro entre 1 et 3 :"+ConsoleColors.RESET);
			 p = clavier.nextInt();
		}while(p<1||p>3)	;
		return p;
	}
	
	public static int choix_menu_gestion() {
		Scanner clavier = new Scanner(System.in) ;
		int p ;
		System.out.println(ConsoleColors.BLUE+StringUtils.rightPad("+", 120 - 1, "-") + "+"+ConsoleColors.RESET);
		System.out.println(ConsoleColors.BLUE_BOLD+StringUtils.center(StringUtils.center(
  		  "1- Liste des gouvernorats "
  		+ "2- Gestion des gouvernorats    "
  		+ "3- Statistique  ", 120 - 2), 120, "|")+ConsoleColors.RESET);
		System.out.println(ConsoleColors.BLUE+StringUtils.rightPad("+", 120 - 1, "-") + "+"+ConsoleColors.RESET);
		do {
			System.out.println(ConsoleColors.RED_BOLD+"Tapez un num?ro entre 1 et 3 :"+ConsoleColors.RESET);
			p = clavier.nextInt();
		}while(p<1||p>3);
		return p;
	}
	
	public static void quit(Gestion ges , int choix) {
		Scanner stringScanner4 = new Scanner(System.in);
		String quit ;
		do {
 			System.out.println(ConsoleColors.RED+"Entrez"+ConsoleColors.RESET+ConsoleColors.BLACK_BOLD+" q "+ConsoleColors.RESET+
 					ConsoleColors.RED+"si vous voulez quitter la section OU "+ConsoleColors.RESET
 					+ConsoleColors.BLACK_BOLD+" r "+ConsoleColors.RESET+ConsoleColors.RED+" si vous voulez restez"+ConsoleColors.RESET);
 			quit = stringScanner4.next();
 		}while(!quit.equals("q") && !quit.equals("r"));
 		if(quit.equals("q"))
     		prog_principale(ges,0);
 		if(quit.equals("r"))
 			prog_principale(ges,choix);
	}
	
	public static void prog_principale(Gestion ges,int choix)
	{
		int n ;
		if(choix==0)
			n = choix_menu_principale();
		else
			n=  choix;
		Scanner stringScanner = new Scanner(System.in);
		Scanner stringScanner2 = new Scanner(System.in);
		Scanner stringScanner3 = new Scanner(System.in);
		Scanner stringScanner4 = new Scanner(System.in);
		Scanner clavier = new Scanner(System.in) ; 
	        switch(n) { 
	        // A propos
	        case 1:{
	        	 System.out.println(ConsoleColors.BLUE+StringUtils.rightPad("+", 120 - 1, "-") + "+"+ConsoleColors.RESET);
	             System.out.println(ConsoleColors.BLUE_BOLD+StringUtils.center(StringUtils.center("A Propos l'application", 120 - 2), 120, "|")+ConsoleColors.RESET);
	             System.out.println(ConsoleColors.BLUE+StringUtils.rightPad("+", 120 - 1, "-") + "+"+ConsoleColors.RESET);
	             
	             System.out.println(ConsoleColors.GREEN+StringUtils.rightPad("+", 120 - 1, "-") + "+"+ConsoleColors.RESET);
	             System.out.println(ConsoleColors.GREEN_BOLD+StringUtils.center(StringUtils.center("Pr?sentation", 120 - 2), 120, "|")+ConsoleColors.RESET);
	             System.out.println(ConsoleColors.GREEN+StringUtils.rightPad("+", 120 - 1, "-") + "+"+ConsoleColors.RESET);
	            
	             System.out.println(StringUtils.rightPad("+", 120 - 1, "-") + "+");
	             System.out.println(StringUtils.center(StringUtils.center("Dans le contexte actuel, l?isolement des personnes susceptibles d??tre contamin?es est une action cl?\r\n" + 
	             		"dans la strat?gie de lutte contre la propagation du coronavirus qui nous permet de limiter\r\n" + 
	             		"consid?rablement la contamination et donc le nombre de victimes. M?me apr?s le confinement\r\n" + 
	             		"g?n?ral, l?isolement sera ex?cut? et ce jusqu?? disparition totale du virus dans le pays et dans"
	             		+ " le monde entier \r\n.Compte tenu de l?importance de cette action,"
	             		+ " notre application facilite la proc?dure de \r\n "
	             		+ "l'organisation des centres d'isolement dans un m?mes interfaces .", 120 - 2), 120, "|"));
	             System.out.println(StringUtils.rightPad("+", 120 - 1, "-") + "+");
	             
	             System.out.println(ConsoleColors.GREEN+StringUtils.rightPad("+", 120 - 1, "-") + "+"+ConsoleColors.RESET);
	             System.out.println(ConsoleColors.GREEN_BOLD+StringUtils.center(StringUtils.center("Nos Services", 120 - 2), 120, "|")+ConsoleColors.RESET);
	             System.out.println(ConsoleColors.GREEN+StringUtils.rightPad("+", 120 - 1, "-") + "+"+ConsoleColors.RESET);
	            
	             System.out.println(StringUtils.rightPad("+", 120 - 1, "-") + "+");
	             System.out.println(ConsoleColors.BLACK_BOLD+StringUtils.center(StringUtils.center("1- Centres ", 120 - 2),
	            		 120, "|")+ConsoleColors.RESET);
	             System.out.println(StringUtils.center(StringUtils.center("Ce service permet de mod?liser les centres"
	             		+ "ainsi que la gestion de leurs chambres et la gestion \r\ndes personnes d?s leur acceuil ? la "
	             		+ "date de sortie avec une affichages convenable claire avec tous \r\nles diff?rents d?tails et filtres"
	             		+ "et statistique sont disponible", 120 - 2), 120, "|"));
	             System.out.println(StringUtils.rightPad("+", 120 - 1, "-") + "+");
	             
	             System.out.println(StringUtils.rightPad("+", 120 - 1, "-") + "+");
	             System.out.println(ConsoleColors.BLACK_BOLD+StringUtils.center(StringUtils.center("2- Gouvernorat ", 120 - 2),
	            		 120, "|")+ConsoleColors.RESET);
	             System.out.println(StringUtils.center(StringUtils.center("Chaque gouvernorat dispose "
	             		+ "d?un ou de plusieurs centres d?isolement avec ce services vous pouvez \r\nvisualis?e"
	             		+ "les centres de chaque gouvernorat", 120 - 2), 120, "|"));
	             System.out.println(StringUtils.rightPad("+", 120 - 1, "-") + "+");
	             
	             System.out.println(StringUtils.rightPad("+", 120 - 1, "-") + "+");
	             System.out.println(ConsoleColors.BLACK_BOLD+StringUtils.center(StringUtils.center("3- Gestion Globale ", 120 - 2),
	            		 120, "|")+ConsoleColors.RESET);
	             System.out.println(StringUtils.center(StringUtils.center("Cette partie englobe tous les gouvernorats"
	             		+ "vous pouvez les manipuler et avoir une vision globale sur \r\ntouts les centres de toute la pays", 120 - 2), 120, "|"));
	             System.out.println(StringUtils.rightPad("+", 120 - 1, "-") + "+");
	             
	             prog_principale(ges,0);
          		 break ;
	        }
	        //Centre
	        case 2:{
	        	 String quit;
	        	 int n2 = choix_menu_centre();
	             switch(n2) {
	             	// Ajout
	             	case 1 :{	             		
	             		System.out.println(ConsoleColors.GREEN+"Donnez les caract?ristique de centre ? ajouter"+ConsoleColors.RESET);        		             		
	             		System.out.println("Gouvernorat :"); 
	             		String gouvernorat ;
	             		do {
	             			gouvernorat= stringScanner.nextLine();
	             		}while(!ges.gouvernorat_existev2(gouvernorat)); 
	             		Gouvernorat go = ges.get_Gouvernorat(gouvernorat);      		
	             		System.out.println("Num de Ref :");
	             		int num ;
	             		do {
	             			num =clavier.nextInt();	             				             			
	             		}while(go.centre_existev2(num)==true);             		
	             		System.out.println("adresse :");
	             		String adresse = stringScanner.nextLine() ;
	             		System.out.println("Capacite :");
	             		int capacite =clavier.nextInt() ; 
	             		           	             		
	             		Centre c = new Centre(num,adresse,gouvernorat,capacite);            		
	             		
	             		if(go!=null) {
	             			go.ajouter_centre(c);
	             			System.out.println("Le "+c+ConsoleColors.GREEN+" Ajout?e avec succ?es"+ConsoleColors.RESET);                		
	             		}
	             		// Quit Section
	             		quit(ges,2);
	             		break ;
	             	}
	             	// Affichage
	             	case 2 :{
	             		System.out.println(ConsoleColors.GREEN+"Donnez le num de centre "+ConsoleColors.RESET);        		             		
	             		int num ;
	             		num =clavier.nextInt();	 
	             		if(!ges.cente_existe(num)) {
	             			System.out.println(ConsoleColors.RED_BACKGROUND+ConsoleColors.BLACK_BOLD+"Centre n'existe pas"+ConsoleColors.RESET);
	             		}
	             		else {
	             			 System.out.println(ConsoleColors.BLUE+StringUtils.rightPad("+", 120 - 1, "-") + "+"+ConsoleColors.RESET);
	        	             System.out.println(ConsoleColors.BLUE_BOLD+StringUtils.center(StringUtils.center(
	        	             		  "1- Information  "
	        	            		+ "2- Liste Chambres   "
	        	             		+ "3- Liste Personnes  ", 120 - 2), 120, "|")+ConsoleColors.RESET);
	        	             System.out.println(ConsoleColors.BLUE+StringUtils.rightPad("+", 120 - 1, "-") + "+"+ConsoleColors.RESET);
	        	             int n3;
	        	             do {
	        	             	System.out.println(ConsoleColors.RED_BOLD+"Tapez un num?ro entre 1 et 3 :"+ConsoleColors.RESET);
	        	             	n3=clavier.nextInt();
	        	             }while(n3<1||n3>3);
	        	             Centre c = ges.get_cente(num);
	        	             switch(n3) {
	        	             // Caract?ristique
	        	             	case 1 :	        	          		
	        	             		System.out.println(ConsoleColors.GREEN+StringUtils.rightPad("+", 120 - 1, "-") + "+"+ConsoleColors.RESET);
	        	             		System.out.println(ConsoleColors.GREEN_BOLD+StringUtils.center("********** Centre Num "+c.getNumero_ref()+
	        	             				" **********"+ConsoleColors.RESET, 120 - 2));
	        	             		System.out.println(ConsoleColors.GREEN+StringUtils.rightPad("+", 120 - 1, "-") + "+"+ConsoleColors.RESET);
	        	             		System.out.println(ConsoleColors.BLACK_BOLD+ConsoleColors.BLACK_UNDERLINED+"Adresse :"+ConsoleColors.RESET+
	        	             				" "+c.getAdresse());
	        	             		System.out.println(ConsoleColors.BLACK_BOLD+ConsoleColors.BLACK_UNDERLINED+"Gouvernorat :"+ConsoleColors.RESET+
	        	             				" "+c.getGouvernorat());
	        	             		System.out.println(ConsoleColors.BLACK_BOLD+ConsoleColors.BLACK_UNDERLINED+"Capacit? :"+ConsoleColors.RESET+
	        	             				" "+c.getCapacite());
	        	             		System.out.println(ConsoleColors.BLACK_BOLD+ConsoleColors.BLACK_UNDERLINED+"Nombres des personnes accueillies :"+ConsoleColors.RESET+
	        	             				" "+c.getNombre_personnes());
	        	             		int x = c.getCapacite()-c.getNombre_personnes();
	        	             		System.out.println(ConsoleColors.BLACK_BOLD+ConsoleColors.BLACK_UNDERLINED+"Nombres des places disponible :"+ConsoleColors.RESET+
	        	             				" "+x);
	        	             		// Quit Section
	        	             		quit(ges,2);
	        	             		break ;
	        	             		
	        	             // Liste Chambres
	        	             	case 2 :
	        	             		System.out.println(ConsoleColors.GREEN+StringUtils.rightPad("+", 120 - 1, "-") + "+"+ConsoleColors.RESET);
	        	             		System.out.println(ConsoleColors.GREEN_BOLD+StringUtils.center("**********Liste des Chambres du Centre Num "+c.getNumero_ref()+
	        	             				" **********"+ConsoleColors.RESET, 120 - 2));
	        	             		System.out.println(ConsoleColors.GREEN+StringUtils.rightPad("+", 120 - 1, "-") + "+"+ConsoleColors.RESET);
	        	             		ArrayList <Chambre> Listc=new ArrayList<Chambre>() ;
	        	             		Listc =c.getList_chambres();
	    	        				String[][] tab1 = tableConsole.changeformat_chambre(Listc);
	    	        				tableConsole.tableWithLinesAndMaxWidth(tab1);
	    	        				// Quit Section
	    		             		quit(ges,2);
	    		             		break ;
	        	            // liste personnes
	        	             	case 3 :
	        	             		System.out.println(ConsoleColors.GREEN+StringUtils.rightPad("+", 120 - 1, "-") + "+"+ConsoleColors.RESET);
	        	             		System.out.println(ConsoleColors.GREEN_BOLD+StringUtils.center("**********Liste des personnes du Centre Num "+c.getNumero_ref()+
	        	             				" **********"+ConsoleColors.RESET, 120 - 2));
	        	             		System.out.println(ConsoleColors.GREEN+StringUtils.rightPad("+", 120 - 1, "-") + "+"+ConsoleColors.RESET);
	        	             		ArrayList <Personne> Listp=new ArrayList<Personne>() ;
	        	             		Listp =c.getList_personnes();
	    	        				String[][] tab2 = tableConsole.changeformat_personne(Listp);
	    	        				tableConsole.tableWithLinesAndMaxWidth(tab2);
	    	        				// Quit Section
	    		             		quit(ges,2);
	    		             		break ;
	        	             }
	             		}
	             		prog_principale(ges,0);
	             		break ;
	             	}
	             	// Personne
	             	case 3 : {
	             		System.out.println(ConsoleColors.GREEN+"Donnez le num de centre "+ConsoleColors.RESET);        		             		
	             		int num ;
	             		num =clavier.nextInt();	 
	             		if(!ges.cente_existe(num)) {
	             			System.out.println(ConsoleColors.RED_BACKGROUND+ConsoleColors.BLACK_BOLD+"Centre n'existe pas"+ConsoleColors.RESET);
	             		}
	             		else {
	             			 System.out.println(ConsoleColors.BLUE+StringUtils.rightPad("+", 120 - 1, "-") + "+"+ConsoleColors.RESET);
	        	             System.out.println(ConsoleColors.BLUE_BOLD+StringUtils.center(StringUtils.center(
	        	             		  "1- Liste  "
	        	            		+ "2- Affiche personne   "
	        	             		+ "3- Ajout  "
	        	            		+ "4- Enregistrement d?part", 120 - 2), 120, "|")+ConsoleColors.RESET);
	        	             System.out.println(ConsoleColors.BLUE+StringUtils.rightPad("+", 120 - 1, "-") + "+"+ConsoleColors.RESET);
	        	             int n3;
	        	             do {
	        	             	System.out.println(ConsoleColors.RED_BOLD+"Tapez un num?ro entre 1 et 4 :"+ConsoleColors.RESET);
	        	             	n3=clavier.nextInt();
	        	             }while(n3<1||n3>4);
	        	             Centre c = ges.get_cente(num);
	        	             switch(n3) {
	        	             	//1-Liste
	        	             	case 1 :{
	        	             		System.out.println(ConsoleColors.BLUE+StringUtils.rightPad("+", 120 - 1, "-") + "+"+ConsoleColors.RESET);
		   	        	            System.out.println(ConsoleColors.BLUE_BOLD+StringUtils.center(StringUtils.center(
		   	        	             		  "1- Tout  "
		   	        	            		+ "2- personnes sortants ce jour  "
		   	        	             		+ "3- Personnes Malades  "
		   	        	            		+ "4- Personnes Contamin?es"
		   	        	             		+ "5- Personnes Sans Symptomes", 120 - 2), 120, "|")+ConsoleColors.RESET);
		   	        	            System.out.println(ConsoleColors.BLUE+StringUtils.rightPad("+", 120 - 1, "-") + "+"+ConsoleColors.RESET);
		   	        	            int np;
		   	        	            do {
		   	        	            	System.out.println(ConsoleColors.RED_BOLD+"Entrez un num entre 1 et 5"+ConsoleColors.RESET);
		   	        	            	np = clavier.nextInt();
		   	        	            }while(np<1||np>5);
		   	        	            switch(np) {
		   	        	            	case 1:{
		   	        	            		System.out.println(ConsoleColors.GREEN+StringUtils.rightPad("+", 120 - 1, "-") + "+"+ConsoleColors.RESET);
			        	             		System.out.println(ConsoleColors.GREEN_BOLD+StringUtils.center("**********Liste des personnes du Centre Num "+c.getNumero_ref()+
			        	             				" **********"+ConsoleColors.RESET, 120 - 2));
			        	             		System.out.println(ConsoleColors.GREEN+StringUtils.rightPad("+", 120 - 1, "-") + "+"+ConsoleColors.RESET);
			        	             		ArrayList <Personne> Listp=new ArrayList<Personne>() ;
			        	             		Listp =c.getList_personnes();
			    	        				String[][] tab2 = tableConsole.changeformat_personne(Listp);
			    	        				tableConsole.tableWithLinesAndMaxWidth(tab2);
			    	        				// Quit Section
			    		             		quit(ges,2);
			        	             		break ;
		   	        	            	}
		   	        	            	case 2 :{
		   	        	            	    // Affichge Liste des personnes qui vont sortir ce jour
			        	             		System.out.println(ConsoleColors.GREEN+StringUtils.rightPad("+", 120 - 1, "-") + "+"+ConsoleColors.RESET);
			        	             		System.out.println(ConsoleColors.GREEN_BOLD+StringUtils.center("**********"+" Liste des personnes qui vont sortir ce jour"
			        	             				+ currentday() +" **********"+ConsoleColors.RESET, 120 - 2));
			        	             		System.out.println(ConsoleColors.GREEN+StringUtils.rightPad("+", 120 - 1, "-") + "+"+ConsoleColors.RESET);
			        	             		ArrayList<Personne> list = c.list_personnes_sortes();
			        	             		String[][] table = tableConsole.changeformat_personne(list);
			        	             		tableConsole.tableWithLinesAndMaxWidth(table);
			        	             		// Quit Section
			        	             		quit(ges,2);
			        	             		break;
		   	        	            	}
		   	        	            	case 3 :{
		   	        	            		// Liste personne malades
		   	        	            		System.out.println(ConsoleColors.GREEN+StringUtils.rightPad("+", 120 - 1, "-") + "+"+ConsoleColors.RESET);
			        	             		System.out.println(ConsoleColors.GREEN_BOLD+StringUtils.center("**********"+" Liste des personnes Malades"
			        	             				+" **********"+ConsoleColors.RESET, 120 - 2));
			        	             		System.out.println(ConsoleColors.GREEN+StringUtils.rightPad("+", 120 - 1, "-") + "+"+ConsoleColors.RESET);
			        	             		ArrayList<Personne> list = c. list_personne_selon_etat(2);
			        	             		String[][] table = tableConsole.changeformat_personne(list);
			        	             		tableConsole.tableWithLinesAndMaxWidth(table);
			        	             		// Quit Section
			        	             		quit(ges,2);
			        	             		break;
		   	        	            	}
		   	        	            	case 4 :{
		   	        	            		// Liste personne Contamin?es
		   	        	            		System.out.println(ConsoleColors.GREEN+StringUtils.rightPad("+", 120 - 1, "-") + "+"+ConsoleColors.RESET);
			        	             		System.out.println(ConsoleColors.GREEN_BOLD+StringUtils.center("**********"+" Liste des personnes Contamin?es"
			        	             				+" **********"+ConsoleColors.RESET, 120 - 2));
			        	             		System.out.println(ConsoleColors.GREEN+StringUtils.rightPad("+", 120 - 1, "-") + "+"+ConsoleColors.RESET);
			        	             		ArrayList<Personne> list = c. list_personne_selon_etat(1);
			        	             		String[][] table = tableConsole.changeformat_personne(list);
			        	             		tableConsole.tableWithLinesAndMaxWidth(table);
			        	             		// Quit Section
			        	             		quit(ges,2);
			        	             		break;
		   	        	            	}
		   	        	            	case 5 :{
		   	        	            		// Liste personne n?a eu aucun sympt?me
		   	        	            		System.out.println(ConsoleColors.GREEN+StringUtils.rightPad("+", 120 - 1, "-") + "+"+ConsoleColors.RESET);
			        	             		System.out.println(ConsoleColors.GREEN_BOLD+StringUtils.center("**********"+" Liste des personnes Contamin?es"
			        	             				+" **********"+ConsoleColors.RESET, 120 - 2));
			        	             		System.out.println(ConsoleColors.GREEN+StringUtils.rightPad("+", 120 - 1, "-") + "+"+ConsoleColors.RESET);
			        	             		ArrayList<Personne> list = c.list_personne_selon_etat(3);
			        	             		String[][] table = tableConsole.changeformat_personne(list);
			        	             		tableConsole.tableWithLinesAndMaxWidth(table);
			        	             		// Quit Section
			        	             		quit(ges,2);
			        	             		break;
		   	        	            	}
		   	        	            }
		   	        	            // Quit Section
	        	             		quit(ges,2);
	        	             		break;
	        	             	}
	        	             	// Affiche personne
	        	             	case 2 :{
	        	             		int cin ;
	        	             		System.out.println(ConsoleColors.GREEN+"Donnez le num de CIN de personne"+ConsoleColors.RESET);        		             		
	        	             		
	        	             		cin =clavier.nextInt();	
	        	             		
	        	             		if(!c.personne_estPresent(cin)) {
	        	             			System.out.println(ConsoleColors.RED_BACKGROUND+ConsoleColors.BLACK_BOLD+"Personne du num cin "
	        	             					+cin +" n'existe pas"+ConsoleColors.RESET);
	        	             		}
	        	             		else {
	        	             			Personne p = c.getPersonne(cin);
		        	             		System.out.println(ConsoleColors.GREEN+StringUtils.rightPad("+", 120 - 1, "-") + "+"+ConsoleColors.RESET);
		        	             		System.out.println(ConsoleColors.GREEN_BOLD+StringUtils.center("********** Personne Num CIN "+p.getNum_cin()+
		        	             				" **********"+ConsoleColors.RESET, 120 - 2));
		        	             		System.out.println(ConsoleColors.GREEN+StringUtils.rightPad("+", 120 - 1, "-") + "+"+ConsoleColors.RESET);
		        	             		p.affiche();
	        	             		}
	        	             		// Quit Section
	        	             		quit(ges,2);
	        	             		break;
	        	             	}
	        	             	// Ajout
	        	             	case 3 :{
	        	             		// 1- Entrez les donn?es du personne ? ajout?e
	        	             		System.out.println("Num de cin : ");
	        	             		int numcin;
	        	             		do {
	        	             			numcin = clavier.nextInt() ;
	        	             		}while(c.personne_estPresentv2(numcin));
	        	             		System.out.println("Nom : ");
	        	             		String nom = stringScanner.nextLine();
	        	             		System.out.println("Pr?nom : ");
	        	             		String prenom = stringScanner2.nextLine();
	        	             		System.out.println("Genre :");
	        	             		String genre ;
	        	             		do {
	        	             			System.out.println(ConsoleColors.RED+"Entrez F ou M"+ConsoleColors.RESET);
	        	             			genre = stringScanner.next();
	        	             		}while(!genre.equals("F") && !genre.equals("M"));
	        	             		System.out.println("Date de naissance : ");
	        	             		String date ;
	        	             		do {
	        	             			System.out.println(ConsoleColors.RED+"Date sous forme jj/mm/aaaa"+ConsoleColors.RESET);
	        	             			date = stringScanner2.nextLine() ;
	        	             		}while(!isDate(date));
	        	             		System.out.println("type_contamination :");
	        	             		System.out.println("Entrez "+ConsoleColors.BLACK_BOLD+" 0 "+ConsoleColors.RESET+" si un contact avec une personne malade");
	        	             		System.out.println("Entrez "+ConsoleColors.BLACK_BOLD+" 1 "+ConsoleColors.RESET+" si venant de l'etranger");
	        	             		int type ;
	        	             		do {
	        	             			type = stringScanner.nextInt();
	        	             		}while(type!=0 && type!=1);
	        	             		System.out.println("Etat :");
	        	             		System.out.println("Entrez "+ConsoleColors.BLACK_BOLD+" 2 "+ConsoleColors.RESET+" si personne malade mais sans sympt?mes graves");
	        	             		System.out.println("Entrez "+ConsoleColors.BLACK_BOLD+" 3 "+ConsoleColors.RESET+" si personne n?a eu aucun sympt?me");
	        	             		int etat ;
	        	             		do {
	        	             			etat = stringScanner4.nextInt();
	        	             		}while(etat!=2 && etat!=3);
	        	             		System.out.println("Gouvernorat :"); 
	        	             		String gouvernorat ;
	        	             		do {
	        	             			gouvernorat= stringScanner3.nextLine();
	        	             		}while(!ges.gouvernorat_existev2(gouvernorat));
	        	             		
	        	             		Personne p = new Personne(numcin,nom,prenom,genre.charAt(0),date,gouvernorat,type,etat);
	        	             		
	        	             		// 2- Si il y'a une place disponible dans le centre si non on cherche le centre le plus proche
	        	             		if(c.getCapacite()<=c.nombre_chambre_libre_desinfecter()) {
	        	             			System.out.println(ConsoleColors.BLACK_BOLD+ConsoleColors.RED_BACKGROUND+
	        	             					"Centre Complet"+ConsoleColors.RESET);
	        	             			Gouvernorat g = ges.get_Gouvernorat(gouvernorat);// get gouvernorat de personne
	        	             			ArrayList <Centre>  listecentre = g.get_list_Centres();
	        	                        int b=0;           
	        	                        for(Centre c1:  listecentre ){
	        	                            if((c1.getCapacite()>c1.nombre_chambre_libre_desinfecter())&&(b==0)){
	        	            	                c1.ajouter_personne(p);
	        	            	                System.out.println(ConsoleColors.GREEN+"Personne ajout?e avec succ?e au centre "+
	        	            	                		c1.getNumero_ref()+ConsoleColors.RESET);
	    	        	             			p.affiche();	
	    	        	             			// Si ajouter c bn il faut l'affect?e ? une chambre
	    	        	             			ArrayList<Chambre> listcld = c1.list_chambre_libre_desinfecter();
	    	        	             			String[][] table = tableConsole.changeformat_chambre(listcld);
	    	        	             			tableConsole.tableWithLinesAndMaxWidth(table);
	    	        	             			System.out.println(ConsoleColors.GREEN+"Entrez le num de chambre :"+ConsoleColors.RESET);
	    	        	             			int numch ;
	    	        	             			do {
	    	        	             				numch = clavier.nextInt();
	    	        	             			}while(!c1.affecter_chambre(numch, p.getNum_cin()));
	    	        	             			System.out.println(ConsoleColors.GREEN+"Personne "+p.getNum_cin()+" affect?e avec succ?e au chambre"
	    	        	             					+ "num "+numch+ConsoleColors.RESET);
	    	        	             		    b=1;
	        	                             }
	        	                        } 
	        	                        if(b==0){
											try {
												String[] t = g.Distance();
												int i=1;
		        	                            while(b==0){
			        	                            Gouvernorat g1=ges.get_Gouvernorat(t[i]);
			        	                            ArrayList <Centre>  lc=g1.get_list_Centres();
			        	                            for(Centre c1:  lc ){
			        	                                if((c1.getCapacite()>c1.nombre_chambre_libre_desinfecter())&&(b==0)){
			        	                                  c1.ajouter_personne(p); 
			        	                                  System.out.println(ConsoleColors.GREEN+"Personne ajout?e avec succ?e"
			        	                                  		+ " au centre "+c.getNumero_ref()+ConsoleColors.RESET);
			        	                                  p.affiche();
			        	                                  // Si ajouter c bn il faut l'affect?e ? une chambre
				    	        	             			ArrayList<Chambre> listcld = c1.list_chambre_libre_desinfecter();
				    	        	             			String[][] table = tableConsole.changeformat_chambre(listcld);
				    	        	             			tableConsole.tableWithLinesAndMaxWidth(table);
				    	        	             			System.out.println(ConsoleColors.GREEN+"Entrez le num de chambre :"+ConsoleColors.RESET);
				    	        	             			int numch ;
				    	        	             			do {
				    	        	             				numch = clavier.nextInt();
				    	        	             			}while(!c1.affecter_chambre(numch, p.getNum_cin()));
				    	        	             			System.out.println(ConsoleColors.GREEN+"Personne "+p.getNum_cin()+" affect?e avec succ?e au chambre"
				    	        	             					+ "num "+numch+ConsoleColors.RESET);
			        	                                  b=1;
			        	                                }
			        	                            }
			        	                            i++;
		        	                            }
											} catch (IOException e) {
												System.out.println("Something went wrong");
											}
	        	                       }
	        	             		}
	        	             		else {
	        	             			c.ajouter_personne(p);
	        	             			System.out.println(ConsoleColors.GREEN+"Personne ajout?e avec succ?e au centre "+c.getNumero_ref()+ConsoleColors.RESET);
	        	             			p.affiche();       
	        	             		    // Si ajouter c bn il faut l'affect?e ? une chambre
	        	             			System.out.println(ConsoleColors.GREEN+StringUtils.rightPad("+", 120 - 1, "-") + "+"+ConsoleColors.RESET);
		        	             		System.out.println(ConsoleColors.GREEN_BOLD+StringUtils.center("**********"+" Liste des chambres libres et "
		        	             				+ "d?sinfect?es **********"+ConsoleColors.RESET, 120 - 2));
		        	             		System.out.println(ConsoleColors.GREEN+StringUtils.rightPad("+", 120 - 1, "-") + "+"+ConsoleColors.RESET);
		        	             		
	        	             			ArrayList<Chambre> listcld = c.list_chambre_libre_desinfecter();
	        	             			String[][] table = tableConsole.changeformat_chambre(listcld);
	        	             			tableConsole.tableWithLinesAndMaxWidth(table);
	        	             			int numch ;
	        	             			do {
	        	             				System.out.println(ConsoleColors.GREEN+"Entrez le num de chambre :"+ConsoleColors.RESET);
	        	             				numch = clavier.nextInt();
	        	             			}while(!c.affecter_chambre(numch, p.getNum_cin()));
	        	             			System.out.println(ConsoleColors.GREEN+"Personne "+p.getNum_cin()+" affect?e avec succ?e au chambre"
	        	             					+ "num "+numch+ConsoleColors.RESET);
	        	             		}
	        	             		// Quit Section
	        	             		quit(ges,2);
	        	             		break;
	        	             	}
	        	             	// Enregistrement de d?part
	        	             	case 4 :{
	        	             		System.out.println(ConsoleColors.GREEN+"Donnez lu num de cin du personne :"+ConsoleColors.RESET);
	        	             		int cin = clavier.nextInt();
	        	             		c.supprime_personne(cin);
	        	             		// Quit Section
	        	             		quit(ges,2);
	        	             		break;
	        	             	}
	        	             }
	        	        }
	             		// Quit Section
	             		quit(ges,2);
	             		break;
	             	}
	             	// Chambre
	             	case 4:{
	             		System.out.println(ConsoleColors.GREEN+"Donnez le num de centre "+ConsoleColors.RESET);        		             		
	             		int num ;
	             		num =clavier.nextInt();	 
	             		if(!ges.cente_existe(num)) {
	             			System.out.println(ConsoleColors.RED_BACKGROUND+ConsoleColors.BLACK_BOLD+"Centre n'existe pas"+ConsoleColors.RESET);
	             		}
	             		else {
	             			 System.out.println(ConsoleColors.BLUE+StringUtils.rightPad("+", 120 - 1, "-") + "+"+ConsoleColors.RESET);
	        	             System.out.println(ConsoleColors.BLUE_BOLD+StringUtils.center(StringUtils.center(
	        	             		  "1- Liste  "
	        	            		+ "2- Affiche Chambre  "
	        	             		+ "3- Nettoyer Chambre "
	        	            		+ "4- Affecter Chambre "
	        	             		+ "5- Lib?rer Chambre  ", 120 - 2), 120, "|")+ConsoleColors.RESET);
	        	             System.out.println(ConsoleColors.BLUE+StringUtils.rightPad("+", 120 - 1, "-") + "+"+ConsoleColors.RESET);
	        	             int n3;
	        	             do {
	        	             	System.out.println(ConsoleColors.RED_BOLD+"Tapez un num?ro entre 1 et 5 :"+ConsoleColors.RESET);
	        	             	n3=clavier.nextInt();
	        	             }while(n3<1||n3>5);
	        	             Centre c = ges.get_cente(num);
	        	             switch(n3) {
	        	             	// liste
	        	             	case 1 :{
	        	             		System.out.println(ConsoleColors.BLUE+StringUtils.rightPad("+", 120 - 1, "-") + "+"+ConsoleColors.RESET);
		   	        	            System.out.println(ConsoleColors.BLUE_BOLD+StringUtils.center(StringUtils.center(
		   	        	             		  "1- Tout  "
		   	        	            		+ "2- Chambres Disponibles  "
		   	        	             		+ "3- Chambres Occup?es  "
		   	        	            		+ "4- Chambres Libres Inf?ct?es", 120 - 2), 120, "|")+ConsoleColors.RESET);
		   	        	            System.out.println(ConsoleColors.BLUE+StringUtils.rightPad("+", 120 - 1, "-") + "+"+ConsoleColors.RESET);
		   	        	            int nc;
		   	        	            do {
		   	        	            	System.out.println(ConsoleColors.RED_BOLD+"Entrez un num entre 1 et 4"+ConsoleColors.RESET);
		   	        	            	nc = clavier.nextInt();
		   	        	            }while(nc<1||nc>5);
		   	        	            switch(nc) {
			   	        	         	case 1:{
		   	        	            		System.out.println(ConsoleColors.GREEN+StringUtils.rightPad("+", 120 - 1, "-") + "+"+ConsoleColors.RESET);
			        	             		System.out.println(ConsoleColors.GREEN_BOLD+StringUtils.center("********** Liste des Chambres **********"+ConsoleColors.RESET, 120 - 2));
			        	             		System.out.println(ConsoleColors.GREEN+StringUtils.rightPad("+", 120 - 1, "-") + "+"+ConsoleColors.RESET);
			        	             		ArrayList <Chambre> Listc=new ArrayList<Chambre>() ;
			        	             		Listc =c.getList_chambres();
			    	        				String[][] tab2 = tableConsole.changeformat_chambre(Listc);
			    	        				tableConsole.tableWithLinesAndMaxWidth(tab2);
			    	        				// Quit Section
			        	             		quit(ges,2);
			        	             		break;
			   	        	            }
			   	        	         	case 2:{
		   	        	            		System.out.println(ConsoleColors.GREEN+StringUtils.rightPad("+", 120 - 1, "-") + "+"+ConsoleColors.RESET);
			        	             		System.out.println(ConsoleColors.GREEN_BOLD+StringUtils.center("********** Liste des Chambres Disponibles **********"+ConsoleColors.RESET, 120 - 2));
			        	             		System.out.println(ConsoleColors.GREEN+StringUtils.rightPad("+", 120 - 1, "-") + "+"+ConsoleColors.RESET);
			        	             		ArrayList <Chambre> Listc=new ArrayList<Chambre>() ;
			        	             		Listc =c.list_chambre_libre_desinfecter();
			    	        				String[][] tab2 = tableConsole.changeformat_chambre(Listc);
			    	        				tableConsole.tableWithLinesAndMaxWidth(tab2);
			    	        				// Quit Section
			        	             		quit(ges,2);
			        	             		break;
			   	        	            }
			   	        	         	case 3:{
		   	        	            		System.out.println(ConsoleColors.GREEN+StringUtils.rightPad("+", 120 - 1, "-") + "+"+ConsoleColors.RESET);
			        	             		System.out.println(ConsoleColors.GREEN_BOLD+StringUtils.center("********** Liste des Chambres Ocupp?es **********"+ConsoleColors.RESET, 120 - 2));
			        	             		System.out.println(ConsoleColors.GREEN+StringUtils.rightPad("+", 120 - 1, "-") + "+"+ConsoleColors.RESET);
			        	             		ArrayList <Chambre> Listc=new ArrayList<Chambre>() ;
			        	             		Listc =c.list_chambre_occupees();
			    	        				String[][] tab2 = tableConsole.changeformat_chambre(Listc);
			    	        				tableConsole.tableWithLinesAndMaxWidth(tab2);
			    	        				// Quit Section
			        	             		quit(ges,2);
			        	             		break;
			   	        	            }
			   	        	         	case 4:{
		   	        	            		System.out.println(ConsoleColors.GREEN+StringUtils.rightPad("+", 120 - 1, "-") + "+"+ConsoleColors.RESET);
			        	             		System.out.println(ConsoleColors.GREEN_BOLD+StringUtils.center("********** Liste des Chambres Libres Inf?ct?es **********"+ConsoleColors.RESET, 120 - 2));
			        	             		System.out.println(ConsoleColors.GREEN+StringUtils.rightPad("+", 120 - 1, "-") + "+"+ConsoleColors.RESET);
			        	             		ArrayList <Chambre> Listc=new ArrayList<Chambre>() ;
			        	             		Listc =c.list_chambre_libre_infecter();
			    	        				String[][] tab2 = tableConsole.changeformat_chambre(Listc);
			    	        				tableConsole.tableWithLinesAndMaxWidth(tab2);
			    	        				// Quit Section
			        	             		quit(ges,2);
			        	             		break;
			   	        	            }
		        	             	}
		   	        	            // Quit Section
	        	             		quit(ges,2);
	        	             		break;
	        	             	}
	        	             	// Affiche Chambre
	        	             	case 2 :{
	        	             		System.out.println(ConsoleColors.GREEN+"Donnez le num de chambre "+ConsoleColors.RESET);        		             		
	        	             		int numc ;
	        	             		numc =clavier.nextInt();	 
	        	             		if(!c.Chambre_existe(numc)) {
	        	             			System.out.println(ConsoleColors.RED_BACKGROUND+ConsoleColors.BLACK_BOLD+"Chambre n'existe pas"+ConsoleColors.RESET);
	        	             		}
	        	             		else {
	        	             			Chambre ch = c.getChambre(numc);
	        	             			System.out.println(ch);
	        	             		}
	        	             		// Quit Section
	        	             		quit(ges,2);
	        	             		break;
	        	             	}
	        	             	// Nettoyer Chambre
	        	             	case 3 :{
	        	             		System.out.println(ConsoleColors.GREEN+"Donnez le num de chambre "+ConsoleColors.RESET);        		             		
	        	             		int numc ;
	        	             		numc =clavier.nextInt();	 
	        	             		if(!c.Chambre_existe(numc)) {
	        	             			System.out.println(ConsoleColors.RED_BACKGROUND+ConsoleColors.BLACK_BOLD+"Chambre n'existe pas"+ConsoleColors.RESET);
	        	             		}
	        	             		else {
	        	             			Chambre ch = c.getChambre(numc);
	        	             			ch.Nettoyer_chambre();
	        	             		}
	        	             		// Quit Section
	        	             		quit(ges,2);
	        	             		break;
	        	             	}
	        	             	//Affecter Chambre
	        	             	case 4:{
	        	             		System.out.println(ConsoleColors.GREEN+"Donnez le num de chambre "+ConsoleColors.RESET);        		             		
	        	             		int numc ;
	        	             		numc =clavier.nextInt();	 
	        	             		if(!c.Chambre_existe(numc)) {
	        	             			System.out.println(ConsoleColors.RED_BACKGROUND+ConsoleColors.BLACK_BOLD+"Chambre n'existe pas"+ConsoleColors.RESET);
	        	             		}
	        	             		else{
	        	             			System.out.println(ConsoleColors.GREEN+"Donnez le num de cin de personne "+ConsoleColors.RESET);        		             		
	        	             			int cin ;
		        	             		cin =clavier.nextInt();	 
		        	             		if(!c.personne_estPresent(cin)) {
		        	             			System.out.println(ConsoleColors.RED_BACKGROUND+ConsoleColors.BLACK_BOLD+"personne n'existe pas"+ConsoleColors.RESET);
		        	             		}else {
		        	             			Chambre ch = c.getChambre(numc);
		        	             			c.affecter_chambre(numc, cin);
		        	             		}
	        	             		}
	        	             		
	        	             		// Quit Section
	        	             		quit(ges,2);
	        	             		break;
	        	             	}
	        	             	case 5:{
	        	             		System.out.println(ConsoleColors.GREEN+"Donnez le num de chambre "+ConsoleColors.RESET);        		             		
	        	             		int numc ;
	        	             		numc =clavier.nextInt();	 
	        	             		if(!c.Chambre_existe(numc)) {
	        	             			System.out.println(ConsoleColors.RED_BACKGROUND+ConsoleColors.BLACK_BOLD+"Chambre n'existe pas"+ConsoleColors.RESET);
	        	             		}
	        	             		else {
	        	             			Chambre ch = c.getChambre(numc);
	        	             			ch.lib?rer_chambre();
	        	             		}
	        	             		// Quit Section
	        	             		quit(ges,2);
	        	             		break;
	        	             	}
	        	             }
	             		}   
	             		// Quit Section
	             		quit(ges,2);
	             		break;
	             	}
	             	//Statistique
	             	case 5:{
	             		System.out.println(ConsoleColors.GREEN+"Donnez le num de centre "+ConsoleColors.RESET);        		             		
	             		int num ;
	             		num =clavier.nextInt();	 
	             		if(!ges.cente_existe(num)) {
	             			System.out.println(ConsoleColors.RED_BACKGROUND+ConsoleColors.BLACK_BOLD+"Centre n'existe pas"+ConsoleColors.RESET);
	             		}
	             		else {
	             			 System.out.println(ConsoleColors.BLUE+StringUtils.rightPad("+", 120 - 1, "-") + "+"+ConsoleColors.RESET);
	        	             System.out.println(ConsoleColors.BLUE_BOLD+StringUtils.center(StringUtils.center(
	        	             		  "1- Statistique Chambre  "
	        	            		+ "2- Statistique Personne  ", 120 - 2), 120, "|")+ConsoleColors.RESET);
	        	             System.out.println(ConsoleColors.BLUE+StringUtils.rightPad("+", 120 - 1, "-") + "+"+ConsoleColors.RESET);
	        	             int n3;
	        	             do {
	        	             	System.out.println(ConsoleColors.RED_BOLD+"Tapez un num?ro entre 1 et 2 :"+ConsoleColors.RESET);
	        	             	n3=clavier.nextInt();
	        	             }while(n3<1||n3>2);
	        	             Centre c = ges.get_cente(num);
	        	             switch(n3) {
		        	             case 2:{
		        	            	System.out.println(ConsoleColors.RED+"Nombre des personnes Contamin?es "+
		        	            			ConsoleColors.RESET+ConsoleColors.BLACK_BOLD+c.list_personne_selon_etat(1).size()
		        	            			+ConsoleColors.RESET);
		        	            	System.out.println(ConsoleColors.BLUE+"Nombre des personnes malades "+
		        	            			ConsoleColors.RESET+ConsoleColors.BLACK_BOLD+c.list_personne_selon_etat(2).size()
		        	            			+ConsoleColors.RESET);
		        	            	System.out.println(ConsoleColors.GREEN+"Nombre des personnes n'ont aucun symptome "+
		        	            			ConsoleColors.RESET+ConsoleColors.BLACK_BOLD+c.list_personne_selon_etat(3).size()
		        	            			+ConsoleColors.RESET);
		        	            	// Quit Section
	        	             		quit(ges,2);
	        	             		break; 
		        	             }
		        	             case 1:{
		        	            	 System.out.println(ConsoleColors.RED+"Nombre des chambres libres d?sinfect?e "+
			        	            			ConsoleColors.RESET+ConsoleColors.BLACK_BOLD+c.nombre_chambre_libre_infecter()
			        	            			+ConsoleColors.RESET);
			        	            	System.out.println(ConsoleColors.BLUE+"Nombre des chambres ocupp?es "+
			        	            			ConsoleColors.RESET+ConsoleColors.BLACK_BOLD+c.nombre_chambres_occupees()
			        	            			+ConsoleColors.RESET);
			        	            	System.out.println(ConsoleColors.GREEN+"Nombre des chambres disponible "+
			        	            			ConsoleColors.RESET+ConsoleColors.BLACK_BOLD+c.nombre_chambre_libre_desinfecter()
			        	            			+ConsoleColors.RESET);
			        	            	// Quit Section
		        	             		quit(ges,2);
		        	             		break;
		        	             }
	        	             }
	             		}
	             		// Quit Section
	             		quit(ges,2);
	             		break;
	             	}
	             }
	             // Quit Section
          		quit(ges,2);
          		break;
	        }   
	        // Ajout personne selon gouvernorat
	        case 3 :{
	        	String quit;
	        	System.out.println(ConsoleColors.GREEN+"Donnez le nom du gouvernorat des personnes ? ajout?es :"+ConsoleColors.RESET);
	    		String ch ;
	    		do {
	     			ch= stringScanner.nextLine();
	     		}while(!ges.gouvernorat_existev2(ch));
	    		int nb ;
	    		do {
	    			System.out.println(ConsoleColors.GREEN+"Donnez le nombre des personnes ? ajout?es :"+ConsoleColors.RESET);
		    		nb = clavier.nextInt() ;
	    		}while(nb<=0);
	    		ArrayList<Centre> listeCentreDispo = new ArrayList<Centre>();
	    		try {
	    			listeCentreDispo = ges.affectation_propos?e(ch,nb);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	    		ges.ajoutpersonne(listeCentreDispo, nb,ch);
	        	// Quit Section
          		quit(ges,3);
          		break;
	        }
	        //gouvernorat 
	        case 4 :     	
	        	{	
	        		String quit;
		        	int p = choix_menu_gouvernorat();
		        	System.out.println(ConsoleColors.GREEN+"Donnez le nom du gouvernorat "+ConsoleColors.RESET);
		    		String ch ;
		    		do {
		     			ch= stringScanner.nextLine();
		     		}while(!ges.gouvernorat_existev2(ch));
		    		Gouvernorat gouv=ges.get_Gouvernorat(ch);// Get gouvernorat
		    		
	        		switch (p) {
	        		//Gestion des centres
	        		case 1 :
	        		{	
	        			System.out.println(ConsoleColors.BLUE+StringUtils.rightPad("+", 120 - 1, "-") + "+"+ConsoleColors.RESET);
	            		System.out.println(ConsoleColors.BLUE_BOLD+StringUtils.center(StringUtils.center(
	              		  "1- Ajouter centre   "	
	              		+ "2- Suprimer centre ", 120 - 2), 120, "|")+ConsoleColors.RESET);
	            		System.out.println(ConsoleColors.BLUE+StringUtils.rightPad("+", 120 - 1, "-") + "+"+ConsoleColors.RESET);
	            		
	            		int i;
	            		do {
	            			System.out.println(ConsoleColors.RED_BOLD+"Entrez un num entre 1 et 2 :"+ConsoleColors.RESET);
	            			i = clavier.nextInt();
	            		}while(i<1||i>2);
	            		
	            		switch (i) {
	            		// Ajouter Centre
		            		case 1 :
			            	{	
			            		System.out.println(ConsoleColors.GREEN+"Donnez les caract?ristique de centre ? ajouter"+ConsoleColors.RESET);        		             		
			             		System.out.println("Num de Ref :");
			             		int num ;
			             		do {
			             			num =clavier.nextInt();	             				             			
			             		}while(gouv.centre_existev2(num)==true);             		
			             		System.out.println("adresse :");
			             		String adresse = stringScanner.nextLine() ;
			             		System.out.println("Capacite :");
			             		int capacite =clavier.nextInt() ; 
			             		           	             		
			             		Centre c = new Centre(num,adresse,ch,capacite);            		
			             		
			             		gouv.ajouter_centre(c);
			             		System.out.println("Le "+c+ConsoleColors.GREEN+" Ajout?e avec succ?es"+ConsoleColors.RESET);                		
			             		      	             		
			             		// Quit Section
        	             		quit(ges,4);
			             		break ;
		            		}
			            	// Supprimer centre
			            	case 2 :
		            		{	
		            				System.out.println (ConsoleColors.GREEN+"donner le num de ref du centre"+ConsoleColors.RESET);
									int num = clavier.nextInt();
									Centre C = gouv.get_centre(num);
									gouv.supprimer_centre(C);
									System.out.println(ConsoleColors.GREEN+"Centre Supprim?e avec succ?e");
		     	             		
				             		// Quit Section
	        	             		quit(ges,4);
							}
	            		}
	            		prog_principale(ges,0);
	             		break ;
	        		}
	        		// Information
	        		case 2 :
	        		{      	
		        			System.out.println(ConsoleColors.GREEN+StringUtils.rightPad("+", 120 - 1, "-") + "+"+ConsoleColors.RESET);
		             		System.out.println(ConsoleColors.GREEN_BOLD+StringUtils.center("********** Liste des Centres du "
		             				+gouv.get_nom() +" **********"+ConsoleColors.RESET, 120 - 2));
		             		System.out.println(ConsoleColors.GREEN+StringUtils.rightPad("+", 120 - 1, "-") + "+"+ConsoleColors.RESET);
		             		
	        				ArrayList <Centre> L=new ArrayList<Centre>() ;
	        				L =gouv.get_list_Centres();
	        				String[][] m = tableConsole.changeformat_centre(L);
	        				tableConsole.tableWithLinesAndMaxWidth(m);
     	             		// Quit Section
        	             	quit(ges,4);
	        		}
	        		// Statistique
	        		case 3 :
	        			{
	        				float pourcentage = ges.pourcentage_contamination_gouv(ch);
		        			System.out.println(ConsoleColors.RED+"le poucentage de contamination est du "+
	        				gouv.get_nom()+" est " + pourcentage + "%"+ConsoleColors.RESET);
     	             		// Quit Section
        	             	quit(ges,4);
		             		break ;
	        			}
	        		}
	            // Quit Section
	            quit(ges,4);
	        	break ;
	        }        		
	        //gestion         	
	        case 5 :
	        {	
	        	String quit;
	        	int p = choix_menu_gestion();
	    		switch (p) {
	    		// Liste des gouvernorats
	    		case 1 :
	    		{
	    			System.out.println(ConsoleColors.GREEN+StringUtils.rightPad("+", 120 - 1, "-") + "+"+ConsoleColors.RESET);
             		System.out.println(ConsoleColors.GREEN_BOLD+StringUtils.center("********** Liste des Gouvernorats **********"+ConsoleColors.RESET, 120 - 2));
             		System.out.println(ConsoleColors.GREEN+StringUtils.rightPad("+", 120 - 1, "-") + "+"+ConsoleColors.RESET);
             		
	    			ArrayList <Gouvernorat> L=new ArrayList<Gouvernorat>() ;
					L =ges.get_list_Gouvernorats();
					String[][] m = tableConsole.changeformat_gouvernorat(L);
					tableConsole.tableWithLinesAndMaxWidth(m);
					// Quit Section
		            quit(ges,5);
					break ;
	    			
	    		}
	    		//Gestion des gouvernorats
	    		case 2:
	    		{
	    			System.out.println(ConsoleColors.BLUE+StringUtils.rightPad("+", 120 - 1, "-") + "+"+ConsoleColors.RESET);
	        		System.out.println(ConsoleColors.BLUE_BOLD+StringUtils.center(StringUtils.center(
	          		  "1- Ajouter gouvernorat   "
	          		+ "2- Suprimer gouvernorat ", 120 - 2), 120, "|")+ConsoleColors.RESET);
	        		System.out.println(ConsoleColors.BLUE+StringUtils.rightPad("+", 120 - 1, "-") + "+"+ConsoleColors.RESET);
	        		int i ;
	        		do {
	        			System.out.println(ConsoleColors.RED_BOLD+"Tapez un num?ro entre 1 et 2");
	        			i = clavier.nextInt();
	        		}while(i<1||i>2);
	        		switch (i) {
	        		// Ajouter gouvernorat
		        		case 1 :
		        		{
		        			if(ges.get_list_Gouvernorats().size()<24) {
			        			System.out.println (ConsoleColors.GREEN+"Donnez le nom du gouvernorat "+ConsoleColors.RESET);
								String nom;
								do {
			             			nom= stringScanner.nextLine();
			             		}while(ges.gouvernorat_existev3(nom));
								Gouvernorat gouv = new Gouvernorat (nom);
								ges.Ajouter_Gouvernorat(gouv);
								System.out.println(ConsoleColors.GREEN+"Gouvernorat "+gouv.get_nom()+" ajout?es avec succ?e"
										+ConsoleColors.RESET);
							}
		        			else {
		        				System.out.println(ConsoleColors.RED+"Vous ne pouvez pas ajout?es d'autre gouvernorat"
		        						+ " il existe d?ja 24 gouvernorats ");
		        			}
		        			// Quit Section
				            quit(ges,5);
							break ;
						}
		        		//Supprimer gouvernorat
		        		case 2 :
		        		{	
		        			System.out.println (ConsoleColors.GREEN+"Donnez le nom du gouvernorat "+ConsoleColors.RESET);
							String nom;
							do {
		             			nom= stringScanner.nextLine();
		             		}while(!ges.gouvernorat_existev2(nom));
							Gouvernorat gouv = ges.find_gouvernorat(nom);
							ges.Supprimer_gouvernorat(gouv);
							System.out.println(ConsoleColors.GREEN+"Gouvernorat "+gouv.get_nom()+" supprim?e avec succ?e "+
							ConsoleColors.RESET);
							// Quit Section
				            quit(ges,5);
							break ;
						}
	        		}
	    		}
	    		// Statistique
	    		case 3: 
	    		{   			   			
	    			int nombre = ges.nbr_personnes_acceillies() ;
	    			float pourcentage = ges.pourcentage_contamination() ;
	    			System.out.println(ConsoleColors.GREEN+"le nomre totale de personnes acceillies est "+ConsoleColors.RESET+ConsoleColors.BLACK_BOLD +nombre+ConsoleColors.RESET); 
	    			System.out.println(ConsoleColors.RED+"le poucentage de contamination est " +ConsoleColors.RESET+ConsoleColors.BLACK_BOLD +  pourcentage + "% "+ConsoleColors.RESET); 
	    			// Quit Section
		            quit(ges,5);
	    			break ;
	    		}
	    		     
	    	}
	    		quit(ges,5);
    			break ;
	    	}
	        
	     }//fin switch
       
	}
	
	
	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in) ; 
		int w = 120;
		int n ;// choix menu
		
		System.out.println(ConsoleColors.BLUE+StringUtils.rightPad("+", w - 1, "-") + "+"+ConsoleColors.RESET);
		System.out.println(ConsoleColors.BLUE_BOLD+StringUtils.center(StringUtils.center("BIENVENUE A NOTRE APPLICATION CONSOLE", w - 2), w, "|")+
				ConsoleColors.RESET);
		System.out.println(ConsoleColors.BLUE+StringUtils.rightPad("+", w - 1, "-") + "+"+ConsoleColors.RESET);
		
		System.out.println(ConsoleColors.BLUE+StringUtils.rightPad("+", w - 1, "-") + "+");
		System.out.println(ConsoleColors.BLUE_BOLD+"                   _____ ______      _______ _____        __  ___     _____           _            \r\n" + 
				"                  / ____/ __ \\ \\    / /_   _|  __ \\      /_ |/ _ \\   / ____|         | |           \r\n" + 
				"                 | |   | |  | \\ \\  / /  | | | |  | |______| | (_) | | |     ___ _ __ | |_ _ __ ___ \r\n" + 
				"                 | |   | |  | |\\ \\/ /   | | | |  | |______| |\\__, | | |    / _ \\ '_ \\| __| '__/ _ \\\r\n" + 
				"                 | |___| |__| | \\  /   _| |_| |__| |      | |  / /  | |___|  __/ | | | |_| | |  __/\r\n" + 
				"                  \\_____\\____/   \\/   |_____|_____/       |_| /_/    \\_____\\___|_| |_|\\__|_|  \\___|"
		+ConsoleColors.RESET);
		System.out.println(ConsoleColors.BLUE+StringUtils.rightPad("+", w - 1, "-") + "+"+ConsoleColors.RESET);
                    
        /*
         * Initialiser la liste des gouvernorat ? partir de fichier initgouv.csv
         */
        Gestion ges = new Gestion(); //C'est notre syst?me 
        ges.init_gouvernorat(); // tous les gouvernorat sont ajout?es au syst?me
        ges.init_centre(); // initialisation des centres
        //init personne
        ges.initpersonne("/files/personneCentre1.csv",123);
        ges.initpersonne("/files/personneCentre3.csv",124);
        //init chambre
        ges.initchambre("/files/chambreCentre1.csv", 123);
        ges.initchambre("/files/chambreCentre2.csv", 125);
        ges.initchambre("/files/chambreCentre3.csv", 124);
        Test.prog_principale(ges,0);
        
	}//fin main
}// fin classe

