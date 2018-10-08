/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graycell;

/**
 *
 * @author Jagdish
 */
public class Paragraph {
    
    public String revParagraph(String paragraph) {
        String result = "";
        String[] lines = paragraph.split("[.]");
        for(String line : lines) {
            result += revLine(line) + ". ";
        }
        return result;
    }
    
    String revLine(String line){                
        String[] tokens = line.split(" ");        
        String swap, result = "";
        int lenToken = tokens.length - 3;
        for(int i=0; i <= lenToken/2; i++){
            swap = tokens[lenToken - i];
            tokens[lenToken - i] = tokens[i];
            tokens[i] = swap;
        }        
        for(String token : tokens){
            result += token + " ";
        }
        return result.trim();
    }
}
