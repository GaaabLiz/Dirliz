package it.gabliz.dirliz

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.stage.Stage

class DirlizApplication : Application() {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            launch(DirlizApplication::class.java, *args)
        }
    }

    override fun start(stage: Stage) {
        val fxmlLoader = FXMLLoader(DirlizApplication::class.java.getResource("hello-view.fxml"))
        val scene = Scene(fxmlLoader.load(), 320.0, 240.0)
        stage.title = "Hello!"
        stage.scene = scene
        stage.show()
    }
}