//Zadatak: Battleship (Brodovi)
//Igra se igra na ploči dimenzija 5x5. Redovi na mreži su označeni velikim slovima od A do E (od vrha prema dnu), a kolone brojevima od 1 do 5 (s lijeva na desno).
//
//Pravila igre:
//Postoje dvije vrste brodova: Patrolni brod i Krstarica. Patrolni brod zauzima jednu ćeliju, dok Krstarica zauzima dvije ćelije, horizontalno ili vertikalno.
//Tri patrolna broda i tri krstarice će biti postavljeni nasumično na mreži, bez da brodovi budu susjedni u redovima ili kolonama (više detalja u napomenama ispod).
//Igrač pogađa šest različitih ćelija, pokušavajući pogoditi da li se u njima nalazi Patrolni brod ili Krstarica.
//Pogoci i promašaji se bilježe na ploči. Za svaki pogođeni patrolni brod ili krstaricu osvaja se poen, a ako je krstarica potopljena, osvajaju se dodatna dva poena.
//Klasa "Battleship"
//Svaka instanca testa će biti kreirana sa dva parametra, tako da se konstruktor mora inicijalizirati sa:
//
//scheme - niz koji sadrži 9 stringova koji označavaju gdje su brodovi postavljeni na ploči.
//target - niz koji sadrži 6 stringova koji predstavljaju pokušaje igrača da pogodi brodove.
//Šta je potrebno implementirati?
//Testovi će provjeravati ispravnost podataka kroz instancu klase Battleship i pozivaće njene četiri različite metode:
//
//board() - vraća konačno stanje ploče, na osnovu postavke brodova i rezultata korisničkih pokušaja, kao matricu dimenzija 5x5. Sljedeći set simbola će predstavljati grafički prikaz igre:
//
//○ = prazna ćelija na ploči.
//● = ćelija koju zauzima brod.
//☼ = promašaj (pogrešan pokušaj).
//☀ = pogodak (ispravan pokušaj).
//hits() - vraća ukupan broj pogodaka koje je igrač ostvario (tačnih pokušaja), bilo da se radi o patrolnim brodovima ili krstaricama.
//
//sunk() - vraća ukupan broj potopljenih krstarica (dvije susjedne pogođene ćelije, horizontalno ili vertikalno).
//
//points() - vraća ukupan broj osvojenih poena od strane korisnika (1 poen za svaki pogodak, 2 dodatna poena za svaku potopljenu krstaricu).
//
//Primjeri:
//kotlin
//Copy code
//// scheme = ["A1", "C1", "B2", "B3", "D2", "E2", "E4", "E5", "A5"]
//// target = ["A1", "B2", "C3", "D4", "E5", "E4"]
//
//battleship.board() ➞ [
//[☀, ○, ○, ○, ●],
//[○, ☀, ●, ○, ○],
//[●, ○, ☼, ○, ○],
//[○, ●, ○, ☼, ○],
//[○, ●, ○, ☀, ☀]
//]
//
//battleship.hits() ➞ 4
//// Ukupni broj pogodaka.
//
//battleship.sunk() ➞ 1
//// Potopljene krstarice, ne patrolni brodovi.
//
//battleship.points() ➞ 6
//// Pogoci + dodatni poeni za potopljene krstarice.
//Napomene:
//Ako se dvije krstarice nalaze u istom redu ili istoj koloni, između njih će biti prazna ćelija, kako bi se moglo razlikovati da su u pitanju različiti brodovi.
//Ploča nije unaprijed data, već je potrebno da je sami kreirate.