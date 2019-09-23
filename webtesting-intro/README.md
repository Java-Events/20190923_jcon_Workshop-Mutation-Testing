# Testen von Webanwendungen

## Technologien

* Java Anwendung
* Selenium / WebDriver
* Browser

### Java Anwendung

  * Die Anwendung muss vor dem Test hochgefahren werden
  * Die Anwendung muss nach dem Test heruntergefahren werden
  * Wenn wir Tests parallel laufen lassen wollen, müssen wir sicherstellen , das die Tests auf je einen Instanz der Anwendung zugreifen

### Selenium / WebDriver

  * Selenium ist der Projektname
  * WebDriver ist das Protokoll mit dem ein Browser ferngesteuert werden kann
  * WebDriver Implementierungen bestehen aus
    * einem Sprachspezifischen Teil (Java, JavaScript, Python, etc.)
    * einem Browserspezifischen Teil (Chrome-Driver, Marionette-Driver, etc.)
  * WebDriver ermöglicht sowohl den Zugriff auf den DOM des Browsers, erzeugen von Screenshots, als auch das senden von Events
  * Das sprachspezifische API sieht in allen Sprachen recht gleich aus - wichtig wenn man Probleme hat...

### Browser

  * Kennen wir alle ;-)
  * ABER, verschiedenen Versionen auf evtl. verschiedenen Betreibssystemen bereitstellen ist nicht trivial
  * Headless Nutzung für CI ist nicht trivial

### Architektur - PageObject-Pattern

  * Es wird ein PageObject pro View(-Teil) erstellt
  * Das technische wird aus den Tests herausgehalten

