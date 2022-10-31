# Oblig3

Jeg startet med å legge til en ny repository. Deretter åpnet jeg Finder og la inn oblig2 innholdet til github desktop. Commitet og pushet filene til repository (oblig3).
Gikk da inn til actions taben og skrev på søkefeltet "maven" og konfigurerte "Java with maven", endret på hele konfigurasjonen. 
Kjørte den nye endringen med å trykke på "run-test" i action taben. Fikk en error, det var en lett fiks. For å få det riktig endret jeg Java versionen fra 14 til 17 og testet konfigurasjonen. 

Fikk en feil med kjøringen av testen, jeg fikk ikke noen tester kjlørt og etter en grundig skjekk viste det seg at jeg ikke hadde version nummer under maven-surefire-plugin. For å kunne fikse det la jeg inn <version>2.22.2</version> og da fungerte det å kjøre.

