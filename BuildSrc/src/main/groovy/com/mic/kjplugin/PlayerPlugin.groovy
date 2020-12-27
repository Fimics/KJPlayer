package com.mic.kjplugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class PlayerPlugin implements Plugin<Project>{

    /**
     * 唯一需要实现的就是这个方法，参数就是引入了当前插件的Project对象
     * @param project
     */
    @Override
    void apply(Project project) {
          println "插件启动了"
        //创建扩展属性
        project.extensions.create('playerRelease'
                    ,ReleaseInfoExtension)

        //创建Tesk
        project.tasks.create('releaseInfoTest',
           ReleaseInfoTask)
    }
}