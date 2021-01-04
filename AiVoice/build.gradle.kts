plugins {
    id("com.android.application")
//    id ("kotlin-android")
     kotlin("android")
    kotlin("android.extensions")
}

android {
    compileSdkVersion (30)
    buildToolsVersion ("30.0.3")

    defaultConfig {
        applicationId ="com.mic.aivoice"
        minSdkVersion(16)
        targetSdkVersion(30)
        versionCode =1
        versionName ="1.0"

        testInstrumentationRunner ="androidx.test.runner.AndroidJUnitRunner"
    }


    //签名
    signingConfigs{
        register("release"){
            keyAlias = "fimics"
            keyPassword ="123456"
            storeFile =file("../sign.jks")
            storePassword ="123456"
        }
    }


    buildTypes {

        getByName("debug"){
            isMinifyEnabled =false
        }

        getByName("release"){
            isMinifyEnabled =false
            signingConfig = signingConfigs.getByName("release")
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }


    //输出类型
    android.applicationVariants.all {
        //编译类型
        val buildType = this.buildType.name
        outputs.all {
            //输出apk
            if(this is com.android.build.gradle.internal.api.ApkVariantOutputImpl){
                this.outputFileName = "AI_V${defaultConfig.versionName}_$buildType.apk"
            }
        }
    }

    //依赖操作
    compileOptions {
        sourceCompatibility =JavaVersion.VERSION_1_8
        targetCompatibility =JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation (fileTree(mapOf("dir" to "libs","include" to listOf("*.jar"))))
    implementation ("org.jetbrains.kotlin:kotlin-stdlib:1.4.20")
    implementation ("androidx.core:core-ktx:1.3.2")
    implementation ("androidx.appcompat:appcompat:1.2.0")
    implementation ("com.google.android.material:material:1.2.1")
    implementation ("androidx.constraintlayout:constraintlayout:2.0.4")
    testImplementation ("junit:junit:4.+")
    androidTestImplementation ("androidx.test.ext:junit:1.1.2")
    androidTestImplementation ("androidx.test.espresso:espresso-core:3.3.0")
}

