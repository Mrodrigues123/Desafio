package br.com.digitalhouse;

public class Principal2 {

    public static void main(String[] args) {

        Filho filhoUm = new Filho("Maria", "Jorge","Jose");
        Filho filhoDois = new Filho("Maria", "Fernando", "Ana");

        mesmaMae(filhoUm, filhoDois);
        mesmoPai(filhoUm, filhoDois);

        System.out.println(saoMeioIrmaos(filhoUm, filhoDois));
    }

    public static String maeDe (Filho novoFilho){
        return novoFilho.getMae();
    }
    public static String paiDe(Filho novoFilho){
        return novoFilho.getPai();
    }

    public static boolean mesmaMae(Filho filhoUm, Filho filhoDois){
        return maeDe(filhoUm) == maeDe(filhoDois);
    }

    public static boolean mesmoPai(Filho filhoUm, Filho FilhoDois){
        if (paiDe(filhoUm) == paiDe(filhoDois)){
            return true;
        }else{
            return false;
        }
    }
    public static boolean saoMeioIrmaos(Filho filhoUm, Filho filhoDois){
    return mesmaMae(filhoUm, filhoDois) && !mesmoPai(filhoUm, filhoDois)
            ||mesmaMae(filhoUm, filhoDois) == mesmoPai(filhoUm, filhoDois)
}
