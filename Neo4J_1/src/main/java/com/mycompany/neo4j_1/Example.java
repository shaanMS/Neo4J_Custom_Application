/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.neo4j_1;


import org.neo4j.driver.AuthTokens;
import org.neo4j.driver.Driver;
import org.neo4j.driver.GraphDatabase;
import org.neo4j.driver.Query;

import static org.neo4j.driver.Values.parameters;
/**
 *
 * @author bhayu
 */
import org.neo4j.driver.*;
import static org.neo4j.driver.Values.parameters;

public class Example {

  public static void main(String...args) {

    Driver driver = GraphDatabase.driver("neo4j://44.203.223.137:7687",
              AuthTokens.basic("neo4j","commanders-pronoun-fountains"));

    try (Session session = driver.session(SessionConfig.forDatabase("neo4j"))) {

      String cypherQuery =
        "MATCH (m:Movie {title:$movie})<-[:RATED]-(u:User)-[:RATED]->(rec:Movie)\n" +
        "RETURN distinct rec.title AS recommendation LIMIT 20";

      var result = session.readTransaction(
        tx -> tx.run(cypherQuery, 
                parameters("movie","Crimson Tide"))
            .list());

      result.forEach(record -> {
          System.out.println(record.get("recommendation").asString());
        });
    }
    driver.close();
  }
}

