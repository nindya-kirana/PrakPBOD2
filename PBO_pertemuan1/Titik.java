class Titik{
    double absis;
    double ordinat;
    static int counterTitik = 0;

    Titik(){
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    Titik(double x, double y){
        absis = x;
        ordinat = y;
        counterTitik++;
    }

    double getAbsis(){
        return absis;
    }

    double getOrdinat(){
        return ordinat;
    }

    void setAbsis(double x){
        absis = x;
    }

    void setOrdinat(double y){
        ordinat = y;
    }

    void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    static int getCounterTitik(){
        return counterTitik;
    }

    int getKuadran(){
        if(this.absis>0 && this.ordinat>0){
            return 1;
        }
        else if(this.absis<0 && this.ordinat>0){
            return 2;
        }
        else if(this.absis<0 && this.ordinat<0){
            return 3;
        }  
        else if(this.absis>0 && this.ordinat<0){
            return 4;
        }   
        else{
            return 0;
        }  
    }

    double getJarakPusat(){
        return Math.sqrt((this.absis*this.absis) + (this.ordinat*this.ordinat));
    }

    double getJarak(Titik T2){
        return Math.sqrt(((T2.absis-this.absis)*(T2.absis-this.absis)) + ((T2.ordinat-this.ordinat)*(T2.ordinat-this.ordinat)));
    }

    void refleksiX(){
        this.ordinat = ordinat * (-1);
    }

    void refleksiY(){
        this.absis = absis * (-1);
    }

    Titik getRefleksiX(){
        Titik T2 = new Titik(absis, ordinat*(-1));
        return T2;
    }

    Titik getRefleksiY(){
        Titik T2 = new Titik(absis*(-1), ordinat);
        return T2;
    }
}