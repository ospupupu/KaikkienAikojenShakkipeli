import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
	  //kirjoittamalla tallenna kun ohjelma kysyy AnnaAlkuX voit kirjoittaa tallenna ja peli rulostaa sinulle lukujonon jonka voit kopioida talteen
	  //ensiksi luomme pelialudan johon voimme tallentaa nappuloita
	  //koska lista on yksi uloitteinen sovimme että kymmenet tarkoittavat
	  //x koordinaattia ja ykköset y koordinaattia
	  //eli esim (3, 6) on pelilaudassa indeksin 36 kohdassa
	  //tämä muoto saadaan kertomalla x koordinaatti kymmenllä ja lisäämällä y
	  //tämän tekniikan käyttö tapahtuu tässä luokassa kun siirrämme nappulaa
	  ArrayList<Nappula> pelilauta = new ArrayList<Nappula>();
	  //alustamme pelailaudan 96 nullilla koska 88 antoi poikkeuksen
	  //nullien määrällä ei ole väliä koska Onkosiirtosallittu() metodi
	  //testaa tapahtuuko siirto pelirajojen sisällä
	  String tyhjapai = "-----------";
	  Tyhjanappula tyhja = new Tyhjanappula(0, 0, 0, 1, tyhjapai);
	  for(int i = 0; i<8*12; i++) {
			pelilauta.add(i, tyhja);
		}
	  	// alustetaan string muuttujat joihin nappuloiden nimi-atribuuttia voidaan myöhemmin verrata
	    // Näin selvitetään minkä nappulan Onkosiirtosallittu() metodi suoritetaan
	  // tallenna ja lataa stringit kertovat jos pelaaja haluaa tallentaa tai ladata pelin
	  
	    String tallenna = "tallenna";
	    String lataa = "lataa";
	  
	  
	  	String sotilas = "--Msotilas-";
	  	String hevonen = "--Mhevonen-";
	  	String torni = "---Mtorni--";
	  	String lahetti = "--Mlahetti-";
	  	String kuningas = "-Mkuningas-";
	  	String kuningatar = "Mkuningatar";
	  	
	  	
	  	String Vsotilas = "--Vsotilas-";
	  	String Vhevonen = "--Vhevonen-";
	  	String Vtorni = "---Vtorni--";
	  	String Vlahetti = "--Vlahetti-";
	  	String Vkuningas = "-Vkuningas-";
	  	String Vkuningatar = "Vkuningatar";
		
	  	//seuraavaksi alustetaan nappulat
	  	//ensimmäinen paremetri on x sijainti toinen y kolmas on väri
	  	//neljas on kertoo onko nappula elossa 1 = on
	  	//elossa olisi järkevämpi olla boolean mutta olimme jo alustaneet ne näin
	  	
	  	//nämä t:llä alkavat objektit ovat metodin käyttöö tarkoitettuja jotta oikeiden nappuloiden sijainti ei muuttuisi vääräksi.
	  	
	  	Sotilas TS1 = new Sotilas(0, 0, 0, 1, sotilas);
	  	Hevonen TH1 = new Hevonen(0, 0, 0, 1, hevonen);
	  	Torni TT1 = new Torni(0, 0, 0, 1, torni);
	  	Lahetti TL1 = new Lahetti(0, 0, 0, 1, lahetti);
	  	Kuningas TK = new Kuningas(0, 0, 0, 1, kuningas);
	  	Kuningatar TQ = new Kuningatar(11, 11, 0, 1, kuningatar);
	  	
	    Sotilas MS1 = new Sotilas(1, 2, 0, 1, sotilas);
		Sotilas MS2 = new Sotilas(2, 2, 0, 1, sotilas);
		Sotilas MS3 = new Sotilas(3, 2, 0, 1, sotilas);
		Sotilas MS4 = new Sotilas(4, 2, 0, 1, sotilas);
		Sotilas MS5 = new Sotilas(5, 2, 0, 1, sotilas);
		Sotilas MS6 = new Sotilas(6, 2, 0, 1, sotilas);
		Sotilas MS7 = new Sotilas(7, 2, 0, 1, sotilas);
		Sotilas MS8 = new Sotilas(8, 2, 0, 1, sotilas);
		
		
		Torni MT1 = new Torni(1, 1, 0, 1, torni);
		Torni MT2 = new Torni(8, 1, 0, 1, torni);
		
		Hevonen MH1 = new Hevonen(2, 1, 0, 1, hevonen);
		Hevonen MH2 = new Hevonen(7, 1, 0, 1, hevonen);
		
		Lahetti ML1 = new Lahetti(3, 1, 0, 1, lahetti);
		Lahetti ML2 = new Lahetti(6, 1, 0, 1, lahetti);
		
		Kuningas MK = new Kuningas(4, 1, 0, 1, kuningas);
		
		Kuningatar MQ = new Kuningatar(5, 1, 0, 1, kuningatar);
		
		//Sitten alustetaan valkoiset nappulaoliot
		
		Sotilas VS1 = new Sotilas(1, 7, 1, 1, Vsotilas);
		Sotilas VS2 = new Sotilas(2, 7, 1, 1, Vsotilas);
		Sotilas VS3 = new Sotilas(3, 7, 1, 1, Vsotilas);
		Sotilas VS4 = new Sotilas(4, 7, 1, 1, Vsotilas);
		Sotilas VS5 = new Sotilas(5, 7, 1, 1, Vsotilas);
		Sotilas VS6 = new Sotilas(6, 7, 1, 1, Vsotilas);
		Sotilas VS7 = new Sotilas(7, 7, 1, 1, Vsotilas);
		Sotilas VS8 = new Sotilas(8, 7, 1, 1, Vsotilas);
		
		Hevonen VH1 = new Hevonen(2, 8, 1, 1, Vhevonen);
		Hevonen VH2 = new Hevonen(7, 8, 1, 1, Vhevonen);
		
		Lahetti VL1 = new Lahetti(3, 8, 1, 1, Vlahetti);
		Lahetti VL2 = new Lahetti(6, 8, 1, 1, Vlahetti);
		
		Torni VT1 = new Torni(1, 8, 1, 1, Vtorni);
		Torni VT2 = new Torni(8, 8, 1, 1, Vtorni);
		
		Kuningas VK = new Kuningas(5, 8, 1, 1, Vkuningas);
		
		Kuningatar VQ = new Kuningatar(4, 8, 1, 1, Vkuningatar);
		
		//asetetaan nappulat pelilaudalle

		


        


		
		
		pelilauta.set(12, MS1);
		pelilauta.set(22, MS2);
		pelilauta.set(32, MS3);
		pelilauta.set(42, MS4);
		pelilauta.set(52, MS5);
		pelilauta.set(62, MS6);
		pelilauta.set(72, MS7);
		pelilauta.set(82, MS8);
		
		pelilauta.set(21, MH1);
		pelilauta.set(71, MH2);
		
		pelilauta.set(11, MT1);
		pelilauta.set(81, MT2);

		pelilauta.set(31, ML1);
		pelilauta.set(61, ML2);
		
		pelilauta.set(41, MK);
		
		pelilauta.set(51, MQ);

		
		
		pelilauta.set(17, VS1);
		pelilauta.set(27, VS2);
		pelilauta.set(37, VS3);
		pelilauta.set(47, VS4);
		pelilauta.set(57, VS5);
		pelilauta.set(67, VS6);
		pelilauta.set(77, VS7);
		pelilauta.set(87, VS8);
		
		pelilauta.set(28, VH1);
		pelilauta.set(78, VH2);
		
		pelilauta.set(38, VL1);
		pelilauta.set(68, VL2);
		
		pelilauta.set(18, VT1);
		pelilauta.set(88, VT2);
		
		pelilauta.set(58, VK);
		
		pelilauta.set(48, VQ);
		
		

		
	  for (int i = 0; i < 88888; i++) {
		//ensin piiretaan pelilauta
		  System.out.println(pelilauta);
		  System.out.println("__________________________________________________________________________________________________");
			System.out.println("|"+ pelilauta.get(18).annaNappula() + "|" + pelilauta.get(28).annaNappula() + "|" + pelilauta.get(38).annaNappula() + "|" + pelilauta.get(48).annaNappula() + "|" + pelilauta.get(58).annaNappula() +"|" + pelilauta.get(68).annaNappula() + "|" + pelilauta.get(78).annaNappula() + "|" + pelilauta.get(88).annaNappula() + "|");
			System.out.println("|"+ pelilauta.get(17).annaNappula() + "|" + pelilauta.get(27).annaNappula() + "|" + pelilauta.get(37).annaNappula() + "|" + pelilauta.get(47).annaNappula() + "|" + pelilauta.get(57).annaNappula() +"|" + pelilauta.get(67).annaNappula() + "|" + pelilauta.get(77).annaNappula() + "|" + pelilauta.get(87).annaNappula() + "|");
			System.out.println("|"+ pelilauta.get(16).annaNappula() + "|" + pelilauta.get(26).annaNappula() + "|" + pelilauta.get(36).annaNappula() + "|" + pelilauta.get(46).annaNappula() + "|" + pelilauta.get(56).annaNappula() +"|" + pelilauta.get(66).annaNappula() + "|" + pelilauta.get(76).annaNappula() + "|" + pelilauta.get(86).annaNappula() + "|");
			System.out.println("|"+ pelilauta.get(15).annaNappula() + "|" + pelilauta.get(25).annaNappula() + "|" + pelilauta.get(35).annaNappula() + "|" + pelilauta.get(45).annaNappula() + "|" + pelilauta.get(55).annaNappula() +"|" + pelilauta.get(65).annaNappula() + "|" + pelilauta.get(75).annaNappula() + "|" + pelilauta.get(85).annaNappula() + "|");
			System.out.println("|"+ pelilauta.get(14).annaNappula() + "|" + pelilauta.get(24).annaNappula() + "|" + pelilauta.get(34).annaNappula() + "|" + pelilauta.get(44).annaNappula() + "|" + pelilauta.get(54).annaNappula() +"|" + pelilauta.get(64).annaNappula() + "|" + pelilauta.get(74).annaNappula() + "|" + pelilauta.get(84).annaNappula() + "|");
			System.out.println("|"+ pelilauta.get(13).annaNappula() + "|" + pelilauta.get(23).annaNappula() + "|" + pelilauta.get(33).annaNappula() + "|" + pelilauta.get(43).annaNappula() + "|" + pelilauta.get(53).annaNappula() +"|" + pelilauta.get(63).annaNappula() + "|" + pelilauta.get(73).annaNappula() + "|" + pelilauta.get(83).annaNappula() + "|");
			System.out.println("|"+ pelilauta.get(12).annaNappula() + "|" + pelilauta.get(22).annaNappula() + "|" + pelilauta.get(32).annaNappula() + "|" + pelilauta.get(42).annaNappula() + "|" + pelilauta.get(52).annaNappula() +"|" + pelilauta.get(62).annaNappula() + "|" + pelilauta.get(72).annaNappula() + "|" + pelilauta.get(82).annaNappula() + "|");
			System.out.println("|"+ pelilauta.get(11).annaNappula() + "|" + pelilauta.get(21).annaNappula() + "|" + pelilauta.get(31).annaNappula() + "|" + pelilauta.get(41).annaNappula() + "|" + pelilauta.get(51).annaNappula() +"|" + pelilauta.get(61).annaNappula() + "|" + pelilauta.get(71).annaNappula() + "|" + pelilauta.get(81).annaNappula() + "|");
			System.out.println("________________________________________________________________________________________________");
		//kysytään lähtö x-koordinaattia
		Scanner input = new Scanner (System.in);
	    System.out.print("Anna Alku x: ");
	    String AlkuX = input.next();
	   //jos pelaaja haluaa tallentaa hän kirjoittaa tallenna ja siirrytään tallennukseen
	    if (AlkuX.contentEquals(tallenna)) {
	    	System.out.println("Ota seuraava lista talteen: ");
	    	System.out.println("0"+","+MS1.annaSijaintiX()+","+MS1.annaSijaintiY()+","+MS2.annaSijaintiX()+","+MS2.annaSijaintiY()+","+MS3.annaSijaintiX()+","+MS3.annaSijaintiY()+","+MS4.annaSijaintiX()+","+MS4.annaSijaintiY()+","+MS5.annaSijaintiX()+","+MS5.annaSijaintiY()+","+MS6.annaSijaintiX()+","+MS6.annaSijaintiY()+","+MS7.annaSijaintiX()+","+MS7.annaSijaintiY()+","+MS8.annaSijaintiX()+","+MS8.annaSijaintiY()+","+VS1.annaSijaintiX()+","+VS1.annaSijaintiY()+","+VS2.annaSijaintiX()+","+VS2.annaSijaintiY()+","+VS3.annaSijaintiX()+","+VS3.annaSijaintiY()+","+VS4.annaSijaintiX()+","+VS4.annaSijaintiY()+","+VS5.annaSijaintiX()+","+VS5.annaSijaintiY()+","+VS6.annaSijaintiX()+","+VS6.annaSijaintiY()+","+VS7.annaSijaintiX()+","+VS7.annaSijaintiY()+","+VS8.annaSijaintiX()+","+VS8.annaSijaintiY()+","+MT1.annaSijaintiX()+","+MT1.annaSijaintiY()+","+MT2.annaSijaintiX()+","+MT2.annaSijaintiY()+","+VT1.annaSijaintiX()+","+VT1.annaSijaintiY()+","+VT2.annaSijaintiX()+","+VT2.annaSijaintiY()+","+MH1.annaSijaintiX()+","+MH1.annaSijaintiY()+","+MH2.annaSijaintiX()+","+MH2.annaSijaintiY()+","+VH1.annaSijaintiX()+","+VH1.annaSijaintiY()+","+VH2.annaSijaintiX()+","+VH2.annaSijaintiY()+","+ML1.annaSijaintiX()+","+ML1.annaSijaintiY()+","+ML2.annaSijaintiX()+","+ML2.annaSijaintiY()+","+VL1.annaSijaintiX()+","+VL1.annaSijaintiY()+","+VL2.annaSijaintiX()+","+VL2.annaSijaintiY()+","+MK.annaSijaintiX()+","+MK.annaSijaintiY()+","+VK.annaSijaintiX()+","+VK.annaSijaintiY()+","+MQ.annaSijaintiX()+","+MQ.annaSijaintiY()+","+VQ.annaSijaintiX()+","+VQ.annaSijaintiY());
	    	//tallennus toimii sillä periaatteella että ohjelma tulostaa listan kaiskista sijainneista ja käyttäjä kopioi tämän kuten yllä näkyy
			
			continue;
	    }
	    //jos pelaaja haluaa ladata siirrytään seuraavaan osioon
	    if (AlkuX.contentEquals(lataa)) {
	    	
	    	 System.out.print("Anna ladattava peli: ");
	 	       String Ladattavatiedosto = input.next();

	 	       
	 	       String line = Ladattavatiedosto;
	 	       
	 	       String numbersLine = line.replaceAll("[^0-9]+", " ");
	 	        

	 	        String[] strArray = numbersLine.split(" ");

	 	        List<Integer> intArrayList = new ArrayList<>();

	 	        for (String string : strArray) {
	 	            if (!string.equals("")) {
	 	                System.out.println(string);
	 	                intArrayList.add(Integer.parseInt(string));
	 	            }
	 	        }
	 	        
	 	        //String muutetaan integeriksi ja tallenetaan samassa jonossa taulkkoon josta luvut poimitaan ja aseteaan koordinaatit oikeille nappuloille
	 	        
	 	        for(int r = 0; i<8*12; i++) {
	 				pelilauta.add(r, tyhja);
	 				}
	 	        	MS1.asetaSijainti(intArrayList.get(1), intArrayList.get(2));
	 	        	MS2.asetaSijainti(intArrayList.get(3), intArrayList.get(4));
	 	        	MS3.asetaSijainti(intArrayList.get(5), intArrayList.get(6));
	 	        	MS4.asetaSijainti(intArrayList.get(7), intArrayList.get(8));
	 	        	MS5.asetaSijainti(intArrayList.get(9), intArrayList.get(10));
	 	        	MS6.asetaSijainti(intArrayList.get(11), intArrayList.get(12));
	 	        	MS7.asetaSijainti(intArrayList.get(13), intArrayList.get(14));
	 	        	MS8.asetaSijainti(intArrayList.get(15), intArrayList.get(16));
	 	        	
	 	        	VS1.asetaSijainti(intArrayList.get(17), intArrayList.get(18));
	 	        	VS2.asetaSijainti(intArrayList.get(19), intArrayList.get(20));
	 	        	VS3.asetaSijainti(intArrayList.get(21), intArrayList.get(22));
	 	        	VS4.asetaSijainti(intArrayList.get(23), intArrayList.get(24));
	 	        	VS5.asetaSijainti(intArrayList.get(25), intArrayList.get(26));
	 	        	VS6.asetaSijainti(intArrayList.get(27), intArrayList.get(28));
	 	        	VS7.asetaSijainti(intArrayList.get(29), intArrayList.get(30));
	 	        	VS8.asetaSijainti(intArrayList.get(31), intArrayList.get(32));
	 	        	
	 	        	MT1.asetaSijainti(intArrayList.get(33), intArrayList.get(34));
	 	        	MT2.asetaSijainti(intArrayList.get(35), intArrayList.get(36));
	 	        	VT1.asetaSijainti(intArrayList.get(37), intArrayList.get(38));
	 	        	VT2.asetaSijainti(intArrayList.get(39), intArrayList.get(40));
	 	        	
	 	        	MH1.asetaSijainti(intArrayList.get(41), intArrayList.get(42));
	 	        	MH2.asetaSijainti(intArrayList.get(43), intArrayList.get(44));
	 	        	VH1.asetaSijainti(intArrayList.get(45), intArrayList.get(46));
	 	        	VH2.asetaSijainti(intArrayList.get(47), intArrayList.get(48));
	 	        	
	 	        	ML1.asetaSijainti(intArrayList.get(49), intArrayList.get(50));
	 	        	ML2.asetaSijainti(intArrayList.get(51), intArrayList.get(52));
	 	        	VL1.asetaSijainti(intArrayList.get(53), intArrayList.get(54));
	 	        	VL2.asetaSijainti(intArrayList.get(55), intArrayList.get(56));
	 	        	
		        	MK.asetaSijainti(intArrayList.get(57), intArrayList.get(58));
	 	        	VK.asetaSijainti(intArrayList.get(59), intArrayList.get(60));
	 	        	MQ.asetaSijainti(intArrayList.get(61), intArrayList.get(62));
	 	        	VQ.asetaSijainti(intArrayList.get(63), intArrayList.get(64));
	 	        	
	 	        	//sitten nappulat täytyy vielä asettaa pelilaudalle
	 	        	
	 	        	
	 	        	
	 	        	pelilauta.set(MS1.annaSijaintiX() * 10 + MS1.annaSijaintiY(), MS1);
	 	        	pelilauta.set(MS2.annaSijaintiX() * 10 + MS2.annaSijaintiY(), MS2);
	 	        	pelilauta.set(MS3.annaSijaintiX() * 10 + MS3.annaSijaintiY(), MS3);
	 	        	pelilauta.set(MS4.annaSijaintiX() * 10 + MS4.annaSijaintiY(), MS4);
	 	        	pelilauta.set(MS5.annaSijaintiX() * 10 + MS5.annaSijaintiY(), MS5);
	 	        	pelilauta.set(MS6.annaSijaintiX() * 10 + MS6.annaSijaintiY(), MS6);
	 	        	pelilauta.set(MS7.annaSijaintiX() * 10 + MS7.annaSijaintiY(), MS7);
	 	        	pelilauta.set(MS8.annaSijaintiX() * 10 + MS8.annaSijaintiY(), MS8);
	 	       	
	 	        	pelilauta.set(VS1.annaSijaintiX() * 10 + VS1.annaSijaintiY(), VS1);
	 	        	pelilauta.set(VS2.annaSijaintiX() * 10 + VS2.annaSijaintiY(), VS2);
	 	        	pelilauta.set(VS3.annaSijaintiX() * 10 + VS3.annaSijaintiY(), VS3);
	 	        	pelilauta.set(VS4.annaSijaintiX() * 10 + VS4.annaSijaintiY(), VS4);
	 	        	pelilauta.set(VS5.annaSijaintiX() * 10 + VS5.annaSijaintiY(), VS5);
	 	        	pelilauta.set(VS6.annaSijaintiX() * 10 + VS6.annaSijaintiY(), VS6);
	 	        	pelilauta.set(VS7.annaSijaintiX() * 10 + VS7.annaSijaintiY(), VS7);
	 	        	pelilauta.set(VS8.annaSijaintiX() * 10 + VS8.annaSijaintiY(), VS8);
	 	        	
	 	        	pelilauta.set(MT1.annaSijaintiX() * 10 + MT1.annaSijaintiY(), MT1);
	 	        	pelilauta.set(MT2.annaSijaintiX() * 10 + MT2.annaSijaintiY(), MT2);
	 	        	pelilauta.set(VT1.annaSijaintiX() * 10 + VT1.annaSijaintiY(), VT1);
	 	        	pelilauta.set(VT2.annaSijaintiX() * 10 + VT2.annaSijaintiY(), VT2);
	 	        	
	 	        	pelilauta.set(MH1.annaSijaintiX() * 10 + MH1.annaSijaintiY(), MH1);
	 	        	pelilauta.set(MH2.annaSijaintiX() * 10 + MH2.annaSijaintiY(), MH2);
	 	        	pelilauta.set(VH1.annaSijaintiX() * 10 + VH1.annaSijaintiY(), VH1);
	 	        	pelilauta.set(VH2.annaSijaintiX() * 10 + VH2.annaSijaintiY(), VH2);
	 	        	
	 	        	pelilauta.set(ML1.annaSijaintiX() * 10 + ML1.annaSijaintiY(), ML1);
	 	        	pelilauta.set(ML2.annaSijaintiX() * 10 + ML2.annaSijaintiY(), ML2);
	 	        	pelilauta.set(VL1.annaSijaintiX() * 10 + VL1.annaSijaintiY(), VL1);
	 	        	pelilauta.set(VL2.annaSijaintiX() * 10 + VL2.annaSijaintiY(), VL2);
	 	        	
	 	        	pelilauta.set(MK.annaSijaintiX() * 10 + MK.annaSijaintiY(), MK);
	 	        	pelilauta.set(MQ.annaSijaintiX() * 10 + MQ.annaSijaintiY(), MQ);
	 	        	pelilauta.set(VK.annaSijaintiX() * 10 + VK.annaSijaintiY(), VK);
	 	        	pelilauta.set(VQ.annaSijaintiX() * 10 + VQ.annaSijaintiY(), VQ);

	 	       

	 	        continue;
	 	        
	 	        
	 	        
	    }
	    System.out.print("Anna Alku y: ");
	    String AlkuY = input.next();
	    System.out.print("Minne siirretaan x koordinaatti? ");
	    String sijaintix = input.next();
	    System.out.print("Minne siirretaan y koordinaatti? ");
	    String sijaintiy = input.next();
	    
	    Integer intAlkux = Integer.valueOf(AlkuX);
	    Integer intAlkuy = Integer.valueOf(AlkuY);
	    
	    Integer intsijaintix = Integer.valueOf(sijaintix);
	    Integer intsijaintiy = Integer.valueOf(sijaintiy);
	    

	    
	    
	    
	    
	    
	    
	    
	    // ensiksi kysytaan onko kyseisesa paikassa nappulaa
	    // jos nappulaa ei ole metodit heittäisivät poikkeuksen
	    //sitten kokeillaan onko elossa
	    // seuraavaksi selvitetään mikä nappula on kyseessä
	    // riippuen mikä nappula olikyseessä suoritaan metodi käyttämällä 
	    // oikeaa testinappulaa
	    // jos siirto toteutti kaikki vaiheet asetetaan uusi sijainti
	    // asetetaan nappulan elossa tila kuolleeksi joka sijaitsi kohadass minkä päälle uusi nappula asetettiin
	    //kuten näkyy kerromme x koordinaatin 10 ja lisäämme y jotta voimme käyttää yksiuloitteista listaa
	    if (pelilauta.get(intAlkux*10 + intAlkuy) != tyhja) {
	    	Nappula siirrettava = pelilauta.get(intAlkux*10 + intAlkuy);
	    	String nimi = siirrettava.annaNappula();
		    	int testisijaintix = pelilauta.get(intAlkux*10 + intAlkuy).annaSijaintiX();
		    	int testisijaintiy = pelilauta.get(intAlkux*10 + intAlkuy).annaSijaintiY();
		    	TS1.asetaSijainti(testisijaintix, testisijaintiy);
		    	TT1.asetaSijainti(testisijaintix, testisijaintiy);
		    	TH1.asetaSijainti(testisijaintix, testisijaintiy);
		    	TL1.asetaSijainti(testisijaintix, testisijaintiy);
		    	TK.asetaSijainti(testisijaintix, testisijaintiy);
		    	TQ.asetaSijainti(testisijaintix, testisijaintiy);
			    if (nimi == sotilas || nimi == Vsotilas) {
			    	System.out.println(testisijaintix);
			    	System.out.println(testisijaintiy);
			    	System.out.println(TS1.annaSijaintiX());
			    	System.out.println(TS1.annaSijaintiY());
			    	System.out.println(intsijaintix);
			    	System.out.println(intsijaintiy);
			    	if (TS1.Onkosiirtosallittu(intsijaintix, intsijaintiy)){
			    		pelilauta.get(intsijaintix * 10 + intsijaintiy).asetaSijainti(9, 9);
			    		pelilauta.set(intsijaintix * 10 + intsijaintiy, pelilauta.get(intAlkux*10 + intAlkuy));
			    		siirrettava.asetaSijainti(intsijaintix, intsijaintiy);
			    		pelilauta.set(intAlkux*10 + intAlkuy, tyhja);
			    		
	
			    		
			    	}
			   }
			    else {
			    	if (nimi == torni || nimi == Vtorni) {
			    		if (TT1.Onkosiirtosallittu(intsijaintix, intsijaintiy)){
			    			pelilauta.get(intsijaintix * 10 + intsijaintiy).asetaSijainti(9, 9);
			    			pelilauta.set(intsijaintix * 10 + intsijaintiy, pelilauta.get(intAlkux*10 + intAlkuy));
				    		siirrettava.asetaSijainti(intsijaintix, intsijaintiy);
				    		pelilauta.set(intAlkux*10 + intAlkuy, tyhja);
				    			
		
			    		}
			    	}
			    	else {
				    	if (nimi == lahetti || nimi == Vlahetti) {
				    		if (TL1.Onkosiirtosallittu(intsijaintix, intsijaintiy)){
				    			pelilauta.get(intsijaintix * 10 + intsijaintiy).asetaSijainti(9, 9);
				    			pelilauta.set(intsijaintix * 10 + intsijaintiy, pelilauta.get(intAlkux*10 + intAlkuy));
					    		siirrettava.asetaSijainti(intsijaintix, intsijaintiy);
					    		pelilauta.set(intAlkux*10 + intAlkuy, tyhja);
			
				    		}
				    	}
				    	else {
					    	if (nimi == hevonen || nimi == Vhevonen) {
					    		if (TH1.Onkosiirtosallittu(intsijaintix, intsijaintiy)){
					    			pelilauta.get(intsijaintix * 10 + intsijaintiy).asetaSijainti(9, 9);
					    			pelilauta.set(intsijaintix * 10 + intsijaintiy, pelilauta.get(intAlkux*10 + intAlkuy));
						    		siirrettava.asetaSijainti(intsijaintix, intsijaintiy);
						    		pelilauta.set(intAlkux*10 + intAlkuy, tyhja);
		
					    		}
					    	}
					    	else {
						    	if (nimi == kuningas || nimi == Vkuningas) {
						    		if (TK.Onkosiirtosallittu(intsijaintix, intsijaintiy)){
						    			pelilauta.get(intsijaintix * 10 + intsijaintiy).asetaSijainti(9, 9);
						    			pelilauta.set(intsijaintix * 10 + intsijaintiy, pelilauta.get(intAlkux*10 + intAlkuy));
							    		siirrettava.asetaSijainti(intsijaintix, intsijaintiy);
							    		pelilauta.set(intAlkux*10 + intAlkuy, tyhja);

						    		}
						    	}
						    	else {
							    	if (nimi == kuningatar || nimi == Vkuningatar) {
							    		if (TQ.Onkosiirtosallittu(intsijaintix, intsijaintiy)){
							    			pelilauta.get(intsijaintix * 10 + intsijaintiy).asetaSijainti(9, 9);
							    			pelilauta.set(intsijaintix * 10 + intsijaintiy, pelilauta.get(intAlkux*10 + intAlkuy));
								    		siirrettava.asetaSijainti(intsijaintix, intsijaintiy);
								    		pelilauta.set(intAlkux*10 + intAlkuy, tyhja);

							    		}
							    	}
						    	}
					    	}
				    	}
			    	}
			    }
	     }
	    
	 //ei kuulu if 
	 }
  }
}
	    

		   
