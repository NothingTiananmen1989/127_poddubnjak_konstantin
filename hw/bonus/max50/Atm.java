public class Atm {
    private int q50;
    private int q100;
    private int q500;
    private int q1000;
    private int q5000;
    public Atm(int q50, int q100, int q500, int q1000, int q5000) {
        this.q50=0;
        this.q100=0;
        this.q500=0;
        this.q1000=0;
        this.q5000=0;
    }
    public int return_m50() {
        return this.q50;
    }
    public int return_m100() {
        return this.q100;
    }
    public int return_m500() {
        return this.q500;
    }
    public int return_m1000() {
        return this.q1000;
    }
    public int return_m5000() {
        return this.q5000;
    }
    public void load (int m50, int m100, int m500, int m1000, int m5000) {
        if (50>0) {
            this.q50=m50+50;
        }
        if (100>0) {
            this.q100=m100+100;
        }
        if (500>0) {
            this.q500=m500+500;
        }
        if (1000>0) {
            this.q1000=m1000+1000;
        }
        if (5000>0) {
            this.q5000=m5000+5000;
        }
    }
    public boolean give (int summ) {
        if (summ%50!=0) {
            return false;
        }
        int x=1;
        while(x==1) {
            if(q5000>0 && summ>=5000) {
                while(q5000>0 && summ>=5000) {
                    summ=summ-5000;
                    q5000=q500-1;
                }
                if(summ==0) {
                    return true;
                }
            }
            if((q1000>0 && 1000<=summ && summ<=5000) || (summ>=1000 && q5000==0)) {
                while(q1000>0 && summ>=1000) {
                    summ=summ-1000;
                    q1000=q1000-1;
                }
                if(summ==0) {
                    return true;
                }
            }
            if((q500>0 && 500<=summ && summ<=1000) || (summ>=500 && q1000==0)) {
                while(q500>0 && summ>=500) {
                    summ=summ-500;
                    q500=q500-1;
                }
                if(summ==0) {
                    return true;
                }
            }
            if((q100>0 && 100<=summ && summ<=500) || (summ>=100 && q500==0)) {
                while(q100>0 && summ>=100) {
                    summ=summ-100;
                    q100=q100-1;
                }
                if(summ==0) {
                    return true;
                }
            }
            if((q50>0 && 50<=summ && summ<=100) || (summ>=50 && q100==0)) {
                while(q50>0 && summ>=50) {
                    summ=summ-50;
                    q50=q50-1;
                }
                if(summ==0) {
                    return true;
                }
            }
            if(summ>0) {
                return false;
            }
        }
        return false;
    }
}