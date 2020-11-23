Funkcionális specifikáció
=========================

## Jelenlegi helyzet

Mai világunkban az interneten kutatva már minden típusú játékot megtalálhatunk, de annyi féle játék van,hogy előfordul,hogy azt az egyet nem találjuk meg, amelyiket keressük.Az üzletember Dr. Remek Elek  is ebbe a problémába ütközött, amikor az interneten keresgélt egy gyerekkori játék után. Emlékszik, hogy gyerekkorában volt egy játék, amellyel nagyon gyakran játszott,de akárhogy is kutat sehogy sem találja, pedig szeretne nosztalgiázni egy kicsit és játszani vele, valamint megmutatni az unokaöccsének,,hogy ő mivel játszott régen és mennyire hasonlított a mai játékokra.

Vágyálomrendszer
----------------
Szeretnénk egy játékot, ami egy késő 90-es, korai 2000 évek lövöldözős játékáraira emlékeztet.
Maga a játékmenet legyen egyszerű, csak szimplán jelenljenek meg az "ellenfelek" a képernőn és 
le kelljen őket lőni, azzal, hogy rájuk kattintunk. Meg lehessen különböztetni a "lövés minőségét"
pl.: fejlövés, testlövés. De a lényeg hogy egy kellemes játék jöjjön létre, ami a régi időket
idézi fel. Természetesen szeretnénk bele egy módot maivel lehet tárolni az elért elerdményt
és azokat kilistázni, például a legjobb 10 eredményt. Valamint kellene legyen alatta valamilyen
háttérzene illetve hangefektek, pl.: lövés hangja.

## Jelenlegi üzleti folyamatok modellje

+ Jelenleg a piacon rengeteg lövöldözős játék van.
+ A mai lövöldözős játékok általában 3D-sek.
+ A mai játékok egy olyan ember számára, aki régen nőtt fel és megszokta az egyszerű játékokat bonyolultnak és nehéznek tűnhetnek.
+ Sok mai lövöldözős játékban túl nagy a választék fegyverek és felszerelések tekintetében.
+ Manapság annyi játék megtalálható az interneten, hogy az embernek nehéz azt az egyet megtalálni amivel gyerekkorában játszott.

## Igényelt üzleti folyamatok modellje

+ Olyan program létrehozása, mely menüket tartalmaz.
+ Több pályának is rendelkezésre kell állnia.
+ Egyszerű legyen a játék menete és csak fegyverrel lehessen lőni.
+ Mivel egy lövöldözős játékról van szó , máshogy pontozzon test és fej eltalálásakor, tehát legyenek különböző hitboxok.
+ Test eltalálásakor 1, fej eltalálása esetén 2 pontot kapjunk.
+ A pontokat 100 pontig kelljen gyűjteni.
+ A progamnak menteni kell a pontszámot és mindig az első 10 legjobbat mutatni.
+ Az idő fejezze ki a helyezést a highscore-ban, minél hamarabb végez valaki a pályával, annál előrébb kerüljön a listában.

## Használati esetek
A programban csak a felhasználó fér hozzá az adatokhoz, viszont azokat még ő sem módosíthatja. Az adatok feldolgozása a háttérben történik, azok feldolgozás során nem módosulnak semmilyen módon. Új adatok nem kerülnek eltárolásra, sem létrehozva a program futása során.

A felasználó dönt a program futásáról és leállásáról.

Iduláskor a felhasználó egy menüt fog látni. Amiben elindíthatja a játékot vagy megnézheti a Scoreboardot.
Ha a Scoreboard-ra kattint akkor a legjobb 10 eredmény-t fogja látni amit valaha elértek a játékban.
Ha elindítja a játékot egy rövid viszaszámlálás után elkezdenek megjelenni a képernyőn a katonák, és rájuk kell kattintani. Ha ez megtörténik akkor eltűnnek,és a pontszám növelődik.
A játék véget ér ha a felhasználó 3-szor mellé lő vagy lejár az ideje.
Ekkor az aktuális pontszáma kerül kiírásra a képernyőn egy Game Over felirattal.
MAjd eldöntheti hogy újraindítja ajátékot vagy kilép a programból.



## Képernyő tervek
------------------------------
A program kinézetének célja, hogy azt a nosztalgia érzést váltsa ki az emberből, mintha újra gyerekként játszana a játékkal. Tehát egyszerű megjelenés, semmi extra gomb vagy kinézet, vagyis a minimalista megközelítés a cél. Megnyitáskor legyen valami háttérkép és zene, ami azonnal belemeríti a felhasználót a játék érzésébe. Játék elindítása, legjobb rekordok, valamint kilépést végrehajtó gombok legyenek a képernyő közepén elhelyezve. Egyéb beállítást ne nagyon lehessen módosítani. A High-Score menüben a legjobb 10 jelenjen csak meg, abból is a legjobb 3 arany, ezüst és bronz színnel és éremmel vagy serleggel legyen megjelenítve, ami megszokott más játékoknál is. Innen könnyen vissza lehet lépni a kezdőképernyőre, ahonnan el tudjuk indítani magát a játékot. 

A játék indítása után lehetőségünk van több pálya választására, hogy hol szeretnénk játszani. Ezen pályákat egy képpel illusztráljuk, hogy lássuk mire is számíthatunk, valamint magával a helyszín nevével. Miután kiválasztottunk egy pályát, a játék azonnal elindul a számlálóval együtt. Ekkor a képernyő különböző pontjain megjelennek az ellenségek, akiket le kell lőni. Sikeres találat esetén a képernyő másik pontján megjelenik egy újabb célpont, és ez a játék végéig így folytatódik. A játék végén láthatjuk a mi időnket, valamint a High-Score táblát is. Erről a képernyőről újra lehet kezdeni a játékot vagy ki lehet lépni.

## Forgatókönyvek
------------------------------
A felhasználó unaloműzés szempontjából elindítja a játékot. Indulás után megjelenik előtte a program ablaka, ahol a főmenü üdvözli őt. A menü háttere és a háttérzene azonnal jó kedvbe hozza őt. Megnézi, hogy milyen rekordokat sikerült eddig elérnie a High-Score gombra kattintva. Látja, hogy még a legelső helyen lévő időt is nagyon könnyen le tudja győzni. Azonnal visszamegy a főmenübe és a Játék elindítása gombra kattint. Ezután kiválasztja az első pályát, mivel az a kedvence. Amint rákattintott el is kezdődött a játék.

Az első célpont azonnal megjelenik a képernyő közepén, viszont azt csak a lábán találja el, így csak 1 pontot kapott érte. A találat után azonnal megjelent most éppen a bal-felső sarokban, aminek szerencsére a fejét találta el, ami már 3 pontot is ér, viszont a további találatok nem olyan sikeresek. Mivel ez még az első játéka a mai nap, ezért sokáig tart, mire sikerül egy-egy célpontot eltalálnia. Egyre idegesebb, mert mindig mellé talál, de végül elérte a 100 pontot, viszont ez még a top 10-ben se volt benne. Dühében újrakezdi ugyanazt a pályát, és bár most jobban teljesít, ő még mindig nem elégedett.

Visszamegy a kezdőképernyőre és egy újabb játékba kezd, viszont most a másik pályát választja. Régen játszott már ezen a pályán, viszont máris jobban teljesít, mint korábban. Nagyon hamar el is érte a 100 pontot, ezzel a rekorddal az első helyre került, aminek nagyon is örül, így egy újabb próbát tesz, amivel egy újabb rekordot dönt, újra legyőzte az első helyen lévő időt. Mára nagy örömmel a kilépés gombbal ki is lép a játékból.

## Funkció – követelmény megfeleltetés
------------------------------
- A játék egyszerű felépítése, kinézete, valamint összességében egyszerűsége sok retro játékos számára nagy élményt tud adni
- A kód megírása Java-ban történik, így a GUI megtervezése JavaFX SceneBuilder segítségével nagyon könnyen megvalósítható
- A rekordokat egy adatbázisban kerül tárolásra

Használati esetek
-----------------
A programhoz egyszerre csak egy felhasznáó tud hozzáférni lokálisan. A felhasználó irányítja a
programot de annak adataihoz nem tud hozzáférni, nem tudja módosítnai. Új adatok kerülnek eltárolásra
a játék eredménye képében, ezen eredményeket egy új fájlban (esetlegesen ugyanabba a fájlba)
rendezésre kerülnek.

Adat elmentésre csak teljes futás során kerül, vagyis ha egy kör le lett játszva. Természetesen az 
eredményeket a felhasználó nem tudja módosítani a programon belülről.