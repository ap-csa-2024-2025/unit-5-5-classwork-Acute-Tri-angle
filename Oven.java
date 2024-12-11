public class Oven
{
    private int maxTemp;
    private int currentTemp;

    public void setmax(int in){
        if(in > 500 || in < 0){
            maxTemp = 500;
        }
        else{
            maxTemp = in;
        }
    }

    public void setcurr(int in){
        if (in > maxTemp){
            currentTemp = maxTemp;
        }
        else if (in == 0){
            currentTemp = 0;
        }
        }


    public int getMaxTemp(){
        return maxTemp;
    }

    public int getCurrentTemp(){
        return currentTemp;
    }

    public void turnOff(){
       if (currentTemp > 0){
        currentTemp = 0;
       }
    }

    public boolean isOn(){
        if (currentTemp > 0){
            return true;
        }
        return false;
    }

    public void preheat(int temp){
        if (temp > maxTemp){
            currentTemp = maxTemp;
        }
        else if (temp <= 0){

        }
        else{
            currentTemp = temp;
        }
    }

    public String toString(){
        return "New oven with maximum temperature of " + maxTemp + " and a starting temperature of " + currentTemp + ".";
    }
}
