group = "mx.com.inftel.sat"
version = "2022.04.04"

plugins {
    `java-library`
    `maven-publish`
    signing
}

repositories {
    mavenCentral()
}

dependencies {
    compileOnly("jakarta.xml.bind:jakarta.xml.bind-api:2.3.3")
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
    withSourcesJar()
    withJavadocJar()
}

tasks.withType<JavaCompile>().configureEach {
    options.encoding = "UTF-8"
}

tasks.withType<Javadoc>().configureEach {
    options.encoding = "UTF-8"
}

tasks.jar.configure {
    archiveBaseName.set("sat-cfd")
}

publishing {
    repositories {
        maven {
            setUrl(file("$projectDir/build/repo"))
            //setUrl("https://oss.sonatype.org/service/local/staging/deploy/maven2/")
        }
    }

    publications {
        create<MavenPublication>("cfd") {
            from(components["java"])
            pom {
                name.set("SAT CFD")
                description.set("Java classes and resources for SAT's CFD. Clases Java y archivos para CFD del SAT.")
                url.set("https://github.com/santoszv/sat-cfd")
                inceptionYear.set("2022")
                licenses {
                    license {
                        name.set("Public domain")
                        url.set("https://en.wikipedia.org/wiki/Public_domain")
                    }
                }
                developers {
                    developer {
                        id.set("santoszv")
                        name.set("Santos Zatarain Vera")
                        email.set("santoszv@inftel.com.mx")
                        url.set("https://www.inftel.com.mx")
                    }
                }
                scm {
                    connection.set("scm:git:https://github.com/santoszv/sat-cfd")
                    developerConnection.set("scm:git:https://github.com/santoszv/sat-cfd")
                    url.set("https://github.com/santoszv/sat-cfd")
                }
            }
            signing.sign(this)
        }
    }
}

signing {
    useGpgCmd()
}