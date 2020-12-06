Rendszerterv
============

## A rendszer célja

Napjainkban rengeteg játékot megtalálhatunk az interneten, vagy vásárolhatunk amilyet szeretnénk, viszont van, hogy előfordul hogy a játékrengetegben pont azt az egyet nem találjuk amelyiket szeretnénk.A következő rendszert azért hozzuk létre mert egy üzletember felkérte a csapatot, hogy készítsünk egy olyan játékot amellyel gyerekkorában játszott. A rendszer célja egy olyan élmény nyújtása, amellyel felidézhető a retró lövöldözős játékok hangulata, egyszerű fegyverhasználattal és szabályrendszerrel.
Tehát a cél egy nosztalgiázni vágyó számára fejlesztett lövöldözős játék.

## Projekt terv

A következő tervben a dátumok és a fejlesztők felsorolása történik. Fontos még,hogy az erőforrás amikkel dolgozunk az mindenkinek a saját gépe lesz.

### Fejlesztők:
+ Szuhai Dávid
+ Nagy Viktor
+ Boros Gergely
+ Ranyhóczki Mariann

### Mérföldkövek:
+ A Githubon a projekt repository elkészítése
+ A követelmény specifikáció megírása
+ A funkcionális specifikáció megírása
+ A rendszerterv megírása
+ Az adatok kigyűjtése
+ Fejlesztés megkezdése
+ Fejlesztés, megbeszélések
+ Demó bemutatása
+ További fejlesztés
+ Tesztelés
+ Bemutatás

## Üzleti folyamatok

### Üzleti szereplők
+ A játék használója elsősorban az a személy lesz aki felkérte a csapatot az elkészítésre.
+ A programot valószínűleg a készíttető fiatalabb rokonai is használni fogják majd 
+ Tehát a felhasználók között megtalálható fiatalabb és idősebb személy is.

### Üzleti folyamatok

+ A folyamat, a használat nagyon egyszerű
+ A program feltelepítése után indítható is a játék.
+ Egy ablakban látjuk a használható gombokat, egy Exitet mely bezárja a programot, egy Mute gombot, amellyel a háttérzenét némíthatjuk le valamit itt tudjuk kiválasztani milyen pályán szeretnénk játszani.
+ 2 pályából választhatunk.
+ A feladatunk a pályán megjelenő alakok eltalálása.
+ A test eltalálása esetén 1 , fej eltalálása esetén 2 pontot kapunk.
+ A játék 100 pont eléréséig tart.
+ A játék végén a program idő szerint sorolja a játékosokat.
+ Neveket megadva minket is elment a Highscore táblába.
+ A Highscore táblán a 10 legjobb eredmény jelenik meg.
+ A végén lehetőségünk van kilépni vagy új játékot kezdeni.

Absztrakt domain modell
-----------------------

A rendszerünk egy gépből áll, mivel a szoftver csak a adott gépen fut, nem használ semmiféle 
hálózati kapcsolatot, nem kommunikál semmiféle módon bármilyen szerverrel.

Architektúrális terv
--------------------

A program helyileg fut, egyszerre egy felhasználó tudja használni. Ha a program váratlan módon
leáll, az akkori játékmenet adatai elvesznek de a korábbi eredmények megmaradnak.

Adatbázis terv
--------------

Az adatok (eredmények) eltárolása, mivel arányaiban nem kell nagy mennyiségű adatot eltárolni,
így szimplán szöveges dokumnetumok segítségével történik. Belélyük kerül a mentés, ott végződik
ez a sorbarendezés, és onnan is kerül beolvasásra az eredmény.

Minden sor egy-egy játékmenetet reprezentál, vagyis ha a felhasználó eléri a célt az általa
elért eredmény tárolásra kerül. Ha nem ér el eredményt, nem fejeződik be a játék nem kerül adat
eltárolásra. 

A futási eredményk aztán sorbarendezésre kerülnek, és a highscore részben azonból a legjobbakat 
tekinthetjük meg.

Követelmények
---------------------
+ A rendszer window 10 rendszeren fusson
+ A rendszer könnyen kezelhető legyen, elég legyen az egérrel vezérelni.
+ A játékban miközben éppen lőjük a katonákat fusson aképernyőn egy időzítő.
+ A játék tárolja el a 10 legjobb eredményt.
+ A játék értékelje  pontosabb célzást.
+ Játszon le zenét a program miközben játszunk.
+ Játék közben is írja ki a program hogy éppen hány pontnál járunk.
+ legyenek megkülönböztethető méretű célpontok a játékban.
+ Legyen Színes.
+ Legyen hasonlo a counterstrike világához.
+ legyen 2D ben.
+ Írja ki játék közben a pontszámokat.
+ Több felhasználót is megtudjon különböztetni.
+ Akármikor ki és be lehessen kapcsolni a zenét.



Funkcionális terv
-----------------
A program funkcióit az alábbi képernyőtervekkel szeretném felvázolni. Megnyitjuk a programot, ezután a menü tárul elénk egy címmel és 3 gombbal.
A 3 gomb egymás alatt van ezek az alábbiak: Play, Highscore , Exit. A PLay gomb lenyomásával 2 map közül választhatunk amin játszani lehet, ezek: Afghan, Syrian.
Az Afghan gomb megnyomásával elindul a a játék kér tőlünk 3 karaktert amivel az dott felhasználót azonosítja, és így hozzátudja kötnia pontszámot, amit a Start gombbal kell megerősíteni.
A start gomb lenyomása után elnindul a játék ahol megjelennek a terrorísták és rájuk kattintva lépked a számláló, itt még ki és be lehet kapcsolni a zenét és a menübe viszalépni.
Ha viszont végigjátszuk a pályát akkor amint összegyűjtünk 100 pontot, szintén amenübe térünk vissza.
Ha A syrian mapot választjuk akkor ugyanaz a lefolyása ami az Afghan mapnak. 
A menüben lévő highscore gomb megnyomásával egy highscore táblát láthatunk, amint alegjobb 10 eredményt látjuk.
Itt még ki és be tudjuk kapcsolni a zenét, valamint visszatudunk lémpni a menübe.
Amenüben lévő exit gomb lenypmásával pedig kilép a játék, leáll a program. 
A menüben is ki és be lehet kapcsolni a zenét.


Fizikai Környezet
---------------------
A programot Java nyelven írjuk java fx segítségével, adatbázisnak egyszerű szöveges dokumentumot alkalmazunk, Windows 10 rendszerre.

## Tesztterv
------------------------------
Minden programot tesztelni kell, mivel sohasem lehet tudni mikor mi nem működik úgy ahogy annak kellene. Tökéletes kód nem létezik, ezért van szükség tesztelésre. A kód írója persze állandóan nézi, hogy amit implementál, az úgy működik-e, ahogy ő azt tervezte, azonban ez szinte soha sem elég. Ezért van mindig szükség legalább egy, de inkább több harmadik személyre is, akik kipróbálják a programot, mert ahány ember, annyiféle módon használnak egy alkalmazást. Így bukkanhatunk rá olyan hibákra is, amire egyáltalán nem is számítottunk. Azonban nem csak hibákat próbálunk keresni teszteléskor, hanem más szempontjából is akarjuk látni, hogy milyen is maga a program. Kaphatunk ötleteket, hogy mivel egészítenék ki az eddigi munkát, vagy hogy min változtatnának rajta, mivel szerintük az jobb lenne a felhasználóknak.

A tesztelés fázisai:

* alpha teszt
* beta teszt

Az alpha teszt legfőképp in-house történik, hogy megnézzük működnek-e az alapfunkciók. Ilyen lehet például:

- elindul-e a program más környezetben/számítógépen
- működik-e minden gomb
- egy gomb nyomására az elvárt eredményt kapjuk-e

A beta teszt pedig már lehet nyilvános is, ilyenkor akárki tesztelheti, aki szeretné. Ekkor már rengeteg visszajelzést kaphatunk, lehet az bug report, vagy új ötlet, változtatás az eddigi működésben. Például:

- gombok elhelyezése
- új gomb funkció
- újabb tartalom hozzáadása

Sikeresnek mondható a teszt, ha már szinte semmiféle probléma nem található a programban, és a mások által feltett és a fejlesztő által elfogadott változtatásokat, újításokat is implementáltuk. Ezután meg is történhet a szoftver első kiadása.

## Telepítési terv
------------------------------
A számítógépekre való feltelepítéshez szükség van egy pár követelményre:

- egy működő számítógép
- annak hozzáférése az internethez
- valamint egy internet böngésző

Ha ez mind megvan, akkor csak egyszerűen be kell gépelni a címsorba a weboldalnak a címét, ahonnan letölthető lesz a futtatható program. Semmiféle telepítésre nincs szükség, egy dupla kattintással máris elindul és használható is. Ajánlatos a letöltött program ikonját az asztalra elhelyezni, hogy könnyebben és gyorsabban meg tudjuk nyitni a programot. Valamint mivel platformfüggetlen a program, így használhatjuk akármelyik operációs rendszeren, legyen az Linux, Windows vagy macOS.

## Karbantartási terv
------------------------------
Természetesen egy szoftver kiadása után nem áll le a fejlesztése. Szükség van további javításokra és bővítésekre. A később felmerülő hibákat és ötleteket jelezni kell a feljesztőknek, akik folyamatosan dolgoznak ezen problémák megoldásán, így szükség van a program karbantartására. Ehhez megfelelően a felmerülő súlyos hibákat minél gyorsabban javítják és adják ki az újabb verziót, amit újra le kell tölteni a korábban megadott weboldalról. Viszont az új ötletek megvalósításához több időre van szükség, így azok ritkábban kerülnek kiadásra. Mivel a szoftver futásához nincs szükség internetkapcsolathoz, így nagy eséllyel az esetleges vírus fenyegetettség miatt nem kell aggódni. 
