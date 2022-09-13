public class Compare {

    public void printCompare(Gryffindor[] gryffindors) {
        int sum = gryffindors[0].getBravery() + gryffindors[0].getHonor() + gryffindors[0].getNobility();
        int tempIndex = 0;
        for (int i = 1; i < gryffindors.length; i++) {
            if (sum < (gryffindors[i].getBravery() + gryffindors[i].getHonor() + gryffindors[i].getNobility())) {
                sum = gryffindors[i].getBravery() + gryffindors[i].getHonor() + gryffindors[i].getNobility();
                tempIndex = i;
            }
        }
        String massage = gryffindors[tempIndex].getFullName() + " " + "лучший Гриффиндорец чем ";
        for (int i = 0; i < gryffindors.length; i++) {
            if (i != tempIndex) {
                massage = massage + gryffindors[i].getFullName() + " ";
            }
        }
        System.out.println(massage);
    }
    public void printCompare(Puffenduy[] puffenduys) {
        int sum = puffenduys[0].getHonesty() + puffenduys[0].getLoyalty() + puffenduys[0].getHardWork();
        int tempIndex = 0;
        for (int i = 1; i < puffenduys.length; i++) {
            if (sum < (puffenduys[i].getHonesty() + puffenduys[i].getLoyalty() + puffenduys[i].getHardWork())) {
                sum = puffenduys[i].getHonesty() + puffenduys[i].getLoyalty() + puffenduys[i].getHardWork();
                tempIndex = i;
            }
        }
        String massage = puffenduys[tempIndex].getFullName() + " " + "лучший Пуффендуец чем ";
        for (int i = 0; i < puffenduys.length; i++) {
            if (i != tempIndex) {
                massage = massage + puffenduys[i].getFullName() + " ";
            }
        }
        System.out.println(massage);
    }
    public void printCompare(Kogtevran[] kogtevrans) {
        int sum = kogtevrans[0].getMind() + kogtevrans[0].getCreativity() + kogtevrans[0].getWisdom()+
                                                                                    kogtevrans[0].getWit();
        int tempIndex = 0;
        for (int i = 1; i < kogtevrans.length; i++) {
            if (sum < (kogtevrans[i].getMind() + kogtevrans[i].getCreativity() + kogtevrans[i].getWisdom()+
                    kogtevrans[i].getWit())) {
                sum = kogtevrans[i].getMind() + kogtevrans[i].getCreativity() + kogtevrans[i].getWisdom()+
                        kogtevrans[i].getWit();
                tempIndex = i;
            }
        }
        String massage = kogtevrans[tempIndex].getFullName() + " " + "лучший Когтевранец чем ";
        for (int i = 0; i < kogtevrans.length; i++) {
            if (i != tempIndex) {
                massage = massage + kogtevrans[i].getFullName() + " ";
            }
        }
        System.out.println(massage);
    }
    public void printCompare(Slytherin[] slytherins) {
        int sum = slytherins[0].getDecisiveness() + slytherins[0].getAmbition() + slytherins[0].getCunning()+
                slytherins[0].getResourcefulness() + slytherins[0].getThirstForPower();
        int tempIndex = 0;
        for (int i = 1; i < slytherins.length; i++) {
            if (sum < (slytherins[i].getDecisiveness() + slytherins[i].getAmbition() + slytherins[i].getCunning()+
                    slytherins[i].getResourcefulness() + slytherins[i].getThirstForPower())) {
                sum = slytherins[i].getDecisiveness() + slytherins[i].getAmbition() + slytherins[i].getCunning()+
                        slytherins[i].getResourcefulness() + slytherins[i].getThirstForPower();
                tempIndex = i;
            }
        }
        String massage = slytherins[tempIndex].getFullName() + " " + "лучший в Слизерине чем ";
        for (int i = 0; i < slytherins.length; i++) {
            if (i != tempIndex) {
                massage = massage + slytherins[i].getFullName() + " ";
            }
        }
        System.out.println(massage);
    }

//    public void printCompire(Hogwarts fistObject, Hogwarts secondObject) {
//        int sum1 = fistObject.getTransgressDistance() + fistObject.getWitchcraftPower();
//        int sum2 = secondObject.getTransgressDistance() + secondObject.getWitchcraftPower();
//        if (sum1 > sum2){
//            System.out.printf("%s сильнее в магии чем %s", fistObject.getFullName(), secondObject.getFullName());
//        }else {
//            System.out.printf("%s сильнее в магии чем %s", secondObject.getFullName(), fistObject.getFullName());
//        }
//    }

    public void printCompare(Hogwarts hogwart, Hogwarts hogwart1) {
        int sum1 = hogwart.getTransgressDistance() + hogwart.getWitchcraftPower();
        int sum2 = hogwart1.getTransgressDistance() + hogwart1.getWitchcraftPower();
        if (sum1 > sum2){
            System.out.printf("%s сильнее в магии чем %s \n", hogwart.getFullName(), hogwart1.getFullName());
        }else {
            System.out.printf("%s сильнее в магии чем %s \n", hogwart1.getFullName(), hogwart.getFullName());
        }
    }
}
