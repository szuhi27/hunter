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

