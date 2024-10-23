//1. Kreiraj apstraktnu klasu Vozilo
//Klasa Vozilo treba sadržavati sljedeće privatne atribute:
//model: String - model vozila
//godinaProizvodnje: Int - godina proizvodnje vozila
//kilometraza: Int - trenutna kilometraža vozila
//Implementiraj konstruktor koji prima vrijednosti za ova tri atributa.
//Implementiraj getter i setter metode za sve atribute, uz sljedeće uvjete:
//getter metode omogućuju pristup privatnim atributima.
//setter metode trebaju osigurati da godinaProizvodnje nije manja od 2000, a kilometraza ne može biti negativna.
//Kreiraj apstraktnu metodu izračunajTroškoveOdržavanja(), koju će naslijeđene klase morati implementirati.
//2. Kreiraj klasu Automobil koja nasljeđuje klasu Vozilo
//Klasa Automobil treba imati dodatni atribut:
//brojVrata: Int - broj vrata na automobilu.
//Implementiraj konstruktor koji prima vrijednosti za sve atribute klase Vozilo, kao i dodatni atribut brojVrata.
//Implementiraj metodu izračunajTroškoveOdržavanja(), koja računa troškove na osnovu sljedeće formule:
//Osnovni troškovi održavanja automobila su 500 KM.
//Za svaki pređeni kilometar, dodaje se 0.10 KM na osnovne troškove.
//3. Kreiraj klasu Kamion koja nasljeđuje klasu Vozilo
//Klasa Kamion treba imati dodatni atribut:
//nosivost: Double - maksimalna nosivost kamiona u tonama.
//Implementiraj konstruktor koji prima vrijednosti za sve atribute klase Vozilo, kao i dodatni atribut nosivost.
//Implementiraj metodu izračunajTroškoveOdržavanja(), koja računa troškove na osnovu sljedeće formule:
//Osnovni troškovi održavanja kamiona su 1000 KM.
//Za svaki pređeni kilometar, dodaje se 0.20 KM na osnovne troškove.
//Ako je nosivost veća od 5 tona, dodaje se dodatnih 500 KM na troškove.
//4. Kreiraj glavni program
//U glavnom programu kreiraj nekoliko objekata tipa Automobil i Kamion.
//Pokaži kako se koriste getter i setter metode za manipulaciju podacima o vozilima.
//Ispiši izračunate troškove održavanja za svako vozilo koristeći metodu izračunajTroškoveOdržavanja().