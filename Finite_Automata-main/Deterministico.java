public class Deterministico {

    public boolean reconhece(String str){
        final int reject = 3;
        int state = 0;
        char letra_atual;
        int i = 0;
        while(i < str.length()){
            letra_atual = str.charAt(i);

            //Estado 0 -> Se for a ou b vai para o estado 0.
            if(letra_atual == 'a'||letra_atual == 'b')
                state = 0;

            //Estado 1 -> Se for y ou z vai para o estado 1(Final).
            else if(letra_atual =='y'||letra_atual =='z')
                state = 1;

            else
                state = reject;

            i++;
        }
        return state == 1;
    }
}
