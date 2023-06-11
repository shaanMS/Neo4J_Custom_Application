/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI.Nodes;

import Relationships.Located_At;
import Relationships.Performs_Visits;
import Relationships.Visits;

/**
 *
 * @author bhayu
 */
public class Visit implements Node {
    private Located_At locateAt;
    private Visits visits;
    private Performs_Visits perVisit;
    private Integer id;
    private String duration;
    private String endtime;
    private String starttime; 
    
}
