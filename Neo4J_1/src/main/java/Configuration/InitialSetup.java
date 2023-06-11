/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Configuration;

import UI.Nodes.Node;
import org.neo4j.driver.Driver;
import org.neo4j.driver.Session;
import org.neo4j.driver.SessionConfig;

/**
 *
 * @author bhayu
 */
public class InitialSetup implements Node
{
    private Driver driver = null;
    private Session session = null;
    private SessionConfig sessionConfig = null;
    public InitialSetup(Driver driver ,Session session , SessionConfig sessionConfig )
    {
        this.driver = driver;
        this.session = session;
        this.sessionConfig = sessionConfig;
    }
           
            
 }
