Rendszerterv
============

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
