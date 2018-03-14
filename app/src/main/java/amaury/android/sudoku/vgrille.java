package amaury.android.sudoku;

/**
 * Created by amaury on 14/03/2018.
 */

public class vgrille {
    protected int lvl;
    private int num;
    private int done;

    public vgrille(int lvl, int num, int done){
        this.lvl = lvl;
        this.num = num;
        this.done = done;
    }

    public int getlvl(){
        return this.lvl;
    }

    public int getnum(){
        return this.num;
    }

    public int getdone(){
        return this.done;
    }
}
