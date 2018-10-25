public class HorseBarn {

    private Horse[] spaces;

    public HorseBarn(Horse[] array)
    {
        this.spaces = array;
    }

    public void consolidate() {
        for (int i = 0; i < this.spaces.length-1; i++) {
            if (this.spaces[i] == null) {
                for (int j = i+1; j < this.spaces.length; j++) {
                    if (this.spaces[j] != null) {
                        this.spaces[i] = this.spaces[j];
                        this.spaces[j] = null;
                        j = this.spaces.length;
                    }
                }
            }
        }
    }

    public int findHorseSpace(String name) {
        for (int i = 0; i < this.spaces.length; i++) {
            if (this.spaces[i]!=null && name.equals(this.spaces[i].getName())) {
                return i+1;
            }
        }
        return -1;
    }

    public String toString() {
        String blank = "";
        for(int i = 0; i < spaces.length; i++)
        {
            blank = blank + "[" + spaces[i] + "] ";
        }
        return blank;
    }
    private Thoroughbred[] spaces1;
    public HorseBarn(Thoroughbred[] array)
    {
        this.spaces1 = array;
    }

    public void consolidate1()
    {
        for (int i = 0; i < this.spaces1.length-1; i++)
        {
            if (this.spaces1[1] == null)
            {
                for (int j = i+1; j < this.spaces1.length;j++)
                {
                    if (this.spaces1[j] != null)
                    {
                        this.spaces1[j] = this.spaces1[j];
                        this.spaces[j] = null;
                        j = this.spaces1.length;
                    }
                }
            }
        }
    }
    public int findHorseSpace1(String name) {
        for (int i = 0; i < this.spaces1.length; i++) {
            if (this.spaces1[i] != null && name.equals(this.spaces1[i].getName())) {
                return i + 1;
            }
        }
        return -1;
    }
}