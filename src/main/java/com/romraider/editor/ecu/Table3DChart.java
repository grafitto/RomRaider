package com.romraider.editor.ecu;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Table3DChart extends Application {

	private static final int WIDTH = 800;
	private static final int HEIGHT = 400;

	@Override
	public void start(Stage mainStage) throws Exception {
		mainStage.setTitle("Table title");
		Group group = new Group();
		Scene scene = new Scene(group, WIDTH, HEIGHT);
		mainStage.setScene(scene);
		mainStage.show();
	}

	public static void show() {
		launch();
	}
}
