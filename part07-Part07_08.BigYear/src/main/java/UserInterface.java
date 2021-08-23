
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nilryan
 */
public class UserInterface {
    private BirdList birds;
    private Scanner scanner;

    public UserInterface(Scanner scanner, BirdList birds) {
        this.scanner = scanner;
        this.birds = birds;
    }
    
    public void start() {
        while (true) {
            System.out.print("? ");
            String command = scanner.nextLine();
            
            if (command.equals("Quit")) {
                break;
            }
            
            if (command.equals("Add")) {
                System.out.println("Name:");
                String name = scanner.nextLine();
                System.out.println("Name in Latin:");
                String latinName = scanner.nextLine();
                
                Bird bird = new Bird(name, latinName);
                
                birds.add(bird);
                continue;
            }
            
            if (command.equals("Observation")) {
                System.out.println("Bird?");
                String birdName = scanner.nextLine();
                if (birdName.equals("Lion")) {
                    System.out.println("Not a bird!");
                    continue;
                }
                
                this.birds.addObservation(birdName);
                
            }
            
            if (command.equals("All")) {
                printBirds();
                continue;
            }
            
            if (command.equals("One")) {
                System.out.println("Bird?");
                String birdName = scanner.nextLine();
                printBirds(birdName);
                continue;
            }
            
            
            
            
            
            
            
        }
    }
    
    public void printBirds() {
        HashMap<Bird, Integer> frequency = this.birds.getBirdFrequency();
        
        for (Map.Entry<Bird, Integer> entry : frequency.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " observations");
        }
        
    }
    
    public void printBirds(String birdName) {
        HashMap<Bird, Integer> frequency = this.birds.getBirdFrequency();
        
        for (Map.Entry<Bird, Integer> entry : frequency.entrySet()) {
            if (entry.getKey().getName().equals(birdName)) {
                System.out.println(entry.getKey() + ": " + entry.getValue() + " observations");
            }
        }
        
    }
    
    
    
}
