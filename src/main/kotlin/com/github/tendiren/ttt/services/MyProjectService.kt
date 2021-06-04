package com.github.tendiren.ttt.services

import com.github.tendiren.ttt.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
