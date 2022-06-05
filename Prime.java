//1から昇順で数えたときに、num番目までの素数を出力する
//入力：出力したい素数の数 num
//出力：num番目までの全ての素数*/

public class Prime {

    public static void main(String[] args){
        int sosuu[];
        int num=9;//出力したい素数の数num=9
        sosuu=new int[num]; 

        System.out.println("何番目の素数を知りたいのか入力");
        int a;
        int j;
        int i=0;
        for(j=1;;j++){////1から順に素数か判定していく
            int katei=1;

          for(a=2;a<j;a++)  { //jより小さい数全てでjを割ったとき1つでも割り切れれば素数でない。それ以外は素数。
             

              int syo=j/a;
              int amari=j-syo*a;         //割り切れるかどうかの計算 
            if(
       (amari==0)
            ){
                katei=0;     //１つでも余りが0→素数でない時、kateiに0を代入する
                System.out.println(j+"は素数ではありません");
                break;
            }   
            
            }
            if(katei==1){//全ての数において余りが0でない時→素数の時、kateiは1のままである
                System.out.println(j+"は素数です");
                sosuu[i]=j;
                i++;  }
            
        
        if(i==num){//入力された値になるまで素数を求めることができたら終了する
            break;
        }   
     }   
    }
}

