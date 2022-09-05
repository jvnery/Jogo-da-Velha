package br.ucsal;

public class JogoDaVelha {
    
    private String[][] m = {{"L1C1","L1C2","L1C3"},{"L2C1","L2C2","L2C3"},{"L3C1","L3C2","L3C3"}};
        
    public String Mostrar(){
        for(int linha=0; linha<3; linha++){
            for(int coluna=0; coluna<3; coluna++){
                System.out.print(" "+ m[linha][coluna]);
            }
            System.out.println("\n");
        }
        return null;
    }
    
    public boolean Valido(String p){
        for(int linha=0; linha<3; linha++){
            for(int coluna=0; coluna<3; coluna++){
                if(m[linha][coluna].equals(p))
                    return true;
            }
        }
        return false;
    }
    
    public void Jogada(String p, String j){
        if(p.equals("L1C1"))
            m[0][0] = j;
        if(p.equals("L1C2"))
            m[0][1] = j;
        if(p.equals("L1C3"))
            m[0][2] = j;
        if(p.equals("L2C1"))
            m[1][0] = j;
        if(p.equals("L2C2"))
            m[1][1] = j;
        if(p.equals("L2C3"))
            m[1][2] = j;
        if(p.equals("L3C1"))
            m[2][0] = j;
        if(p.equals("L3C2"))
            m[2][1] = j;
        if(p.equals("L3C3"))
            m[2][2] = j;
    }
    
    public String Ganhou(int jogadas){
        String[] T = new String[8];
        String vencedor = "null";
        
        if(jogadas==9){
            vencedor = "Empate";
        }
        T[0] = m[0][0] + m[0][1] + m[0][2];
        T[1] = m[1][0] + m[1][1] + m[1][2];
        T[2] = m[2][0] + m[2][1] + m[2][2];
        
        T[3] = m[0][0] + m[1][0] + m[2][0];
        T[4] = m[0][1] + m[1][1] + m[2][1];
        T[5] = m[0][2] + m[1][2] + m[2][2];
        
        T[6] = m[0][0] + m[1][1] + m[2][2];
        T[7] = m[0][2] + m[1][1] + m[2][0];
        
        for(int i=0; i<T.length; i++){
            if(T[i].equals("XXX")){
                vencedor = "Jogador 1";
            } else if(T[i].equals("OOO")){
                vencedor = "Jogador 2";
            }
        }    
        return vencedor;
    }  
    
    
    
}
