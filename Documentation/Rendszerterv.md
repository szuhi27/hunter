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