// Top-level build file where you can add configuration options common to all sub-projects/modules.
// Top-level build file where you can add configuration options common to all sub-projects/modules.
//apply from: this.file('depends.gradle') //去当前工程下找 并把该文件内容引入进来
// 根目录下的build.gradle头部加入自定义config.gradle，相当于layout布局中加入include
//apply from: "config.gradle"

//学习测试demo
//apply from:  this.file('build_demo.gradle')


//依赖配置的核心功能
buildscript {
    val kotlin_version = "1.4.20"
    //工程的创库地址
    repositories {
        google()
        jcenter()
//        maven {
//            name 'personal'
//            url 'htoop://localhost:8081/nexus/repositiories'
//            credentials{
//                username 'admin'
//                pawwword 'admin123'
//            }
//        }
    }

    //插件的依赖地址
    dependencies {
        classpath ("com.android.tools.build:gradle:4.1.1")
        classpath ("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version")

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

//为当前工程和他所有的子project提供配置
allprojects {
    repositories {
        google()
        jcenter()
//        maven { url "https://jitpack.io" }
    }
}

//groovy
//task clean(type: Delete) {
//    delete rootProject.buildDir
//}

//kotlin
tasks{
    val clean by registering(Delete::class){
        delete(buildDir)
    }
}