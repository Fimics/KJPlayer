
//全局常量
object BuildConst{
    const val gradle_version = "4.1.1"
    const val kotlin_version = "1.4.20"
}

//应用配置
object androids {
    const val compileSdkVersion = 29
    const val buildToolsVersion = "29.0.3"
    const val applicationId = "com.mic.aivoice"
    const val minSdkVersion = 21
    const val targetSdkVersion = 29
    const val versionCode = 1
    const val versionName = "1.0"
}


//依赖配置
object dependens {

    //Kotlin基础库
    const val std_lib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${BuildConst.kotlin_version}"

    //Android标准库
    const val app_compat = "androidx.appcompat:appcompat:1.2.0"

    //Kotlin核心库
    const val ktx_core = "androidx.core:core-ktx:1.2.0"

    //EventBus
    const val event_bus = "org.greenrobot:eventbus:3.2.0"

    //ARouter
    const val arouter = "com.alibaba:arouter-api:1.5.0"
    const val arouter_compiler = "com.alibaba:arouter-compiler:1.2.2"

    //RecyclerView
    const val recyclerview = "androidx.recyclerview:recyclerview:1.0.0"

    //Permissions
    const val and_permissions = "com.yanzhenjie:permission:2.0.3"

    //Retrofit
    const val retrofit = "com.squareup.retrofit2:retrofit:2.8.1"
    const val retrofit_gson = "com.squareup.retrofit2:converter-gson:2.8.1"

    //ViewPager
    const val viewpager = "com.zhy:magic-viewpager:1.0.1"
    const val material = "com.google.android.material:material:1.0.0"
    const val constraint ="androidx.constraintlayout:constraintlayout:2.0.4"
    const val junit ="junit:junit:4.+"
    const val extjunit ="androidx.test.ext:junit:1.1.2"
    const val espresso ="androidx.test.espresso:espresso-core:3.3.0"

    //Lottie
    const val lottie = "com.airbnb.android:lottie:3.4.0"

    //刷新
    const val refresh_kernel = "com.scwang.smart:refresh-layout-kernel:2.0.1"
    const val refresh_header = "com.scwang.smart:refresh-header-classics:2.0.1"
    const val refresh_foot = "com.scwang.smart:refresh-footer-classics:2.0.1"

    //图表
    const val chart = "com.github.PhilJay:MPAndroidChart:v3.1.0"
}
