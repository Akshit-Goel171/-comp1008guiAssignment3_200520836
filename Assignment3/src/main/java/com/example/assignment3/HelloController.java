package com.example.assignment3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import java.util.Random;
import java.util.ArrayList;



public class HelloController {

    //instantiating some variables for future use
    boolean count = false;
    Random random = new Random();
    int used;



    @FXML
    private Button addStudent;

    @FXML
    private ColorPicker studentColor;

    @FXML
    private TextField studentName;

    @FXML
    private Label errorMessage;

    @FXML
    private TextField student1;
    @FXML
    private TextField student2;
    @FXML
    private TextField student3;
    @FXML
    private TextField student4;
    @FXML
    private TextField student5;
    @FXML
    private TextField student6;
    @FXML
    private TextField student7;
    @FXML
    private TextField student8;
    @FXML
    private TextField student9;
    @FXML
    private Pane studentPanel1;
    @FXML
    private Pane studentPanel2;
    @FXML
    private Pane studentPanel3;
    @FXML
    private Pane studentPanel4;
    @FXML
    private Pane studentPanel5;
    @FXML
    private Pane studentPanel6;
    @FXML
    private Pane studentPanel7;
    @FXML
    private Pane studentPanel8;
    @FXML
    private Pane studentPanel9;




    @FXML
    void onLoginClick(ActionEvent event) {

        ArrayList<String> lists = new ArrayList<>();
        lists.add("box1");
        lists.add("box2");
        lists.add("box3");
        lists.add("box4");
        lists.add("box5");
        lists.add("box6");
        lists.add("box7");
        lists.add("box8");
        lists.add("box9");



        errorMessage.setText("");

        System.out.println("You clicked on 'ADD STUDENT' ");

        // variables for received data
        String receivedStudentName = studentName.getText();
        Color colorsetter = studentColor.getValue();

        // error display message
        if(receivedStudentName.equals("")){
            errorMessage.setText("PLEASE ENTER STUDENT NAME");
        }
        else if(receivedStudentName.length() < 3){
            errorMessage.setText("NAME SHOULD NOT BE LESS THAN 3 CHARACTERS");
        }
        else{
            count = true;
        }




        // Giving different names to random boxes
        if(count){
            int rand = random.nextInt(0,9);
            System.out.println(rand);


            // for first box
            if(lists.get(rand).equals("box1") && student1.getText().isEmpty()){
                student1.setText(receivedStudentName);
                studentPanel1.setStyle("-fx-background-color: #" +colorsetter.toString().substring(2));
                errorMessage.setText("Seat allotted");
//               lists.remove(rand);
            }
            else if(student1.getText() != ("")  && lists.get(rand).equals("box1")){
                errorMessage.setText("SEAT ALREADY CHOSEN. CHOOSE AGAIN. MAY TAKE A FEW TURNS");
            }


            // for second box
            else if(lists.get(rand).equals("box2") && student2.getText().isEmpty()){
                student2.setText(receivedStudentName);
                studentPanel2.setStyle("-fx-background-color: #" +colorsetter.toString().substring(2));
                errorMessage.setText("Seat allotted");
//                lists.remove(rand);
            }
            else if(student2.getText() != ("")  && lists.get(rand).equals("box2")){
                errorMessage.setText("SEAT ALREADY CHOSEN. CHOOSE AGAIN. MAY TAKE A FEW TURNS");
            }


            // for third box
            else if(lists.get(rand).equals("box3") && student3.getText().isEmpty()){
                student3.setText(receivedStudentName);
                studentPanel3.setStyle("-fx-background-color: #" +colorsetter.toString().substring(2));
                errorMessage.setText("Seat allotted");
//                lists.remove(rand);
            }
            else if(student3.getText() != ("")  && lists.get(rand).equals("box3")){
                errorMessage.setText("SEAT ALREADY CHOSEN. CHOOSE AGAIN. MAY TAKE A FEW TURNS");
            }


            // for fourth box
            else if(lists.get(rand).equals("box4") && student4.getText().isEmpty()){
                student4.setText(receivedStudentName);
                studentPanel4.setStyle("-fx-background-color: #" +colorsetter.toString().substring(2));
                errorMessage.setText("Seat allotted");
//                lists.remove(rand);
            }
            else if(student4.getText() != ("") && lists.get(rand).equals("box4")){
                errorMessage.setText("SEAT ALREADY CHOSEN. CHOOSE AGAIN. MAY TAKE A FEW TURNS");
            }


            // for fifth box
            else if(lists.get(rand).equals("box5") && student5.getText().isEmpty()){
                student5.setText(receivedStudentName);
                studentPanel5.setStyle("-fx-background-color: #" +colorsetter.toString().substring(2));
                errorMessage.setText("Seat allotted");
//                lists.remove(rand);
            }
            else if(student5.getText() != ("")  && lists.get(rand).equals("box5")){
                errorMessage.setText("SEAT ALREADY CHOSEN. CHOOSE AGAIN. MAY TAKE A FEW TURNS");
            }


            // for sixth box
            else if(lists.get(rand).equals("box6") && student6.getText().isEmpty() ){
                student6.setText(receivedStudentName);
                studentPanel6.setStyle("-fx-background-color: #" +colorsetter.toString().substring(2));
                errorMessage.setText("Seat allotted");
//                lists.remove(rand);
            }
            else if(student6.getText() != ("")  && lists.get(rand).equals("box6")){
                errorMessage.setText("SEAT ALREADY CHOSEN. CHOOSE AGAIN. MAY TAKE A FEW TURNS");
            }


            // for seventh box
            else if(lists.get(rand).equals("box7") && student7.getText().isEmpty()){
                student7.setText(receivedStudentName);
                studentPanel7.setStyle("-fx-background-color: #" +colorsetter.toString().substring(2));
                errorMessage.setText("Seat allotted");
//                lists.remove(rand);
            }
            else if(student7.getText() != ("")  && lists.get(rand).equals("box7")){
                errorMessage.setText("SEAT ALREADY CHOSEN. CHOOSE AGAIN. MAY TAKE A FEW TURNS");
            }


            // for eighth box
            else if(lists.get(rand).equals("box8") && student8.getText().isEmpty()){
                student8.setText(receivedStudentName);
                studentPanel8.setStyle("-fx-background-color: #" +colorsetter.toString().substring(2));
                errorMessage.setText("Seat allotted");
//                lists.remove(rand);
            }
            else if(student8.getText() != ("")  && lists.get(rand).equals("box8")){
                errorMessage.setText("SEAT ALREADY CHOSEN. CHOOSE AGAIN. MAY TAKE A FEW TURNS");
            }


            // for ninth box
            else if(lists.get(rand).equals("box9") && student9.getText().isEmpty()){
                student9.setText(receivedStudentName);
                studentPanel9.setStyle("-fx-background-color: #" +colorsetter.toString().substring(2));
                errorMessage.setText("Seat allotted");
//                lists.remove(rand);
            }
            else if(student9.getText() != ("")  && lists.get(rand).equals("box9")){
                errorMessage.setText("SEAT ALREADY CHOSEN. CHOOSE AGAIN. MAY TAKE A FEW TURNS");
            }


            // setting error message to null
            else{
                errorMessage.setText("");
            }


            // if all the fields are full
            if(student1.getText() != ("") && student2.getText() != ("") && student3.getText() != ("") &&
                    student4.getText() != ("") && student5.getText() != ("") && student6.getText() != ("") &&
                    student7.getText() != ("") && student8.getText() != ("") && student9.getText() != ("") ){
                errorMessage.setText("CONGRATS.... FULL ATTENDANCE TODAY");
            }







            used = rand;
            lists.remove(rand);
            System.out.println(lists);
        }

    }



    @FXML
    void initialize() {
        System.out.println("Our program has loaded!!!");

        errorMessage.setText("");
    }
}


