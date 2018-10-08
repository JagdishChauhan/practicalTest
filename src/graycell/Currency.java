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
public final class Currency {

    public Currency() {
    }

    static String toWord(float currencys) {        
        
        //======================================================================
        //  rupee process
        //======================================================================
        int currency = (int) currencys;        
        String result = "Rupees ";        
        String[][] digits = {{"","2"}, {"Hundred ","1"}, {"Thousands ","2"}, {"Lack ","2"}, {"Crore ","2"}};
        for (String[] digit : digits) {
            if(currency > 0){                
                int modulo = (int) Math.pow(10,Integer.parseInt(digit[1]));                
                String getTens = getTens((int)(currency % modulo));
                if(!("".equals(getTens)))                    
                    result = getTens + digit[0] + result;
                currency /= modulo;
            } else { break; }
        }
        
        //======================================================================
        //  paise process
        //======================================================================
        String paisa = getTens(((int)((currencys - (float)currency) * 100)));
        if("".equalsIgnoreCase(paisa))
            result += "And " + "Zero " + "Paisa Only";
        else
            result += "And " + paisa + "Paisa Only";
        
        //======================================================================
        //  after process value return 
        //======================================================================
        return result;
    }    
    
    static String getDigit(int i){
        switch(i){
            //case 0: return "Zero";
            case 1: return "One ";
            case 2: return "Two ";
            case 3: return "Three ";
            case 4: return "Four ";
            case 5: return "Five ";
            case 6: return "Six ";
            case 7: return "Seven ";
            case 8: return "Eight ";
            case 9: return "Nine ";
            case 10: return "Ten ";
            case 11: return "Eleven ";
            case 12: return "Twelve ";
            case 13: return "Thrteen ";
            case 14: return "Fourteen ";
            case 15: return "Fifteen ";
            case 16: return "Sixteen ";
            case 17: return "Seventeen ";
            case 18: return "Eighteen ";
            case 19: return "Ninghteen ";
            default: return "";
        }
    }
    
    private static String getTens(int i){          
        if( i >= 00 && i <= 19 ) return getDigit(i);
        else if( i >= 20 && i <= 29 ) return "Twenty " + getDigit(i%10);
        else if( i >= 30 && i <= 39 ) return "Tharty " + getDigit(i%10);
        else if( i >= 40 && i <= 49 ) return "Fourty " + getDigit(i%10);
        else if( i >= 50 && i <= 59 ) return "Fifty " + getDigit(i%10);
        else if( i >= 60 && i <= 69 ) return "Sixty " + getDigit(i%10);
        else if( i >= 70 && i <= 79 ) return "Seventy " + getDigit(i%10);
        else if( i >= 80 && i <= 89 ) return "Eighty " + getDigit(i%10);
        else if( i >= 90 && i <= 99 ) return "Ninghty " + getDigit(i%10);
        return "";        
    }    
}
