package automat;

public class Muenzsystem{
    final static private int[] validCoins = {1, 2, 5, 10, 20, 50, 100, 200};
    final private int[] currentCoins = {0, 0, 0, 0, 0, 0, 0, 0};
    
   
    private int isCoin(int coin){
        
        for (int i = 0; i < validCoins.length; i++) {
            if (validCoins[i] == coin) {
                return i;
            }
        }
return -1;
    }
    
    //Gibt den Wert der aktuell eingeworfenen Münzen zurück.
    public int getCurrentValue(){
        
        int total = 0;
        for (int i = 0; i < validCoins.length; i++) {
            total += currentCoins[i] * validCoins[i];
        }
return total;
    }
    
    public boolean insert(int coin){
        int index = isCoin(coin);
        if (index == -1){
            return false;
        }
        
        //Wir können Coin hinzufügen
        ++currentCoins[index];
        return true;
    }
    
//Gibt an, ob für den Preis price genügend Geld vorhanden ist.
    public boolean buy(int price){
        if (price <= getCurrentValue()){
            for (int i = 0; i < currentCoins.length; ++i){
                currentCoins[i] = 0;
            }
            return true;
        }
        return false;
    }
    
    public void reset(){
        for (int i = 0; i < currentCoins.length; ++i){
            System.out.println("Giving back " + currentCoins[i] + " times " + validCoins[i] + " Cents.");
            currentCoins[i] = 0;
        }
    }
}
