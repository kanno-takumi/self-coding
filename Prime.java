/*1から昇順で数えたときに、N番目にあたる素数を出力するコマンドラインツールを作成してください。
入力：出力したい素数の順番 N
出力：N番目の素数*/

public class Prime {

    public static void main(String[] args){
        int sosuu[];
        int num=9;
        sosuu=new int[num]; 

        System.out.println("何番目の素数を知りたいのか入力");
        int a;
        int j;
        int i=0;
        for(j=1;;j++){
            int katei=1;

          for(a=2;a<j;a++)  { 
             

              int syo=j/a;
              int amari=j-syo*a;       
            if(
       (amari==0)
            ){
                katei=0;
                System.out.println(j+"は素数ではありません");
                break;
            }   
            
            }
            if(katei==1){
                System.out.println(j+"は素数です");
                sosuu[i]=j;
                i++;  }
            
        
        if(i==num){
            break;
        }   
     }   
    }
}

