package automat;

public class Automat{
    private Muenzsystem ms;
    private Ware[] waren;
    
    public Automat(String[] names, int[] prices){
        this.ms = new Muenzsystem();
        waren = new Ware[names.length];

        for (int i = 0; i < names.length; i++){
            waren[i] = new Ware (i, names[i], prices[i]);
            }
    }
    
    public void printWare(){
        for (int i = 0; i < waren.length; i++){
            System.out.println(waren[i].toString());
        }

    }
    
    public boolean select(int id){
       
for (Ware ware : waren) {
            if (ware.getID() == id) {
                if (ware.getPrice() <= ms.getCurrentValue()) {
                    System.out.println("Successfull");
                    return true;
                } else {
                        System.out.println("Not enough money");
                        return false;
                    }
            }
        }
        System.out.println("Ware nicht gefunden.");
        return false;
        
    }
    
    
    public boolean insertCoin(int coin){
        boolean res = ms.insert(coin);
        
        if (!res){
            System.out.println("Münze existiert nicht.");
        }
        
        return res;
    }
    
    public void reset(){
        ms.reset();
    }
}
