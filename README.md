# Reto-Automatizacion-Evalart
# PRUEBA TECNICA ANALISTA DE PRUEBAS馃殌
Automatizaci贸n Prueba Tecnica, dirigida a certificar la pagina: http://demo.guru99.com/test/newtours/

Tiene como finalidad responder a la necesidad del Product-Owner 


Pre-requisitos 
--
* Tener el [JDK](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) Java Development Kit como minimo en la version 1.8 

Instalaci贸n 
---
* Clonar el proyecto (https://github.com/) ejecutando el siguiente comando
```git
git clone https://github.com/maritm/Reto-Automatizacion-Evalart.git
```
* Puede realizar tareas por defecto de Gradle como compilar o ejecutar a trav茅s de los siguientes comandos (*es necesario ubicarse en la ra铆z del proyecto para ejecutarlos*) :

*Para compilar el proyecto:*
``` gradle
gradlew build -x test     
```

Se crea el proyecto sobre Gradle, es una herramienta de automatizaci贸n de 
la construcci贸n de nuestro c贸digo, es la versi贸n mejorada de Maven, 
pero intenta llevarlo todo un paso m谩s all谩. Para empezar, se apoya 
en Groovy y en un DSL (Domain Specific Language) para trabajar 
con un lenguaje sencillo y claro a la hora de construir el build comparado con Maven. 
Por otro lado, dispone de una gran flexibilidad que permite trabajar 
con ella utilizando otros lenguajes y no solo Java. Dispone por otro 
lado de un sistema de gesti贸n de dependencias s贸lido.

*Por medio del build.gradle utilizamos diferentes dependencias para nuestra automatizaci贸n:

apply plugin: 'java'
apply plugin: 'idea'
apply plugin: 'net.serenity-bdd.aggregator'

version '1.0-SNAPSHOT'

sourceCompatibility = 1.8
targetCompatibility = 1.8

group 'co.com.evalart.certification'


repositories {
    mavenCentral()
}
buildscript {
    repositories {
        maven { url "https://plugins.gradle.org/m2/"}
        mavenCentral()
    }
    ext{
        serenityVersion = "2.3.13"
        serenityGradleVersion="2.3.13"
        serenityCucumberVersion = "2.2.6"
    }
    dependencies {
        classpath("net.serenity-bdd:serenity-gradle-plugin:$rootProject.ext.serenityGradleVersion")
    }
}

configurations.all {
    resolutionStrategy{
        force "io.cucumber:cucumber-core:5.0.0"
    }
}


dependencies {
    implementation group:'org.slf4j', name:'slf4j-simple',version: '2.0.0-alpha1'
    implementation group:'org.hamcrest', name:'hamcrest',version: '2.2'

    implementation"net.serenity-bdd:serenity-core:$rootProject.ext.serenityVersion",
            "net.serenity-bdd:serenity-junit:$rootProject.ext.serenityVersion",
            "net.serenity-bdd:serenity-screenplay:$rootProject.ext.serenityVersion",
            "net.serenity-bdd:serenity-screenplay-webdriver:$rootProject.ext.serenityVersion",
            "net.serenity-bdd:serenity-screenplay-rest:$rootProject.ext.serenityVersion",
            "org.assertj:assertj-core:3.19.0"




    testImplementation "net.serenity-bdd:serenity-cucumber5:$rootProject.ext.serenityCucumberVersion",
            "junit:junit:4.12"
}

test.finalizedBy(aggregate)

gradle.startParameter.continueOnFailure = true

  
```

#Pr谩cticas de automatizaci贸n
Un proyecto donde se ejemplifica el uso del patr贸n serenity
[screenplay](http://thucydides.info/docs/serenity-staging/#_serenity_and_the_screenplay_pattern) con cucumber y gradle.

Los tests usan tareas (tasks), interacciones (interactions), preguntas (questions), elementos de p谩ginas (user_interface) y basicamente se tiene la siguiente estructura a nivel de proyecto de automatizaci贸n.

+ model
    Clases que usan el patr贸n DTO o relacionadas con el modelo de dominio
+ tasks
    Clases que representan tareas que realiza el actor a nivel de proceso de negocio
+ interacion
    Clases que representan las interacciones directas con la interfaz de usuario
+ user_interface
    Page Objects y Page Elements. Mapean los objetos de la interfaz de usuario
+ questions
    Objectos usados para consultar acerca del estado de la aplicaci贸n


Estrategia de automatizaci贸n
---
Inicialmente se levantaron los flujos de cada transacci贸n, para conocer el negocio y tener claro que se debia automatizar.
Una vez claro el alcance se procede con la automatizaci贸n de las transacciones, para esto se decide automatizar el front.

El navegador y la versi贸n utilizada
---
El navegador utilizado fue: chrome=Versi贸n Versi贸n Versi贸n 105.0.5195.127  y el chromeDriver soportado para esta versi贸n. Para m谩s informaci贸n consultar p谩gina de compatibilidad (https://chromedriver.chromium.org/).

Para correr el proyecto se necesita Java JDK 1.8 y Gradle preferiblemente con la versi贸n 7.1.
