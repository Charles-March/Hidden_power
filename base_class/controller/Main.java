package controller;

import view.MainWindow;

public final class Main {

	public static void main(String[] args) {
		Config.init("EN");
		Engine.init();
		MainWindow mw = new MainWindow("Hidden Power",1366,768);
		mw.mainMenu();
		

	}

}
