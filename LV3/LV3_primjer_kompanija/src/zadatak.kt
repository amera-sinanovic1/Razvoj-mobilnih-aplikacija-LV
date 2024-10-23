//Zadatak: Upravljanje zaposlenicima u kompaniji
//Zadano je da radimo aplikaciju za upravljanje zaposlenicima u jednoj kompaniji. Potrebno je kreirati sistem koji omogućava upravljanje različitim vrstama zaposlenika, kao i obračun njihovih plata.
//
//1. Kreiraj apstraktnu klasu Zaposlenik
//Klasa Zaposlenik treba sadržavati sljedeće privatne atribute:
//ime: String - ime zaposlenika
//prezime: String - prezime zaposlenika
//godineIskustva: Int - broj godina radnog iskustva zaposlenika
//Implementiraj konstruktor koji prima vrijednosti za ova tri atributa.
//Implementiraj getter i setter metode za sva tri atributa, uz sljedeće uvjete:
//getter metode trebaju omogućiti pristup privatnim atributima.
//setter metode trebaju ograničiti broj godina iskustva tako da ne može biti manji od 0.
//Kreiraj apstraktnu metodu izračunajPlatu(), koju će naslijeđene klase morati implementirati.
//2. Kreiraj klasu Programer koja nasljeđuje klasu Zaposlenik
//Klasa Programer treba imati dodatni atribut:
//brojProjekata: Int - broj projekata na kojima je programer radio
//Implementiraj konstruktor koji prima vrijednosti za sve atribute klase Zaposlenik kao i dodatni atribut brojProjekata.
//Implementiraj metodu izračunajPlatu(), koja računa platu na osnovu sljedeće formule:
//Osnovna plata programera je 1000 KM.
//Svaki projekat donosi dodatnih 200 KM.
//Svaka godina iskustva donosi dodatnih 100 KM.
//3. Kreiraj klasu Menadžer koja nasljeđuje klasu Zaposlenik
//Klasa Menadžer treba imati dodatni atribut:
//brojTimova: Int - broj timova koje menadžer vodi
//Implementiraj konstruktor koji prima vrijednosti za sve atribute klase Zaposlenik kao i dodatni atribut brojTimova.
//Implementiraj metodu izračunajPlatu(), koja računa platu na osnovu sljedeće formule:
//Osnovna plata menadžera je 1500 KM.
//Svaki tim donosi dodatnih 500 KM.
//Svaka godina iskustva donosi dodatnih 100 KM.
//4. Kreiraj glavni program
//U glavnom programu kreiraj nekoliko objekata tipa Programer i Menadžer.
//Pokaži kako se koriste getter i setter metode za manipulaciju podacima zaposlenika.
//Ispiši izračunate plate za svakog zaposlenika koristeći metodu izračunajPlatu().