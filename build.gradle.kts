group = "mx.com.inftel.sat"
version = "2022.02.10"

plugins {
    `java-library`
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
}

tasks.jar.configure {
    archiveBaseName.set("sat-cfd")
}