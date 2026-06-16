module com.anhtong.quizappv1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.anhtong.quizappv1 to javafx.fxml;
    exports com.anhtong.quizappv1;
}
