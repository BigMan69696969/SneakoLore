package com.company;

public class Main {

    public static EDater nate = new NatalieCraig();
    public static EDater mio = new Mio();

    public static void main(String[] args) {
        nate.printInfo();
        mio.printInfo();
    }
}

class NatalieCraig extends EDater {

    @Override
    String getName() {
        return "Natalie Craig";
    }

    @Override
    boolean isSittingInThrone() {
        return false;
    }

    @Override
    boolean isGettingRailed() {
        return true;
    }

    @Override
    String getBigBuffBlackGuy() {
        return "BIG MAN";
    }
}

class Mio extends EDater {

    @Override
    String getName() {
        return "Sneako";
    }

    @Override
    boolean isSittingInThrone() {
        return true;
    }

    @Override
    boolean isGettingRailed() {
        return false;
    }

    @Override
    String getBigBuffBlackGuy() {
        return null;
    }
}

abstract class EDater {

    abstract String getName();
    abstract boolean isSittingInThrone();
    abstract boolean isGettingRailed();
    abstract String getBigBuffBlackGuy();

    void printInfo() {
        String info = isSittingInThrone()
                ? "%s is sitting in their throne (folding chair)."
                : "%s is getting railed by %s";

        System.out.printf(info, getName(), getBigBuffBlackGuy());
        System.out.print("\n");
    }
}
