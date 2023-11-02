/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.awt.Color;
import javax.swing.JTextField;

/**
 *
 * @author trand
 */
public class DataValidator {
    public static void validatorEmpty(JTextField field, StringBuilder sb, String errorMessage){
        if(field.getText().equals("")){
            sb.append(errorMessage).append("\n");
            field.requestFocus();
        } else {
            field.setBackground(Color.white);
        }
    }
}
