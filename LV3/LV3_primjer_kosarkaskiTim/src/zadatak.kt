//Vi ste menadžer košarkaškog tima. Za nadolazeći turnir želite odabrati tim s najvećim ukupnim rezultatom. Rezultat tima je zbir rezultata svih igrača u timu.
//
//Međutim, košarkaški tim ne smije imati sukobe. Sukob postoji ako mlađi igrač ima strogo veći rezultat od starijeg igrača. Sukob se ne dešava između igrača iste dobi.
//
//Date su dvije liste, scores i ages, gdje svaka scores[i] i ages[i] predstavlja rezultat i dob i-tog igrača. Vratite najveći ukupni rezultat od svih mogućih košarkaških timova.
//
//Primjeri
//Primjer 1:
//
//Ulaz: scores = [1,3,5,10,15], ages = [1,2,3,4,5]
//Izlaz: 34
//Objašnjenje: Možete izabrati sve igrače.
//
//Primjer 2:
//
//Ulaz: scores = [4,5,6,5], ages = [2,1,2,1]
//Izlaz: 16
//Objašnjenje: Najbolje je izabrati zadnja 3 igrača. Napominjemo da možete izabrati više igrača iste dobi.
//
//Primjer 3:
//
//Ulaz: scores = [1,2,3,5], ages = [8,9,10,1]
//Izlaz: 6
//Objašnjenje: Najbolje je izabrati prva 3 igrača.
//
//Ograničenja:
//1 <= scores.length, ages.length <= 1000
//scores.length == ages.length
//1 <= scores[i] <= 10^6
//1 <= ages[i] <= 1000