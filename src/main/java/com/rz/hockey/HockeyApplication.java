package com.rz.hockey;

import com.rz.hockey.entities.Player;
import com.rz.hockey.entities.Team;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HockeyApplication {

	public static void main(String[] args) {
		SpringApplication.run(HockeyApplication.class, args);

//        System.out.println("Hockey Application Started");
//        Team tor = new Team("Toronto Maple Leafs", "TOR");
//        Team isl = new Team("New York Islanders", "NYI");
//
//        Player knies = new Player("Matthew Knies", tor);
//        Player domi = new Player("Max Domi", tor);
//        Player macelli = new Player("Macelli", tor);
//
//        Player barzal = new Player("Barzal", isl);
//        Player lee = new Player("Lee", isl);
//
//        tor.addPlayer(knies);
//        tor.addPlayer(domi);
//        tor.addPlayer(macelli);
//        isl.addPlayer(lee);
//        isl.addPlayer(barzal);
//
//        System.out.println("Maple Leafs players:: ");
//        for (Player p: tor.getPlayers()) {
//            System.out.println(p.getName());
//        }
//
//        System.out.println("Islanders players:: ");
//        for (Player p: isl.getPlayers()) {
//            System.out.println(p.getName());
//        }
	}

}
