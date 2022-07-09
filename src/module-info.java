module javafx1 {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	
	exports gui;
	
	opens gui to javafx.fxml, javafx.controls;
	
	opens application to javafx.graphics, javafx.fxml;
	
}
