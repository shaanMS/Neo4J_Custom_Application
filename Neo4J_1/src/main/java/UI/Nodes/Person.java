/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI.Nodes;

import Relationships.Visits;
import Relationships.Located_At;
import Relationships.Performs_Visits;
import java.util.Date;
import java.util.Map;

/**
 *
 * @author bhayu
 */
public class Person implements Node {
  private String name;
  private Integer id ;
  private Place place ;
  private Performs_Visits pervisit;
  private Located_At locAt;
  private Visits visit;
  private boolean healthyStatus = true;
  private Date confirmedtime ;
  private Map<Character , Float> point ;
  private Time time;
  
}
