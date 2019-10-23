public class Board{
    int tiles[][] = new int[8][8];
    
    public Board(){
        for(int i = 0; i < tiles.length; i++){
            for(int j = 0; j < tiles[i].length; j++){
                if((i + j) % 2 == 0){
                    tiles[i][j] = -1;
                }
            }
        }
    }

    void visualise(){
        for(int[] i : tiles){
            for(int j : i){
                System.out.print(j + "\t");
            }
            System.out.println();
        }
    }
}
