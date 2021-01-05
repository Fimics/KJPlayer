plugins {
    id("com.android.application")
    id ("kotlin-android")
//     kotlin("android")
//    kotlin("android.extensions")
}

android {
    compileSdkVersion (androids.compileSdkVersion)
    buildToolsVersion (androids.buildToolsVersion)

    defaultConfig {
        applicationId =androids.applicationId
        minSdkVersion(androids.minSdkVersion)
        targetSdkVersion(androids.targetSdkVersion)
        versionCode =androids.versionCode
        versionName =androids.versionName

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
    implementation (dependens.std_lib)
    implementation (dependens.ktx_core)
    implementation (dependens.app_compat)
    implementation (dependens.material)
    implementation (dependens.constraint)
    testImplementation (dependens.junit)
    androidTestImplementation (dependens.extjunit)
    androidTestImplementation (dependens.espresso)
}

